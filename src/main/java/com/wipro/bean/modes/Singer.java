package com.wipro.bean.modes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("krishna")
@Scope("prototype")
public class Singer {
	private String lyric = "We found a message in a bottle we were drinking";

	public void sing() {
		System.out.println(lyric);
	}
}
