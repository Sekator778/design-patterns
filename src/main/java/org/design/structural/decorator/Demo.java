package org.design.structural.decorator;

public class Demo {
    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource("file.txt");
        dataSource.writeData("data");
        System.out.println(dataSource.readData());

        DataSource encryptedDataSource = new EncryptionDecorator(dataSource);
        encryptedDataSource.writeData("data");
        System.out.println(encryptedDataSource.readData());
    }
}
