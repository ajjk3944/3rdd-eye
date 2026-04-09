package xk;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f37172d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f37173e;

    public c(ck.h hVar, Thread thread, q0 q0Var) {
        super(hVar, true);
        this.f37172d = thread;
        this.f37173e = q0Var;
    }

    @Override // xk.f1
    public final void o(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f37172d;
        if (nk.k.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
