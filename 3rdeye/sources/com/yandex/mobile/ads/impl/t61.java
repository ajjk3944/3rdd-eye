package com.yandex.mobile.ads.impl;

import android.content.Context;
import c9.C2100u;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class t61 implements cr1<p61> {

    /* renamed from: a, reason: collision with root package name */
    private final ii2 f33456a;

    /* renamed from: b, reason: collision with root package name */
    private final z81 f33457b;

    public /* synthetic */ t61(Context context, mp1 mp1Var) {
        this(context, mp1Var, mc1.a(), new z81(context, mp1Var));
    }

    public final p61 a(String stringResponse, qj base64EncodingParameters) {
        kotlin.jvm.internal.l.f(stringResponse, "stringResponse");
        kotlin.jvm.internal.l.f(base64EncodingParameters, "base64EncodingParameters");
        try {
            return this.f33457b.a(stringResponse, base64EncodingParameters);
        } catch (k61 unused) {
            fp0.b(new Object[0]);
            return null;
        } catch (JSONException unused2) {
            fp0.b(new Object[0]);
            return null;
        }
    }

    public t61(Context context, mp1 reporter, ii2 volleyNetworkResponseDecoder, z81 nativeJsonParser) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(volleyNetworkResponseDecoder, "volleyNetworkResponseDecoder");
        kotlin.jvm.internal.l.f(nativeJsonParser, "nativeJsonParser");
        this.f33456a = volleyNetworkResponseDecoder;
        this.f33457b = nativeJsonParser;
    }

    @Override // com.yandex.mobile.ads.impl.cr1
    public final p61 a(nc1 networkResponse) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        String strA = this.f33456a.a(networkResponse);
        if (strA == null || strA.length() == 0) {
            return null;
        }
        Map map = networkResponse.f30837c;
        if (map == null) {
            map = C2100u.f18582b;
        }
        return a(strA, new pj(map));
    }
}
