package com.nhinhnguyenuit.jetpackcomposepractics1.data.repository

import com.nhinhnguyenuit.jetpackcomposepractics1.data.local.ItemDao
import com.nhinhnguyenuit.jetpackcomposepractics1.model.Item
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow

class ItemRepository  constructor(
    private val itemDao: ItemDao
) {
//    val items: Flow<List<Item>> = itemDao.getAllItems().asFlow()

    suspend fun insertItem(item: Item){
        itemDao.insertItem(item)
    }

    suspend fun deleteItem(item: Item){
        itemDao.deleteItem(item)
    }

    suspend fun updateItem(item: Item) {
        itemDao.updateItem(item)
    }

}