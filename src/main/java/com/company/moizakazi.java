package com.company;

import org.telegram.telegrambots.meta.api.methods.stickers.UploadStickerFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class moizakazi {
    public UploadStickerFile korzinka (String str ) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("G:\\java abdumajid\\maven_Iroda_selfStudy\\src\\main\\resources\\korzinka.txt"));
     bufferedWriter.write(str);
     bufferedWriter.newLine();
       bufferedWriter.close();
        System.out.println( "true");
        return null;
    }
}
