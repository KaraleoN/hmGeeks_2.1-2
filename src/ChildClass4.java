public class ChildClass4 extends ParentClass implements Printable {
    private boolean property4;

    public ChildClass4(int parentId, boolean property4) {
        super(parentId);
        this.property4 = property4;
    }

    public boolean isProperty4() {
        return property4;
    }

    @Override
    public void print() {
        System.out.println("ChildClass4{parentId=" + getParentId() + ", property4=" + property4 + "}");
    }
}