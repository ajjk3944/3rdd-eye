package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;

/* loaded from: classes.dex */
public final class SC implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final YC f11153a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceFutureC2326a f11154b;

    public SC(YC yc, InterfaceFutureC2326a interfaceFutureC2326a) {
        this.f11153a = yc;
        this.f11154b = interfaceFutureC2326a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f11153a.f14234a != this) {
            return;
        }
        InterfaceFutureC2326a interfaceFutureC2326a = this.f11154b;
        if (AbstractC1198gD.f14233g.e0(this.f11153a, this, YC.h(interfaceFutureC2326a))) {
            YC.o(this.f11153a, false);
        }
    }
}
