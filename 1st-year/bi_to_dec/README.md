# Binary to Decimal Conventer

Bu küçük Java programı, kullanıcıdan alınan ikili (binary) ifadeyi onluk (decimal) sayıya çevirir. 

## Kullanılan Teknolojiler

- Java
- Eclipse IDE

## Dosya Yapısı

```
bi_to_dec/
├── BinaryToDeci.java
└── README.md
```

## Nasıl Çalışır?

1. Kullanıcıdan boşlukla ayrılmış binary ifadeler alınır.
2. Her bir girdi bu değerlerden biriyse `1` kabul edilir: `1`, `one`, `true`, `yes`.
3. Diğer tüm değerler `0` kabul edilerek işlem yapılır.
4. Binary sayı, onluk (decimal) karşılığına çevrilir ve ekrana yazdırılır.

## Örnek Girdi-Çıktı

Enter the binary number: `1 true false no zero one one 0`

Binary number: `1 true false no zero one one 0`

Decimal equivalent: `198`

## Açıklama

"1" -> 1
true -> 1
false -> 0
no -> 0
zero -> 0
one -> 1
one -> 1
0 -> 0

Binary: 1 1 0 0 0 1 1 0 → (11000110)₂ = 198₁₀

## Öğrenilenler

- 'StringTokenizer' sınıfı kullanımı
- 'Math.pow()' ile üs alma işlemi
- Mantıksal karşılaştırmalarla esnek kullanıcı girişi

## Geliştiren

[Çiğdem Yıldız](https://github.com/Cigdem-Yildiz)
