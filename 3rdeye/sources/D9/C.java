package D9;

import A9.C0583j;
import A9.W;
import A9.X;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.Arrays;

/* compiled from: SharedFlow.kt */
/* loaded from: classes3.dex */
public class C<T> extends E9.b<F> implements x<T>, InterfaceC0644f {

    /* renamed from: e, reason: collision with root package name */
    public final int f1132e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1133f;

    /* renamed from: g, reason: collision with root package name */
    public final C9.a f1134g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f1135h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public long f1136j;

    /* renamed from: k, reason: collision with root package name */
    public int f1137k;

    /* renamed from: l, reason: collision with root package name */
    public int f1138l;

    /* compiled from: SharedFlow.kt */
    public static final class a implements W {

        /* renamed from: b, reason: collision with root package name */
        public final C<?> f1139b;

        /* renamed from: c, reason: collision with root package name */
        public final long f1140c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f1141d;

        /* renamed from: e, reason: collision with root package name */
        public final C0583j f1142e;

        public a(C c10, long j4, Object obj, C0583j c0583j) {
            this.f1139b = c10;
            this.f1140c = j4;
            this.f1141d = obj;
            this.f1142e = c0583j;
        }

        @Override // A9.W
        public final void dispose() {
            C<?> c10 = this.f1139b;
            synchronized (c10) {
                if (this.f1140c < c10.m()) {
                    return;
                }
                Object[] objArr = c10.f1135h;
                kotlin.jvm.internal.l.c(objArr);
                long j4 = this.f1140c;
                if (objArr[((int) j4) & (objArr.length - 1)] != this) {
                    return;
                }
                E.d(objArr, j4, E.f1151a);
                c10.h();
                C1992A c1992a = C1992A.f18074a;
            }
        }
    }

