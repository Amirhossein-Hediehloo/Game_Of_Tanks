/*** In The Name of Allah ***/
package game.template.bufferstrategy;

import game.map.Camera;
import game.map.SpriteSheet;

/**
 * A very simple structure for the main game loop.
 * THIS IS NOT PERFECT, but works for most situations.
 * Note that to make this work, none of the 2 methods
 * in the while loop (update() and render()) should be
 * long running! Both must execute very quickly, without
 * any waiting and blocking!
 * <p>
 * Detailed discussion on different game loop design
 * patterns is available in the following link:
 * http://gameprogrammingpatterns.com/game-loop.html
 *
 * @author Seyed Mohammad Ghaffarian
 */
public class GameLoop implements Runnable
{

    /**
     * Frame Per Second.
     * Higher is better, but any value above 24 is fine.
     */
    public static final int FPS = 30;

    private GameFrame canvas;
    private GameState state;
    private SpriteSheet spriteSheet;
    private Camera camera;

    public GameLoop(GameFrame frame)
    {
        canvas = frame;
    }

    /**
     * This must be called before the game loop starts.
     */
    public void init()
    {
        // Perform all initializations ...
        state = new GameState();
        spriteSheet = new SpriteSheet("src/resource/sprite_sheet.png");
        //camera = new Camera(state.objects.getPlayer().getX(), state.objects.getPlayer().getY());
        camera = new Camera(0, 0);
        canvas.addKeyListener(state.getKeyListener());
        canvas.addMouseListener(state.getMouseListener());
        canvas.addMouseMotionListener(state.getMouseMotionListener());
    }

    @Override
    public void run()
    {
        boolean gameOver = false;
        while (!gameOver)
        {
            try
            {
                long start = System.currentTimeMillis();
                //
                state.update();
                canvas.render(state, camera, spriteSheet);
                //
                long delay = (1000 / FPS) - (System.currentTimeMillis() - start);
                if (delay > 0)
                {
                    Thread.sleep(delay);
                }
            }
            catch (InterruptedException ex)
            {
            }
        }
    }
}
