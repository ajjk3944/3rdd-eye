package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class ax1 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f25016a;

    public /* synthetic */ ax1() {
        this(new rk2());
    }

    public final Integer a(XmlPullParser parser) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        this.f25016a.getClass();
        parser.require(2, null, "Ad");
        Integer numB = pd2.b(parser.getAttributeValue(null, "sequence"));
        if (numB == null || numB.intValue() >= 0) {
            return numB;
        }
        return null;
    }

    public ax1(rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f25016a = xmlHelper;
    }
}
