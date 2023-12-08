package org.docx4java.style;

import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class Style implements Serializable {
    private String color;
    private String fontFamily; // east Asia font
    private String westernFontFamily; // western font
    private double fontSize;
    private Boolean isBold;
    private Boolean isItalic;
    private Boolean isStrike;
    private UnderlinePatterns underlinePatterns;
    private String underlineColor;
    private XWPFHighlightColor highlightColor;
    private int characterSpacing;
    private String vertAlign;


    public Style() {
    }

    public Style(String color) {
        this.color = color;
    }

    public Style(String fontFamily, double fontSize) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
    }


}
