#Hangman Game
------------

Bu proje, klasik **Adam Asmaca (Hangman)** oyununu Java ile konsolda oynamanızı sağlar.  
Rastgele seçilen bir kelimeyi harf harf tahmin ederek bulmaya çalışırsınız.  
Toplam 6 yanlış hakkınız vardır.
***

##Kullanılan Teknolojiler

- Java
- Eclipse IDE
***

Dosya Yapısı

```
hangman_game/
├── HangmanGame.java
└── README.md
```
***

Nasıl Oynanır?

1. Program çalıştığında rastgele bir kelime seçilir.
2. Sizden birer harf girmeniz istenir.
3. Her doğru tahminde kelimenin o harfi açılır.
4. Her yanlış tahminde "adam" çizmeye başlar.
5. 6 yanlışta oyun biter!
***

Programı Çalıştırma

1. `HangmanGame.java` dosyasını bir Java IDE’sinde açın veya terminalden çalıştırın:
   ```bash
   javac HangmanGame.java
   java HangmanGame

2. Konsola harf girerek oyunu oynayın:

_ _ _ _ _ _
Enter your guess: e
***

Öğrenilenler
- ArrayList ile dinamik liste yönetimi

- Karakter dizisi ve kullanıcı girişi kontrolü

- Random sınıfı ile rastgele kelime seçimi

- switch-case yapısı ile ASCII sanat (adam çizimi)
***

Geliştirme Fikirleri
- Zorluk seviyesi (kolay / zor kelimeler)

- Dosyadan kelime çekme

- Skor sistemi ekleme

- Türkçe karakter desteği
***

Geliştiren
Çiğdem Yıldız (https://github.com/Cigdem-Yildiz)
