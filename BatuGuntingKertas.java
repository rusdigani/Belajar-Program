import java.util.Scanner;
public class BatuGuntingKertas {
public static void main(String[]args){
    //inisiallisasi variabel
    Scanner input = new Scanner(System.in);
    String nama;
        String Rusdi = null;
        String komputer = null;
        String hasil = null;
      
        nama = "Rusdi";
        System.out.println("Memasukkan Nama Anda = "+nama);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("| PERMAINAN BATU GUNTING KERTAS |");
        System.out.println("|   1.BATU 2.GUNTING 3.KERTAS   |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan pilihan anda = ");

    int pilihan = input.nextInt();
    if(pilihan==1){
        Rusdi = "BATU";
    }
    else if(pilihan==2){
        Rusdi = "GUNTING";
    }
    else if(pilihan==3){
        Rusdi = "KERTAS";
    }
    else if(pilihan==4){
        System.exit(0);
    }
    else {
      System.out.println("Maaf, nilai yang anda masukkan salah");
    }

    int generate = (int) (Math.random()*3+1);
    if(generate==1){
        komputer = "BATU";
    }
    else if(generate==2){
        komputer = "GUNTING";
    }
    else{
        komputer = "KERTAS";
    }

    if(pilihan<1 || pilihan>4)
        System.out.println("Maaf, Silahkan Ulangi lagi");
    else if(Rusdi.equals(komputer)){
        hasil = "SERI";
    } else if(Rusdi=="BATU" && komputer=="KERTAS"){
        hasil = "Anda Kalah";
    } else if(Rusdi=="BATU" && komputer=="GUNTING"){
        hasil = "Anda Kalah";
    } else if(Rusdi=="KERTAS" && komputer=="GUNTING"){
        hasil = "Anda Kalah";
    } else if(Rusdi=="GUNTING" && komputer=="KERTAS"){
        hasil = "Anda Menang";
    } else if(Rusdi=="GUNTING" && komputer=="BATU"){
        hasil = "Anda Kalah";
    }

    System.out.println("Rusdi memilih = "+Rusdi);
    System.out.println("Komputer memilih = "+komputer);
    System.out.println("Hasilnya adalah = "+hasil);
}
}