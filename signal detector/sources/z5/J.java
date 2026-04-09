package z5;

import d5.C2280h;
import h5.InterfaceC2375i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
public abstract class J extends K implements A {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24493f = AtomicReferenceFieldUpdater.newUpdater(J.class, Object.class, "_queue$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f24494g = AtomicReferenceFieldUpdater.newUpdater(J.class, Object.class, "_delayed$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24495h = AtomicIntegerFieldUpdater.newUpdater(J.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // z5.A
    public final void b(long j6, C3030f c3030f) {
        long j7 = j6 > 0 ? j6 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j6 : 0L;
        if (j7 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            G g2 = new G(this, j7 + jNanoTime, c3030f);
            x(jNanoTime, g2);
            c3030f.v(new C3028d(1, g2));
        }
    }

    @Override // z5.AbstractC3042s
    public final void d(InterfaceC2375i interfaceC2375i, Runnable runnable) {
        t(runnable);
    }

    @Override // z5.K
    public void shutdown() {
        H hD;
        j0.f24536a.set(null);
        f24495h.set(this, 1);
        B2.a aVar = AbstractC3046w.f24560c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24493f;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof E5.n)) {
                    if (obj != aVar) {
                        E5.n nVar = new E5.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((E5.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (w() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            I i = (I) f24494g.get(this);
            if (i == null) {
                return;
            }
            synchronized (i) {
                hD = E5.x.f1420b.get(i) > 0 ? i.d(0) : null;
            }
            if (hD == null) {
                return;
            } else {
                s(jNanoTime, hD);
            }
        }
    }

    public void t(Runnable runnable) {
        if (!u(runnable)) {
            RunnableC3047x.i.t(runnable);
            return;
        }
        Thread threadP = p();
        if (Thread.currentThread() != threadP) {
            LockSupport.unpark(threadP);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = z5.J.f24493f
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = z5.J.f24495h
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof E5.n
            if (r4 == 0) goto L47
            r4 = r1
            E5.n r4 = (E5.n) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            E5.n r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            B2.a r4 = z5.AbstractC3046w.f24560c
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            E5.n r3 = new E5.n
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.J.u(java.lang.Runnable):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v() {
        /*
            r7 = this;
            d5.h r0 = r7.f24498e
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = z5.J.f24494g
            java.lang.Object r0 = r0.get(r7)
            z5.I r0 = (z5.I) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = E5.x.f1420b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = z5.J.f24493f
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof E5.n
            if (r3 == 0) goto L4f
            E5.n r0 = (E5.n) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = E5.n.f1403f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            B2.a r3 = z5.AbstractC3046w.f24560c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.J.v():boolean");
    }

    public final long w() {
        H hB;
        H hD;
        if (!r()) {
            I i = (I) f24494g.get(this);
            Runnable runnable = null;
            if (i != null && E5.x.f1420b.get(i) != 0) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (i) {
                        try {
                            H[] hArr = i.f1421a;
                            H h6 = hArr != null ? hArr[0] : null;
                            if (h6 == null) {
                                hD = null;
                            } else {
                                hD = ((jNanoTime - h6.f24490a) > 0L ? 1 : ((jNanoTime - h6.f24490a) == 0L ? 0 : -1)) >= 0 ? u(h6) : false ? i.d(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (hD != null);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24493f;
            loop1: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof E5.n)) {
                    if (obj != AbstractC3046w.f24560c) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop1;
                    }
                    break;
                }
                E5.n nVar = (E5.n) obj;
                Object objD = nVar.d();
                if (objD != E5.n.f1404g) {
                    runnable = (Runnable) objD;
                    break;
                }
                E5.n nVarC = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C2280h c2280h = this.f24498e;
            if (((c2280h == null || c2280h.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f24493f.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof E5.n) {
                        long j6 = E5.n.f1403f.get((E5.n) obj2);
                        if (((int) (1073741823 & j6)) == ((int) ((j6 & 1152921503533105152L) >> 30))) {
                        }
                    } else if (obj2 == AbstractC3046w.f24560c) {
                        return Long.MAX_VALUE;
                    }
                }
                I i3 = (I) f24494g.get(this);
                if (i3 != null && (hB = i3.b()) != null) {
                    long jNanoTime2 = hB.f24490a - System.nanoTime();
                    if (jNanoTime2 >= 0) {
                        return jNanoTime2;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public final void x(long j6, H h6) {
        int iB;
        Thread threadP;
        int i = f24495h.get(this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f24494g;
        if (i != 0) {
            iB = 1;
        } else {
            I i3 = (I) atomicReferenceFieldUpdater.get(this);
            if (i3 == null) {
                I i6 = new I();
                i6.f24492c = j6;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, i6) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                q5.i.b(obj);
                i3 = (I) obj;
            }
            iB = h6.b(j6, i3, this);
        }
        if (iB != 0) {
            if (iB == 1) {
                s(j6, h6);
                return;
            } else {
                if (iB != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        I i7 = (I) atomicReferenceFieldUpdater.get(this);
        if ((i7 != null ? i7.b() : null) != h6 || Thread.currentThread() == (threadP = p())) {
            return;
        }
        LockSupport.unpark(threadP);
    }
}
