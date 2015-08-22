package com.kremer.headspiker.GameWorld;

import com.badlogic.gdx.math.Vector2;
import com.kremer.headspiker.GameObjects.Head;
import com.kremer.headspiker.GameObjects.HeadThrower;
import com.kremer.headspiker.GameObjects.Spike;

public class GameWorld {
	
	private HeadThrower m_Thrower;
	private Head m_Head;
	private Spike m_Spike;
	
	public HeadThrower GetThrower() {
		return m_Thrower;
	}

	public Head GetHead() {
		return m_Head;
	}

	public Spike GetSpike() {
		return m_Spike;
	}


	public GameWorld() {
		// TODO: Decide positioning and size
		// TODO: Add GameObjects
		m_Thrower = new HeadThrower(new Vector2(0,0), new Vector2(0,0), new Vector2(0,0), 0, 0);
		m_Head  = new Head(new Vector2(0,0), new Vector2(0,0), new Vector2(0,0), 0, 0);
		m_Spike = new Spike(new Vector2(0,0), new Vector2(0,0), new Vector2(0,0), 0, 0);
	}

	public void update(float delta) {
		m_Thrower.update(delta);
		m_Head.update(delta);
		m_Spike.update(delta);
	}

}
