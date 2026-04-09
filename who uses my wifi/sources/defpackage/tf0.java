package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tf0 extends eu0 implements qf0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(tf0.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public tf0() {
        super(1);
        this.owner$volatile = i30.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r0 = r1.g;
        r5.set(r0, null);
        r1.f.k(r4, new defpackage.rf0(r0, r1, 0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.qj r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.eu0.g
            int r1 = r0.get(r7)
            int r2 = r7.a
            if (r1 <= r2) goto L17
        La:
            int r1 = r0.get(r7)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r7, r1, r2)
            if (r1 == 0) goto La
            goto L0
        L17:
            r3 = 0
            z31 r4 = defpackage.z31.a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.tf0.h
            if (r1 > 0) goto L5d
            oj r8 = defpackage.uk2.r(r8)
            kd r8 = defpackage.m54.j(r8)
            sf0 r1 = new sf0     // Catch: java.lang.Throwable -> L58
            r1.<init>(r7, r8)     // Catch: java.lang.Throwable -> L58
        L2b:
            int r6 = r0.getAndDecrement(r7)     // Catch: java.lang.Throwable -> L58
            if (r6 > r2) goto L2b
            if (r6 <= 0) goto L44
            tf0 r0 = r1.g     // Catch: java.lang.Throwable -> L58
            r5.set(r0, r3)     // Catch: java.lang.Throwable -> L58
            kd r2 = r1.f     // Catch: java.lang.Throwable -> L58
            rf0 r3 = new rf0     // Catch: java.lang.Throwable -> L58
            r5 = 0
            r3.<init>(r0, r1, r5)     // Catch: java.lang.Throwable -> L58
            r2.k(r4, r3)     // Catch: java.lang.Throwable -> L58
            goto L4a
        L44:
            boolean r6 = r7.a(r1)     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L2b
        L4a:
            java.lang.Object r8 = r8.t()
            rk r0 = defpackage.rk.f
            if (r8 != r0) goto L53
            goto L54
        L53:
            r8 = r4
        L54:
            if (r8 != r0) goto L57
            return r8
        L57:
            return r4
        L58:
            r0 = move-exception
            r8.A()
            throw r0
        L5d:
            int r2 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 == 0) goto L0
            r5.set(r7, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf0.c(qj):java.lang.Object");
    }

    public final void d() {
        while (Math.max(eu0.g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            gs3 gs3Var = i30.j;
            if (obj != gs3Var) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, gs3Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                b();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(um.k(this));
        sb.append("[isLocked=");
        sb.append(Math.max(eu0.g.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
