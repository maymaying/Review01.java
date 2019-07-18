public class Review {
	
	//打印九九乘法表
	public static void printMultipicationTable() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				//System.out.print(i + " * " + j + " = " + (i * j));
				System.out.printf("%d * %d = %-2d ", j, i, i * j);
			}
			System.out.println();
		}
	}
	
	
	// e = 1/0! + 1/1! + 1/2! + 1/3! + 1/4! + ...
	// 利用递归方式计算阶乘
	public static long factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	// 利用迭代方式计算阶乘
	public static long factorial2(int n) {
		int r = 1;
		for (int i = 1; i <= n; i++) {
			//r = r * i;
			r *= i;
		}
		return r;
	}	
	public static double calcE(int n) {
		double e = 0;
		for (int i = 0; i < n; i++) {
			e += (1.0 / factorial2(i));
		}
		
		return e;
	}
	

    //* Pi / 4 = 1/1 - 1/3 + 1/5 - 1/7 + 1/9 - ...  
    public static double calcPi(int n) {
		double pi4 = 0;
		for (int i = 0; i < n; i++) {
			int fenmu = 2 * i + 1;
			double item = 1.0 / fenmu;
			if (i % 2 == 0) {
				pi4 += item;
			} else {
				pi4 -= item;
			}
		}	
		return pi4 * 4;
	}
	
	
    //反转字符串
    /*
     * 10 进制转 16 进制，计算公式如下例
     * 1958 转 16 进制
     * 1958 % 16 == 6        1958 / 16 == 122
     * 122 % 16 == 10(A)     122 / 16 == 7
     * 7 < 16
     * 1958 的 16 进制 为 7A6
     */
    public static String reverse(String s) {
        int length = s.length();
        String r = "";
        for (int i = length - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        return r;
    }
    public static String decToHex(int n) {
		String r = "";
		while (n > 16) {
			int yushu = n % 16;
			int shang = n / 16;
			if (yushu > 9) {
				char c = (char)((yushu - 10) + 'A');
				r += c;
			} else {
				r += yushu;
			}
			n = shang;
		}		
		if (n > 9) {
			char c = (char)((n - 10) + 'A');
			r += c;
		} else {
			r += n;
		}		
		return reverse(r);
	}
	
	
	public static void main(String[] args) {
		printMultipicationTable();   
		System.out.println("e = " + calcE(4));  
		System.out.println("pi = "+calcPi(10000));
		System.out.println(decToHex(1958));
	}
}