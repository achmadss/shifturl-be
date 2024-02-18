package com.achmadss.shifturl.repositories

import com.achmadss.shifturl.entities.URLMapping
import java.util.Optional
import java.util.UUID
import org.springframework.data.jpa.repository.JpaRepository

interface URLMappingRepository: JpaRepository<URLMapping, UUID> {
    fun findByShortURL(shortURL: String): Optional<URLMapping>
}
