package ex01.model.dto;

import lombok.Data;
import ex01.model.OrderOption;

import java.util.*;

@Data
public class OrderDetailDTO {

    private int orderId;
    private List<OrderProductDTO> products;
    private int sumPrice;

    public OrderDetailDTO(List<OrderOption> options ) {
        // 1. orderId
        this.orderId = options.get(0).getOrder().getId();

        // 2. sumPrice
        for (OrderOption option : options) {
            this.sumPrice += option.getTotalPrice();
        }
        // 3. products
        // 3.1 주문옵션들 productId[1,1,2] -> [1,2] 돈봉투 2개 만들기

        // List<Integer> ids = new ArrayList<>();
        Set<Integer> ids = new HashSet<>(); //[1,2]
        for (OrderOption option : options) {
            ids.add(option.getId());
        }

        // 3.2 중복도니 상품의 크기만큼 ㅏㅂㄴ복하면서 주문 옵션 추가하기
        for(Integer id : ids) {
            List<OrderOption> temp = new ArrayList<>();

            for(OrderOption option : options) {
                if(option.getProduct().getId() == id) temp.add(option);
            }

            OrderProductDTO product = new OrderProductDTO();
            products.add(product);
        }




        List<OrderOption> temp2 = new ArrayList<>();


        List<OrderOption> p1 = Arrays.asList(options.get(0), options.get(1));
        List<OrderOption> p2 = Arrays.asList(options.get(2));
        OrderProductDTO product1 = new OrderProductDTO(); // 돈봉투1
        OrderProductDTO product2 = new OrderProductDTO(); // 돈봉투2


    }
    @Data
    class OrderProductDTO {
        private int productId;
        private List<OrderOption> options;

        @Data
        class OrderOptionDTO {
            private int id;
            private String optionName;
            private int qty;
            private int totalPrice;
        }

    }
}
