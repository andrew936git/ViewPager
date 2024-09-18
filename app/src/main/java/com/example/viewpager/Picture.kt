package com.example.viewpager

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable
import android.widget.ImageView
import java.io.Serializable

@SuppressLint("ParcelCreator")
class Picture(val title: String, val nameAuthor: String, val image: Int): Serializable {

    companion object{
        val pictureList = mutableListOf(
            Picture("В осеннем лесу", "Михаил Нестеров", R.drawable.forest),
            Picture("Пейзаж с двумя девушками", "ММарсель Диф", R.drawable.peizagh),
            Picture("Проводы покойника", "Василий Перов", R.drawable.provodi),
            Picture("Крик", "Эдвард Мунк", R.drawable.scream),
            Picture("Читатели", "Чарльз Бартон", R.drawable.read),
            Picture("С дипломом", "Василий Максимов", R.drawable.diplom),
            Picture("Женщина с гитарой", "Огюст Ренуар", R.drawable.gitara),
            Picture("Девятый вал", "Иван Айвазовский", R.drawable.devyatival),
            Picture("Оттепель", "Юрий Клевер", R.drawable.ottepel),
            Picture("Волшебница Шалот", "Джон Уотерхауз", R.drawable.lady)

        )
    }

}