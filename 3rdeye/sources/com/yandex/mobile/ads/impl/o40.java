package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class o40 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f31163a;

    public /* synthetic */ o40() {
        this(new rk2());
    }

    public final int a(XmlPullParser parser) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        this.f31163a.getClass();
        parser.require(2, null, "Duration");
        this.f31163a.getClass();
        Long lA = pd2.a(rk2.c(parser));
        if (lA != null) {
            return (int) lA.longValue();
        }
        return 0;
    }

    public o40(rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f31163a = xmlHelper;
    }
}
