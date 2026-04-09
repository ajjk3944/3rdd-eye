package kotlinx.coroutines.flow;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes4.dex */
public class SharedFlowImpl extends kotlinx.coroutines.flow.internal.a implements s0, kotlinx.coroutines.flow.b, kotlinx.coroutines.flow.internal.i {

    /* renamed from: e, reason: collision with root package name */
    public final int f22412e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22413f;

    /* renamed from: g, reason: collision with root package name */
    public final BufferOverflow f22414g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f22415h;

    /* renamed from: i, reason: collision with root package name */
    public long f22416i;

    /* renamed from: j, reason: collision with root package name */
    public long f22417j;

    /* renamed from: k, reason: collision with root package name */
    public int f22418k;

    /* renamed from: l, reason: collision with root package name */
    public int f22419l;

    public static final class a implements kotlinx.coroutines.y0 {

        /* renamed from: a, reason: collision with root package name */
        public final SharedFlowImpl f22420a;

        /* renamed from: b, reason: collision with root package name */
        public long f22421b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f22422c;

        /* renamed from: d, reason: collision with root package name */
        public final c9.c f22423d;

        public a(SharedFlowImpl sharedFlowImpl, long j10, Object obj, c9.c cVar) {
            this.f22420a = sharedFlowImpl;
            this.f22421b = j10;
            this.f22422c = obj;
            this.f22423d = cVar;
        }

        @Override // kotlinx.coroutines.y0
        public void d() {
            this.f22420a.y(this);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22424a;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.f22240a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.f22242c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.f22241b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22424a = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {382, 389, 392}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(c9.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedFlowImpl.A(SharedFlowImpl.this, null, this);
        }
    }

    public SharedFlowImpl(int i10, int i11, BufferOverflow bufferOverflow) {
        this.f22412e = i10;
        this.f22413f = i11;
        this.f22414g = bufferOverflow;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r9).b(r0) == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object A(kotlinx.coroutines.flow.SharedFlowImpl r8, kotlinx.coroutines.flow.c r9, c9.c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.A(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.c, c9.c):java.lang.Object");
    }

    public static /* synthetic */ Object F(SharedFlowImpl sharedFlowImpl, Object obj, c9.c cVar) throws Throwable {
        if (sharedFlowImpl.a(obj)) {
            return y8.s.f25199a;
        }
        Object objG = sharedFlowImpl.G(obj, cVar);
        return objG == kotlin.coroutines.intrinsics.a.f() ? objG : y8.s.f25199a;
    }

    public final void B(long j10) {
        kotlinx.coroutines.flow.internal.c[] cVarArr;
        if (this.f22471b != 0 && (cVarArr = this.f22470a) != null) {
            for (kotlinx.coroutines.flow.internal.c cVar : cVarArr) {
                if (cVar != null) {
                    z0 z0Var = (z0) cVar;
                    long j11 = z0Var.f22493a;
                    if (j11 >= 0 && j11 < j10) {
                        z0Var.f22493a = j10;
                    }
                }
            }
        }
        this.f22417j = j10;
    }

    @Override // kotlinx.coroutines.flow.internal.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public z0 f() {
        return new z0();
    }

