package gr.aueb.cf.ch17;


public abstract class AbstractShape implements IShape {
    private Long id;

    public AbstractShape() {
    }
    public AbstractShape(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getID() {
        return this.id;
    }
}
