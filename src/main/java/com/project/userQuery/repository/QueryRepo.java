package com.project.userQuery.repository;

import com.project.userQuery.dto.QueryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryRepo extends JpaRepository<QueryDto, Integer> {



}
