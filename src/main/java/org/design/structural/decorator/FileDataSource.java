package org.design.structural.decorator;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Write data to file: " + filename);
    }

    @Override
    public String readData() {
        System.out.println("Read data from file: " + filename);
        return null;
    }
}
