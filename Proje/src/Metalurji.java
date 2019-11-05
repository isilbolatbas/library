import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.TimeZone;

public class Metalurji extends Kutuphane {
		
	public int metalurjiSure = 8;
	public int metalurjiKat = 1;
	List<String> kitap = new ArrayList<String>();

	@Override
	public void kitapIcerik() {
		// TODO Auto-generated method stub
		System.out.println("kitap teknik kitaptir"+metalurjiKat + ". kattadir");
		System.out.println("ogrenmek istediginiz diger bilgiler icin:");
		System.out.println("1-kitap suresi");
		System.out.println("2-donus gunu");
		Scanner scan = new Scanner(System.in);
		int secim = scan.nextInt();
		if (secim == 1) {
			sureOgren();
		} else if (secim == 2) {
			kitapDonusu();
		}
	}

	@Override
	public void kitapNerede() {
		// TODO Auto-generated method stub
		System.out.print("yerini ogrenmek istediginiz kitabi giriniz:");
		Scanner scanner = new Scanner(System.in);
		String isim = scanner.next();

		for (int i = 0; i < kitap.size(); i++) {
			if (kitap.get(i).equals(isim)) {
				System.out.print(kitap.indexOf(isim));
				System.out.println(". sirada");
			}

		}
	}

	@Override
	public void kitapEkle() {
		// TODO Auto-generated method stub
		System.out.print("girmek istediginiz kitabin ismi:");
		Scanner scanner = new Scanner(System.in);
		String ad = scanner.next();
		kitap.add(ad);
		for (int i = 0; i < kitap.size(); i++) {
			System.out.println(kitap.get(i)+ " kitabi eklendi.");
		}
	}

	@Override
	public void kitapListele() {
		// TODO Auto-generated method stub
		System.out.println(kitap);
		System.out.println("1-kitap icerigi ogren");
		System.out.println("2-kitap nerede");
		System.out.print("ogrenmek istediginiz durumu seciniz:");

		Scanner scanner = new Scanner(System.in);
		int secim = scanner.nextInt();
		
		if (secim == 1) {
			kitapIcerik();
		} else if (secim == 2) {
			kitapNerede();
		}
	}

	@Override
	public void kitapSil() {
		// TODO Auto-generated method stub
		System.out.print("silmek istediginiz kitabin ismi:");
		Scanner scanner = new Scanner(System.in);
		String sil = scanner.next();
		for (int i = 0; i < kitap.size(); i++) {
			if (kitap.get(i).equals(sil)) {
				kitap.remove(i);}
			else {
				System.out.println("bu isimde bir kitap bulunamamistir.");
				break;
			}
		}
	}

	@Override
	public void sureOgren() {
		// TODO Auto-generated method stub
		System.out.println("KITABI 8 GUN ICINDE TESLIM ETMELISINIZ.");
	}

	@Override
	public void kitapDonusu() {
		// TODO Auto-generated method stub
		Date date;
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Turkey"));
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		System.out.println(day + metalurjiSure + "/" + month + "/" + year+ " tarihinde teslim etmelisiniz.");
	
	}

	}


	
	


