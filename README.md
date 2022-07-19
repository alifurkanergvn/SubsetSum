# SubsetSum

Methodun imzası şu şekilde: boolean siraliAltKumeVarMi(int[] sayilar, int ulasilacakToplam)

Beklenen Çıktı: Verilen 'sayilar' dizesinde öyle bir altküme var mı ki altküme elemanları dizede yan yana olsun ve toplamları 'ulasilacakToplam' sayısına eşit olsun.

Örnek #1: [1, 3, 1, 4, 23] dizesi ve 8 sayısı verilsin. Method True dönmeli çünkü 3, 1, 4 değerleri toplamı 8e eşittir.
Örnek #2: [1, 3, 1, 4, 23] dizesi ve 7 sayısı verilsi. Method False dönmeli çünkü hiçbir altküme (yan yana olmak koşuluyla) 7 toplamını vermiyor. 3, 4 değerlerinin toplamı 7 ama yan yana değiller, aralarında 1 değeri de var.

Dikkat edilmesi gereken kurallar/tüyolar:
•	Örnekte olduğu gibi bir sayı dizede birden fazla kez yer alabilir.
•	Örnekte olduğu gibi dizedeki sayılar sıralı olmak zorunda değil.
•	Dizedeki sayılar negatif değere sahip olabilir.
•	Dizedeki sayılarda yer alabilecek en küçük sayı -100 olabilir. Bu şekilde mi diye kontrol etmenize gerek yok, bu şekilde iletilecek diye kabul edebilirsiniz.
•	Çok büyük sayı olursa çatlar mı gibi şeylere takılmanıza gerek yok :)
