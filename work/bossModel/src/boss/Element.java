package boss;

public abstract class Element {

    public abstract void accept(Visitor visitor);

    public abstract void acceptTwo(Visitor visitor);
}
