package com.djain.test.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

import javax.persistence.GenerationType;

@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
    private Location loc;
}
