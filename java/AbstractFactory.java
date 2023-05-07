public class AbstractFactory{
    public static void main(String[] args) {
        IDBUtils mysqlUtil = new MySQLDBUtils();
        IConnection mysqlCnn = mysqlUtil.getIConnection();
        mysqlCnn.connect();
        ICommand mysqlCmd = mysqlUtil.getICommand();
        mysqlCmd.command();
    }
}

interface IDBUtils{
    public IConnection getIConnection();
    public ICommand getICommand(); 
}

class MySQLDBUtils implements IDBUtils{

    @Override
    public IConnection getIConnection() {
        return new MySQLConnection();
    }

    @Override
    public ICommand getICommand() {
        return new MySQLCommand();
    }
    
}

class OracleDBUtils implements IDBUtils{

    @Override
    public IConnection getIConnection() {
        return new OracleConnection();
    }

    @Override
    public ICommand getICommand() {
        return new OracleCommand();
    }
    
}

interface IConnection{
    public void connect();
}

class MySQLConnection implements IConnection{

    @Override
    public void connect() {
        System.out.println("mysql connected!");
    }
    
}

class OracleConnection implements IConnection{

    @Override
    public void connect() {
        System.out.println("oracle connected!");
    }
    
}

interface ICommand{
    public void command();
}

class MySQLCommand implements ICommand{

    @Override
    public void command() {
        System.out.println("mysql command");
    }
    
}

class OracleCommand implements ICommand{

    @Override
    public void command() {
        System.out.println("oracle command");
    }
    
}