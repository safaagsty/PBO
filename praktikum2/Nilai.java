import java.util.Scanner;

public class Nilai{
	String nim;
	String nama;
	float nilaiTugas, nilaiUts, nilaiUas, pNilaiTugas, pNilaiUts, pNilaiUas, nilaiAkhir;

	Scanner key = new Scanner(System.in);
	void Nilai(String nim, String nama, float nilaiTugas, float nilaiUts, float nilaiUas)
{
	this.nim=nim;
	this.nama=nama;
	this.nilaiTugas=nilaiTugas;
	this.nilaiUts=nilaiUts;
	this.nilaiUas=nilaiUas;
}
void setNim(String nim){
	this.nim=nim;
}
String getNim(){
	return nim;
}
void inputData(){
	System.out.print ("Nim			: ");nim=key.nextLine();
	System.out.print ("Nama			: ");nama=key.nextLine();
	System.out.print ("Nilai Tugas 		: ");nilaiTugas=key.nextFloat();
	System.out.print ("Nilai UTS 		: ");nilaiUts=key.nextFloat();
	System.out.print ("Nilai UAS 		: ");nilaiUas=key.nextFloat();
}
void hitungNilai(){
	pNilaiTugas=.2f*nilaiTugas;
	pNilaiUts=.35f*nilaiUts;
	pNilaiUas=.45f*nilaiUas;
	nilaiAkhir=pNilaiTugas+pNilaiUts+pNilaiUas;
}
void cetakNilai(){
	System.out.println("Nim			: "+nim);
	System.out.println("Nama			: "+nama);
	System.out.println("Nilai Tugas		: "+nilaiTugas+"	35% : "+pNilaiTugas);
	System.out.println("Nilai UTS		: "+nilaiUts+"	20% : "+pNilaiUts);
	System.out.println("Nilai UAS		: "+nilaiUas+"	45% : "+pNilaiUas);
	System.out.println("Nilai Akhir		: "+nilaiAkhir);
}
}