package info.revenberg.library.domain;

public interface Bundle {

    public void addSong(Song song);

    public void removeSong(Song song);

    public void setId(Long id);

    public long getId();

    public long getBundleid();

    public void setBundleid(long bundleid);

    public String getName();

    public void setName(String name);

    public String getMnemonic();

    public void setMnemonic(String mnemonic);

    public boolean equals(Object o) ;
}