package org.docx4java.style;

import lombok.Getter;
import org.apache.poi.xwpf.usermodel.LineSpacingRule;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;

import java.io.Serializable;

@Getter
public class docx4javaParagraphStyle implements Serializable {
    // getter
    private String styleId;
    private ParagraphAlignment align; // 对齐
    private Double indentLeftCM; // 缩进-左侧 CM
    private Double indentLeftChars; // 缩进-左侧
    private Double indentRightChars;// 缩进-右侧
    private Double indentHangingChars;// 缩进-悬挂
    private Double indentFirstLineChars;// 缩进-首行
    private BorderStyle leftBorder; // 边框-左
    private BorderStyle rightBorder;// 边框-右
    private BorderStyle topBorder;// 边框-上
    private BorderStyle bottomBorder;// 边框-下
    private XWPFShadingPattern shadingPattern; // 底纹样式
    private String backgroundColor; // 底纹颜色
    private Boolean widowControl; // 孤行控制
    private Boolean keepLines; // 段中不分页
    private Boolean keepNext; // 与下段同页
    private Boolean pageBreakBefore; // 段前分页
    private Boolean segmentation; // 段前分节
    private String pageType;//页面类型
    private Boolean allowWordBreak; // 单词断行
    private Double spacingBeforeLines; // 间距-段前-行
    private Double spacingAfterLines; // 间距-断后-行
    private Double spacingBefore; // 间距-段前-磅
    private Double spacingAfter; // 间距-断后-磅
    private Double spacing;
    private LineSpacingRule spacingRule;
    private Style glyphStyle;
    private Long numId;
    private Long lvl;

    public docx4javaParagraphStyle setStyleId(String styleId) {
        this.styleId = styleId;
        return this;
    }

    public docx4javaParagraphStyle setAlign(ParagraphAlignment align) {
        this.align = align;
        return this;
    }

    public docx4javaParagraphStyle setIndentLeftCM(Double indentLeftCM) {
        this.indentLeftCM = indentLeftCM;
        return this;
    }

    public docx4javaParagraphStyle setIndentLeftChars(Double indentLeftChars) {
        this.indentLeftChars = indentLeftChars;
        return this;
    }

    public docx4javaParagraphStyle setIndentRightChars(Double indentRightChars) {
        this.indentRightChars = indentRightChars;
        return this;
    }

    public docx4javaParagraphStyle setIndentHangingChars(Double indentHangingChars) {
        this.indentHangingChars = indentHangingChars;
        return this;
    }

    public docx4javaParagraphStyle setIndentFirstLineChars(Double indentFirstLineChars) {
        this.indentFirstLineChars = indentFirstLineChars;
        return this;
    }

    public docx4javaParagraphStyle setLeftBorder(BorderStyle leftBorder) {
        this.leftBorder = leftBorder;
        return this;
    }

    public docx4javaParagraphStyle setRightBorder(BorderStyle rightBorder) {
        this.rightBorder = rightBorder;
        return this;
    }

    public docx4javaParagraphStyle setTopBorder(BorderStyle topBorder) {
        this.topBorder = topBorder;
        return this;
    }

    public docx4javaParagraphStyle setBottomBorder(BorderStyle bottomBorder) {
        this.bottomBorder = bottomBorder;
        return this;
    }

    public docx4javaParagraphStyle setShadingPattern(XWPFShadingPattern shadingPattern) {
        this.shadingPattern = shadingPattern;
        return this;
    }

    public docx4javaParagraphStyle setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public docx4javaParagraphStyle setWidowControl(Boolean widowControl) {
        this.widowControl = widowControl;
        return this;
    }

    public docx4javaParagraphStyle setKeepLines(Boolean keepLines) {
        this.keepLines = keepLines;
        return this;
    }

    public docx4javaParagraphStyle setKeepNext(Boolean keepNext) {
        this.keepNext = keepNext;
        return this;
    }

    public docx4javaParagraphStyle setPageBreakBefore(Boolean pageBreakBefore) {
        this.pageBreakBefore = pageBreakBefore;
        return this;
    }

    public docx4javaParagraphStyle setAllowWordBreak(Boolean allowWordBreak) {
        this.allowWordBreak = allowWordBreak;
        return this;
    }

    public docx4javaParagraphStyle setSpacingBeforeLines(Double spacingBeforeLines) {
        this.spacingBeforeLines = spacingBeforeLines;
        return this;
    }

    public docx4javaParagraphStyle setSpacingAfterLines(Double spacingAfterLines) {
        this.spacingAfterLines = spacingAfterLines;
        return this;
    }

    public docx4javaParagraphStyle setSpacingBefore(Double spacingBefore) {
        this.spacingBefore = spacingBefore;
        return this;
    }

    public docx4javaParagraphStyle setSpacingAfter(Double spacingAfter) {
        this.spacingAfter = spacingAfter;
        return this;
    }

    public docx4javaParagraphStyle setSpacing(Double spacing) {
        this.spacing = spacing;
        return this;
    }

    public docx4javaParagraphStyle setSpacingRule(LineSpacingRule spacingRule) {
        this.spacingRule = spacingRule;
        return this;
    }

    public docx4javaParagraphStyle setGlyphStyle(Style glyphStyle) {
        this.glyphStyle = glyphStyle;
        return this;
    }

    public docx4javaParagraphStyle setNumId(Long numId) {
        this.numId = numId;
        return this;
    }

    public docx4javaParagraphStyle setLvl(Long lvl) {
        this.lvl = lvl;
        return this;
    }


    public docx4javaParagraphStyle setSegmentation(Boolean segmentation) {
        this.segmentation = segmentation;
        return this;
    }

    public docx4javaParagraphStyle setPageType(String pageType) {
        this.pageType = pageType;
        return this;
    }
}
