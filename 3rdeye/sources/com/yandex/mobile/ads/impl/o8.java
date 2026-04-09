package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o8 {

    /* renamed from: a, reason: collision with root package name */
    private final pf1 f31288a;

    /* renamed from: b, reason: collision with root package name */
    private final pf1 f31289b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31290c;

    /* renamed from: d, reason: collision with root package name */
    private final vu f31291d;

    /* renamed from: e, reason: collision with root package name */
    private final kk0 f31292e;

    private o8() {
        vu vuVar = vu.f34692c;
        kk0 kk0Var = kk0.f29687c;
        pf1 pf1Var = pf1.f31726c;
        this.f31291d = vuVar;
        this.f31292e = kk0Var;
        this.f31288a = pf1Var;
        this.f31289b = pf1Var;
        this.f31290c = false;
    }

    public static o8 a() {
        return new o8();
    }

    public final boolean b() {
        return pf1.f31726c == this.f31288a;
    }

    public final boolean c() {
        return pf1.f31726c == this.f31289b;
    }

    public final JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        vn2.a(jSONObject, "impressionOwner", this.f31288a);
        vn2.a(jSONObject, "mediaEventsOwner", this.f31289b);
        vn2.a(jSONObject, "creativeType", this.f31291d);
        vn2.a(jSONObject, "impressionType", this.f31292e);
        vn2.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f31290c));
        return jSONObject;
    }
}