    /* compiled from: SharedFlow.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1143a;

        static {
            int[] iArr = new int[C9.a.values().length];
            try {
                iArr[C9.a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C9.a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C9.a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1143a = iArr;
        }
    }

    public C(int i, int i10, C9.a aVar) {
        this.f1132e = i;
        this.f1133f = i10;
        this.f1134g = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (((D9.M) r9).b(r0) == r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g9.a i(D9.C r8, D9.InterfaceC0645g r9, f9.InterfaceC4347e r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.C.i(D9.C, D9.g, f9.e):g9.a");
    }

    @Override // D9.InterfaceC0644f
    public final Object b(InterfaceC0645g<? super T> interfaceC0645g, InterfaceC4347e<?> interfaceC4347e) {
        return i(this, interfaceC0645g, interfaceC4347e);
    }

    @Override // E9.b
    public final E9.d d() {
        return new F();
    }

    @Override // E9.b
    public final E9.d[] e() {
        return new F[2];
    }

    @Override // D9.x, D9.InterfaceC0645g
    public final Object emit(T t10, InterfaceC4347e<? super C1992A> interfaceC4347e) throws Throwable {
        Throwable th;
        InterfaceC4347e<C1992A>[] interfaceC4347eArrL;
        a aVar;
        if (o(t10)) {
            return C1992A.f18074a;
        }
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
        c0583j.s();
        InterfaceC4347e<C1992A>[] interfaceC4347eArrL2 = E9.c.f1488a;
        synchronized (this) {
            try {
                if (p(t10)) {
                    try {
                        c0583j.resumeWith(C1992A.f18074a);
                        interfaceC4347eArrL = l(interfaceC4347eArrL2);
                        aVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        a aVar2 = new a(this, m() + this.f1137k + this.f1138l, t10, c0583j);
                        k(aVar2);
                        this.f1138l++;
                        if (this.f1133f == 0) {
                            interfaceC4347eArrL2 = l(interfaceC4347eArrL2);
                        }
                        interfaceC4347eArrL = interfaceC4347eArrL2;
                        aVar = aVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    c0583j.v(new X(aVar));
                }
                for (InterfaceC4347e<C1992A> interfaceC4347e2 : interfaceC4347eArrL) {
                    if (interfaceC4347e2 != null) {
                        interfaceC4347e2.resumeWith(C1992A.f18074a);
                    }
                }
                Object objR = c0583j.r();
                g9.a aVar3 = g9.a.COROUTINE_SUSPENDED;
                if (objR != aVar3) {
                    objR = C1992A.f18074a;
                }
                return objR == aVar3 ? objR : C1992A.f18074a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final Object g(F f10, D d10) {
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(d10));
        c0583j.s();
        synchronized (this) {
            if (q(f10) < 0) {
                f10.f1155b = c0583j;
            } else {
                c0583j.resumeWith(C1992A.f18074a);
            }
            C1992A c1992a = C1992A.f18074a;
        }
        Object objR = c0583j.r();
        return objR == g9.a.COROUTINE_SUSPENDED ? objR : C1992A.f18074a;
    }

    public final void h() {
        if (this.f1133f != 0 || this.f1138l > 1) {
            Object[] objArr = this.f1135h;
            kotlin.jvm.internal.l.c(objArr);
            while (this.f1138l > 0) {
                long jM = m();
                int i = this.f1137k;
                int i10 = this.f1138l;
                if (objArr[((int) ((jM + (i + i10)) - 1)) & (objArr.length - 1)] != E.f1151a) {
                    return;
                }
                this.f1138l = i10 - 1;
                E.d(objArr, m() + this.f1137k + this.f1138l, null);
            }
        }
    }

    public final void j() {
        Object[] objArr;
        Object[] objArr2 = this.f1135h;
        kotlin.jvm.internal.l.c(objArr2);
        E.d(objArr2, m(), null);
        this.f1137k--;
        long jM = m() + 1;
        if (this.i < jM) {
            this.i = jM;
        }
        if (this.f1136j < jM) {
            if (this.f1486c != 0 && (objArr = this.f1485b) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        F f10 = (F) obj;
                        long j4 = f10.f1154a;
                        if (j4 >= 0 && j4 < jM) {
                            f10.f1154a = jM;
                        }
                    }
                }
            }
            this.f1136j = jM;
        }
    }

    public final void k(Object obj) {
        int i = this.f1137k + this.f1138l;
        Object[] objArrN = this.f1135h;
        if (objArrN == null) {
            objArrN = n(null, 0, 2);
        } else if (i >= objArrN.length) {
            objArrN = n(objArrN, i, objArrN.length * 2);
        }
        E.d(objArrN, m() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final InterfaceC4347e<C1992A>[] l(InterfaceC4347e<C1992A>[] interfaceC4347eArr) {
        Object[] objArr;
        F f10;
        C0583j c0583j;
        int length = interfaceC4347eArr.length;
        if (this.f1486c != 0 && (objArr = this.f1485b) != null) {
            int length2 = objArr.length;
            int i = 0;
            interfaceC4347eArr = interfaceC4347eArr;
            while (i < length2) {
                Object obj = objArr[i];
                if (obj != null && (c0583j = (f10 = (F) obj).f1155b) != null && q(f10) >= 0) {
                    int length3 = interfaceC4347eArr.length;
                    interfaceC4347eArr = interfaceC4347eArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(interfaceC4347eArr, Math.max(2, interfaceC4347eArr.length * 2));
                        kotlin.jvm.internal.l.e(CopyOf, "copyOf(...)");
                        interfaceC4347eArr = CopyOf;
                    }
                    interfaceC4347eArr[length] = c0583j;
                    f10.f1155b = null;
                    length++;
                }
                i++;
                interfaceC4347eArr = interfaceC4347eArr;
            }
        }
        return interfaceC4347eArr;
    }

    public final long m() {
        return Math.min(this.f1136j, this.i);
    }

    public final Object[] n(Object[] objArr, int i, int i10) {
        if (i10 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i10];
        this.f1135h = objArr2;
        if (objArr != null) {
            long jM = m();
            for (int i11 = 0; i11 < i; i11++) {
                long j4 = i11 + jM;
                E.d(objArr2, j4, objArr[((int) j4) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean o(T t10) {
        int i;
        boolean z10;
        InterfaceC4347e<C1992A>[] interfaceC4347eArrL = E9.c.f1488a;
        synchronized (this) {
            if (p(t10)) {
                interfaceC4347eArrL = l(interfaceC4347eArrL);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (InterfaceC4347e<C1992A> interfaceC4347e : interfaceC4347eArrL) {
            if (interfaceC4347e != null) {
                interfaceC4347e.resumeWith(C1992A.f18074a);
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(T r13) {
        /*
            r12 = this;
            int r1 = r12.f1486c
            int r2 = r12.f1132e
            r9 = 1
            if (r1 != 0) goto L22
            if (r2 != 0) goto La
            goto L7a
        La:
            r12.k(r13)
            int r1 = r12.f1137k
            int r1 = r1 + r9
            r12.f1137k = r1
            if (r1 <= r2) goto L17
            r12.j()
        L17:
            long r1 = r12.m()
            int r3 = r12.f1137k
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f1136j = r1
            return r9
        L22:
            int r1 = r12.f1137k
            int r3 = r12.f1133f
            if (r1 < r3) goto L42
            long r4 = r12.f1136j
            long r6 = r12.i
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L42
            int[] r1 = D9.C.b.f1143a
            C9.a r4 = r12.f1134g
            int r4 = r4.ordinal()
            r1 = r1[r4]
            if (r1 == r9) goto L40
            r4 = 2
            if (r1 == r4) goto L7a
            goto L42
        L40:
            r1 = 0
            return r1
        L42:
            r12.k(r13)
            int r1 = r12.f1137k
            int r1 = r1 + r9
            r12.f1137k = r1
            if (r1 <= r3) goto L4f
            r12.j()
        L4f:
            long r3 = r12.m()
            int r1 = r12.f1137k
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.i
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7a
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f1136j
            long r5 = r12.m()
            int r7 = r12.f1137k
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.m()
            int r10 = r12.f1137k
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f1138l
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.s(r1, r3, r5, r7)
        L7a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.C.p(java.lang.Object):boolean");
    }

    public final long q(F f10) {
        long j4 = f10.f1154a;
        if (j4 < m() + this.f1137k) {
            return j4;
        }
        if (this.f1133f <= 0 && j4 <= m() && this.f1138l != 0) {
            return j4;
        }
        return -1L;
    }

    public final Object r(F f10) {
        Object obj;
        InterfaceC4347e<C1992A>[] interfaceC4347eArrT = E9.c.f1488a;
        synchronized (this) {
            try {
                long jQ = q(f10);
                if (jQ < 0) {
                    obj = E.f1151a;
                } else {
                    long j4 = f10.f1154a;
                    Object[] objArr = this.f1135h;
                    kotlin.jvm.internal.l.c(objArr);
                    Object obj2 = objArr[((int) jQ) & (objArr.length - 1)];
                    if (obj2 instanceof a) {
                        obj2 = ((a) obj2).f1141d;
                    }
                    f10.f1154a = jQ + 1;
                    Object obj3 = obj2;
                    interfaceC4347eArrT = t(j4);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC4347e<C1992A> interfaceC4347e : interfaceC4347eArrT) {
            if (interfaceC4347e != null) {
                interfaceC4347e.resumeWith(C1992A.f18074a);
            }
        }
        return obj;
    }

    public final void s(long j4, long j10, long j11, long j12) {
        long jMin = Math.min(j10, j4);
        for (long jM = m(); jM < jMin; jM++) {
            Object[] objArr = this.f1135h;
            kotlin.jvm.internal.l.c(objArr);
            E.d(objArr, jM, null);
        }
        this.i = j4;
        this.f1136j = j10;
        this.f1137k = (int) (j11 - jMin);
        this.f1138l = (int) (j12 - j11);
    }

    public final InterfaceC4347e<C1992A>[] t(long j4) {
        long j10;
        long j11;
        long j12;
        int i;
        InterfaceC4347e<C1992A>[] interfaceC4347eArr;
        Object[] objArr;
        long j13 = this.f1136j;
        InterfaceC4347e<C1992A>[] interfaceC4347eArr2 = E9.c.f1488a;
        if (j4 <= j13) {
            long jM = m();
            long j14 = this.f1137k + jM;
            int i10 = this.f1133f;
            if (i10 == 0 && this.f1138l > 0) {
                j14++;
            }
            int i11 = 0;
            if (this.f1486c != 0 && (objArr = this.f1485b) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        long j15 = ((F) obj).f1154a;
                        if (j15 >= 0 && j15 < j14) {
                            j14 = j15;
                        }
                    }
                }
            }
            if (j14 > this.f1136j) {
                long jM2 = m() + this.f1137k;
                int iMin = this.f1486c > 0 ? Math.min(this.f1138l, i10 - ((int) (jM2 - j14))) : this.f1138l;
                long j16 = this.f1138l + jM2;
                F9.y yVar = E.f1151a;
                if (iMin > 0) {
                    InterfaceC4347e<C1992A>[] interfaceC4347eArr3 = new InterfaceC4347e[iMin];
                    j12 = 1;
                    Object[] objArr2 = this.f1135h;
                    kotlin.jvm.internal.l.c(objArr2);
                    i = i10;
                    long j17 = jM2;
                    while (true) {
                        if (jM2 >= j16) {
                            j10 = jM;
                            j11 = j14;
                            break;
                        }
                        j10 = jM;
                        Object obj2 = objArr2[((int) jM2) & (objArr2.length - 1)];
                        if (obj2 != yVar) {
                            kotlin.jvm.internal.l.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            a aVar = (a) obj2;
                            int i12 = i11 + 1;
                            j11 = j14;
                            interfaceC4347eArr3[i11] = aVar.f1142e;
                            E.d(objArr2, jM2, yVar);
                            E.d(objArr2, j17, aVar.f1141d);
                            j17++;
                            if (i12 >= iMin) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            j11 = j14;
                        }
                        jM2++;
                        jM = j10;
                        j14 = j11;
                    }
                    jM2 = j17;
                    interfaceC4347eArr = interfaceC4347eArr3;
                } else {
                    j10 = jM;
                    j11 = j14;
                    j12 = 1;
                    i = i10;
                    interfaceC4347eArr = interfaceC4347eArr2;
                }
                int i13 = (int) (jM2 - j10);
                long j18 = this.f1486c == 0 ? jM2 : j11;
                long jMax = Math.max(this.i, jM2 - Math.min(this.f1132e, i13));
                if (i == 0 && jMax < j16) {
                    Object[] objArr3 = this.f1135h;
                    kotlin.jvm.internal.l.c(objArr3);
                    if (kotlin.jvm.internal.l.b(objArr3[((int) jMax) & (objArr3.length - 1)], yVar)) {
                        jM2 += j12;
                        jMax += j12;
                    }
                }
                s(jMax, j18, jM2, j16);
                h();
                return interfaceC4347eArr.length == 0 ? interfaceC4347eArr : l(interfaceC4347eArr);
            }
        }
        return interfaceC4347eArr2;
    }
}
