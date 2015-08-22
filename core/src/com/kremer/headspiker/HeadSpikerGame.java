package com.kremer.headspiker;

import com.badlogic.gdx.Game;
import com.kremer.headspiker.Screens.GameScreen;

public class HeadSpikerGame extends Game {

	@Override
	public void create() {
		System.out.println("HeadSpikerGame Created!");
		setScreen(new GameScreen());
	}

}
