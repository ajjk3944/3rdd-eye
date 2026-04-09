package E5;

import h5.InterfaceC2375i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z5.i0;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final B2.a f1372a = new B2.a("NO_DECISION", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final B2.a f1373b = new B2.a("CLOSED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final B2.a f1374c = new B2.a("UNDEFINED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final B2.a f1375d = new B2.a("REUSABLE_CLAIMED", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final B2.a f1376e = new B2.a("CONDITION_FALSE", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final B2.a f1377f = new B2.a("NO_THREAD_ELEMENTS", 1);

    public static final Object a(t tVar, long j6, p5.p pVar) {
        while (true) {
            if (tVar.f1413c >= j6 && !tVar.c()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1380a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            B2.a aVar = f1373b;
            if (obj == aVar) {
                return aVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.h(Long.valueOf(tVar.f1413c + 1), tVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                    if (atomicReferenceFieldUpdater.get(tVar) != null) {
                        break;
                    }
                }
                if (tVar.c()) {
                    tVar.d();
                }
            }
            tVar = tVar2;
        }
    }

    public static final t b(Object obj) {
        if (obj != f1373b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(InterfaceC2375i interfaceC2375i, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f1383a.iterator();
        while (it.hasNext()) {
            try {
                ((A5.b) it.next()).d(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    com.bumptech.glide.e.b(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            com.bumptech.glide.e.b(th, new g(interfaceC2375i));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean d(Object obj) {
        return obj == f1373b;
    }

    public static final Object e(Object obj, Object obj2) {
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

    public static final void f(InterfaceC2375i interfaceC2375i, Object obj) {
        if (obj == f1377f) {
            return;
        }
        if (!(obj instanceof y)) {
            Object objO = interfaceC2375i.o(null, w.f1417d);
            q5.i.c(objO, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            A.f.s(objO);
            throw null;
        }
        y yVar = (y) obj;
        i0[] i0VarArr = yVar.f1423b;
        int length = i0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        i0 i0Var = i0VarArr[length];
        q5.i.b(null);
        Object obj2 = yVar.f1422a[length];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[Catch: all -> 0x0079, DONT_GENERATE, TryCatch #2 {all -> 0x0079, blocks: (B:19:0x0054, B:21:0x0062, B:23:0x0068, B:36:0x009d, B:26:0x007b, B:28:0x0089, B:33:0x0094, B:35:0x009a, B:41:0x00aa, B:44:0x00b3, B:43:0x00b0, B:31:0x008f), top: B:57:0x0054, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(h5.InterfaceC2370d r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof E5.h
            if (r0 == 0) goto Lbe
            E5.h r9 = (E5.h) r9
            z5.s r0 = r9.f1386d
            java.lang.Throwable r1 = c5.C0409f.a(r10)
            if (r1 != 0) goto L10
            r2 = r10
            goto L16
        L10:
            z5.n r2 = new z5.n
            r3 = 0
            r2.<init>(r1, r3)
        L16:
            j5.b r1 = r9.f1387e
            r1.getContext()
            boolean r3 = r0.e()
            r4 = 1
            if (r3 == 0) goto L2e
            r9.f1388f = r2
            r9.f24484c = r4
            h5.i r10 = r1.getContext()
            r0.d(r10, r9)
            return
        L2e:
            z5.K r0 = z5.j0.a()
            long r5 = r0.f24496c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L50
            r9.f1388f = r2
            r9.f24484c = r4
            d5.h r10 = r0.f24498e
            if (r10 != 0) goto L4c
            d5.h r10 = new d5.h
            r10.<init>()
            r0.f24498e = r10
        L4c:
            r10.addLast(r9)
            goto Lb8
        L50:
            r0.q(r4)
            r3 = 0
            h5.i r4 = r1.getContext()     // Catch: java.lang.Throwable -> L79
            z5.t r5 = z5.C3043t.f24555b     // Catch: java.lang.Throwable -> L79
            h5.g r4 = r4.h(r5)     // Catch: java.lang.Throwable -> L79
            z5.T r4 = (z5.T) r4     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L7b
            boolean r5 = r4.a()     // Catch: java.lang.Throwable -> L79
            if (r5 != 0) goto L7b
            z5.c0 r4 = (z5.c0) r4     // Catch: java.lang.Throwable -> L79
            java.util.concurrent.CancellationException r10 = r4.u()     // Catch: java.lang.Throwable -> L79
            r9.b(r2, r10)     // Catch: java.lang.Throwable -> L79
            c5.e r10 = R2.a.d(r10)     // Catch: java.lang.Throwable -> L79
            r9.e(r10)     // Catch: java.lang.Throwable -> L79
            goto L9d
        L79:
            r10 = move-exception
            goto Lb4
        L7b:
            java.lang.Object r2 = r9.f1389g     // Catch: java.lang.Throwable -> L79
            h5.i r4 = r1.getContext()     // Catch: java.lang.Throwable -> L79
            java.lang.Object r2 = k(r4, r2)     // Catch: java.lang.Throwable -> L79
            B2.a r5 = E5.a.f1377f     // Catch: java.lang.Throwable -> L79
            if (r2 == r5) goto L8e
            z5.l0 r5 = z5.AbstractC3046w.q(r1, r4, r2)     // Catch: java.lang.Throwable -> L79
            goto L8f
        L8e:
            r5 = r3
        L8f:
            r1.e(r10)     // Catch: java.lang.Throwable -> La7
            if (r5 == 0) goto L9a
            boolean r10 = r5.O()     // Catch: java.lang.Throwable -> L79
            if (r10 == 0) goto L9d
        L9a:
            f(r4, r2)     // Catch: java.lang.Throwable -> L79
        L9d:
            boolean r10 = r0.r()     // Catch: java.lang.Throwable -> L79
            if (r10 != 0) goto L9d
        La3:
            r0.k()
            goto Lb8
        La7:
            r10 = move-exception
            if (r5 == 0) goto Lb0
            boolean r1 = r5.O()     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto Lb3
        Lb0:
            f(r4, r2)     // Catch: java.lang.Throwable -> L79
        Lb3:
            throw r10     // Catch: java.lang.Throwable -> L79
        Lb4:
            r9.j(r10, r3)     // Catch: java.lang.Throwable -> Lb9
            goto La3
        Lb8:
            return
        Lb9:
            r9 = move-exception
            r0.k()
            throw r9
        Lbe:
            r9.e(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.a.g(h5.d, java.lang.Object):void");
    }

    public static final long i(String str, long j6, long j7, long j8) {
        String property;
        boolean z6;
        String str2;
        Long lValueOf;
        int i = v.f1415a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j6;
        }
        d5.y.d(10);
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
            break;
        }
        int i3 = 0;
        char cCharAt = property.charAt(0);
        long j9 = -9223372036854775807L;
        if (cCharAt < '0') {
            z6 = true;
            if (length != 1) {
                if (cCharAt == '+') {
                    z6 = false;
                    i3 = 1;
                } else if (cCharAt == '-') {
                    j9 = Long.MIN_VALUE;
                    i3 = 1;
                }
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        z6 = false;
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i3 < length) {
            int iDigit = Character.digit((int) property.charAt(i3), 10);
            if (iDigit >= 0) {
                if (j10 >= j11) {
                    str2 = property;
                } else if (j11 == -256204778801521550L) {
                    str2 = property;
                    j11 = j9 / 10;
                    if (j10 < j11) {
                    }
                    lValueOf = null;
                    break;
                }
                long j12 = j10 * 10;
                long j13 = iDigit;
                if (j12 < j9 + j13) {
                    lValueOf = null;
                    break;
                }
                j10 = j12 - j13;
                i3++;
                property = str2;
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        str2 = property;
        lValueOf = z6 ? Long.valueOf(j10) : Long.valueOf(-j10);
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j7 <= jLongValue && jLongValue <= j8) {
            return jLongValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j7);
        A.f.v(sb, "..", j8, ", but is '");
        sb.append(jLongValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int j(int i, int i3, String str) {
        return (int) i(str, i, 1, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(InterfaceC2375i interfaceC2375i, Object obj) {
        if (obj == null) {
            obj = interfaceC2375i.o(0, w.f1416c);
            q5.i.b(obj);
        }
        if (obj == 0) {
            return f1377f;
        }
        if (obj instanceof Integer) {
            return interfaceC2375i.o(new y(((Number) obj).intValue(), interfaceC2375i), w.f1418e);
        }
        A.f.s(obj);
        throw null;
    }
}
