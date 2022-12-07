package bankaOdevi;

public class UserManager //extends Account
{
	
	public String bankMail = "@xbank.com";
	//public Account ac;
	//Account ac = new Account();
	// acount classı tekrar oluşuyor o yüzden sıfırlanıyor
	// extend etmeliyiz 
//	public boolean flag=false;
	
	
	public String otomatikEmailOlustur(User user)
	{
		String otomatikOlusanEmail;
		otomatikOlusanEmail=user.name+"."+user.surname+bankMail;
		user.setEmail(otomatikOlusanEmail);
		System.out.println("bankacılık işlem mailiniz: "+otomatikOlusanEmail);
		return user.getEmail();
	}
	public void bilgileriGoster(User user)
	{
		System.out.println("isim: "+user.name+" soyisim: "+user.surname+" hesap no: "
				+user.account.hesapNo+" e-mail: "+user.getEmail()+" hesap bakiyeniz: "
				+user.getAccount().getBakiye()+" kalan kredi: "+user.account.getIstenenKredi());
	}
	public void krediBasvurusundaBulun(Account account, int para)
	{
		
		account.krediBasvurusu=true;
		account.setKrediBasvurusu(account.krediBasvurusu);
		//ac.setKrediBasvurusu(true);
		account.setIstenenKredi(Double.valueOf(para));
		System.out.println(account.getIstenenKredi()+" Değerinde kredi başvurusu yaptınız.");
		System.out.println("lütfen bekleyiniz");

	}
	public void krediKartiBorcuOde(Account account, double taksit)
	{
		if(account.getIstenenKredi()==0)
			//if(flag==false)
		{
			System.out.println("kredi borcunuz bulunmamaktadır");
		}
		else if(account.getIstenenKredi()!=0)
			//else if(flag==true)
		{
			account.setIstenenKredi(account.getIstenenKredi()-taksit);

			System.out.println("odenen borç miktari: "+taksit+" kalan kredi borcunuz"
			+account.getIstenenKredi());
			account.setBakiye(account.getBakiye()-taksit);
		}
		else 
		{
			System.out.println("iflerin içirisine doğru giremiyor true false durumu");
		}
	}

}
