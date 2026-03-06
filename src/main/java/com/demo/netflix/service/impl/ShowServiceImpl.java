package com.demo.netflix.service.impl;

import com.demo.netflix.entity.ShowEntity;
import com.demo.netflix.repository.ShowRepository;
import com.demo.netflix.service.ShowService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowServiceImpl implements ShowService {

    private final ShowRepository showRepository;

    public ShowServiceImpl(ShowRepository showRepository){
        this.showRepository = showRepository;
    }

    @Override
    public List<ShowEntity> selectShowList() {
        return (List<ShowEntity>) showRepository.findAll() ;
    }
}
