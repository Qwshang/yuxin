package com.baizhi.client_producer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private String name;
    private Integer age;
	private Integer code;
	private Integer number;
	private Integer history;
	private String remarks;
}
