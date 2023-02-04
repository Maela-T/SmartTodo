package com.example.smarttodo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "item_table")
class Item(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "item") val item: String
    )

