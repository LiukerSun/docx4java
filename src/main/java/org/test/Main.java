package org.test;

import org.apache.logging.log4j.LogManager;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.docx4java.docx4javaDocument;
import org.docx4java.style.docx4javaParagraphStyle;
import org.docx4java.style.docx4javaRunStyle;

public class Main {
    public static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        docx4javaDocument document = new docx4javaDocument();
        document.addParagraph()
                .addStyle(
                        new docx4javaParagraphStyle()
                                .setAlign(ParagraphAlignment.CENTER)
                )
                .addRun()
                .addText("123")
                .addLatex("$a^2+b^2=c^2$")
                .addPageBreak()
                .addText("456")
                .addStyle(new docx4javaRunStyle().setBold(true))
        ;
        document.save("./test.docx");
    }
}
