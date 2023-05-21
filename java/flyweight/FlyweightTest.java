package flyweight;

import java.util.HashMap;


public class FlyweightTest {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        Website ios = webSiteFactory.getWebsiteCategory("ios");
        ios.use();
        Website android = webSiteFactory.getWebsiteCategory("android");
        android.use();
        Website wechatProm = webSiteFactory.getWebsiteCategory("wechatProm");
        wechatProm.use();
        System.out.println("Current pool size:" + webSiteFactory.getWebsiteCount());

        Website ios2 = webSiteFactory.getWebsiteCategory("ios");
        Website android2 = webSiteFactory.getWebsiteCategory("android");
        Website wechatProm2 = webSiteFactory.getWebsiteCategory("wechatProm");
        System.out.println("Current pool size:" + webSiteFactory.getWebsiteCount()); // pool size didn't change because of reuse
    }
    
}

// return a website according to requirement
class WebSiteFactory {

    // assemble, work as pool
    private HashMap<String, ConcreteWebsite> pool = new HashMap<>();

    // return website according to web type
    // if not exist, create a website and put in pool, and return
    public Website getWebsiteCategory(String type) {
        if(!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }
        return (Website)pool.get(type);
    }

    public int getWebsiteCount(){
        return pool.size();
    }

}

abstract class Website {
    abstract public void use();
}

class ConcreteWebsite extends Website {

    private String type = "";

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("start use " + type + " website.");
    }
    
}