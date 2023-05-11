package adapter;

public class InterfaceAdapterTest {
    public static void main(String[] args) {
        Usage usage = new Usage();
        usage.m1();
    }
    
}

interface InterfaceM {
    public void m1();
    public void m2();
    public void m3();
    public void m4();
}

class InterfaceMAdapter implements InterfaceM{

    @Override
    public void m1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'm1'");
    }

    @Override
    public void m2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'm2'");
    }

    @Override
    public void m3() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'm3'");
    }

    @Override
    public void m4() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'm4'");
    }
    
}

class Usage extends InterfaceMAdapter{
    @Override
    public void m1() {
        System.out.println("only need to realize function which will be used");
    }
}