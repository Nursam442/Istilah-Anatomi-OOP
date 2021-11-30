package cg;

public class Kopi {
    String namaKopi;
    String asalKopi;
    int harga;
    
    void CetakHasil(){
        System.out.println("Nama Kopinya      : " +namaKopi);
    }
    
    String tampilkanAsal(){
        return asalKopi;
    }
     int tampilkanHarga(){
         return harga;
     }
     
     public static void main(String[] args) {
        Kopi kapten = new Kopi();
        kapten.namaKopi = "Kapten";
        kapten.CetakHasil();
        kapten.asalKopi = "Bandung";
        kapten.harga = 5000;
         System.out.println("Asal Kopi         : "+kapten.asalKopi);
         System.out.println("harga             : "+kapten.harga);
         System.out.println("----------------------------");
         
         Kopi torabika = new Kopi();
         torabika.namaKopi = "Torabika";
         torabika.CetakHasil();
         torabika.asalKopi = "Jakarta";
         torabika.harga = 6000;
         System.out.println("Asal Kopi         : "+torabika.asalKopi);
         System.out.println("harga             : "+torabika.harga);
         System.out.println("-----------------------");
         
         Kopi barista = new Kopi();
         barista.namaKopi = "Barista";
         barista.CetakHasil();
         barista.asalKopi ="Palembang";
         barista.harga = 40000;
         System.out.println("Asal Kopi         : "+torabika.asalKopi);
         System.out.println("harga             : "+torabika.harga);
    }
 
    

 }
