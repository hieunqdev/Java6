package bai1.main;

import java.util.Arrays;
import java.util.List;

//stream(): phương thức thao tác trên mảng 1 cách dễ dàng hơn.
//map(): duyệt qua tất cả các phần tử của mảng đã được thay đổi như mình định nghĩa.
//filter(): duyệt qua tất cả các phần tử của mảng theo điều kiện như mình định nghĩa.
//forEach(): duyệt qua tất cả các phần tử của mảng .
public class Main {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
		lst.stream()
//			-> tạo mảng mới có kích thước = mảng cũ.
			.map(number -> number*10) 
			.filter(number -> number<5)
			.forEach(number -> System.out.println(number));
		
		
//		lst.forEach(number -> System.out.println(number));

	}

}
