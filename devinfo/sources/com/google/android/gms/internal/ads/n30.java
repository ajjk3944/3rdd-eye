package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n30 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14140a;

    /* renamed from: b, reason: collision with root package name */
    public final v40 f14141b;

    public /* synthetic */ n30(v40 v40Var, int i4) {
        this.f14140a = i4;
        this.f14141b = v40Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f14140a) {
            case 0:
                try {
                    return new JSONObject(this.f14141b.b().f18120z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new ia0(this.f14141b.b());
        }
    }
}
