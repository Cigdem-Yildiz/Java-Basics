# Binary Run Length Encoder

Kullanıcıdan alınan metin mesajları binary formata çevirip run-length encoding prensiplerini kullanarak şifreler.

## Kullanılan Teknolojiler

- Java
- Eclipse IDE

## Dosya Yapısı

```
binaryRunLenthEncoder/
├── BinaryRunLenthEncoder.java
└── README.md
```

## Nasıl Çalışır?

1. Kullanıcıdan ASCII metin mesajı alınır.
2. Mesaj Binary'e çevrilir.
3. Ardışık bitler gruplanıp oluşan gruplar kodlanır.
4. Çıktı olarak boşlukla ayrılmış sıfır blokları ekrana yazdırılır.

## Örnek Girdi - Çıktı

```
Enter a message: BTS
Encoded message: 0 0 00 0000 0 0 00 0 0 0 00 0 0 0 00 0 0 0 00 00 0 0 00 0 0 0 00 00 0 00
```

## Açıklama
**Örnek:** Tek Karakter 'C'

**Girdi:** C

**Binary:** 1000011


**Kodlama Süreci:**

1 ardışık 1 → 0 0 <br>4 ardışık 0 → 00 0000<br>2 ardışık 1 → 0 00


**Çıktı:** `0 0 00 0000 0 00`

## Öğrenilenler

- Run-Length Encoding algoritmasının mantığı ve uygulaması
- Binary veri üzerinde pattern recognition teknikleri
- String formatlama (String.format(), replace(), repeat())
- ASCII - Binary dönüşüm işlemleri (Integer.toBinaryString())

## Geliştiren

[Çiğdem Yıldız](https://github.com/Cigdem-Yildiz)
