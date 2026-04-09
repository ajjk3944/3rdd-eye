package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t90 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16757a;

    /* renamed from: b, reason: collision with root package name */
    public final aw f16758b;

    public /* synthetic */ t90(aw awVar, int i4) {
        this.f16757a = i4;
        this.f16758b = awVar;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f16757a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f16758b.f9451b;
                al0.z(jSONObject);
                return jSONObject;
            case 1:
                hc0 hc0Var = (hc0) this.f16758b.f9452c;
                al0.z(hc0Var);
                return hc0Var;
            case 2:
                return (ua.a) this.f16758b.f9453d;
            default:
                return (uv) this.f16758b.f9454e;
        }
    }
}
