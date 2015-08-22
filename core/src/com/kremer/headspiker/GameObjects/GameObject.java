package com.kremer.headspiker.GameObjects;

import com.badlogic.gdx.math.Vector2;

public class GameObject {

	private Vector2 m_Position;
	private Vector2 m_Velocity;
	private Vector2 m_Acceleration;
	
	private int m_Width;
	private int m_Height;
	
	public GameObject(Vector2 i_Position, Vector2 i_Velocity, 
			Vector2 i_Acceleration,  int i_Width, int i_Height) {

		
		m_Position = i_Position;
		m_Velocity = i_Velocity;
		m_Acceleration = i_Acceleration;
		m_Width = i_Width;
		m_Height = i_Height;
	}
	
	public void update(float i_Delta) {
		
	}
	
	public float getX() {
		return m_Position.x;
	}

	public float getY() {
		return m_Position.y;
	}

	public float getWidth() {
		return m_Width;
	}

	public float getHeight() {
		return m_Height;
	}

}
