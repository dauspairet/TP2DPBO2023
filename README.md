# TP2DPBO2023
Saya Muhamad Firdaus [2101995] mengerjakan soal TP 2 dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Deskripsi Tugas
Buatlah program Java yang terkoneksi dengan database MySQL. Berikut spesifikasi program yang harus dibuat:
- Program bebas, kecuali program Mahasiswa dan Book Author
- Terdapat proses Create, Read, Update, dan Delete data
- Terdapat proses Autentikasi (Login, Register) *
- Menggunakan minimal 2 tabel pada database
- Harus terdapat minimal 1 properti gambar pada class yang dibuat (gambar akan ditampilkan pada UI)
- Terdapat pergantian screen pada UI
- Terdapat button navigasi untuk beralih screen
- List data ditampilkan menggunakan card (JPanel)
* Boleh login dan/atau register. Tidak perlu ada enkripsi password

## Design Program
Program ini terdapat `8 class` yang berperan sebagai main pada program ini, yaitu `class login`. Berikut keterangan masing-masing class:
- `DbConnection` : Class yang berfungsi untuk melakukan koneksi ke database. Database yang digunakan dalam program ini, yaitu Mysql.
- `Login` : Class form yang berfungsi untuk melakukan proses _login_. Proses ini hanya dapat dilakukan ketika _user_ telah mempunyai akun atau telah melakukan _sign up_
- `SignUp` : Class form yang berfungsi untuk melakukan proses _sign up_. Proses ini dilakukan ketika user belum mempunyai akun.
- `JPanelCard` : Class form yang berfungsi untuk menampilkan daftar card yang berisi daftar kriminal yang terdapat pada _database_.
- `Card` : Class form yang berfungsi untuk menampilkan data kriminal yang terdiri dari idCriminal dan nama.
- `Add` : Class form yang berfungsi untuk proses penambahan data pada _database_.
- `UserAccount` : Class yang berfungsi untuk menyimpan id account.
- `Criminal` : Class yang berfungsi untuk menyimpan atribut kriminal.

## Desain

## Alur Program
1. Login
2. Sign Up
3. Home
4. Add
5. Logout
