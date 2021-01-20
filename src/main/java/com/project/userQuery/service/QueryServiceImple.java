package com.project.userQuery.service;

import com.project.userQuery.controller.QueryController;
import com.project.userQuery.dto.QueryDto;
import com.project.userQuery.repository.QueryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Service
public class QueryServiceImple implements   QueryService{

    @Autowired
    QueryRepo qc;

    @Override
    public QueryDto insertQuery(QueryDto qd) {
    return qc.save(qd);
    }

    @Override
    public List<QueryDto> getQueries() {
        Iterable<QueryDto> it;
        it= qc.findAll();
        Iterator<QueryDto> itr = it.iterator();
        List<QueryDto> list = new ArrayList<>();
        while (itr.hasNext()){
            list.add(itr.next());
        }
        return list;
    }
}
