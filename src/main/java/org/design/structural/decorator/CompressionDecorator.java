package org.design.structural.decorator;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Compressing data");
        super.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("Decompressing data");
        return super.readData();
    }
}
