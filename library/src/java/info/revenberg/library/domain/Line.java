package info.revenberg.library.domain;

public interface Line extends AuditModel {
    
    public long getId();

    public void setVers(Vers vers);

    public Vers getVers();

    public int getRank();

    public void setRank(int rank);

    public String getText();

    public void setText(String text);

    public String getLocation();

    public void setLocation(String location);

    public boolean equals(Object o);

}
