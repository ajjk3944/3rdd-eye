package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import y9.C5819a;

/* loaded from: classes3.dex */
public final class oc1 {

    /* renamed from: a, reason: collision with root package name */
    private final pn1 f31343a;

    /* renamed from: b, reason: collision with root package name */
    private final qn1 f31344b;

    public /* synthetic */ oc1() {
        this(new pn1(), qn1.f32297b.a());
    }

    public final nc1 a(op1<?> request) {
        kotlin.jvm.internal.l.f(request, "request");
        String strA = this.f31344b.a(request);
        if (strA == null) {
            return null;
        }
        try {
            this.f31343a.getClass();
            on1 on1VarA = pn1.a(strA);
            byte[] bytes = on1VarA.a().getBytes(C5819a.f48359b);
            kotlin.jvm.internal.l.e(bytes, "getBytes(...)");
            return new nc1(200, bytes, on1VarA.b(), false);
        } catch (JSONException unused) {
            return null;
        }
    }

    public oc1(pn1 readyResponseDecoder, qn1 readyResponseStorage) {
        kotlin.jvm.internal.l.f(readyResponseDecoder, "readyResponseDecoder");
        kotlin.jvm.internal.l.f(readyResponseStorage, "readyResponseStorage");
        this.f31343a = readyResponseDecoder;
        this.f31344b = readyResponseStorage;
    }
}
