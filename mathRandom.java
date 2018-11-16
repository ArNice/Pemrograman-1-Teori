public class mathRandom{
    // Code untuk mengacak huruf dari 25 alfabet
    public static void main(String[] args){
        // Code agar output looping dan huruf diacak dua kali
        // Tipe data Integer
        int i;
        for (i=0;i<=1;i++){
        // Membuat objek untuk diacak
        String huruf = "abcdefghijklmnopqrstuvwxyz";
        // Code untuk mengacak huruf
        // Tipe data Integer
        int acak = (int)(Math.random()* 27); 
        // Code untuk menampilkan huruf yang diacak dan diubah menjadi huruf kapital
        System.out.println(Character.toUpperCase(huruf.charAt(acak)));
        }
    }
}
