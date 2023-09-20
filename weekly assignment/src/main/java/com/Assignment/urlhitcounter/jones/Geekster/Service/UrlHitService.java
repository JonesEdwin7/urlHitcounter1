package com.Assignment.urlhitcounter.jones.Geekster.Service;

import com.Assignment.urlhitcounter.jones.Geekster.Entity.UrlHitCounter;
import com.Assignment.urlhitcounter.jones.Geekster.Repository.UrlHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlHitService {

    @Autowired
    UrlHitRepo urlHitRepo;

    public List<UrlHitCounter> getAllVisitors()
    {
        return  urlHitRepo.getUrlHitCounter();
    }


    public String addVisitor(UrlHitCounter user) {
        List<UrlHitCounter> visitorlist = getAllVisitors();
        for(UrlHitCounter u : visitorlist)
        {
            if(u.getUserName().equals(user.getUserName()))
            {
                u.setCounter(u.getCounter()+1);
                return "Cannot count updated";
            }
        }
        visitorlist.add(user);

        return "Welcome";
    }


    public String getCountOfVisitors() {

        List<UrlHitCounter> li = getAllVisitors();

        return "Visitors: "+li.size();
    }


    public UrlHitCounter getAVisitor(String username) {
        List<UrlHitCounter> visitorlist = getAllVisitors();
        for(UrlHitCounter u : visitorlist)
        {
            if(u.getUserName().equals(username))
            {
                return u;

            }
        }
        throw new IllegalStateException("User not found");
    }

    public String countUpdated(String username) {
        List<UrlHitCounter> visitorlist = getAllVisitors();
        for(UrlHitCounter u : visitorlist)
        {
            if(u.getUserName().equals(username))
            {
                u.setCounter(u.getCounter()+1);
                return "Welcome";
            }
        }


        return "User not found";
    }
}