package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class t70 {

    /* renamed from: a, reason: collision with root package name */
    private final rk2 f33470a;

    /* renamed from: b, reason: collision with root package name */
    private final fy1 f33471b;

    public /* synthetic */ t70(rk2 rk2Var) {
        this(rk2Var, new fy1(rk2Var));
    }

    public final ArrayList a(XmlPullParser parser, pj base64EncodingParameters) throws XmlPullParserException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f33470a.getClass();
        parser.require(2, null, "Extensions");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f33470a.getClass();
            if (!rk2.a(parser)) {
                return arrayList;
            }
            this.f33470a.getClass();
            if (rk2.b(parser)) {
                if ("Extension".equals(parser.getName())) {
                    p70 p70VarA = this.f33471b.a(parser, base64EncodingParameters);
                    if (p70VarA != null) {
                        arrayList.add(p70VarA);
                    }
                } else {
                    this.f33470a.getClass();
                    rk2.d(parser);
                }
            }
        }
    }

    public t70(rk2 xmlHelper, fy1 simpleExtensionParser) {
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        kotlin.jvm.internal.l.f(simpleExtensionParser, "simpleExtensionParser");
        this.f33470a = xmlHelper;
        this.f33471b = simpleExtensionParser;
    }
}
