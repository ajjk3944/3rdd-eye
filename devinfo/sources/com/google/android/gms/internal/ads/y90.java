package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y90 implements xg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ca0 f18684b;

    public y90(ca0 ca0Var, String str) {
        this.f18683a = str;
        this.f18684b = ca0Var;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    @Override // com.google.android.gms.internal.ads.xg
    public final void w(wg wgVar) {
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16134g2)).booleanValue()) {
            if (wgVar.j) {
                ca0 ca0Var = this.f18684b;
                if (ca0Var.f10033w != null) {
                    ca0Var.H.put(this.f18683a, Boolean.TRUE);
                    ?? r02 = ca0Var.f10033w;
                    if (r02 == 0) {
                        return;
                    }
                    ca0Var.z(r02.f2(), r02.A1(), r02.D1(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (wgVar.j) {
                    ca0 ca0Var2 = this.f18684b;
                    if (ca0Var2.f10033w != null) {
                        ca0Var2.H.put(this.f18683a, Boolean.TRUE);
                        ?? r03 = ca0Var2.f10033w;
                        if (r03 == 0) {
                        } else {
                            ca0Var2.z(r03.f2(), ca0Var2.f10033w.A1(), ca0Var2.f10033w.D1(), true);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
