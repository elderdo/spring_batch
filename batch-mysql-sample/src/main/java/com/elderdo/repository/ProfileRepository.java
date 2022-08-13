package com.elderdo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elderdo.domain.Profile;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Integer> {

}
