package org.docx4java.style;

import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.VerticalAlign;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class docx4javaRunStyle implements Serializable {
    private Boolean bold;
    private Boolean Capitalized;
    private int CharacterSpacing;// 字符间距
    private String Color;
    private Boolean DoubleStrikethrough;
    private Boolean Embossed;// 着重
    private String EmphasisMark;//着重符号
    private String FontFamily;
    private String westernFontFamily; // western font
    private double FontSize;
    private Boolean Imprinted;
    private Boolean Italic;
    private int Kerning; // 字体调整字间距
    private String Lang; // 设置段落关联语言
    private Boolean Shadow;
    private Boolean SmallCaps;
    private Boolean Strike; //删除线
    private Boolean StrikeThrough;
    private VerticalAlign Subscript; //上标/下标
    private String TextHighlightColor;
    private UnderlinePatterns Underline;
    private String UnderlineColor;
    private String VerticalAlignment;
    private String vertAlign;
    private XWPFHighlightColor highlightColor;
}
