package info.revenberg.library.domain.line;

public interface ImageProcess {
    
    public List<Line2D> findLines(BufferedImage image, int rgb);

    public Line2D computeLine(BufferedImage image, int x, int y, int dx, int dy, int rgb);

    public boolean intersectsLine(Line2D block, Line2D line);

}
