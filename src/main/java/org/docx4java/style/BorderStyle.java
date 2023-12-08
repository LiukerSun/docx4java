package org.docx4java.style;

import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.poi.xwpf.usermodel.XWPFTable.XWPFBorderType;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class BorderStyle implements Serializable {
    private int size;
    private String color;
    private XWPFBorderType type;
    private int space = 0;

}
