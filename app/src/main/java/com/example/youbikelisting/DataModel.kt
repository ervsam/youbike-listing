package com.example.youbikelisting

data class DataModel(
    val id: String,
    val sno: String,
    val sna : String,
    val tot : String,
    val sbi : String,
    val sarea : String,
    val mday : String,
    val lat : String,
    val lng : String,
    val ar : String,
    val sareaen : String,
    val snaen : String,
    val aren : String,
    val bemp : String,
    val act : String
    ) : Comparable<DataModel> {
    override fun compareTo(other: DataModel): Int = this.mday.toInt().compareTo(other.mday.toInt())
}