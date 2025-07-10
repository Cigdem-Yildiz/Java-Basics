# Müzik Çalar

Bu proje, `.wav` formatındaki müzik dosyalarını çalabilen basit bir **Java tabanlı müzik çalar**dır.  
Kullanıcılar arayüz üzerinden şarkıyı başlatabilir, durdurabilir, sıfırlayabilir ve listedeki parçalar arasında gezinebilir. 

---

## Kullanılan Teknolojiler

- Java
- `javax.sound.sampled` API
- Eclipse IDE

---

## Dosya Yapısı
```
music_player/
├── MusicPlayerInterface.java
├── MusicPlayerMain.java
└── README.md
```

---

## Özellikler

- `.wav` uzantılı müzik dosyalarını tanır
- Otomatik olarak klasördeki tüm şarkıları listeler
- Arayüzdeki butonları kullanarak şarkıyı durdurur, başlatır, sonraki veya önceki şarkıyı oynatır, şarkıyı baştan başlatır.
- Frame kapandığında şarkı kapanır.

---

## Programı Çalıştırma

1. `MusicPlayerMain.java` dosyasındaki `directoryPath` kısmını kendi müzik klasörünle değiştir:
   ```java
   String directoryPath = "C:\\Users\\_YOUR_NAME\\Music";

2. Tüm sınıfları derleyin:
   ```bash
   javac MusicPlayerMain.java MusicPlayerInterface.java

3. Programı başlatın:
   ```bash
   java MusicPlayerMain

4. Arayüz açıldığında müzik seçme, oynatma ve duraklatma gibi işlemleri butonlar üzerinden gerçekleştirebilirsiniz.

---


## Planlanan Geliştirme: GUI Arayüz

Swing veya JavaFX kullanılarak görsel bir arayüz eklenecek.
Bu sayede kullanıcı:

- Butonlar ile parçaları kontrol edebilecek ✓

- Liste görünümünden şarkı seçebilecek

- Arka planda otomatik geçiş ve görsel efektler eklenecek ✓

---

## Öğrenilenler

- File ve Directory işlemleri

- AudioInputStream ve Clip ile ses çalma

- Exception yönetimi (IOException, UnsupportedAudioFileException)

- Java'da `JFrame`, `JButton`, `JPanel` gibi bileşenlerle temel GUI oluşturmayı ve yerleşim düzenlerini (`FlowLayout`, `setBounds`) kullanmayı öğrendim.
  
- `ActionListener` gibi event listener’larla kullanıcı etkileşimini yönetmeyi ve `.wav` dosyalarını GUI üzerinden çalmayı başardım.

- Arayüzde ikon hizalaması ve görsel düzenlemeler üzerine çalıştım.

- Yeni GUI sürümünü izole bir şekilde geliştirmek için `git branch` yapısını öğrendim ve kullandım.

---

## Geliştiren

[Çiğdem Yıldız](https://github.com/Cigdem-Yildiz)
