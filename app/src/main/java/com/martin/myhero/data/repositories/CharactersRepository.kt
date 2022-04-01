package com.martin.myhero.data.repositories

import com.martin.myhero.data.models.NetResult
import com.martin.myhero.data.services.CharacterService
import com.martin.myhero.data.services.CharactersResponse

class CharactersRepository(
    private val characterService: CharacterService
) : BaseRepository() {

    suspend fun getCharacters(offset: Int, limit: Int = 15): NetResult<CharactersResponse> =
        handleResult(characterService.getCharacters(authParams.getMap(), offset, limit))
}