package com.digitalhouse.series.service;

import com.digitalhouse.series.model.Series;

import java.util.List;

public interface SeriesService {

    List<Series> findByGenre(String genre);
    Series saveSerie(Series series);

}
