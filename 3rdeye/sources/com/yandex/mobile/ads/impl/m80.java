package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class m80 implements qk2<h80> {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f30305a;

    public m80(rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f30305a = xmlHelper;
    }

    @Override // com.yandex.mobile.ads.impl.qk2
    public final h80 a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f30305a.getClass();
        parser.require(2, null, "FalseClick");
        tu.a(this.f30305a, parser, "parser", "interval", "attributeName");
        String attributeValue = parser.getAttributeValue(null, "interval");
        Long lR = attributeValue != null ? y9.m.R(attributeValue) : null;
        this.f30305a.getClass();
        String strC = rk2.c(parser);
        if (strC.length() <= 0 || lR == null) {
            return null;
        }
        return new h80(strC, lR.longValue());
    }
}
