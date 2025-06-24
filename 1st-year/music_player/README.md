# Müzik Çalar

Bu proje, `.wav` formatındaki müzik dosyalarını çalabilen basit bir **Java tabanlı müzik çalar**dır.  
Kullanıcılar; şarkıyı başlatabilir, durdurabilir, sıfırlayabilir ve listedeki parçalar arasında gezinebilir.  
**Gelecek adım:** Projeye kullanıcı arayüzü (GUI) eklenecektir.

---

## Kullanılan Teknolojiler

- Java
- `javax.sound.sampled` API
- Eclipse IDE

---

## Dosya Yapısı
```
music_player/
├── MusicPlayerMain.java
└── README.md
```

---

## Özellikler

- `.wav` uzantılı müzik dosyalarını tanır
- Otomatik olarak klasördeki tüm şarkıları listeler
- Kullanıcıdan komut alarak:
  -  `P` — Şarkıyı çalar(Play)
  -  `S` — Durdurur(Stop)
  -  `R` — Baştan başlatır(Restart)
  -  `N` — Sonraki şarkıya geçer(Next Song)
  -  `F` — Önceki şarkıya döner(Previous Song)
  -  `E` — Programdan çıkar(Exit)

---

## Programı Çalıştırma

1. `MusicPlayerMain.java` dosyasındaki `directoryPath` kısmını kendi müzik klasörünle değiştir:
   ```java
   String directoryPath = "C:\\Users\\_YOUR_NAME\\Music";

2. Derleyip çalıştır:
   ```bash
   javac MusicPlayerMain.java
   java MusicPlayerMain

3. Programı başlatıp ekrandaki yönergeleri izleyin.

---

## Örnek Konsol Görünümü

```
****************
* MUSIC PLAYER *
****************

Now selected: 4 O'CLOCK - R&V.wav

P = Play
S = Stop
R = Reset
N = Next Song
F = Former Song
E = Exit
Enter your choice:
```

---

## Planlanan Geliştirme: GUI Arayüz

Swing veya JavaFX kullanılarak görsel bir arayüz eklenecek.
Bu sayede kullanıcı:

- Butonlar ile parçaları kontrol edebilecek

- Liste görünümünden şarkı seçebilecek

- Arka planda otomatik geçiş ve görsel efektler eklenecek

Not: GUI sürümü ayrı bir branch veya klasörde yayınlanacaktır.

---

## Öğrenilenler

- File ve Directory işlemleri

- AudioInputStream ve Clip ile ses çalma

- Exception yönetimi (IOException, UnsupportedAudioFileException)

- Döngü ve kullanıcı etkileşimi

---

## Geliştiren

[Çiğdem Yıldız](https://github.com/Cigdem-Yildiz)
