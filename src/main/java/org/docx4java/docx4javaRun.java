package org.docx4java;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.docx4java.style.docx4javaRunStyle;
import org.docx4java.utils.StyleUtils;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import uk.ac.ed.ph.snuggletex.SnuggleEngine;
import uk.ac.ed.ph.snuggletex.SnuggleInput;
import uk.ac.ed.ph.snuggletex.SnuggleSession;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.docx4java.utils.LatexUtils._getOMML;
import static org.docx4java.utils.PicUtils.get_pic_type;

public class docx4javaRun {
    public XWPFRun run;
    docx4javaParagraph paragraph;
    String text;

    public docx4javaRun(docx4javaParagraph paragraph) {
        this.paragraph = paragraph;
        this.run = paragraph.getParagraph().createRun();
    }

    public docx4javaRun addText(String text) {
        this.run.setText(text);
        this.text = text;
        return this;
    }

    public docx4javaRun addReturn() {
        this.run.addCarriageReturn();
        return this;
    }

    public docx4javaRun addPageBreak() {
        this.run.addBreak(BreakType.PAGE);
        return this;
    }

    public docx4javaRun addPic(String pic_path, double width, double height) throws Exception {
        InputStream stream;
        if (pic_path.startsWith("http")) {
            URL url = new URL(pic_path);
            URLConnection connection = url.openConnection();
            connection.getContentType();
            stream = connection.getInputStream();
        } else {
            stream = Files.newInputStream(Paths.get(pic_path));
        }
        return addPic(stream, pic_path, width, height);
    }

    public docx4javaRun addPic(InputStream pic_Stream, String pic_path, double width, double height) {
        try {
            int widthEMU = (int) Math.rint(360000.0D * width);
            int heightEMU = (int) Math.rint(360000.0D * height);
            this.run.addPicture(pic_Stream, get_pic_type(pic_path), "Generated", widthEMU,
                    heightEMU);
            return this;
        } catch (IOException | InvalidFormatException e) {
            throw new RuntimeException(e);
        }
    }

    public docx4javaRun addLatex(String latex) throws Exception {
        SnuggleEngine engine = new SnuggleEngine();
        SnuggleSession session = engine.createSession();
        SnuggleInput input = new SnuggleInput(latex);
        session.parseInput(input);
        String mathML = session.buildXMLString();
        CTOMath ctOMath = _getOMML(mathML);
        CTP ctp = this.paragraph._getCTP();
        ctp.setOMathArray(new CTOMath[]{ctOMath});
        return this;
    }
    public docx4javaRun addStyle(docx4javaRunStyle style) {
        StyleUtils.styleRun(this, style);
        return this;
    }
}
