import java.lang.reflect.Array;

public class PAL {
		public int Select(int [] Array) {
			if (Array== null || Array.length <= 0)
				System.out.println("Error");
			for (int i = 0; i < Array.length; i++) {  
	            int min = i; /* 将当前下标定义为最小值下标 */  
	            for (int j = i + 1; j < Array.length; j++) {  
	                if (Array[min] > Array[j]) { /* 如果有小于当前最小值的关键字 */  
	                    min = j; /* 将此关键字的下标赋值给min */  
	                }  
	            }  
	            if (i != min) {/* 若min不等于i，说明找到最小值，交换 */  
	                int tmp = Array[min];  
	                Array[min] = Array[i];  
	                Array[i] = tmp;
	            }
			}
		}
		return Array;
}
