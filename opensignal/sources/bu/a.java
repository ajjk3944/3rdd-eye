package bu;

import ir.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wt.j1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final t f2951a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f2952b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f2953c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f2954d;

    /* renamed from: e, reason: collision with root package name */
    public static final au.r f2955e = new au.r(1);

    /* renamed from: f, reason: collision with root package name */
    public static final au.r f2956f = new au.r(2);

    /* renamed from: g, reason: collision with root package name */
    public static final au.r f2957g = new au.r(3);

    static {
        int i10 = 0;
        f2951a = new t("CLOSED", i10);
        f2952b = new t("UNDEFINED", i10);
        f2953c = new t("REUSABLE_CLAIMED", i10);
        f2954d = new t("NO_THREAD_ELEMENTS", i10);
    }

    public static final void a(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(h0.b.h(i10, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(r rVar, long j, ar.n nVar) {
        while (true) {
            if (rVar.f2987c >= j && !rVar.c()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f2958a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            t tVar = f2951a;
            if (obj == tVar) {
                return tVar;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) nVar.w(Long.valueOf(rVar.f2987c + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.c()) {
                    rVar.d();
                }
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f2951a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th2, pq.h hVar) {
        Throwable runtimeException;
        Iterator it = d.f2961a.iterator();
        while (it.hasNext()) {
            try {
                ((wt.s) it.next()).L(th2, hVar);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    f0.c(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            f0.c(th2, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    public static final boolean e(Object obj) {
        return obj == f2951a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(pq.h hVar, Object obj) {
        if (obj == f2954d) {
            return;
        }
        if (!(obj instanceof w)) {
            Object objZ = hVar.Z(f2956f, null);
            br.l.c(objZ, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            w.g.p(objZ);
            throw null;
        }
        w wVar = (w) obj;
        j1[] j1VarArr = wVar.f2995b;
        int length = j1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        j1 j1Var = j1VarArr[length];
        br.l.b(null);
        Object obj2 = wVar.f2994a[length];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(java.lang.Object r9, pq.c r10) {
        /*
            boolean r0 = r10 instanceof bu.f
            if (r0 == 0) goto Lae
            bu.f r10 = (bu.f) r10
            wt.q r0 = r10.f2963r
            rq.c r1 = r10.f2964x
            java.lang.Throwable r2 = lq.o.a(r9)
            if (r2 != 0) goto L12
            r3 = r9
            goto L18
        L12:
            wt.o r3 = new wt.o
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            pq.h r2 = r1.m()
            boolean r2 = r0.p0(r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r10.f2965y = r3
            r10.f24608g = r4
            pq.h r9 = r1.m()
            r0.n0(r9, r10)
            return
        L2f:
            wt.k0 r0 = wt.k1.a()
            long r5 = r0.f24629g
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r10.f2965y = r3
            r10.f24608g = r4
            r0.s0(r10)
            goto La8
        L46:
            r0.u0(r4)
            pq.h r2 = r1.m()     // Catch: java.lang.Throwable -> L69
            wt.r r3 = wt.r.f24653d     // Catch: java.lang.Throwable -> L69
            pq.f r2 = r2.Y(r3)     // Catch: java.lang.Throwable -> L69
            wt.t0 r2 = (wt.t0) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.b()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r9 = r2.y()     // Catch: java.lang.Throwable -> L69
            lq.n r9 = lf.t1.k(r9)     // Catch: java.lang.Throwable -> L69
            r10.g(r9)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r9 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r10.B     // Catch: java.lang.Throwable -> L69
            pq.h r3 = r1.m()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = l(r3, r2)     // Catch: java.lang.Throwable -> L69
            bu.t r5 = bu.a.f2954d     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            wt.o1 r5 = wt.w.A(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.g(r9)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r9 = r5.b0()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L8d
        L8a:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r9 = r0.w0()     // Catch: java.lang.Throwable -> L69
            if (r9 != 0) goto L8d
        L93:
            r0.r0(r4)
            goto La8
        L97:
            r9 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.b0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r9     // Catch: java.lang.Throwable -> L69
        La4:
            r10.h(r9)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.r0(r4)
            throw r9
        Lae:
            r10.g(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.a.h(java.lang.Object, pq.c):void");
    }

    public static final long i(String str, long j, long j7, long j10) {
        String property;
        int i10 = u.f2991a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lP0 = tt.s.p0(property);
        if (lP0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lP0.longValue();
        if (j7 <= jLongValue && jLongValue <= j10) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j7 + ".." + j10 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int j(String str, int i10, int i11) {
        return (int) i(str, i10, 1, (i11 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(pq.h hVar) {
        Object objZ = hVar.Z(f2955e, 0);
        br.l.b(objZ);
        return objZ;
    }

    public static final Object l(pq.h hVar, Object obj) {
        if (obj == null) {
            obj = k(hVar);
        }
        if (obj == 0) {
            return f2954d;
        }
        if (obj instanceof Integer) {
            return hVar.Z(f2957g, new w(((Number) obj).intValue(), hVar));
        }
        w.g.p(obj);
        throw null;
    }
}
