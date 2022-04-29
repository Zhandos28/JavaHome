package com.university.h8;

import java.io.*;

public class Ex_17_2 {
    public static void main(String[] args) throws IOException {
        try (
                // Create an output stream to the file
                // Append new data if file already exists
                FileOutputStream output =
                        new FileOutputStream("Exercise17_02.dat", true);
        ) {
            // Output 100 integers created randomly into the file
            for (int i = 0; i < 100; i++)
                output.write((int)(1 + Math.random() * 100));
        }
    }
}
