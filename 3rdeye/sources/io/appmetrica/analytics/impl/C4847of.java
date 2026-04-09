package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.of, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4847of {

    /* renamed from: a, reason: collision with root package name */
    public final String f41374a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f41375b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC4685i8 f41376c;

    public C4847of(String str, JSONObject jSONObject, EnumC4685i8 enumC4685i8) {
        this.f41374a = str;
        this.f41375b = jSONObject;
        this.f41376c = enumC4685i8;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f41374a + "', additionalParams=" + this.f41375b + ", source=" + this.f41376c + '}';
    }
}
