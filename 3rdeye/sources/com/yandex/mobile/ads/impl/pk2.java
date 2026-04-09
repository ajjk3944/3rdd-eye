package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class pk2<T> implements qk2<List<? extends T>> {

    /* renamed from: a, reason: collision with root package name */
    private final qk2<T> f31806a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31807b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31808c;

    /* renamed from: d, reason: collision with root package name */
    private final rk2 f31809d;

    public /* synthetic */ pk2(qk2 qk2Var, String str, String str2) {
        this(qk2Var, str, str2, new rk2());
    }

    @Override // com.yandex.mobile.ads.impl.qk2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, JSONException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        ArrayList arrayList = new ArrayList();
        rk2 rk2Var = this.f31809d;
        String str = this.f31807b;
        rk2Var.getClass();
        parser.require(2, null, str);
        while (true) {
            this.f31809d.getClass();
            if (!rk2.a(parser)) {
                return arrayList;
            }
            this.f31809d.getClass();
            if (rk2.b(parser)) {
                if (kotlin.jvm.internal.l.b(this.f31808c, parser.getName())) {
                    T tA = this.f31806a.a(parser, base64EncodingParameters);
                    if (tA != null) {
                        arrayList.add(tA);
                    }
                } else {
                    this.f31809d.getClass();
                    rk2.d(parser);
                }
            }
        }
    }

    public pk2(qk2<T> xmlElementParser, String elementsArrayTag, String elementTag, rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(xmlElementParser, "xmlElementParser");
        kotlin.jvm.internal.l.f(elementsArrayTag, "elementsArrayTag");
        kotlin.jvm.internal.l.f(elementTag, "elementTag");
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f31806a = xmlElementParser;
        this.f31807b = elementsArrayTag;
        this.f31808c = elementTag;
        this.f31809d = xmlHelper;
    }
}
