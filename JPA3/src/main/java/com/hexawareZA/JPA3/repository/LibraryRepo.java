package com.hexawareZA.JPA3.repository;

import com.hexawareZA.JPA3.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibraryRepo extends JpaRepository<Library, Long> {
}
