import java.lang.reflect.Array;

public class PAL {
		public int Select(int [] Array) {
			if (Array== null || Array.length <= 0)
				System.out.println("Error");
			for (int i = 0; i < Array.length; i++) {  
	            int min = i; /* ����ǰ�±궨��Ϊ��Сֵ�±� */  
	            for (int j = i + 1; j < Array.length; j++) {  
	                if (Array[min] > Array[j]) { /* �����С�ڵ�ǰ��Сֵ�Ĺؼ��� */  
	                    min = j; /* ���˹ؼ��ֵ��±긳ֵ��min */  
	                }  
	            }  
	            if (i != min) {/* ��min������i��˵���ҵ���Сֵ������ */  
	                int tmp = Array[min];  
	                Array[min] = Array[i];  
	                Array[i] = tmp;
	            }
			}
		}
		return Array;
}
