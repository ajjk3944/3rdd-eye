package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class g9 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f27588a;

    public g9(rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f27588a = xmlHelper;
    }

    public final f9 a(XmlPullParser parser) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        this.f27588a.getClass();
        parser.require(2, null, "AdTagURI");
        parser.getAttributeValue(null, "templateType");
        this.f27588a.getClass();
        String strC = rk2.c(parser);
        if (strC.length() > 0) {
            return new f9(strC);
        }
        return null;
    }
}
