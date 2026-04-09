package com.google.android.gms.internal.ads;

import t2.AbstractC2907C;

/* renamed from: com.google.android.gms.internal.ads.uc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1967uc extends B3.u {

    /* renamed from: c, reason: collision with root package name */
    public final Object f17127c;

    /* renamed from: d, reason: collision with root package name */
    public final C2021vc f17128d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17129e;

    public C1967uc(C2021vc c2021vc) {
        super(3, false);
        this.f17127c = new Object();
        this.f17128d = c2021vc;
    }

    public final void D() {
        AbstractC2907C.m("release: Trying to acquire lock");
        synchronized (this.f17127c) {
            try {
                AbstractC2907C.m("release: Lock acquired");
                if (this.f17129e) {
                    AbstractC2907C.m("release: Lock already released");
                    return;
                }
                this.f17129e = true;
                A(new W9(5), new W9(20));
                A(new C1283hr(this), new Nx(this));
                AbstractC2907C.m("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
