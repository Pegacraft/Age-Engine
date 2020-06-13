package game.test;

import engine.Scene;
import engine.editor.menu.Button;
import engine.rendering.Graphics;

public class GameScene extends Scene {

    @Override
    public void init() {
        Player2 pl = new Player2();
        this.addObject(new Button());
        this.addObject(pl);
    }

    @Override
    public void logicLoop() {

    }

    @Override
    public void renderLoop() {
        Graphics.g.fillRect(-100, -100, 20, 20);
    }
}
