package org.docx4java;

import org.apache.poi.xwpf.usermodel.*;
import org.docx4java.style.docx4javaParagraphStyle;

import java.io.*;
import java.util.ArrayList;
public class docx4javaDocument {
    XWPFDocument document;
    ArrayList<docx4javaParagraph> paragraphs = new ArrayList<>();

    public docx4javaDocument() {
        this.document = new XWPFDocument();
    }

    public docx4javaDocument(String docx_path) throws IOException {
        InputStream is = new FileInputStream(docx_path);
        this.document = new XWPFDocument(is);
        is.close();
    }

    public void save(String docx_path) throws IOException {
        FileOutputStream out = new FileOutputStream(docx_path);

        this.document.write(out);
        out.close();
    }

    public docx4javaParagraph addParagraph() {
        docx4javaParagraph paragraph = new docx4javaParagraph(this);
        this.paragraphs.add(paragraph);
        return paragraph;
    }

}
