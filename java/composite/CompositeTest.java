package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeTest {
    public static void main(String[] args) {
        OrganizationComponent university = new University("SHOU", "");
        OrganizationComponent ic = new College("Information College", "");
        university.add(ic);
        university.add(new College("Management College", ""));
        university.add(new College("Biology College", ""));
        ic.add(new Department("computer science", ""));
        ic.add(new Department("software engineering", ""));
        university.print();

    }
    
}

abstract class OrganizationComponent {
    private String name;
    private String desc;
    
    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void add(OrganizationComponent orgCom) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    public void remove(OrganizationComponent orgCom) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    public abstract void print();
}

class University extends OrganizationComponent {

    public University(String name, String desc) {
        super(name, desc);
        //TODO Auto-generated constructor stub
    }

    List<OrganizationComponent> orgComList = new ArrayList<OrganizationComponent>();

    @Override
    public void add(OrganizationComponent orgCom) {
        orgComList.add(orgCom);
    }

    @Override
    public void remove(OrganizationComponent orgCom) {
        orgComList.remove(orgCom);
    }

    @Override
    public void print() {
        System.out.println("University Name:" + getName());
        for (OrganizationComponent orgCom : orgComList) {
            orgCom.print();
        }
    }

}

// not leaf, normal node
class College extends OrganizationComponent {

    public College(String name, String desc) {
        super(name, desc);
        //TODO Auto-generated constructor stub
    }

    List<OrganizationComponent> orgComList = new ArrayList<OrganizationComponent>();

    @Override
    public void add(OrganizationComponent orgCom) {
        orgComList.add(orgCom);
    }

    @Override
    public void remove(OrganizationComponent orgCom) {
        orgComList.remove(orgCom);
    }

    @Override
    public void print() {
        System.out.println("College Name:" + getName());
        for (OrganizationComponent orgCom : orgComList) {
            orgCom.print();
        }
    }

}

// leaf
class Department extends OrganizationComponent {
    
    public Department(String name, String desc) {
        super(name, desc);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void print() {
        System.out.println("Department Name:" + getName());
    }

}