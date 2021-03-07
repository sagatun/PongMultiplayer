package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.PongMultiplayer;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "PongMultiplayer";
		config.width = PongMultiplayer.WIDTH;
		config.height = PongMultiplayer.HEIGHT;
		new LwjglApplication(new PongMultiplayer(), config);
	}
}
