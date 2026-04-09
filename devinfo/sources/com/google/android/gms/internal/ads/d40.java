package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d40 implements xg {

    /* renamed from: a, reason: collision with root package name */
    public final qz f10316a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f10317b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10318c = new AtomicReference();

    public d40(qz qzVar, Executor executor) {
        this.f10316a = qzVar;
        this.f10317b = executor;
    }

    @Override // com.google.android.gms.internal.ads.xg
    public final synchronized void w(wg wgVar) {
        qz qzVar = this.f10316a;
        if (qzVar != null) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Rd)).booleanValue()) {
                if (wgVar.j) {
                    AtomicReference atomicReference = this.f10318c;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.f10317b.execute(new a00(qzVar, 3));
                    }
                } else {
                    AtomicReference atomicReference2 = this.f10318c;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.f10317b.execute(new a00(qzVar, 2));
                    }
                }
            }
        }
    }
}
