package cl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import xk.c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final u f2902a = new u("CLOSED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final u f2903b = new u("UNDEFINED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final u f2904c = new u("REUSABLE_CLAIMED", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final u f2905d = new u("NO_THREAD_ELEMENTS", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final bl.v f2906e = new bl.v(3);

    /* renamed from: f, reason: collision with root package name */
    public static final bl.v f2907f = new bl.v(4);
    public static final bl.v g = new bl.v(5);

    public static final void a(int i4) {
        if (i4 < 1) {
            throw new IllegalArgumentException(je.u.r(i4, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(s sVar, long j, mk.e eVar) {
        while (true) {
            if (sVar.f2939c >= j && !sVar.d()) {
                return sVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f2908a;
            Object obj = atomicReferenceFieldUpdater.get(sVar);
            u uVar = f2902a;
            if (obj == uVar) {
                return uVar;
            }
            s sVar2 = (s) ((c) obj);
            if (sVar2 == null) {
                sVar2 = (s) eVar.invoke(Long.valueOf(sVar.f2939c + 1), sVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(sVar, null, sVar2)) {
                    if (atomicReferenceFieldUpdater.get(sVar) != null) {
                        break;
                    }
                }
                if (sVar.d()) {
                    sVar.e();
                }
            }
            sVar = sVar2;
        }
    }

    public static final s c(Object obj) {
        if (obj != f2902a) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(ck.h hVar, Throwable th2) {
        Throwable runtimeException;
        Iterator it = e.f2911a.iterator();
        while (it.hasNext()) {
            try {
                ((xk.t) it.next()).E(hVar, th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    wd.b.a(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            wd.b.a(th2, new f(hVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    public static final boolean e(Object obj) {
        return obj == f2902a;
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

    public static final void g(ck.h hVar, Object obj) {
        if (obj == f2905d) {
            return;
        }
        if (!(obj instanceof z)) {
            Object objG = hVar.G(null, f2907f);
            nk.k.c(objG, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((w) objG).a(obj);
            return;
        }
        z zVar = (z) obj;
        w[] wVarArr = zVar.f2952c;
        int length = wVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i4 = length - 1;
            w wVar = wVarArr[length];
            nk.k.b(wVar);
            wVar.a(zVar.f2951b[length]);
            if (i4 < 0) {
                return;
            } else {
                length = i4;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(ck.c r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof cl.g
            if (r0 == 0) goto Lae
            cl.g r9 = (cl.g) r9
            xk.r r0 = r9.f2914d
            ek.c r1 = r9.f2915e
            java.lang.Throwable r2 = yj.l.a(r10)
            if (r2 != 0) goto L12
            r3 = r10
            goto L18
        L12:
            xk.p r3 = new xk.p
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            ck.h r2 = r1.getContext()
            boolean r2 = j(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r9.f2916f = r3
            r9.f37182c = r4
            ck.h r10 = r1.getContext()
            i(r0, r10, r9)
            return
        L2f:
            xk.q0 r0 = xk.n1.a()
            long r5 = r0.f37226c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r9.f2916f = r3
            r9.f37182c = r4
            r0.Y(r9)
            goto La8
        L46:
            r0.a0(r4)
            ck.h r2 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            xk.s r3 = xk.s.f37235b     // Catch: java.lang.Throwable -> L69
            ck.f r2 = r2.O(r3)     // Catch: java.lang.Throwable -> L69
            xk.y0 r2 = (xk.y0) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r10 = r2.p()     // Catch: java.lang.Throwable -> L69
            yj.k r10 = ci.b.h(r10)     // Catch: java.lang.Throwable -> L69
            r9.resumeWith(r10)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r10 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r9.g     // Catch: java.lang.Throwable -> L69
            ck.h r3 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = n(r3, r2)     // Catch: java.lang.Throwable -> L69
            cl.u r5 = cl.b.f2905d     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            xk.s1 r5 = xk.x.D(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.resumeWith(r10)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r10 = r5.k0()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L8d
        L8a:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r10 = r0.c0()     // Catch: java.lang.Throwable -> L69
            if (r10 != 0) goto L8d
        L93:
            r0.X(r4)
            goto La8
        L97:
            r10 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.k0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r10     // Catch: java.lang.Throwable -> L69
        La4:
            r9.g(r10)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.X(r4)
            throw r9
        Lae:
            r9.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.b.h(ck.c, java.lang.Object):void");
    }

    public static final void i(xk.r rVar, ck.h hVar, Runnable runnable) {
        try {
            rVar.T(hVar, runnable);
        } catch (Throwable th2) {
            throw new c0(th2, rVar, hVar);
        }
    }

    public static final boolean j(xk.r rVar, ck.h hVar) throws c0 {
        try {
            return rVar.V(hVar);
        } catch (Throwable th2) {
            throw new c0(th2, rVar, hVar);
        }
    }

    public static final long k(String str, long j, long j8, long j9) {
        String property;
        boolean z3;
        String str2;
        Long lValueOf;
        int i4 = v.f2943a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        nk.k.e(property, "<this>");
        com.bumptech.glide.d.g(10);
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
            break;
        }
        int i10 = 0;
        char cCharAt = property.charAt(0);
        long j10 = -9223372036854775807L;
        if (nk.k.f(cCharAt, 48) < 0) {
            z3 = true;
            if (length != 1) {
                if (cCharAt == '+') {
                    z3 = false;
                    i10 = 1;
                } else if (cCharAt == '-') {
                    j10 = Long.MIN_VALUE;
                    i10 = 1;
                }
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        z3 = false;
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i10 < length) {
            int iDigit = Character.digit((int) property.charAt(i10), 10);
            if (iDigit >= 0) {
                if (j11 >= j12) {
                    str2 = property;
                } else if (j12 == -256204778801521550L) {
                    str2 = property;
                    j12 = j10 / 10;
                    if (j11 < j12) {
                    }
                    lValueOf = null;
                    break;
                }
                long j13 = j11 * 10;
                long j14 = iDigit;
                if (j13 < j10 + j14) {
                    lValueOf = null;
                    break;
                }
                j11 = j13 - j14;
                i10++;
                property = str2;
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        str2 = property;
        lValueOf = z3 ? Long.valueOf(j11) : Long.valueOf(-j11);
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j8 <= jLongValue && jLongValue <= j9) {
            return jLongValue;
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' should be in range ");
        sb2.append(j8);
        a0.g.A(sb2, "..", j9, ", but is '");
        sb2.append(jLongValue);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static int l(int i4, int i10, String str) {
        return (int) k(str, i4, 1, (i10 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object m(ck.h hVar) {
        Object objG = hVar.G(0, f2906e);
        nk.k.b(objG);
        return objG;
    }

    public static final Object n(ck.h hVar, Object obj) {
        if (obj == null) {
            obj = m(hVar);
        }
        return obj == 0 ? f2905d : obj instanceof Integer ? hVar.G(new z(((Number) obj).intValue(), hVar), g) : ((w) obj).b(hVar);
    }
}
