package com.example.android.navigation

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//สร้างไฟล์คลาส Kotlin ใหม่ชื่อ Word ที่มีคลาสข้อมูล Word
//คลาสนี้จะอธิบายถึงเอนทิตี (ซึ่งแสดงถึงตาราง SQLite) สำหรับคำพูดของคุณ คุณสมบัติแต่ละรายการในคลาสแทนคอลัมน์ในตาราง ในที่สุดห้องจะใช้คุณสมบัติเหล่านี้เพื่อสร้างตารางและสร้างอินสแตนซ์วัตถุจากแถวในฐานข้อมูล

@Entity(tableName = "word_table")
class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String){

}