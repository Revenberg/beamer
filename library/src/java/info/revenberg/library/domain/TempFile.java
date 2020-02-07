package info.revenberg.library.domain;

public interface TempFile {

    public String getOriginalFilename();

    public void setOriginalFilename(String originalFilename);

    public String getFilename();

    public void setFilename(String filename);

    public long getSize();

    public void setSize(long size);

    public String getContentType();

    public void setContentType(String contentType);

    public String getName();

    public void setName(String name);

    public TempFile originalFilename(String originalFilename);

    public TempFile filename(String filename);

    public TempFile size(long size);

    public TempFile contentType(String contentType);

    public TempFile name(String name);

}
