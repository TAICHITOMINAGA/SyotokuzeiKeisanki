package 所得税計算機;

class Process {
public static  void outputtest(int syunyu,int keihi) {
	int zeiritu = 0;
	int nensyu = syunyu - keihi;
	if(nensyu >= 1000 && nensyu <= 1949999) {
	}else if (nensyu >= 1950000 && nensyu <=3299999) {
		 zeiritu = 10;
	}else if (nensyu >= 3300000 && nensyu <=6949999) {
		 zeiritu = 20;
	}else if (nensyu >= 6950000 && nensyu <=8999999) {
		 zeiritu = 23;
	}else if (nensyu >= 9000000 && nensyu <=17999999) {
		 zeiritu = 33;
	}else if (nensyu >= 18000000 && nensyu <=39999999) {
		 zeiritu = 40;
	}else if (nensyu >= 40000000) {
		 zeiritu = 45;
	}else {
		 zeiritu = 0;
	} 

	double syotokuzei = nensyu * (zeiritu * 0.01);
	int syotokuzei2 = (int)syotokuzei;
	System.out.println("");	
	System.out.println("入力された収入" + syunyu + "円");	
	System.out.println("入力された経費" + keihi + "円");	
	System.out.println("年収" + nensyu + "円");
	System.out.println("税率" + zeiritu + "%");
	System.out.println("所得税" + syotokuzei2 + "円");
}
}