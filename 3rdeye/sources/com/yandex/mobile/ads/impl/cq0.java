package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class cq0 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f25751a;

    public /* synthetic */ cq0() {
        this(new rk2());
    }

    public final bq0 a(XmlPullParser parser) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        this.f25751a.getClass();
        parser.require(2, null, "JavaScriptResource");
        tu.a(this.f25751a, parser, "parser", "apiFramework", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "apiFramework");
        tu.a(this.f25751a, parser, "parser", "browserOptional", "attributeName");
        String attributeValue2 = parser.getAttributeValue(null, "browserOptional");
        Boolean boolValueOf = attributeValue2 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue2)) : null;
        this.f25751a.getClass();
        String strC = rk2.c(parser);
        if (attributeValue == null || attributeValue.length() == 0 || boolValueOf == null || strC.length() <= 0) {
            return null;
        }
        return new bq0(attributeValue, strC, boolValueOf.booleanValue());
    }

    public cq0(rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f25751a = xmlHelper;
    }
}
