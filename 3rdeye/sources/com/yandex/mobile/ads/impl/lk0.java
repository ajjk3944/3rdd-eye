package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.za2;
import java.io.IOException;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class lk0 {

    /* renamed from: a, reason: collision with root package name */
    private final eb2 f30019a;

    /* renamed from: b, reason: collision with root package name */
    private final rk2 f30020b;

    public /* synthetic */ lk0(eb2 eb2Var) {
        this(eb2Var, new rk2());
    }

    public final za2 a(XmlPullParser parser, za2.a videoAdBuilder, qj base64EncodingParameters) throws XmlPullParserException, JSONException, IOException {
        kotlin.jvm.internal.l.f(parser, "parser");
        kotlin.jvm.internal.l.f(videoAdBuilder, "videoAdBuilder");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        this.f30020b.getClass();
        parser.require(2, null, "InLine");
        while (true) {
            this.f30020b.getClass();
            if (!rk2.a(parser)) {
                break;
            }
            this.f30020b.getClass();
            if (rk2.b(parser)) {
                this.f30019a.a(parser, videoAdBuilder, base64EncodingParameters);
            }
        }
        za2 za2VarA = videoAdBuilder.a();
        if (za2VarA.e().isEmpty()) {
            return null;
        }
        return za2VarA;
    }

    public lk0(eb2 videoAdElementParser, rk2 xmlHelper) {
        kotlin.jvm.internal.l.f(videoAdElementParser, "videoAdElementParser");
        kotlin.jvm.internal.l.f(xmlHelper, "xmlHelper");
        this.f30019a = videoAdElementParser;
        this.f30020b = xmlHelper;
    }
}
