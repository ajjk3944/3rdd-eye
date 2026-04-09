package gl;

import cl.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c extends g implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24758h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public c(boolean z3) {
        super(1, z3 ? 1 : 0);
        this.owner$volatile = z3 ? null : d.f24759a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r2 = r0.f24757b;
        gl.c.f24758h.set(r2, null);
        r3 = r0.f24756a;
        r3.B(r1, r3.f37182c, new d0.w(3, new b7.u(r2, r0)));
     */
    @Override // gl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(ek.c r7) {
        /*
            r6 = this;
            boolean r0 = r6.f()
            yj.u r1 = yj.u.f37649a
            if (r0 == 0) goto L9
            goto L50
        L9:
            ck.c r7 = a.a.r(r7)
            xk.h r7 = xk.x.p(r7)
            gl.b r0 = new gl.b     // Catch: java.lang.Throwable -> L51
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L51
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = gl.g.g     // Catch: java.lang.Throwable -> L51
            int r2 = r2.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L51
            int r3 = r6.f24766a     // Catch: java.lang.Throwable -> L51
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3d
            gl.c r2 = r0.f24757b     // Catch: java.lang.Throwable -> L51
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = gl.c.f24758h     // Catch: java.lang.Throwable -> L51
            r4 = 0
            r3.set(r2, r4)     // Catch: java.lang.Throwable -> L51
            xk.h r3 = r0.f24756a     // Catch: java.lang.Throwable -> L51
            b7.u r4 = new b7.u     // Catch: java.lang.Throwable -> L51
            r4.<init>(r2, r0)     // Catch: java.lang.Throwable -> L51
            int r0 = r3.f37182c     // Catch: java.lang.Throwable -> L51
            d0.w r2 = new d0.w     // Catch: java.lang.Throwable -> L51
            r5 = 3
            r2.<init>(r5, r4)     // Catch: java.lang.Throwable -> L51
            r3.B(r1, r0, r2)     // Catch: java.lang.Throwable -> L51
            goto L43
        L3d:
            boolean r2 = r6.a(r0)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L16
        L43:
            java.lang.Object r7 = r7.r()
            dk.a r0 = dk.a.f22275a
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
            r7.A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.c.c(ek.c):java.lang.Object");
    }

    public final boolean d() {
        return Math.max(g.g.get(this), 0) == 0;
    }

    @Override // gl.a
    public final void e(Object obj) {
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24758h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            u uVar = d.f24759a;
            if (obj2 != uVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, uVar)) {
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

    public final boolean f() {
        int i4;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f24766a;
            if (i10 > i11) {
                do {
                    i4 = atomicIntegerFieldUpdater.get(this);
                    if (i4 > i11) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, i11));
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    f24758h.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        return "Mutex@" + x.n(this) + "[isLocked=" + d() + ",owner=" + f24758h.get(this) + ']';
    }
}
