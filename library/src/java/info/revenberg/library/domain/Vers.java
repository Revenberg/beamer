package info.revenberg.library.domain;

public interface Vers extends AuditModel {

    public long getId();

    public void setSong(Song song);

    public Song getSong();

    public long getVersid();

    public void setVersid(long versid);

    public int getRank();

    public void setRank(int rank);

    public String getTitle();

    public void setTitle(String title);

    public String getName();

    public void setName(String name);

    public String getLocation();

    public void setLocation(String location);

    public int getVersLines();

    public void setVersLines(int versLines);

    public boolean equals(Object o);

}
