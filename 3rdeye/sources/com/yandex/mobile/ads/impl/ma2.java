package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class ma2 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f30324a;

    public /* synthetic */ ma2() {
        this(new rk2());
    }

    public final String a(XmlPullParser parser) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        this.f30324a.getClass();
        parser.require(2, null, "VerificationParameters");
        this.f30324a.getClass();
        String strC = rk2.c(parser);
        if (strC.length() == 0) {
            return null;
        }
        return strC;
    }

    public ma2(rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f30324a = xmlHelper;
    }
}
