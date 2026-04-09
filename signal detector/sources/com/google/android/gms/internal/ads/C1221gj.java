package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.gj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221gj implements M7 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0828Yg f14366a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f14367b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f14368c = new AtomicReference();

    public C1221gj(InterfaceC0828Yg interfaceC0828Yg, Executor executor) {
        this.f14366a = interfaceC0828Yg;
        this.f14367b = executor;
    }

    @Override // com.google.android.gms.internal.ads.M7
    public final synchronized void K(L7 l7) {
        InterfaceC0828Yg interfaceC0828Yg = this.f14366a;
        if (interfaceC0828Yg != null) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.Pd)).booleanValue()) {
                if (l7.f9629j) {
                    AtomicReference atomicReference = this.f14368c;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.f14367b.execute(new RunnableC1219gh(interfaceC0828Yg, 3));
                    }
                } else {
                    AtomicReference atomicReference2 = this.f14368c;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.f14367b.execute(new RunnableC1219gh(interfaceC0828Yg, 2));
                    }
                }
            }
        }
    }
}
