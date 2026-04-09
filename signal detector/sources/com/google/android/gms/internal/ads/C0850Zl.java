package com.google.android.gms.internal.ads;

import org.json.JSONObject;
import p2.C2771a;

/* renamed from: com.google.android.gms.internal.ads.Zl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0850Zl implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12947a;

    /* renamed from: b, reason: collision with root package name */
    public final C1431kf f12948b;

    public /* synthetic */ C0850Zl(C1431kf c1431kf, int i) {
        this.f12947a = i;
        this.f12948b = c1431kf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f12947a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f12948b.f15173b;
                Cr.v(jSONObject);
                return jSONObject;
            case 1:
                C1547mn c1547mn = (C1547mn) this.f12948b.f15174c;
                Cr.v(c1547mn);
                return c1547mn;
            case 2:
                return (C2771a) this.f12948b.f15175d;
            default:
                return (InterfaceC1054df) this.f12948b.f15176e;
        }
    }
}
