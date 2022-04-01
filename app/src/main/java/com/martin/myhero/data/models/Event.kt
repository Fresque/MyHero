package com.martin.myhero.data.models

data class Event(
    val title: String = "",
    val description: String = "",
    val resourceUri: String = "",
    val modified: String = "",
    val start: String = "",
    val end: String = "",
    val thumbnail: Thumbnail = Thumbnail(),
    val comics: Appearances = Appearances()
)