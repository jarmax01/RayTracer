import maths.Vector;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Display {

    public Display() throws IOException {
        int width = 1920;
        int height = 1080;

        File file = new File("/Users/maxime/IdeaProjects/RayTracer/images/image.ppm");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("P3\n");
        fileWriter.write("1920 1080\n");
        fileWriter.write("255\n");

        Vector origin = new Vector(0.0, 0.0, 0.0);
        Vector horizontal = new Vector(4.0,0.0,0.0);
        Vector vertical = new Vector(0.0,2.0,0.0);
        Vector lower_left_corner = new Vector(-2.0,-1.0,-1.0);

        for(int i = height-1; i  >= 0; --i){
            for(int j = 0; j < width; ++j){
                double u = (double) i / (double) width;
                double v = (double) j / (double) width;

                fileWriter.write((int)(u*255.9) + " " + (int)(v*255.9*0.5) +" 255\n");
            }
        }
        fileWriter.close();
    }

    public Vector color(Ray ray){
        Vector unit_direction = Vector.unit_vector(ray.getDirection());
        double t = 0.5*(unit_direction.y() + 1);
        return new Vector(1.0,1.0,1.0).multiply(1.0-t).plus(new Vector(0.5,0.7,1.0).multiply(t));
    }

}
