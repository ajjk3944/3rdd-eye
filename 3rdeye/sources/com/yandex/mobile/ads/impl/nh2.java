package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class nh2 implements qk2<mh2> {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f30880a;

    public /* synthetic */ nh2() {
        this(new rk2());
    }

    @Override // com.yandex.mobile.ads.impl.qk2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mh2 a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f30880a.getClass();
        parser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f30880a.getClass();
            if (!rk2.a(parser)) {
                return new mh2(arrayList);
            }
            this.f30880a.getClass();
            if (rk2.b(parser)) {
                if ("Viewable".equals(parser.getName())) {
                    this.f30880a.getClass();
                    arrayList.add(rk2.c(parser));
                } else {
                    this.f30880a.getClass();
                    rk2.d(parser);
                }
            }
        }
    }

    public nh2(rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f30880a = xmlHelper;
    }
}
