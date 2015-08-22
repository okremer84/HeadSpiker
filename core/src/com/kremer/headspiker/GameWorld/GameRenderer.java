package com.kremer.headspiker.GameWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class GameRenderer {
	private GameWorld myWorld;
	private OrthographicCamera cam;
	private ShapeRenderer shapeRenderer;

	public GameRenderer(GameWorld world) {
		myWorld = world;
		cam = new OrthographicCamera();
		cam.setToOrtho(true, 137, 204);

		shapeRenderer = new ShapeRenderer();
		shapeRenderer.setProjectionMatrix(cam.combined);
	}

	public void render() {
		System.out.println("GameRenderer - render");

		/*
		 * 1. We draw a black background. This prevents flickering.
		 */

		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}
}
