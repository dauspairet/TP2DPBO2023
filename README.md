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
1. Login

![login](https://github.com/dauspairet/TP2DPBO2023/raw/main/Screenshot/login.jpg)

2. Sign Up

![signup](https://github.com/dauspairet/TP2DPBO2023/raw/main/Screenshot/sign%20up.jpg)

3. Home

![home](https://github.com/dauspairet/TP2DPBO2023/raw/main/Screenshot/home.jpg)

4. Add

![add](https://github.com/dauspairet/TP2DPBO2023/raw/main/Screenshot/upload.jpg)

5. Logout

![logout](https://github.com/dauspairet/TP2DPBO2023/raw/main/Screenshot/logout.jpg)

## Alur Program
1. Login

Jika _user_ mempunyai akun maka dapat menggunakan metode _login_ untuk mengakses _home_. _User_ akan mengisi idAccountnya beserta dengan passwordnya. Jika _Textfield_ kosong, salah idAccount atau salah password maka _user_ tidak bisa mengakses _home_. Jika berhasil _login_ maka data akan disimpan di database account dan user_admin.

2. Sign Up

Jika _user_ belum mempunyai akun maka dapat menggunakan metode _sign up_ untuk melakukan _login_ kemudian mengakses _home_. _User_ akan diminta untuk mengisi idAccount beserta dengan passwordnya. Jika idAccount ada yang sama maka akan ada _pop up_ untuk meminta _user_ mengganti idAccount tersebut. Jika berhasil _Sign Up_ maka data akan disimpan di database account dan user_admin.

4. Home

Halaman utama yang dapat diakses oleh _user_ jika melakukan telah _login_.

5. Add

Halaman untuk mengirim gambar, id, dan nama kriminal. User akan diminta untuk mengisi id kriminal, nama kriminal, dan foto kriminal. Jika berhasil melakukan _upload_ maka data akan disimpan di database images.

6. Logout

_User_ keluar dari akunnya dengan menekan tombol _logout_.

## User Login
`id`        123
`password`  123
