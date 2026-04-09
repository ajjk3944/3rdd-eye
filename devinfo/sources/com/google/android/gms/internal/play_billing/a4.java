package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a4 extends y3 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b4 f20083h;

    public a4(b4 b4Var) {
        this.f20083h = b4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.y3
    public final String b() {
        z3 z3Var = (z3) this.f20083h.f20091a.get();
        return z3Var == null ? "Completer object has been garbage collected, future will fail soon" : d.h.t("tag=[", String.valueOf(z3Var.f20274a), "]");
    }
}
