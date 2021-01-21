package com.project.userQuery.service;

import com.project.userQuery.dto.QueryDto;

import java.util.List;

public interface QueryService {

    public QueryDto insertQuery(QueryDto qd);
    public List<QueryDto> getQueries();

}
