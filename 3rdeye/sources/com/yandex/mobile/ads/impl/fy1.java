package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class fy1 implements qk2<p70> {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f27490a;

    public fy1(rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f27490a = xmlHelper;
    }

    @Override // com.yandex.mobile.ads.impl.qk2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p70 a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f27490a.getClass();
        parser.require(2, null, "Extension");
        String attributeValue = parser.getAttributeValue(null, "type");
        this.f27490a.getClass();
        String strC = rk2.c(parser);
        if (attributeValue == null || attributeValue.length() == 0 || strC.length() <= 0) {
            return null;
        }
        return new p70(attributeValue, strC);
    }
}
