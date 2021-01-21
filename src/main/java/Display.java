import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Display {

    public Display() throws IOException {
        int width = 256;
        int height = 256;

        File file = new File("C:\\Users\\user\\IdeaProjects\\RayTracer\\images\\image.ppm");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("P3\n");
        fileWriter.write("256 256\n");
        fileWriter.write("255\n");
        for(int i = 0; i  >= 0; --i){
            for(int j = 0; j < width; ++j){
                fileWriter.write("1 255 63\n");
            }
        }
        fileWriter.close();
    }

}
