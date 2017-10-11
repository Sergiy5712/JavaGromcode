package lesson11.biginterfaceexaple;

public class SimpleReader implements Readable {

    static String test;

    public static void main(String[] args) {
        System.out.println(test);
        //null pointer exeption
    }


    @Override
    public void readFilesFromStorege(Storage storage) {


        for (File file : storage.getFiles()){

            if (file != null)
            System.out.println(file.getName());
            else
                System.out.println(file);
        }

    }
}
