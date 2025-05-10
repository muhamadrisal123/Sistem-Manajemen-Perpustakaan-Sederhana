# Sistem Manajemen Perpustakaan Sederhana

## Deskripsi
Proyek ini merupakan implementasi konsep Object-Oriented Programming (OOP) dalam bahasa Java, dengan studi kasus manajemen perpustakaan sederhana.

## Fitur Utama
- Pendaftaran dan pengelompokan pengguna (anggota siswa, guru, dan pustakawan)
- Pengelolaan data buku
- Proses peminjaman buku
- Tampilan data buku menggunakan array

## Konsep OOP yang Digunakan
- **Class & Object**: Class seperti `Book`, `User`, `Member`, `LoanTransaction` mewakili objek nyata di dunia perpustakaan.
- **Encapsulation**: Atribut privat diakses melalui getter/setter untuk melindungi data.
- **Inheritance**: `StudentMember` dan `TeacherMember` adalah turunan (cucu) dari `Member` yang merupakan turunan dari `User`.
- **Array**: Digunakan untuk menyimpan dan menampilkan daftar buku.

## Struktur Folder
src/
├── Book.java
├── User.java
├── Member.java
├── StudentMember.java
├── TeacherMember.java
├── Librarian.java
├── LoanTransaction.java
└── Main.java


## Cara Menjalankan
1. Compile semua file Java:
2. Jalankan program utama:
