package Business;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.OrderDAO;
import Entity.Order;

public class OrderBUS {
   /**
 * @return
   @param
   @return
   @author
   @throws
Oct 16, 2018
 */
public List<Order> getAllOrder(){
	   List<Order> listOrder=new ArrayList<>();
	try {
		OrderDAO orderDAO = new OrderDAO();
		String sql="select *from car_order";
		listOrder=orderDAO.getAllOrder(sql);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
	return listOrder;
   }
   /**
 * @return
   @param
   @return
   @author
   @throws
Oct 16, 2018
 */
public int removeOrderIsCancle(){
	   int numberOfOrderCancle=0;
	   try {
		OrderDAO orderDao=new OrderDAO();
		String sql="exec cauc";
		numberOfOrderCancle=orderDao.removeOrderCancle(sql);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return 0;
	}
	return numberOfOrderCancle;
   }
}
