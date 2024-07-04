public class ChildClass3 extends ParentClass implements Printable {
    private double property3;

    public ChildClass3(int parentId, double property3) {
        super(parentId);
        this.property3 = property3;
    }

    public double getProperty3() {
        return property3;
    }

    @Override
    public void print() {
        System.out.println("ChildClass3{parentId=" + getParentId() + ", property3=" + property3 + "}");
    }
}