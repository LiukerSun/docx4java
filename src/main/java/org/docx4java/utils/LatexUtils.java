package org.docx4java.utils;

import org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath;
import org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class LatexUtils {
    static File stylesheet;

    static {
        URL resourceUrl = LatexUtils.class.getClassLoader().getResource("MML2OMML.XSL");
        if (resourceUrl != null) {
            stylesheet = new File(resourceUrl.getFile());
        } else {
            // 处理文件未找到的情况
            System.err.println("MML2OMML.XSL file not found in src/main/resources");
        }
    }

    static TransformerFactory tFactory = TransformerFactory.newInstance();
    static StreamSource styleSource = new StreamSource(stylesheet);

    public static CTOMath _getOMML(String mathML) throws Exception {
        Transformer transformer = tFactory.newTransformer(styleSource);
        StringReader stringreader = new StringReader(mathML);
        StreamSource source = new StreamSource(stringreader);
        StringWriter stringwriter = new StringWriter();
        StreamResult result = new StreamResult(stringwriter);
        transformer.transform(source, result);
        String ooML = stringwriter.toString();
        stringwriter.close();
        CTOMathPara ctOMathPara = CTOMathPara.Factory.parse(ooML);
        return ctOMathPara.getOMathArray(0);
    }

}
