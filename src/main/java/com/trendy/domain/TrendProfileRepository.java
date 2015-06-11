package com.trendy.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface TrendProfileRepository extends Repository<TrendProfile, Long> {

    Page<TrendProfile> findAll(Pageable pageable);

    TrendProfile findByName(String name);
}
