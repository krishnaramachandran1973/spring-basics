package com.wipro.bean.modes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class Concert {

	@Getter
	private Singer singer;

	@Autowired
	public Concert(Singer singer) {
		this.singer = singer;
	}

	public void startPlay() {
		singer.sing();
	}

}
