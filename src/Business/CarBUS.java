package Business;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.CarDAO;
import Entity.Car;

public class CarBUS {
	/**
	 * @param sql
	 * @return
	   @param
	   @return
	   @author
	   @throws
	Oct 16, 2018
	 */
	public List<Car> getAllCar(){
		List<Car> listCar=new ArrayList<>();
		try {
			CarDAO carDao = new CarDAO();
			String sql="select *from car";
			listCar=carDao.getAllCar(sql);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return listCar;
	}
	/**
	 * @param sql
	 * @return
	   @param
	   @return
	   @author
	   @throws
	Oct 16, 2018
	 */
	public List<String> getCarMarker(String sql){
		List<String> listCar=new ArrayList<>();
		try {
			CarDAO carDAO=new CarDAO();
			listCar=carDAO.getCarMarker(sql);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return listCar;
	}

}
