package com.Assignment.urlhitcounter.jones.Geekster.Repository;

import com.Assignment.urlhitcounter.jones.Geekster.Entity.UrlHitCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UrlHitRepo {

    @Autowired
    private List<UrlHitCounter> urlHit;

    public List<UrlHitCounter> getUrlHitCounter()
    {
        return  urlHit;
    }

    public void addUsers(UrlHitCounter u)
    {
        urlHit.add(u);
    }
}
