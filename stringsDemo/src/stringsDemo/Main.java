package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel.";
		/*System.out.println("Eleman sayisi:"+mesaj.length());
		System.out.println("11. eleman :"+mesaj.charAt(11));//İndexteki elemanı bulmak için kullanılır.
		System.out.println("Yasasin. "+mesaj.concat(mesaj));//İki stringi birbirine bağlar.
		System.out.println(mesaj.startsWith("B"));//Stringin hangi kelime ile başladığını öğrenmek için kullanılır.Boolean değer döndürür.
		System.out.println(mesaj.endsWith("a"));//Stringin hangi kelime ile bittiğini öğrenmek için kullanılır.Boolean değer kullanılır.
		char[] karakterler = new char[5];//Yeni bir char dizisi oluşturduk.
		mesaj.getChars(2, 5, karakterler, 0);//mesaj char dizisini karakterler char dizisine 2den 5'e kadar, 0'dan başlayarak aktardık.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("v"));// v harfinin kaçıncı indexte başladığını bulmak için kullandık. Sadece ilk v'yi buluruz.
		System.out.println(mesaj.lastIndexOf("k"));// k harfini sondan başlayarak kontrol eder ve baştan kaçıncı indexte olduğunu bize söyler.
		*/
		
		String yeniMesaj = mesaj.replace(" ", "-");//String içindeki boşluk karakerini - karakteri ile değiştirdik.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));//mesajı ikinci indexinden sonrasını yazdırdık.
		System.out.println(mesaj.substring(3,10));//mesajı üçüncü indeksten(3 dahil) başlatarak,10. indekse kadar(10 hariç) yazdırdık.
		
		for(String kelime : mesaj.split(" ") ) {//split: kelimeyi bölmek istediğimizz karakteri belirlerken kullanıyoruz.
			System.out.println(kelime);
		}
		for(String kelime : yeniMesaj.split("-") ) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toUpperCase());//Tüm stringi büyük harf yapıyor.
		System.out.println(mesaj.toLowerCase());//Tüm stringi küçük harf yapıyor.
		System.out.println(mesaj.trim());//Stringin sağındaki ve solundaki boşlukları siliyor.
	}

}
