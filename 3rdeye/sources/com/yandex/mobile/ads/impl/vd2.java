package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class vd2 implements qk2<ud2> {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f34517a;

    public /* synthetic */ vd2() {
        this(new rk2());
    }

    @Override // com.yandex.mobile.ads.impl.qk2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ud2 a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f34517a.getClass();
        String str = null;
        parser.require(2, null, "VideoClicks");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f34517a.getClass();
            if (!rk2.a(parser)) {
                return new ud2(str, arrayList);
            }
            this.f34517a.getClass();
            if (rk2.b(parser)) {
                String name = parser.getName();
                if ("ClickThrough".equals(name)) {
                    this.f34517a.getClass();
                    String strC = rk2.c(parser);
                    if (strC.length() > 0) {
                        str = strC;
                    }
                } else if ("ClickTracking".equals(name)) {
                    this.f34517a.getClass();
                    String strC2 = rk2.c(parser);
                    if (strC2.length() > 0) {
                        arrayList.add(strC2);
                    }
                } else {
                    this.f34517a.getClass();
                    rk2.d(parser);
                }
            }
        }
    }

    public vd2(rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f34517a = xmlHelper;
    }
}
