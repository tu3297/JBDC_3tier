package Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Commom.ConnectDatabase;
import Entity.Car;

/**
 * @author tu329
 *
 */
public class CarDAO {
	private Connection conn;

	public CarDAO() throws SQLException, ClassNotFoundException {
		conn = ConnectDatabase.getSQLServerConnection();
	}
	
	/**
	 * @param sql
	 * @return
	 * @throws ClassNotFoundException
	   @param
	   @return
	   @author
	   @throws
	   Oct 15, 2018
	 */
	public List<Car> getAllCar(String sql) throws ClassNotFoundException {
		List<Car> listCar = new ArrayList<>();
		// create statement
		try {
			Statement statement = conn.createStatement();
			// get list data
			ResultSet rs = statement.executeQuery(sql);
			// for retrieven data
			while (rs.next()) {
				Car car = new Car();
				car.setCarId(rs.getInt(1));
				car.setCarMarker(rs.getString(2));
				car.setCarModel(rs.getString(3));
				car.setCarYearManufacture(rs.getDate(4) + "");
				car.setCarColor(rs.getString(5));
				car.setCarNote(rs.getString(6));
				listCar.add(car);
			}
			return listCar;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public List<String> getCarMarker(String sql){
		List<String>listCarMarker=new ArrayList<>();
		try {
			Statement statement=conn.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while(rs.next()){
				String marker=rs.getString(1);
				listCarMarker.add(marker);
			}
			return listCarMarker;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
