# Tugas Praktik STSI4102 - Algoritma dan Pemrograman

Repo ini berisi tugas praktikum mata kuliah **STSI4102 Algoritma dan Pemrograman** menggunakan Java.

---

## Daftar Program

### 1. `PenghasilanKaryawan.java` (Tugas Praktik 2)
Program untuk menghitung slip rincian penghasilan karyawan dan upah lembur berbasis percabangan (*if-else statement*).
- **Input:** Golongan Karyawan (`A`, `B`, atau `C`) dan Jumlah Jam Lembur.
- **Output:** Slip rincian gaji (Gaji Pokok, Upah Lembur, dan Total Penghasilan).

### 2. `PenghasilanKaryawanArray.java` (Tugas Praktik 3)
Program perhitungan penghasilan karyawan dan lembur berbasis operator, statemen `if`, serta struktur data **Array**.
- **Struktur Data:**
  - Array daftar gaji pokok: `{5000000.0, 6500000.0, 9500000.0}`
  - Array persentase lembur: `{0.30, 0.32, 0.34, 0.36, 0.38}`

---

## 💼 Ketentuan & Aturan Perhitungan

### Gaji Pokok Berdasarkan Golongan
| Golongan | Gaji Pokok |
| :---: | :--- |
| **A** | Rp 5.000.000 |
| **B** | Rp 6.500.000 |
| **C** | Rp 9.500.000 |

### Persentase Upah Lembur Berdasarkan Jam
| Jam Lembur | Persentase Upah Lembur |
| :---: | :--- |
| `0` jam | 0% (Tanpa upah lembur) |
| `1` jam | 30% dari Gaji Pokok |
| `2` jam | 32% dari Gaji Pokok |
| `3` jam | 34% dari Gaji Pokok |
| `4` jam | 36% dari Gaji Pokok |
| `≥ 5` jam | 38% dari Gaji Pokok |

---

## Cara Menjalankan

Gunakan Java Development Kit (JDK).

### 1. Compile
```bash
# Tugas Praktik 2
javac PenghasilanKaryawan.java

# Tugas Praktik 3
javac PenghasilanKaryawanArray.java
```

### 2. Run Program
```bash
# Tugas Praktik 2
java PenghasilanKaryawan

# Tugas Praktik 3
java PenghasilanKaryawanArray
```
