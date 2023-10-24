
public class Sring {

    public static void main(String[] args) {
//        String merupakan sebuah tipe data reference. Tipe data ini diperlakukan 
//        sebagai sebuah obyek.String adalah kumpulan beberapa karakter(char).

        String belajar = "Hello World!";
        System.out.println(belajar);
//        String terdapat beberapa constructor yang memungkinkan kita untuk memberi
//        kan nilai awal untuk string dari sumber yang berbeda. 
        char[] PcChars = {'d', 'i', 'c', 'o', 'd', 'i', 'n', 'g'};
        String PcString = new String(PcChars);
        System.out.println(PcString);

//        cara mengetahui panjang string
//      dengan method length()
        String pc = "proggraming comunity";
        int length = pc.length();
        System.out.println(length);

//        mengambil karakter dari sebuah string
//        dengan  method charAt(int index)
        String progcom = "proggraming comunity";
        char result = progcom.charAt(10);
        System.out.println(result);
        
//        ada juga beberapa method
//No.	Nama                                    Deskripsi
//1	length()                                Digunakan untuk mengetahui panjang atau jumlah karakter dalam string.
//2	charAt(int index)                       Digunakan untuk mengambil sebuah karakter berdasarkan indeks tertentu.
//3	format(String format, Object… args)	Digunakan untuk memformat sebuah string.
//4	substring(int beginIndex)               Mengembalikan/menghasilkan substring berdasarkan indeks yang diberikan.
//5	contains(CharSequence s)                Mengembalikan/menghasilkan nilai true atau false setelah mencocokkan karakter.
//6	equals(Object object)               	Memeriksa apakah nilai objek sama dengan nilai string.
//7	isEmpty()                               Memeriksa apakah sebuah string itu kosong atau tidak.
//8	concat(String s)                    	Mengkonsolidasikan sebuah string.
//9	replace(char a, char b)         	Mengganti suatu karakter di dalam string.
//10	indexOf(String a)               	Mengetahui indeks dari sebuah substring.
//11	toLowerCase()                   	Mengubah format string menjadi huruf kecil semua.
//12	toUpperCase()                   	Mengubah format string menjadi huruf kapital semua.
//13	trim()                          	Menghapus spasi awal dan akhir dari string.
//14	valueOf(int value)              	Mengkonversi tipe yang diberikan menjadi sebuah string.
//15	compareTo()                             Membandingkan dua nilai
//Selengkapnya tentang string, kunjungi: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html.
    }
}
