package com.demo.netflix.web;

import com.demo.netflix.entity.ShowEntity;
import com.demo.netflix.service.ShowService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/show")
@Controller
public class ShowController {

    private final ShowService showService;

    public ShowController(ShowService showService){
        this.showService = showService;
    }

    @PostMapping("/shows")
    public ResponseEntity<Object> selectShowList(){
        List<ShowEntity> showEntityList = showService.selectShowList();
        System.out.println(showEntityList.get(0));
        return new ResponseEntity<>(showEntityList, HttpStatus.OK);
    }

}
