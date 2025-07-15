# Java Alarm Clock

Bu proje, kullanıcıdan alınan bir saat bilgisine göre 24 saat bazında alarm kuran basit bir Java uygulamasıdır. Belirtilen saatte, belirlenen `.wav` formatındaki müzik dosyasını çalar ve kullanıcı alarmı manuel olarak durdurana kadar çalmaya devam eder.

## Kullanılan Teknolojiler

- Java
- Eclipse IDE
- `.wav` formatında bir müzik dosyası

## Dosya Yapısı

```
alarm_clock/
├── AlarmClock.java
├── AlarmClockMain.java
└── README.md
```

## Nasıl Çalışır?

1. Projeyi bir Java IDE'sine (örneğin Eclipse) veya terminale yükleyin.
2. AlarmClockMain.java dosyasında musicPath değişkenine, bilgisayarınızda bulunan .wav uzantılı bir ses dosyasının tam dosya yolunu girin:
   ```java
   String musicPath = "C:\\Users\\_DELL\\Desktop\\4 O'CLOCK.wav";
   ```
3. Programı çalıştırın.
4. Konsoldaki yönergeleri takip ederek alarm saatini HH:MM formatında girin.
5. Saat geldiğinde alarm çalacak, Enter tuşuna basarak alarmı durdurabilirsiniz..

## ⚠️ Uyarılar

- Sadece `.wav` formatındaki ses dosyaları desteklenmektedir.
- Dosya yolu hatalıysa veya ses dosyası desteklenmiyorsa alarm çalışmayacaktır.
- Alarm zamanı gelene kadar her saniye terminalde (aynı satırda) güncel saat görüntülenir.
- **Geçmiş saat girilirse alarm kurulmaz** ve uyarı verilir:  
  `"This time already passed for today! Please enter a valid time."`

## Örnek Girdi-Çıktı

Enter the alarm time(HH:MM): 20:46
Alarm time set for 20:46

20:46:00
Press *Enter* to stop the alarm: 


## Öğrenilenler

Bu proje boyunca aşağıdaki temel Java konuları ve becerileri öğrenme ve pekiştirme fırsatı elde edilmiştir:

- Zaman Yönetimi:

  `LocalTime`, `DateTimeFormatter` sınıflarıyla saat alma, biçimlendirme ve karşılaştırma. Gerçek zamanlı saat takibi ve geçmiş zaman kontrolü.
- Dosya İşleme ve Ses Çalma:

  `File`, `AudioInputStream`, `Clip` sınıflarıyla `.wav` dosyasını okuma ve oynatma. `try-with-resources` kullanımı ile dosya kapatma işlemlerinin otomatikleştirilmesi.
- Çoklu İş Parçacığı (Multithreading):

  `Runnable` arayüzü ve ``Thread`` sınıfı kullanılarak paralel alarm sayacı çalıştırma.
- Hata Yönetimi ve Kullanıcı Girdisi:

  Yanlış saat formatına veya geçmiş zamana karşı kullanıcıyı bilgilendirme ve güvenli giriş sağlama.

## Geliştiren

[Çiğdem Yıldız](https://github.com/Cigdem-Yildiz)
