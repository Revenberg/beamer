package info.revenberg.javalibrary.domain;

/*
 * a simple domain entity doubling as a DTO
 */
public interface Song extends AuditModel {


    public void setVerses(Set<Vers> verses);

    public Set<Vers> getVerses();

    public long getId();

    public long getSongid();

    public void setBundle(Bundle bundle);

    public Bundle getBundle();

    public void setSongid(long songid);

    public String getName();

    public void setName(String name);

    public String getsource();

    public void setsource(String source);

    public void addVers(Vers vers);

    public void removeVers(Vers vers);

    public boolean equals(Object o) ;
}
