package com.demo.netflix.service;

import com.demo.netflix.entity.ShowEntity;

import java.util.List;

public interface ShowService {

    List<ShowEntity> selectShowList();

}
