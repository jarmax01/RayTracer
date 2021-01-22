package maths;

/*
The aim of this class is to contain vector in 3D
However we will use it to stock RGB colors because colors have 3 parameters
In general we will stock values with 3 parameters : colors, locations, directions, offsets, whatever...
 */

public class Vector {

    private final Double[] values = new Double[3];

    public Vector(double val1, double val2, double val3){
        this.values[0] = val1;
        this.values[1] = val2;
        this.values[2] = val3;
    }

    public Double length(){
        return Math.sqrt(values[0]*values[0] + values[1]*values[1] + values[2]*values[2]);
    }

    public Double length_squared(){
        return (values[0]*values[0] + values[1]*values[1] + values[2]*values[2]);
    }

    /*
    Java don't accept the operator overloading such as Kotlin, C++
    So we will use function instead binary operation such as +, -
     */

    public Vector plus(Vector vector2){
        return new Vector(this.x() + vector2.x(), this.y() + vector2.y(), this.z() + vector2.z());
    }

    public Vector minus(Vector vector2){
        return new Vector(this.x() - vector2.x(), this.y() - vector2.y(), this.z() - vector2.z());
    }

    public Vector multiply(Vector vector2){
        return new Vector(this.x() * vector2.x(), this.y() * vector2.y(), this.z() * vector2.z());
    }

    public Vector multiply(double val){
        return new Vector(this.x() * val, this.y() * val, this.z() * val);
    }

    public Vector divide(Vector vector2){
        return new Vector(this.x() / vector2.x(), this.y() / vector2.y(), this.z() / vector2.z());
    }

    public Vector divide(double val){
        return new Vector(this.x() / val, this.y() / val, this.z() / val);
    }

    public static Double dot(Vector vector1,Vector vector2){
        return vector1.x() * vector2.x() + vector1.y() * vector2.y() + vector1.z() * vector2.z();
    }

    public static Vector cross(Vector vector1,Vector vector2){
        return new Vector((vector1.y()*vector2.z() - vector1.z()*vector2.y()),
                -(vector1.x()*vector2.z() - vector1.z()*vector2.x()),
                (vector1.x()*vector2.y() - vector1.y()*vector2.x()));
    }

    public void unit(){
        double k = 1.0/length();
        values[0] *=k;
        values[1] *=k;
        values[2] *=k;
    }

    public static Vector unit_vector(Vector vector){
        return vector.divide(vector.length());
    }

    public Double x(){
        return values[0];
    }

    public Double y(){
        return values[1];
    }

    public Double z(){
        return values[2];
    }

    public Double r(){
        return values[0];
    }

    public Double g(){
        return values[1];
    }

    public Double b(){
        return values[2];
    }

    public String toString(){
        return "x = " + this.x() + " | y = " + this.y() + " | z = " + this.z();
    }


}
