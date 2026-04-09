package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class N5 extends AbstractBinderC4983w2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f36137a;

    N5(C5 c52, AtomicReference atomicReference) {
        this.f36137a = atomicReference;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4959t2
    public final void E(List list) {
        synchronized (this.f36137a) {
            this.f36137a.set(list);
            this.f36137a.notifyAll();
        }
    }
}
