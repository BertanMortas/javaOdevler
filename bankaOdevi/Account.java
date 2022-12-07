package bankaOdevi;

import java.util.Random;

public class Account 
{
	public String hesapNo;
	public double istenenKredi;
	public double bakiye;
	public boolean krediBasvurusu;
	
	
	
	
	public Account() {
		super();
		Random random = new Random();
		String randNumber = String.valueOf(random.nextInt(1000000000));
		this.hesapNo=randNumber;
		//setHesapNo(randNumber);
		//this.hesapNo=randNumber;
		
	}

	

	public double getBakiye() {
		return bakiye;
	}


	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}


	public double getIstenenKredi() {
		return istenenKredi;
	}


	public void setIstenenKredi(double istenenKredi) {
		this.istenenKredi = istenenKredi;
	}


	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}


	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}


	public String getHesapNo() {
		return hesapNo;
	}


	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}
	
	
	
	

}
