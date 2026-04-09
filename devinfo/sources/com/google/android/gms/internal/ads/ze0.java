package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ze0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f19064a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19065b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19066c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19067d;

    /* renamed from: e, reason: collision with root package name */
    public final String f19068e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19069f;
    public final boolean g;

    public ze0(String str, String str2, boolean z3, int i4, String str3, int i10, String str4) {
        this.f19064a = str;
        this.f19065b = str2;
        this.f19066c = str3;
        this.f19067d = i4;
        this.f19068e = str4;
        this.f19069f = i10;
        this.g = z3;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f19064a);
        jSONObject.put("version", this.f19066c);
        pk pkVar = sk.Da;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f19065b);
        }
        jSONObject.put("status", this.f19067d);
        jSONObject.put("description", this.f19068e);
        jSONObject.put("initializationLatencyMillis", this.f19069f);
        if (((Boolean) sVar.f36166c.a(sk.Ea)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.g);
        }
        return jSONObject;
    }
}
