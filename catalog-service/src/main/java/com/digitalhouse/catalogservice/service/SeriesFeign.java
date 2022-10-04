package com.digitalhouse.catalogservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="serie-service")
public interface SeriesFeign {

    @GetMapping("/series/{genre}")
    List<Object> findSeries(@PathVariable String genre);
}
