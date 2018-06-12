package game.elements;

import java.util.ArrayList;

/**
 * a class containing all created objects like tanks, bullets , turrets , ... in game
 */
public class Objects {

    //fields
    private ArrayList<Tank> tanks;
    private ArrayList<Bullet> bullets;
    private ArrayList<Turret> turrets;


    //constructor

    public Objects(){
        tanks = new ArrayList<>();
        bullets = new ArrayList<>();
        turrets = new ArrayList<>();
    }

    //methods
    /**
     * if the game hasn't been started before it need to be initialized. player's tank must be created add a gun
     * must be added to that. then
     */
    public void init(){
        Tank playerTank = new Tank(100,100,100,0); // making player's tank
        Gun playerTankGun = new Gun(40,25,playerTank); // create gun for player's tank
        playerTank.setGun(playerTankGun); // add gun to player's tank
        tanks.add(playerTank); //add player's tank to objects ( tanks arrayList)
    }

    /**
     * add a tank to tanks ArrayList which contains all available tanks in game
     * @param tank the tank which must be added
     */
    public void addTank(Tank tank){
        tanks.add(tank);
    }

    /**
     * add a bullet to bullets ArrayList which contains all available bullets in game
     * @param bullet the bullet which must be added
     */
    public void addBullet(Bullet bullet){
        bullets.add(bullet);
    }

    /**
     * add a turret to turrets ArrayList which contains all available turrets in game
     * @param turret the turret which must be added
     */
    public void addTurret(Turret turret){
        turrets.add(turret);
    }

    /**
     * remove a tank from ArrayList which contains all available tanks in game
     * @param tank the tank that must be removed
     */
    public void removeTank(Tank tank){
        tanks.remove(tank);
    }

    /**
     * remove a bullet from ArrayList which contains all available bullets in game
     * @param bullet the bullet that must be removed
     */
    public void removeBullet(Bullet bullet){
        bullets.remove(bullet);
    }

    /**
     * remove a turret from ArrayList which contains all available turrets in game
     * @param turret the turret that must be removed
     */
    public void removeTurret(Turret turret){
        turrets.remove(turret);
    }

    /**
     * set a new arrayList for tanks
     * @param tanks
     */
    public void setTanks(ArrayList<Tank> tanks) {
        this.tanks = tanks;
    }

    /**
     * set a new arrayList for bullets
     * @param bullets
     */
    public void setBullets(ArrayList<Bullet> bullets) {
        this.bullets = bullets;
    }

    /**
     * set a new arrayList for turrets
     * @param turrets
     */
    public void setTurrets(ArrayList<Turret> turrets) {
        this.turrets = turrets;
    }

    /**
     * get arrayList that contains all tanks
     * @return
     */
    public ArrayList<Tank> getTanks() {
        return tanks;
    }

    /**
     * get arrayList that contains all bullets
     * @return
     */
    public ArrayList<Bullet> getBullets() {
        return bullets;
    }

    /**
     * get arrayList that contains all turrets
     * @return
     */
    public ArrayList<Turret> getTurrets() {
        return turrets;
    }
}