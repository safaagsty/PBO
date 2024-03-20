public class TesNilai{
	public static void main(String[] args)
	{
		Nilai nilai=new Nilai();
		nilai.nim="08982983";
		nilai.nama="Ghiyatsi";
		nilai.nilaiTugas=80;
		nilai.nilaiUts=90;
		nilai.nilaiUas=87;
		nilai.hitungNilai();
		nilai.cetakNilai();
		Nilai nilai2=new Nilai();
		nilai2.inputData();
		nilai2.hitungNilai();
		nilai2.cetakNilai();	
		System.out.println();
	}
}