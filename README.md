<img width="1920" height="1080" alt="Screenshot 2025-11-04 140614" src="https://github.com/user-attachments/assets/30ececb2-797a-4628-ae22-55c9fa547053" />
1 Program Menghitung Biaya Pengiriman
 Perangkat program:

import java.util.Scanner;
→ Untuk menggunakan kelas Scanner agar bisa membaca input dari keyboard.

Scanner input = new Scanner(System.in);
→ Membuat objek input yang digunakan untuk menerima data dari pengguna.

Deklarasi variabel (berat, jarak, panjang, lebar, tinggi)
→ Menyimpan data numerik yang dimasukkan pengguna.

double volume = panjang * lebar * tinggi;
→ Menghitung volume paket dalam satuan cm³.

Percabangan (jarak <= 10) ? 4250 : 6000;
→ Jika jarak kurang atau sama dengan 10 km, maka biaya per kg adalah Rp 4.250,
jika lebih dari 10 km, biaya per kg Rp 6.000.

if (volume > 100)
→ Mengecek apakah volume paket lebih dari 100 cm³.
Jika ya, tambahkan biaya tambahan Rp 50.000.

System.out.println()
→ Menampilkan hasil volume dan total biaya pengiriman.

Cara kerjanya:

Program membaca semua data yang dibutuhkan (berat, jarak, panjang, lebar, tinggi), menghitung volume, menentukan tarif berdasarkan jarak, dan menambahkan biaya tambahan jika volume besar. Lalu, hasil akhir berupa total biaya ditampilkan ke layar.
