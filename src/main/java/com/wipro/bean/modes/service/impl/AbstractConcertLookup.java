package com.wipro.bean.modes.service.impl;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import com.wipro.bean.modes.Singer;
import com.wipro.bean.modes.service.ConcertLookup;

@Component
public class AbstractConcertLookup implements ConcertLookup {

	@Override
	@Lookup("krishna")
	public Singer getMySinger() {
		return null;
	}

	@Override
	public void startPlay() {
		getMySinger().sing();

	}

}
