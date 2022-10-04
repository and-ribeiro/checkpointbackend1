package com.digitalhouse.series.service;

import com.digitalhouse.series.model.Series;
import com.digitalhouse.series.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SeriesServiceImpl implements SeriesService{

    @Autowired
    private SeriesRepository seriesRepository;

    @Override
    public List<Series> findByGenre(String genre) {
        return seriesRepository.findByGenre(genre);
    }

    @Override
    public Series saveSerie(Series series) {
        return seriesRepository.save(series);
    }

}
