package info.revenberg.library.domain.line;

public interface FindLinesInImage {
    
    public int getversLines() ;

    public Map<Integer, ImageDefinition> getImageDefinitions() ;

    public BufferedImage createimage(BufferedImage image) ;

    public BufferedImage line(int splitLine) ;

    public void saveImages(String path, String filename) throws IOException;

    public void save(BufferedImage img, String filepath) throws IOException;

    public void createIMG(int from, int to, String path, String filename) throws IOException ;
}