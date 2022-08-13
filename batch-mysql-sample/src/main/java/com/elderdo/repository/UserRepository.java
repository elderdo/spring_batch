package com.elderdo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.elderdo.domain.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {

    Page<User> findByStatusAndEmailVerified(String status, boolean emailVerified,
            Pageable pageable);
}