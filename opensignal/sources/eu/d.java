package eu;

import bu.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wt.w;

/* loaded from: classes.dex */
public final class d extends i implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8352h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public d(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : e.f8353a;
    }

    public final boolean c() {
        return Math.max(i.f8358g.get(this), 0) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r2 = r0.f8351d;
        eu.d.f8352h.set(r2, null);
        r3 = r0.f8350a;
        r3.D(r1, r3.f24608g, new eu.b(2, new cg.j(r2, r0)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(rq.c r7) {
        /*
            r6 = this;
            boolean r0 = r6.e()
            lq.b0 r1 = lq.b0.f15562a
            if (r0 == 0) goto L9
            goto L50
        L9:
            pq.c r7 = xu.l.D(r7)
            wt.g r7 = wt.w.n(r7)
            eu.c r0 = new eu.c     // Catch: java.lang.Throwable -> L51
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L51
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = eu.i.f8358g     // Catch: java.lang.Throwable -> L51
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L51
            int r3 = r6.f8359a     // Catch: java.lang.Throwable -> L51
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3d
            eu.d r2 = r0.f8351d     // Catch: java.lang.Throwable -> L51
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = eu.d.f8352h     // Catch: java.lang.Throwable -> L51
            r4 = 0
            r3.set(r2, r4)     // Catch: java.lang.Throwable -> L51
            wt.g r3 = r0.f8350a     // Catch: java.lang.Throwable -> L51
            cg.j r4 = new cg.j     // Catch: java.lang.Throwable -> L51
            r4.<init>(r2, r0)     // Catch: java.lang.Throwable -> L51
            int r0 = r3.f24608g     // Catch: java.lang.Throwable -> L51
            eu.b r2 = new eu.b     // Catch: java.lang.Throwable -> L51
            r5 = 2
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L51
            r3.D(r1, r0, r2)     // Catch: java.lang.Throwable -> L51
            goto L43
        L3d:
            boolean r2 = r6.a(r0)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L16
        L43:
            java.lang.Object r7 = r7.u()
            qq.a r0 = qq.a.COROUTINE_SUSPENDED
            if (r7 != r0) goto L4c
            goto L4d
        L4c:
            r7 = r1
        L4d:
            if (r7 != r0) goto L50
            return r7
        L50:
            return r1
        L51:
            r0 = move-exception
            r7.C()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eu.d.d(rq.c):java.lang.Object");
    }

    public final boolean e() {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.f8358g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f8359a;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > i12) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                if (i11 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f8352h.set(this, null);
                    return true;
                }
            }
        }
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8352h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = e.f8353a;
            if (obj2 != tVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + w.l(this) + "[isLocked=" + c() + ",owner=" + f8352h.get(this) + ']';
    }
}