    @Override // kotlinx.coroutines.flow.internal.a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public z0[] i(int i10) {
        return new z0[i10];
    }

    public final void E() {
        Object[] objArr = this.f22415h;
        kotlin.jvm.internal.p.b(objArr);
        y0.g(objArr, K(), null);
        this.f22418k--;
        long jK = K() + 1;
        if (this.f22416i < jK) {
            this.f22416i = jK;
        }
        if (this.f22417j < jK) {
            B(jK);
        }
    }

    public final Object G(Object obj, c9.c cVar) throws Throwable {
        Throwable th;
        c9.c[] cVarArrI;
        a aVar;
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        pVar.F();
        c9.c[] cVarArrI2 = kotlinx.coroutines.flow.internal.b.f22474a;
        synchronized (this) {
            try {
                if (R(obj)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        pVar.resumeWith(Result.b(y8.s.f25199a));
                        cVarArrI = I(cVarArrI2);
                        aVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        aVar = new a(this, K() + P(), obj, pVar);
                        H(aVar);
                        this.f22419l++;
                        if (this.f22413f == 0) {
                            cVarArrI2 = I(cVarArrI2);
                        }
                        cVarArrI = cVarArrI2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    kotlinx.coroutines.r.a(pVar, aVar);
                }
                for (c9.c cVar2 : cVarArrI) {
                    if (cVar2 != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        cVar2.resumeWith(Result.b(y8.s.f25199a));
                    }
                }
                Object objW = pVar.w();
                if (objW == kotlin.coroutines.intrinsics.a.f()) {
                    d9.e.c(cVar);
                }
                return objW == kotlin.coroutines.intrinsics.a.f() ? objW : y8.s.f25199a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void H(Object obj) {
        int iP = P();
        Object[] objArrQ = this.f22415h;
        if (objArrQ == null) {
            objArrQ = Q(null, 0, 2);
        } else if (iP >= objArrQ.length) {
            objArrQ = Q(objArrQ, iP, objArrQ.length * 2);
        }
        y0.g(objArrQ, K() + iP, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final c9.c[] I(c9.c[] cVarArr) {
        kotlinx.coroutines.flow.internal.c[] cVarArr2;
        z0 z0Var;
        c9.c cVar;
        int length = cVarArr.length;
        if (this.f22471b != 0 && (cVarArr2 = this.f22470a) != null) {
            int length2 = cVarArr2.length;
            int i10 = 0;
            cVarArr = cVarArr;
            while (i10 < length2) {
                kotlinx.coroutines.flow.internal.c cVar2 = cVarArr2[i10];
                if (cVar2 != null && (cVar = (z0Var = (z0) cVar2).f22494b) != null && T(z0Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        kotlin.jvm.internal.p.d(CopyOf, "copyOf(...)");
                        cVarArr = CopyOf;
                    }
                    cVarArr[length] = cVar;
                    z0Var.f22494b = null;
                    length++;
                }
                i10++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long J() {
        return K() + this.f22418k;
    }

    public final long K() {
        return Math.min(this.f22417j, this.f22416i);
    }

    public final Object L() {
        Object[] objArr = this.f22415h;
        kotlin.jvm.internal.p.b(objArr);
        return y0.f(objArr, (this.f22416i + O()) - 1);
    }

    public final Object M(long j10) {
        Object[] objArr = this.f22415h;
        kotlin.jvm.internal.p.b(objArr);
        Object objF = y0.f(objArr, j10);
        return objF instanceof a ? ((a) objF).f22422c : objF;
    }

    public final long N() {
        return K() + this.f22418k + this.f22419l;
    }

    public final int O() {
        return (int) ((K() + this.f22418k) - this.f22416i);
    }

    public final int P() {
        return this.f22418k + this.f22419l;
    }

    public final Object[] Q(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f22415h = objArr2;
        if (objArr != null) {
            long jK = K();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = i12 + jK;
                y0.g(objArr2, j10, y0.f(objArr, j10));
            }
        }
        return objArr2;
    }

    public final boolean R(Object obj) {
        if (l() == 0) {
            return S(obj);
        }
        if (this.f22418k >= this.f22413f && this.f22417j <= this.f22416i) {
            int i10 = b.f22424a[this.f22414g.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
        }
        H(obj);
        int i11 = this.f22418k + 1;
        this.f22418k = i11;
        if (i11 > this.f22413f) {
            E();
        }
        if (O() > this.f22412e) {
            V(this.f22416i + 1, this.f22417j, J(), N());
        }
        return true;
    }

    public final boolean S(Object obj) {
        if (this.f22412e == 0) {
            return true;
        }
        H(obj);
        int i10 = this.f22418k + 1;
        this.f22418k = i10;
        if (i10 > this.f22412e) {
            E();
        }
        this.f22417j = K() + this.f22418k;
        return true;
    }

    public final long T(z0 z0Var) {
        long j10 = z0Var.f22493a;
        if (j10 >= J() && (this.f22413f > 0 || j10 > K() || this.f22419l == 0)) {
            return -1L;
        }
        return j10;
    }

    public final Object U(z0 z0Var) {
        Object obj;
        c9.c[] cVarArrW = kotlinx.coroutines.flow.internal.b.f22474a;
        synchronized (this) {
            try {
                long jT = T(z0Var);
                if (jT < 0) {
                    obj = y0.f22492a;
                } else {
                    long j10 = z0Var.f22493a;
                    Object objM = M(jT);
                    z0Var.f22493a = jT + 1;
                    cVarArrW = W(j10);
                    obj = objM;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (c9.c cVar : cVarArrW) {
            if (cVar != null) {
                Result.Companion companion = Result.INSTANCE;
                cVar.resumeWith(Result.b(y8.s.f25199a));
            }
        }
        return obj;
    }

    public final void V(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jK = K(); jK < jMin; jK++) {
            Object[] objArr = this.f22415h;
            kotlin.jvm.internal.p.b(objArr);
            y0.g(objArr, jK, null);
        }
        this.f22416i = j10;
        this.f22417j = j11;
        this.f22418k = (int) (j12 - jMin);
        this.f22419l = (int) (j13 - j12);
    }

    public final c9.c[] W(long j10) {
        long j11;
        long j12;
        long j13;
        kotlinx.coroutines.flow.internal.c[] cVarArr;
        if (j10 > this.f22417j) {
            return kotlinx.coroutines.flow.internal.b.f22474a;
        }
        long jK = K();
        long j14 = this.f22418k + jK;
        if (this.f22413f == 0 && this.f22419l > 0) {
            j14++;
        }
        if (this.f22471b != 0 && (cVarArr = this.f22470a) != null) {
            for (kotlinx.coroutines.flow.internal.c cVar : cVarArr) {
                if (cVar != null) {
                    long j15 = ((z0) cVar).f22493a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f22417j) {
            return kotlinx.coroutines.flow.internal.b.f22474a;
        }
        long J = J();
        int iMin = l() > 0 ? Math.min(this.f22419l, this.f22413f - ((int) (J - j14))) : this.f22419l;
        c9.c[] cVarArr2 = kotlinx.coroutines.flow.internal.b.f22474a;
        long j16 = this.f22419l + J;
        if (iMin > 0) {
            cVarArr2 = new c9.c[iMin];
            Object[] objArr = this.f22415h;
            kotlin.jvm.internal.p.b(objArr);
            j13 = 1;
            long j17 = J;
            int i10 = 0;
            while (true) {
                if (J >= j16) {
                    j11 = jK;
                    j12 = j14;
                    J = j17;
                    break;
                }
                Object objF = y0.f(objArr, J);
                j11 = jK;
                kotlinx.coroutines.internal.c0 c0Var = y0.f22492a;
                if (objF != c0Var) {
                    kotlin.jvm.internal.p.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j12 = j14;
                    cVarArr2[i10] = aVar.f22423d;
                    y0.g(objArr, J, c0Var);
                    y0.g(objArr, j17, aVar.f22422c);
                    long j18 = j17 + 1;
                    if (i11 >= iMin) {
                        J = j18;
                        break;
                    }
                    i10 = i11;
                    j17 = j18;
                } else {
                    j12 = j14;
                }
                J++;
                jK = j11;
                j14 = j12;
            }
        } else {
            j11 = jK;
            j12 = j14;
            j13 = 1;
        }
        c9.c[] cVarArr3 = cVarArr2;
        int i12 = (int) (J - j11);
        long j19 = l() == 0 ? J : j12;
        long jMax = Math.max(this.f22416i, J - Math.min(this.f22412e, i12));
        if (this.f22413f == 0 && jMax < j16) {
            Object[] objArr2 = this.f22415h;
            kotlin.jvm.internal.p.b(objArr2);
            if (kotlin.jvm.internal.p.a(y0.f(objArr2, jMax), y0.f22492a)) {
                J += j13;
                jMax += j13;
            }
        }
        V(jMax, j19, J, j16);
        z();
        return !(cVarArr3.length == 0) ? I(cVarArr3) : cVarArr3;
    }

    public final long X() {
        long j10 = this.f22416i;
        if (j10 < this.f22417j) {
            this.f22417j = j10;
        }
        return j10;
    }

    @Override // kotlinx.coroutines.flow.s0
    public boolean a(Object obj) {
        int i10;
        boolean z10;
        c9.c[] cVarArrI = kotlinx.coroutines.flow.internal.b.f22474a;
        synchronized (this) {
            if (R(obj)) {
                cVarArrI = I(cVarArrI);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (c9.c cVar : cVarArrI) {
            if (cVar != null) {
                Result.Companion companion = Result.INSTANCE;
                cVar.resumeWith(Result.b(y8.s.f25199a));
            }
        }
        return z10;
    }

    @Override // kotlinx.coroutines.flow.internal.i
    public kotlinx.coroutines.flow.b b(kotlin.coroutines.d dVar, int i10, BufferOverflow bufferOverflow) {
        return y0.e(this, dVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.x0, kotlinx.coroutines.flow.b
    public Object collect(c cVar, c9.c cVar2) {
        return A(this, cVar, cVar2);
    }

    @Override // kotlinx.coroutines.flow.s0, kotlinx.coroutines.flow.c
    public Object emit(Object obj, c9.c cVar) {
        return F(this, obj, cVar);
    }

    @Override // kotlinx.coroutines.flow.s0
    public void j() throws Throwable {
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                V(J(), this.f22417j, J(), N());
                y8.s sVar = y8.s.f25199a;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final Object x(z0 z0Var, c9.c cVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        pVar.F();
        synchronized (this) {
            try {
                if (T(z0Var) < 0) {
                    z0Var.f22494b = pVar;
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    pVar.resumeWith(Result.b(y8.s.f25199a));
                }
                y8.s sVar = y8.s.f25199a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objW = pVar.w();
        if (objW == kotlin.coroutines.intrinsics.a.f()) {
            d9.e.c(cVar);
        }
        return objW == kotlin.coroutines.intrinsics.a.f() ? objW : y8.s.f25199a;
    }

    public final void y(a aVar) {
        synchronized (this) {
            if (aVar.f22421b < K()) {
                return;
            }
            Object[] objArr = this.f22415h;
            kotlin.jvm.internal.p.b(objArr);
            if (y0.f(objArr, aVar.f22421b) != aVar) {
                return;
            }
            y0.g(objArr, aVar.f22421b, y0.f22492a);
            z();
            y8.s sVar = y8.s.f25199a;
        }
    }

    public final void z() {
        if (this.f22413f != 0 || this.f22419l > 1) {
            Object[] objArr = this.f22415h;
            kotlin.jvm.internal.p.b(objArr);
            while (this.f22419l > 0 && y0.f(objArr, (K() + P()) - 1) == y0.f22492a) {
                this.f22419l--;
                y0.g(objArr, K() + P(), null);
            }
        }
    }
}
