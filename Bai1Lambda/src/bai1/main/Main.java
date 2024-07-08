package bai1.main;

import java.util.Arrays;
import java.util.List;

// Lambda: 1 hàm ẩn danh, có thể khai báo ở bất kỳ đâu và không có khả năng tái sử dụng.
//(tham_so_1, tham_so_2) -> {logic}

// Khi nào sử dụng Lambda:
//	- Hạn chế bị nhiều vòng lặp từ 2 trở lên -> Lambda
//	- Phương thức có tham số làm biểu thức Lambda

public class Main {
	public static void main(String[] args) {
//		VD1:
		List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
		lst.forEach((number) -> System.out.println(number));
		
//		VD2: biêt là nó có tồn tại
//		int a = 1;
//		int b = 2;
//		
//		TinhToan tinhToan = (x, y) -> x+y;
//		int ketQua = tinhToan.tinhTong(a, b);
//		
//		TinhToan tinhToan2 = (x, y) -> x-y;
//		int ketQua2 = tinhToan2.tinhTong(a, b);
//		System.out.println(ketQua);
		
		

	}

}
