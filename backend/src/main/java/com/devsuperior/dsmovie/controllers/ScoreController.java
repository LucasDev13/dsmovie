package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.dto.MovieDto;
import com.devsuperior.dsmovie.dto.ScoreDto;
import com.devsuperior.dsmovie.entities.Score;
import com.devsuperior.dsmovie.services.MovieService;
import com.devsuperior.dsmovie.services.ScoreService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/api/scores")
public class ScoreController {

    private ScoreService service;

    public ScoreController(ScoreService service) {
        this.service = service;
    }

    @PutMapping
    public MovieDto saveScore(@RequestBody ScoreDto dto){
        return service.saveScore(dto);
    }

}
