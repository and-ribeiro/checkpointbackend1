package com.digitalhouse.series.repository;

import com.digitalhouse.series.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SeriesRepository extends JpaRepository<Series, Integer> {
    List<Series> findByGenre(String genre);
}
