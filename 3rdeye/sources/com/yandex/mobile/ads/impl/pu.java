package com.yandex.mobile.ads.impl;

import java.io.IOException;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class pu<T> implements qk2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final qk2<T> f31915a;

    /* renamed from: b, reason: collision with root package name */
    private final rk2 f31916b;

    public pu(m80 xmlElementParser, rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(xmlElementParser, "xmlElementParser");
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f31915a = xmlElementParser;
        this.f31916b = xmlHelper;
    }

    @Override // com.yandex.mobile.ads.impl.qk2
    public final T a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, JSONException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f31916b.getClass();
        T tA = null;
        parser.require(2, null, "CreativeExtension");
        while (true) {
            this.f31916b.getClass();
            if (!rk2.a(parser)) {
                return tA;
            }
            this.f31916b.getClass();
            if (rk2.b(parser)) {
                tA = this.f31915a.a(parser, base64EncodingParameters);
            }
        }
    }
}
