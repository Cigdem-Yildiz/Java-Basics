# Taş Kağıt Makas

Bu proje, konsol tabanlı klasik **Taş - Kağıt - Makas (Rock - Paper - Scissors)** oyununun Java ile geliştirilmiş bir versiyonudur.  
Kullanıcı ve bilgisayar karşılıklı hamle yapar ve kazanan belirlenir. Oyun çoklu oynanabilir, istatistikleri tutar.

---

## Kullanılan Teknolojiler

- Java (standart kütüphaneler)
- Eclipse IDE (veya başka bir Java geliştirme ortamı)

---

## Dosya Yapısı

```
rock_paper_scissors/
├── RockPaperScissors.java
└── README.md
```

---

## Oyun Nasıl Oynanır?

1. Konsola `"rock"`, `"paper"` veya `"scissors"` yazın.
2. Bilgisayar rastgele bir hamle yapar.
3. Kazanan, klasik kurallara göre belirlenir:
   - **Rock** scissors'ı yener.
   - **Paper** rock'ı yener.
   - **Scissors** paper'ı yener.
4. Oyun sonunda tekrar oynayıp oynamayacağınız sorulur.

---

## Programı Çalıştırma

1. Kodu bir Java IDE’sine yapıştır veya terminal üzerinden çalıştır:
   ```bash
   javac RockPaperScissors.java
   java RockPaperScissors

2. Konsoldan hamle girin:
   ```bash
   Enter your move(rock/paper/scissors): rock
   Computer choice: scissors
   You won!

---

## Örnek Oynanış
```
Enter your move(rock/paper/scissors): paper
Computer choice: rock
You won!
Play again(yes/no): yes

Enter your move(rock/paper/scissors): scissors
Computer choice: rock
You lost!
Play again(yes/no): no

You played 2 time/s. You won 1 of them.
Game is over!
Thank you for playing!
```

---

## Öğrenilenler
- Kullanıcı girişi ve string karşılaştırmaları

- Math.random() ile rastgele değer üretimi

- Temel mantıksal karşılaştırmalar (if-else)

- Döngü (do-while) ile çoklu oyun oynama

- Basit istatistik tutma (galibiyet/oyun sayısı)

---

## Geliştiren

[Çiğdem Yıldız](https://github.com/Cigdem-Yildiz)
