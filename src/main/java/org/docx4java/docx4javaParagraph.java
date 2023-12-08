package org.docx4java;

import lombok.Getter;
import lombok.experimental.Accessors;

import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.docx4java.style.docx4javaParagraphStyle;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;

import java.util.ArrayList;

import org.docx4java.utils.StyleUtils;


@Getter
@Accessors(chain = true)
public class docx4javaParagraph {
    private final XWPFParagraph paragraph;
    ArrayList<docx4javaRun> runs = new ArrayList<>();

    private docx4javaParagraphStyle style;

    public docx4javaParagraph(docx4javaDocument document) {
        this.paragraph = document.document.createParagraph();
    }

    public docx4javaRun addRun() {
        docx4javaRun run = new docx4javaRun(this);
        this.runs.add(run);
        return run;
    }

    public CTP _getCTP() {
        return this.paragraph.getCTP();
    }

    public docx4javaParagraph addStyle(docx4javaParagraphStyle style) {
        StyleUtils.styleParagraph(this, style);
        this.style = style;
        return this;
    }


}
