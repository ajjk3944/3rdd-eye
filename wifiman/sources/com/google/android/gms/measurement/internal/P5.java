package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class P5 extends AbstractBinderC4991x2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f36171a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C5 f36172b;

    P5(C5 c52, AtomicReference atomicReference) {
        this.f36171a = atomicReference;
        this.f36172b = c52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4999y2
    public final void k(S6 s62) {
        synchronized (this.f36171a) {
            this.f36172b.zzj().G().b("[sgtm] Got upload batches from service. count", Integer.valueOf(s62.f36206a.size()));
            this.f36171a.set(s62);
            this.f36171a.notifyAll();
        }
    }
}
