package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class x30 implements w60 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f18292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ za.a f18293c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp0 f18294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq0 f18295e;

    public /* synthetic */ x30(Context context, za.a aVar, wp0 wp0Var, hq0 hq0Var, int i4) {
        this.f18291a = i4;
        this.f18292b = context;
        this.f18293c = aVar;
        this.f18294d = wp0Var;
        this.f18295e = hq0Var;
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void e() {
        switch (this.f18291a) {
            case 0:
                JSONObject jSONObject = this.f18294d.C;
                ua.j.C.f35271o.k(this.f18292b, this.f18293c.f38129a, jSONObject.toString(), this.f18295e.g);
                break;
            default:
                JSONObject jSONObject2 = this.f18294d.C;
                ua.j.C.f35271o.k(this.f18292b, this.f18293c.f38129a, jSONObject2.toString(), this.f18295e.g);
                break;
        }
    }
}
