import java.util.Scanner;

public abstract class Kutuphane implements Icerik, Kitap {

	public abstract void sureOgren();

	public abstract void kitapDonusu();

	public  void misafirBilgi() {
		System.out.println("kutuphane kayitlarina ulasma izniniz yoktur.");
	}

	public static void main(String[] args) {

		final int x = 1;

		System.out.println("GAZI UNIVERSISTESI KUTUPHANESI");
		System.out.println("1-Bilgisayar Muhendisligi");
		System.out.println("2-Elektrik Elektronik Muhendisligi");
		System.out.println("3-Endustriyel Tasarim Muhendisligi");
		System.out.println("4-Metalurji ve Malzeme Muhendisligi");
		System.out.println("5-Misafir");

		Scanner scan = new Scanner(System.in);
		int secim = scan.nextInt();
		Bilgisayar bilgisayar = new Bilgisayar();
		Misafir misafir = new Misafir();
		Elektrik elektrik = new Elektrik();
		EndTasarim endTasarim = new EndTasarim();
		Metalurji metalurji = new Metalurji ();

		if (secim == 1) {

			while (x == 1) {

				System.out.println("1-kitap ekle");
				System.out.println("2-kitap listele");
				System.out.println("3-kitap sil");
				System.out.print("yapmak istediginiz islemi seciniz:");

				Scanner s = new Scanner(System.in);
				int secenek = s.nextInt();

				if (secenek == 1) {
					bilgisayar.kitapEkle();
				} else if (secenek == 2) {
					bilgisayar.kitapListele();

				} else if (secenek == 3) {
					bilgisayar.kitapSil();
				}
			}

		} else if (secim == 2) {
			
			while (x == 1) {

				System.out.println("1-kitap ekle");
				System.out.println("2-kitap listele");
				System.out.println("3-kitap sil");
				System.out.print("yapmak istediginiz islemi seciniz:");

				Scanner s = new Scanner(System.in);
				int secenek = s.nextInt();

				if (secenek == 1) {
					elektrik.kitapEkle();
				} else if (secenek == 2) {
					elektrik.kitapListele();

				} else if (secenek == 3) {
					elektrik.kitapSil();
				}
			}

		} else if (secim == 3) {
			while (x == 1) {

				System.out.println("1-kitap ekle");
				System.out.println("2-kitap listele");
				System.out.println("3-kitap sil");
				System.out.print("yapmak istediginiz islemi seciniz:");

				Scanner s = new Scanner(System.in);
				int secenek = s.nextInt();

				if (secenek == 1) {
					endTasarim.kitapEkle();
				} else if (secenek == 2) {
					endTasarim.kitapListele();

				} else if (secenek == 3) {
					endTasarim.kitapSil();
				}
			}
			
		} else if (secim == 4) {
			while (x == 1) {

				System.out.println("1-kitap ekle");
				System.out.println("2-kitap listele");
				System.out.println("3-kitap sil");
				System.out.print("yapmak istediginiz islemi seciniz:");

				Scanner s = new Scanner(System.in);
				int secenek = s.nextInt();

				if (secenek == 1) {
					metalurji.kitapEkle();
				} else if (secenek == 2) {
					metalurji.kitapListele();

				} else if (secenek == 3) {
					metalurji.kitapSil();
				}
			}
			
		} else if (secim == 5) {
			while (x == 1) {

				System.out.println("1-kitap ekle");
				System.out.println("2-kitap listele");
				System.out.println("3-kitap sil");
				System.out.print("yapmak istediginiz islemi seciniz:");

				Scanner s = new Scanner(System.in);
				int secenek = s.nextInt();

				if (secenek == 1) {
					misafir.kitapEkle();
				} else if (secenek == 2) {
					misafir.kitapListele();

				} else if (secenek == 3) {
					misafir.kitapSil();
				}
			}
			
		}

	}

}
