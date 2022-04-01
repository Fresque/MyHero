package com.martin.myhero.data.repositories

import com.martin.myhero.data.models.NetResult
import com.martin.myhero.data.services.EventResponse
import com.martin.myhero.data.services.EventService

class EventRepository(
    private val eventService: EventService
) : BaseRepository() {

    suspend fun getEvents(offset: Int, limit: Int = 15): NetResult<EventResponse> =
        handleResult(eventService.getEvents(authParams.getMap(), offset, limit))

}