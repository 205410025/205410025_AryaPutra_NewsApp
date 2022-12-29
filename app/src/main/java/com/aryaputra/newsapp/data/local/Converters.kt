package com.aryaputra.newsapp.data.local

import androidx.room.TypeConverter
import com.aryaputra.newsapp.data.model.Source
//class converters untuk mengconvert data
class Converters {

    @TypeConverter
    fun fromSource(source: Source): String{
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name, name)
    }
}