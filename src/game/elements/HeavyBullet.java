package game.elements;

/**
 * kind of bullet that has a high level damage.
 * it is fired from MissileGun
 */
public class HeavyBullet extends Bullet
{

    //constructor
    public HeavyBullet(){

    }
    public HeavyBullet(double startX, double startY, double mouseX, double mouseY)
    {
        super(startX, startY, mouseX, mouseY, ObjectId.HeavyBullet, "src/resource/HeavyBullet.png");
        damage = 100;
    }

}
