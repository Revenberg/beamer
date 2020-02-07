package info.revenberg.library.domain;

public abstract interface AuditModel extends ResourceSupport {

    public Date getCreatedAt();

    public void setCreatedAt(Date createdAt);

    public Date getUpdatedAt();

    public void setUpdatedAt(Date updatedAt);

    public String toString();

    public boolean equals(Object o) ;
}