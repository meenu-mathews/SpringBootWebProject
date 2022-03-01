package com.techreturners.apilab1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder

    public class Food {

        @Id
        @GeneratedValue
        @Column(updatable = false, nullable = false)
        Long id;

        @Column
        String name;

        @Column
        double calories;

        @Column
        String mealtype;

        @Column
        String diet;
    }

