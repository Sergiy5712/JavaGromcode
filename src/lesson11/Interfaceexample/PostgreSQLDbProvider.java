package lesson11.Interfaceexample;

public class PostgreSQLDbProvider implements DbProvider {

    @Override
    public void connectToDb() {
        //same logic for postgresql
    }

    @Override
    public void disconnectFromDb() {
//same logic for postgresql
    }

    @Override
    public void encryptDate() {
//same logic for postgresql
    }
}
