package com.google.android.gms.internal.ads;

import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.al, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896al implements InterfaceC0730Sk {

    /* renamed from: a, reason: collision with root package name */
    public int f13220a;

    /* renamed from: b, reason: collision with root package name */
    public int f13221b;

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void E(C1807re c1807re) {
    }

    public final synchronized int a() {
        return this.f13220a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final synchronized void w(Xt xt) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8591F1)).booleanValue()) {
            try {
                St st = (St) xt.f12510b.f15174c;
                this.f13220a = st.f11270c;
                this.f13221b = st.f11271d;
            } catch (NullPointerException unused) {
            }
        }
    }
}
