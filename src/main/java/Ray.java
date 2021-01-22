import maths.Vector;

/*
The class in fundamental for the creation of the Ray Tracer
Here we are considering a ray as function : P(t) = A + t*B
A is the start position of the vector
B is the direction of the vector
T is a real number witch give us the position at T.
To understand this you can considerate T as the time so the function return you the position of the ray at a time.
In this consideration of a ray, the vector make a trajectory in t time. Here t equal to the number of pixel of your vector.
 */
public class Ray {

    private final Vector origin;
    private final Vector direction; //We aren't making the ray direction to a unit vector because I think not doing that makes for simpler and slightly faster code

    public Ray(Vector origin, Vector direction){
        this.origin = origin;
        this.direction = direction;
    }

    public Vector point_at_parameter(double t){
        return origin.plus(direction.multiply(t));
    }

    public Vector getOrigin() {
        return origin;
    }

    public Vector getDirection() {
        return direction;
    }
}
