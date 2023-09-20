package com.Assignment.urlhitcounter.jones.Geekster.BeanManager;

import com.Assignment.urlhitcounter.jones.Geekster.Entity.UrlHitCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanMaker {

    @Bean
    public List<UrlHitCounter> getUrlHitCounterList(){

        return new ArrayList<>();
    }
}