import maths.Vector;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Display {

    public Display() throws IOException {
        int width = 256;
        int height = 256;

        File file = new File("/Users/maxime/IdeaProjects/RayTracer/images/image.ppm");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("P3\n");
        fileWriter.write("256 256\n");
        fileWriter.write("255\n");
        for(int i = height-1; i  >= 0; --i){
            for(int j = 0; j < width; ++j){
                Vector color = new Vector((255-i),(255-j), 255-i);
                fileWriter.write(color.r().intValue()+ " " + color.g().intValue() + " "  + color.b().intValue()+"\n");
            }
        }
        fileWriter.close();
    }

}
