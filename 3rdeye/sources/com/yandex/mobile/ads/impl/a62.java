package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class a62 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f24447a;

    /* renamed from: b, reason: collision with root package name */
    private final z52 f24448b;

    public /* synthetic */ a62() {
        this(new rk2(), new z52());
    }

    public final HashMap a(XmlPullParser parser, qj base64EncodingHeaderParameters) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingHeaderParameters, "base64EncodingHeaderParameters");
        this.f24447a.getClass();
        parser.require(2, null, "TrackingEvents");
        HashMap map = new HashMap();
        while (true) {
            this.f24447a.getClass();
            if (!rk2.a(parser)) {
                return map;
            }
            this.f24447a.getClass();
            if (rk2.b(parser)) {
                if ("Tracking".equals(parser.getName())) {
                    y52 y52VarA = this.f24448b.a(parser, base64EncodingHeaderParameters);
                    if (y52VarA != null) {
                        String strA = y52VarA.a();
                        String strC = y52VarA.c();
                        if (!map.containsKey(strA)) {
                            map.put(strA, new ArrayList());
                        }
                        List list = (List) map.get(strA);
                        if (list != null) {
                            list.add(strC);
                        }
                    }
                } else {
                    this.f24447a.getClass();
                    rk2.d(parser);
                }
            }
        }
    }

    public a62(rk2 xmlHelper, z52 trackingEventParser) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        kotlin.jvm.internal.l.f(trackingEventParser, "trackingEventParser");
        this.f24447a = xmlHelper;
        this.f24448b = trackingEventParser;
    }
}
