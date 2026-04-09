package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yn2;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xn2 implements yn2.b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f35372a;

    /* renamed from: b, reason: collision with root package name */
    private final co2 f35373b;

    public xn2(co2 co2Var) {
        this.f35373b = co2Var;
    }

    public final void a() {
        this.f35373b.a(new go2(this));
    }

    public final JSONObject b() {
        return this.f35372a;
    }

    public final void a(JSONObject jSONObject) {
        this.f35372a = jSONObject;
    }

    public final void b(JSONObject jSONObject, HashSet<String> hashSet, long j4) {
        this.f35373b.a(new lo2(this, hashSet, jSONObject, j4));
    }

    public final void a(JSONObject jSONObject, HashSet<String> hashSet, long j4) {
        this.f35373b.a(new oo2(this, hashSet, jSONObject, j4));
    }
}
