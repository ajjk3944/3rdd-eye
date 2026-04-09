package com.google.android.gms.internal.ads;

import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.tO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1908tO {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1854sO f16903a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1800rO f16904b;

    /* renamed from: c, reason: collision with root package name */
    public int f16905c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16906d;

    /* renamed from: e, reason: collision with root package name */
    public final Looper f16907e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16908f;

    public C1908tO(InterfaceC1800rO interfaceC1800rO, InterfaceC1854sO interfaceC1854sO, Looper looper) {
        this.f16904b = interfaceC1800rO;
        this.f16903a = interfaceC1854sO;
        this.f16907e = looper;
    }

    public final void a() {
        AbstractC0582Jp.h0(!this.f16908f);
        this.f16908f = true;
        ZN zn = (ZN) this.f16904b;
        if (!zn.f12848V && zn.f12869j.getThread().isAlive()) {
            zn.f12866h.b(14, this).a();
        } else {
            AbstractC2022vd.v("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }

    public final synchronized void b(boolean z6) {
        notifyAll();
    }
}
