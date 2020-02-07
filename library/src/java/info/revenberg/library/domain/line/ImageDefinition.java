package info.revenberg.library.domain.line;

public interface ImageDefinition {
    
    public String getFilename() ;

    public void setFilename(String filename) ;

    public Integer getIndex();

    public void setIndex(Integer index);

    public int getWidth();

    public int getHeight();

    public void setImage(BufferedImage image);

    public BufferedImage getImage();

    public void setTitle(String title);

    public String getTitle();

    public double getminY();

    public double getMaxY();

    public double getminX() ;

    public double getMaxX() ;

}
