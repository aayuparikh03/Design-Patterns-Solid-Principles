package org.example;
// Step 1: Define smaller, focused interfaces
interface Readable {
    void read();
}
interface Writable {
    void write();
}
interface Printable {
    void print();
}
interface Scannable {
    void scan();
}
// Step 2: Implement specific interfaces
// TextDocument implements only Readable and Writable
class TextDocument implements Readable, Writable {
    @Override
    public void read() {
        System.out.println("Reading a text document...");
    }
    @Override
    public void write() {
        System.out.println("Writing to a text document...");
    }
}
// PrintableDocument implements Readable and Printable
class PrintableDocument implements Readable, Printable {
    @Override
    public void read() {
        System.out.println("Reading a printable document...");
    }

    @Override
    public void print() {
        System.out.println("Printing the document...");
    }
}
// ScannerDevice implements Scannable
class ScannerDevice implements Scannable {
    @Override
    public void scan() {
        System.out.println("Scanning the document...");
    }
}

// MultiFunctionPrinter implements all interfaces
class MultiFunctionPrinter implements Readable, Writable, Printable, Scannable {
    @Override
    public void read() {
        System.out.println("Reading the document using a multi-function printer...");
    }

    @Override
    public void write() {
        System.out.println("Writing to the document using a multi-function printer...");
    }

    @Override
    public void print() {
        System.out.println("Printing the document using a multi-function printer...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning the document using a multi-function printer...");
    }
}

// Step 3: Demonstrate usage
public class Main {
    public static void main(String[] args) {
        System.out.println("Demonstrating Interface Segregation Principle:");

        // Text Document: Can read and write
        TextDocument textDoc = new TextDocument();
        textDoc.read();
        textDoc.write();

        // Printable Document: Can read and print
        PrintableDocument printableDoc = new PrintableDocument();
        printableDoc.read();
        printableDoc.print();

        // Scanner Device: Can scan only
        ScannerDevice scanner = new ScannerDevice();
        scanner.scan();

        // Multi-Function Printer: Can do everything
        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.read();
        mfp.write();
        mfp.print();
        mfp.scan();
    }
}
