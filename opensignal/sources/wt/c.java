package wt;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: r, reason: collision with root package name */
    public final Thread f24606r;

    /* renamed from: x, reason: collision with root package name */
    public final k0 f24607x;

    public c(pq.h hVar, Thread thread, k0 k0Var) {
        super(hVar, true);
        this.f24606r = thread;
        this.f24607x = k0Var;
    }

    @Override // wt.b1
    public final void d(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f24606r;
        if (br.l.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
