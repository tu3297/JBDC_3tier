package View;

import java.util.Scanner;

import Business.CarBUS;
import Business.CustomerBUS;
import Business.OrderBUS;

public class MainApp {
   public static void main(String[] args) {
	   CarBUS carBUS=new CarBUS();
	   OrderBUS orderBUS=new OrderBUS();
	   CustomerBUS customerBUS=new CustomerBUS();
	   Scanner sc=new Scanner(System.in);
	   int select;
	    System.out.println("1: Liệt kê danh sách: ");
	    System.out.println("2: Hiển thị số xe của từng khách hàng");
	    System.out.println("3: Hiển thị hãng xe bán chạy nhất");
	    System.out.println("4: Hiển thị xe mà khách hàng nào đó đã mua");
	    System.out.println("5: Xóa các order đã cũ ");
	    while(true) {
	       select=sc.nextInt();
	       if(select==0) { System.out.println("Tạm biệt"); break; }
	       switch(select) {
	          case 1:
	            break;
	          case 2:
	            break;
	          case 3:
	            break;
	          case 4:
	            int customerID;
	            System.out.println("Nhap ma khach hang: ");
	            System.out.println("Nhap 0 để chọn hạng mục khác: ");
	            while(true) {
	                customerID=sc.nextInt();
	                if(customerID==0) break;
	               //customerBUS.getAllCarCustomerBuy(sql,customerID);
	            }
	            break;
	          case 5:
	            break;    
	       }   
	    }
   }
}
