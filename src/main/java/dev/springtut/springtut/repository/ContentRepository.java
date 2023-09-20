package dev.springtut.springtut.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import dev.springtut.springtut.model.Content;
import dev.springtut.springtut.model.Status;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    // Fetching/Implementing Query Method by Query Derivation
    List<Content> findAllByTitleContains(String keyword);

    // Fetching/Implementing Query Method by manually defining the query
    @Query("SELECT * FROM Content WHERE status = :status")
    List<Content> listByStatus(@Param("status") Status status);
}
