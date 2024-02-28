package com.wipro.bean.modes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class Concert {

	@Autowired
	@Getter
	private Singer singer;

	public void startPlay() {
		singer.sing();
	}

}
