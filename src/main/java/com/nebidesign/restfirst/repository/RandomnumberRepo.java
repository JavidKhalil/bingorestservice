package com.nebidesign.restfirst.repository;

import com.nebidesign.restfirst.domain.RandomNumbersDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RandomnumberRepo extends JpaRepository<RandomNumbersDomain, Long> {
}
