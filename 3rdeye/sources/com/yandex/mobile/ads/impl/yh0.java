package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.xh0;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class yh0 implements qk2<xh0> {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f35800a;

    public /* synthetic */ yh0() {
        this(new rk2());
    }

    @Override // com.yandex.mobile.ads.impl.qk2
    public final xh0 a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f35800a.getClass();
        parser.require(2, null, "Icon");
        xh0.a aVar = new xh0.a();
        tu.a(this.f35800a, parser, "parser", "program", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "program");
        tu.a(this.f35800a, parser, "parser", "height", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "height");
        tu.a(this.f35800a, parser, "parser", "width", "attributeName");
        String attributeValue3 = parser.getAttributeValue(null, "width");
        tu.a(this.f35800a, parser, "parser", "xPosition", "attributeName");
        String attributeValue4 = parser.getAttributeValue(null, "xPosition");
        tu.a(this.f35800a, parser, "parser", "yPosition", "attributeName");
        String attributeValue5 = parser.getAttributeValue(null, "yPosition");
        tu.a(this.f35800a, parser, "parser", "apiFramework", "attributeName");
        String attributeValue6 = parser.getAttributeValue(null, "apiFramework");
        tu.a(this.f35800a, parser, "parser", "offset", "attributeName");
        String attributeValue7 = parser.getAttributeValue(null, "offset");
        tu.a(this.f35800a, parser, "parser", "duration", "attributeName");
        String attributeValue8 = parser.getAttributeValue(null, "duration");
        while (true) {
            this.f35800a.getClass();
            if (!rk2.a(parser)) {
                return aVar.f(attributeValue).c(attributeValue2).j(attributeValue3).d(attributeValue4).i(attributeValue5).a(attributeValue6).e(attributeValue7).b(attributeValue8).a();
            }
            this.f35800a.getClass();
            if (rk2.b(parser)) {
                String name = parser.getName();
                xh0.c.f35311c.getClass();
                xh0.c[] cVarArrValues = xh0.c.values();
                int length = cVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        this.f35800a.getClass();
                        rk2.d(parser);
                        break;
                    }
                    if (kotlin.jvm.internal.l.b(cVarArrValues[i].a(), name)) {
                        this.f35800a.getClass();
                        aVar.g(name).h(rk2.c(parser));
                        break;
                    }
                    i++;
                }
            }
        }
    }

    public yh0(rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f35800a = xmlHelper;
    }
}
