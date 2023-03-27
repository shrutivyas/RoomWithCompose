package com.brainjug.roomwithcompose.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.brainjug.roomwithcompose.dao.ContactDao
import com.brainjug.roomwithcompose.data.Contact

@Database(
    entities = [Contact::class],
    version = 1
)
abstract class ContactDatabase : RoomDatabase() {

    abstract val dao: ContactDao
}