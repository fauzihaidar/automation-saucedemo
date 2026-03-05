# Automation Test Login SauceDemo (Katalon Studio)

## Deskripsi Project

Project ini berisi automation test untuk website berikut:

https://www.saucedemo.com/

Automation dibuat menggunakan **Katalon Studio** untuk menguji fitur **login** dengan dua skenario pengujian:

1. Login berhasil menggunakan credential yang valid
2. Login gagal ketika username atau password salah

---

# Skenario Pengujian

## 1. Login Berhasil

User melakukan login menggunakan credential yang benar.

Credential yang digunakan:
Username: standard_user  
Password: secret_sauce

Expected Result:
User berhasil login dan diarahkan ke halaman **Products**.
Verifikasi yang dilakukan:
Automation script akan memverifikasi bahwa **label "Products" muncul** setelah login berhasil.

---

## 2. Login Gagal

User memasukkan username atau password yang salah.

Contoh input:
Username: wrong_user  
Password: wrong_password

Expected Result:
Login gagal dan muncul **pesan error**.
Verifikasi yang dilakukan:
Automation script akan memverifikasi bahwa **error message muncul pada halaman login**.

---

# Strategi Pemilihan Locator

Locator dipilih berdasarkan **stabilitas, keunikan, dan performa**.

| Elemen | Jenis Locator | Locator | Alasan |
|------|------|------|------|
| Username Field | ID | user-name | ID unik dan paling stabil |
| Password Field | ID | password | Elemen unik |
| Login Button | ID | login-button | Locator stabil |
| Products Label | XPath | //span[text()='Products'] | Digunakan untuk verifikasi login berhasil |
| Error Message | XPath | //h3[contains(@data-test,'error')] | Digunakan untuk verifikasi login gagal |

Penggunaan **ID locator** diprioritaskan karena lebih cepat dan lebih stabil dibandingkan locator lainnya.

---

# Penanganan Wait dan Sinkronisasi

Automation script menggunakan **explicit wait melalui verifikasi elemen** yang tersedia di Katalon.
Contoh:
WebUI.verifyElementPresent(testObject, 10)
Penjelasan:
- Script akan menunggu maksimal **10 detik**
- Jika elemen muncul sebelum 10 detik → test berhasil
- Jika elemen tidak muncul → test gagal

Pendekatan ini membantu menghindari kegagalan test akibat **loading halaman yang lambat**.

---

# Asumsi dan Pertimbangan

Beberapa asumsi yang digunakan dalam pembuatan automation script:
1. Struktur website SauceDemo tidak berubah.
2. Automation dijalankan menggunakan **browser Google Chrome**.
3. WebDriver dikelola otomatis oleh Katalon Studio.
4. Koneksi internet tersedia saat menjalankan automation.

---

# Cara Install Dependencies (Windows)

## 1. Install Java

Download Java JDK dari:
https://www.oracle.com/java/technologies/javase-downloads.html
Setelah instalasi selesai, cek dengan command berikut:
java -version


---

## 2. Install Katalon Studio

Download Katalon Studio dari:

https://katalon.com/download

Langkah-langkah:
1. Download Katalon Studio
2. Extract file zip
3. Jalankan file berikut
katalon.exe


---

# Konfigurasi WebDriver

Katalon Studio secara otomatis mengelola WebDriver.
Jika diperlukan update ChromeDriver:
Masuk ke menu:
Tools → Update WebDrivers → Chrome

---
# Cara Menjalankan Automation Script

1. Buka **Katalon Studio**
2. Pilih **Open Project**
3. Pilih folder project automation ini
4. Buka folder:
   Test Cases
5. Jalankan test case berikut:
- Login_Success
- Login_Failure
6. Klik tombol:
Run → Chrome

---
# Cara Melihat Automation Test Report

Setelah automation selesai dijalankan, report akan otomatis dibuat pada folder:
Reports/

Buka file **HTML report** untuk melihat:
- Status test (Passed / Failed)
- Detail langkah test
- Log execution
---
# Repository Git
Project ini disimpan pada repository GitHub public.
https://github.com/fauzihaidar/automation-saucedemo



