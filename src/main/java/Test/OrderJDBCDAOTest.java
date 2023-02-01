package Test;

import DAO.Impl.OrderJDBCDAO;
import Model.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class OrderJDBCDAOTest {
    OrderJDBCDAO orderJDBCDAO = new OrderJDBCDAO();
    @Test
    public void getAllOrderTest() {
        Assertions.assertNotNull(orderJDBCDAO.getAllOrder());
    }

    @Test
    public void getAllOrderByUserTest() {
        Assertions.assertNotNull(orderJDBCDAO.getAllOrderByUser(1L));
    }

    @Test
    public void addOrderTest(){
        Order order = new Order();
        order.setProduct("TEST, TEST, TEST");
        order.setUserId(20L);
        order.setTotalPrice(999F);
        Assertions.assertNotNull(orderJDBCDAO.addOrder(order));
    }
}
