public class ChildClass2 extends ParentClass implements Printable {
    private String property2;

    public ChildClass2(int parentId, String property2) {
        super(parentId);
        this.property2 = property2;
    }

    public String getProperty2() {
        return property2;
    }

    @Override
    public void print() {
        System.out.println("ChildClass2{parentId=" + getParentId() + ", property2='" + property2 + "'}");
    }
}