package io.github.EXP1;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class physicsObject {
    private final double MASS;                  // mass of object in solar masses
    private final double RAD;                   // size of object in solar radius's
    private final Vector2 velocity;             // velocity of object

    private final Texture texture;              // texture of object
    private final Rectangle rect;               // rectangle to express the object on screen with

    public physicsObject(float x, float y, double mass, double radius, Vector2 velocity, Texture texture) {
        MASS = mass;
        RAD = radius;
        this.velocity = velocity;
        this.texture = texture;

        // default scale: ~ 100px. 100px == 1 solar radius
        this.rect = new Rectangle(x, y, (float)(texture.getWidth() * RAD), (float)(texture.getHeight() * RAD));

    }

    public void update(float delta, Array<physicsObject> objects) {
        for (physicsObject other : objects) {
            // get force applied by object and change this.velocity
        }
        // change pos with updated velo
    }

    public void draw(Batch batch) {
        batch.draw(texture, rect.x, rect.y, rect.width, rect.height);
    }

    public double getMASS() {
        return MASS;
    }
    public double getSIZE() {
        return RAD;
    }
    public Vector2 getVelocity() {
        return velocity;
    }
    /**
     * @return the Y-coordinate center of the object
     */
    public float getX() {
        return rect.getWidth()/2 + rect.getX();
    }
    /**
     * @return the X-coordinate center of the object
     */
    public float getY() {
        return rect.getWidth()/2 + rect.getY();
    }
}

