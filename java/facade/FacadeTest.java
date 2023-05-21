package facade;

public class FacadeTest {
    public static void main(String[] args) {
        // don't need to care about the details in process any more
        TheaterFacade theaterFacade = new TheaterFacade();
        theaterFacade.start();
        theaterFacade.end();
    }
    
}

class DVDDriver {
    static DVDDriver dvdDriver = new DVDDriver();

    public static DVDDriver getDvdDriver() {
        return dvdDriver;
    }

    private DVDDriver() {
    }

    public void in() {
        System.out.println("DVDDriver in");
    }

    public void pop() {
        System.out.println("DVDDriver pop");
    }
}

class Projecter {
    static Projecter projector = new Projecter();

    public static Projecter getProjecter() {
        return projector;
    }

    private Projecter() {
    }

    public void open() {
        System.out.println("Projecter open");
    }

    public void close() {
        System.out.println("Projecter close");
    }

    public void focus() {
        System.out.println("Projecter focus");
    }
}

class Screen {
    static Screen screen = new Screen();

    public static Screen getScreen() {
        return screen;
    }

    private Screen() {
    }

    public void on() {
        System.out.println("Screen on");
    }

    public void down() {
        System.out.println("Screen down");
    }
}

class TheaterFacade {
    DVDDriver dvdDriver;
    Screen screen;
    Projecter projecter;
    public TheaterFacade() {
        this.dvdDriver = DVDDriver.getDvdDriver();
        this.screen = Screen.getScreen();
        this.projecter = Projecter.getProjecter();
    }

    public void start() {
        dvdDriver.in();
        screen.on();
        projecter.open();
        projecter.focus();
    }

    public void end() {
        projecter.close();
        screen.down();
        dvdDriver.pop();    
    }
    
}

