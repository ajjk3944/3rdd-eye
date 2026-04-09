package com.yandex.mobile.ads.impl;

import c9.C2092m;
import com.yandex.mobile.ads.impl.hb2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class ib2 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f28630d = "yandex_tracking_events";

    /* renamed from: e, reason: collision with root package name */
    private static final List<String> f28631e = C2092m.W("ad_system", "social_ad_info", "AdTune", "yandex_ad_info", "bannerId", "VitrinaTVIsInteractive");

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f28632a;

    /* renamed from: b, reason: collision with root package name */
    private final fy1 f28633b;

    /* renamed from: c, reason: collision with root package name */
    private final pk2<y52> f28634c;

    public ib2() {
        rk2 rk2Var = new rk2();
        this.f28632a = rk2Var;
        this.f28633b = new fy1(rk2Var);
        this.f28634c = a();
    }

    public final hb2 a(XmlPullParser parser, qj base64EncodingParameters) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f28632a.getClass();
        parser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        hb2.a aVar = new hb2.a();
        while (true) {
            this.f28632a.getClass();
            if (!rk2.a(parser)) {
                aVar.a(arrayList2);
                aVar.b(arrayList);
                return aVar.a();
            }
            this.f28632a.getClass();
            if (rk2.b(parser)) {
                if ("Extension".equals(parser.getName())) {
                    String attributeValue = parser.getAttributeValue(null, "type");
                    if (f28631e.contains(attributeValue)) {
                        p70 p70VarA = this.f28633b.a(parser, base64EncodingParameters);
                        if (p70VarA != null) {
                            arrayList2.add(p70VarA);
                        }
                    } else if (kotlin.jvm.internal.l.b(f28630d, attributeValue)) {
                        arrayList.addAll(this.f28634c.a(parser, base64EncodingParameters));
                    } else {
                        this.f28632a.getClass();
                        rk2.d(parser);
                    }
                } else {
                    this.f28632a.getClass();
                    rk2.d(parser);
                }
            }
        }
    }

    private static pk2 a() {
        return new pk2(new z52(), "Extension", "Tracking", new rk2());
    }
}
