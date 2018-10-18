public class KaryawanTest{
	public static void main(String[] args){
		System.out.println("Macam - macam gaji karyawan perusahaan sw-house XYZ");
		System.out.println(" ");
		Designer a = new Designer();
		a.setNama("Devia Suci Khoirun Nissa");
		a.setAlamat("Jatibarang");
		a.setGaji(70);

		System.out.println(" ");
		Pm b = new Pm();
		b.setNama("Dimas Septia Khoirudin");
		b.setAlamat("Bulak Lor");
		b.setGaji(90);

		System.out.println(" ");
		Programmer c = new Programmer();
		c.setNama("Umi Chabibah");
		c.setAlamat("Cirebon");
		c.setGaji(90);

	}
}