package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class YF {

    /* renamed from: b, reason: collision with root package name */
    public static final YF f12621b = new YF();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f12622a = new AtomicReference(new C1469lG(new C1879sw(4)));

    public final synchronized void a(C1309iG c1309iG) {
        AtomicReference atomicReference = this.f12622a;
        C1879sw c1879sw = new C1879sw((C1469lG) atomicReference.get());
        c1879sw.d(c1309iG);
        atomicReference.set(new C1469lG(c1879sw));
    }

    public final synchronized void b(InterfaceC1577nG interfaceC1577nG) {
        AtomicReference atomicReference = this.f12622a;
        C1879sw c1879sw = new C1879sw((C1469lG) atomicReference.get());
        c1879sw.e(interfaceC1577nG);
        atomicReference.set(new C1469lG(c1879sw));
    }
}
