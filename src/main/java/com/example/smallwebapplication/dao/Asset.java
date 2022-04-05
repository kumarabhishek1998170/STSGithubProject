package com.example.smallwebapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.smallwebapplication.entity.asset;

public interface Asset extends JpaRepository<asset, Integer> {

}
