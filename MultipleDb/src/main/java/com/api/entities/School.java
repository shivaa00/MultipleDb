package com.api.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import lombok.Data;

@Entity
@Table(name = "school", catalog = "school")

public @Data class School {

	@Id
	@Column(name = "school_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
	@GenericGenerator(strategy = "native", name = "native")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "code")
	private String code;
	
	
}
