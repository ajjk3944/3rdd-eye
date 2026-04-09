package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j40 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12625a;

    /* renamed from: b, reason: collision with root package name */
    public final ce1 f12626b;

    public /* synthetic */ j40(ce1 ce1Var, int i4) {
        this.f12625a = i4;
        this.f12626b = ce1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f12625a) {
            case 0:
                w70 w70Var = (w70) this.f12626b.f10095c;
                return w70Var != null ? new q80(w70Var, fx.g) : new q80(new i40(), fx.g);
            default:
                return (w70) this.f12626b.f10095c;
        }
    }
}
