package Li;

import Ii.C3073p;
import Ii.InterfaceC3052e0;
import Mi.AbstractC3305a;
import Yg.u;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes4.dex */
public class E extends AbstractC3305a implements y, InterfaceC3220g, Mi.o {

    /* renamed from: e, reason: collision with root package name */
    private final int f11833e;

    /* renamed from: f, reason: collision with root package name */
    private final int f11834f;

    /* renamed from: g, reason: collision with root package name */
    private final Ki.a f11835g;

    /* renamed from: h, reason: collision with root package name */
    private Object[] f11836h;

    /* renamed from: i, reason: collision with root package name */
    private long f11837i;

    /* renamed from: j, reason: collision with root package name */
    private long f11838j;

    /* renamed from: k, reason: collision with root package name */
    private int f11839k;

    /* renamed from: l, reason: collision with root package name */
    private int f11840l;

    private static final class a implements InterfaceC3052e0 {

        /* renamed from: a, reason: collision with root package name */
        public final E f11841a;

        /* renamed from: b, reason: collision with root package name */
        public long f11842b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f11843c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC5380e f11844d;

        public a(E e10, long j10, Object obj, InterfaceC5380e interfaceC5380e) {
            this.f11841a = e10;
            this.f11842b = j10;
            this.f11843c = obj;
            this.f11844d = interfaceC5380e;
        }

        @Override // Ii.InterfaceC3052e0
        public void dispose() {
            this.f11841a.A(this);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11845a;

        static {
            int[] iArr = new int[Ki.a.values().length];
            try {
                iArr[Ki.a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ki.a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ki.a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11845a = iArr;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f11846a;

        /* renamed from: b, reason: collision with root package name */
        Object f11847b;

        /* renamed from: c, reason: collision with root package name */
        Object f11848c;

        /* renamed from: d, reason: collision with root package name */
        Object f11849d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f11850e;

        /* renamed from: g, reason: collision with root package name */
        int f11852g;

        c(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11850e = obj;
            this.f11852g |= PduHandle.NONE;
            return E.C(E.this, null, this);
        }
    }

    public E(int i10, int i11, Ki.a aVar) {
        this.f11833e = i10;
        this.f11834f = i11;
        this.f11835g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(a aVar) {
        synchronized (this) {
            if (aVar.f11842b < M()) {
                return;
            }
            Object[] objArr = this.f11836h;
            AbstractC6492s.f(objArr);
            if (F.f(objArr, aVar.f11842b) != aVar) {
                return;
            }
            F.g(objArr, aVar.f11842b, F.f11853a);
            B();
            Yg.J j10 = Yg.J.f24997a;
        }
    }

    private final void B() {
        if (this.f11834f != 0 || this.f11840l > 1) {
            Object[] objArr = this.f11836h;
            AbstractC6492s.f(objArr);
            while (this.f11840l > 0 && F.f(objArr, (M() + R()) - 1) == F.f11853a) {
                this.f11840l--;
                F.g(objArr, M() + R(), null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:15:0x003b, B:32:0x0092, B:34:0x009a, B:38:0x00ad, B:39:0x00b0, B:22:0x005d), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [Mi.a] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [Li.E, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Li.h] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [Mi.c] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [Li.G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [Li.G] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00be -> B:16:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object C(Li.E r8, Li.InterfaceC3221h r9, dh.InterfaceC5380e r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Li.E.C(Li.E, Li.h, dh.e):java.lang.Object");
    }

    private final void D(long j10) {
        Mi.c[] cVarArr;
        if (((AbstractC3305a) this).f13232b != 0 && (cVarArr = ((AbstractC3305a) this).f13231a) != null) {
            for (Mi.c cVar : cVarArr) {
                if (cVar != null) {
                    G g10 = (G) cVar;
                    long j11 = g10.f11854a;
                    if (j11 >= 0 && j11 < j10) {
                        g10.f11854a = j10;
                    }
                }
            }
        }
        this.f11838j = j10;
    }

    private final void G() {
        Object[] objArr = this.f11836h;
        AbstractC6492s.f(objArr);
        F.g(objArr, M(), null);
        this.f11839k--;
        long jM = M() + 1;
        if (this.f11837i < jM) {
            this.f11837i = jM;
        }
        if (this.f11838j < jM) {
            D(jM);
        }
    }

    static /* synthetic */ Object H(E e10, Object obj, InterfaceC5380e interfaceC5380e) {
        Object objI;
        return (!e10.j(obj) && (objI = e10.I(obj, interfaceC5380e)) == AbstractC5467b.g()) ? objI : Yg.J.f24997a;
    }

    private final Object I(Object obj, InterfaceC5380e interfaceC5380e) {
        InterfaceC5380e[] interfaceC5380eArrK;
        a aVar;
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        InterfaceC5380e[] interfaceC5380eArrK2 = Mi.b.f13235a;
        synchronized (this) {
            try {
                if (T(obj)) {
                    u.a aVar2 = Yg.u.f25017b;
                    c3073p.resumeWith(Yg.u.c(Yg.J.f24997a));
                    interfaceC5380eArrK = K(interfaceC5380eArrK2);
                    aVar = null;
                } else {
                    a aVar3 = new a(this, R() + M(), obj, c3073p);
                    J(aVar3);
                    this.f11840l++;
                    if (this.f11834f == 0) {
                        interfaceC5380eArrK2 = K(interfaceC5380eArrK2);
                    }
                    interfaceC5380eArrK = interfaceC5380eArrK2;
                    aVar = aVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            Ii.r.a(c3073p, aVar);
        }
        for (InterfaceC5380e interfaceC5380e2 : interfaceC5380eArrK) {
            if (interfaceC5380e2 != null) {
                u.a aVar4 = Yg.u.f25017b;
                interfaceC5380e2.resumeWith(Yg.u.c(Yg.J.f24997a));
            }
        }
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU == AbstractC5467b.g() ? objU : Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Object obj) {
        int iR = R();
        Object[] objArrS = this.f11836h;
        if (objArrS == null) {
            objArrS = S(null, 0, 2);
        } else if (iR >= objArrS.length) {
            objArrS = S(objArrS, iR, objArrS.length * 2);
        }
        F.g(objArrS, M() + iR, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final InterfaceC5380e[] K(InterfaceC5380e[] interfaceC5380eArr) {
        Mi.c[] cVarArr;
        G g10;
        InterfaceC5380e interfaceC5380e;
        int length = interfaceC5380eArr.length;
        if (((AbstractC3305a) this).f13232b != 0 && (cVarArr = ((AbstractC3305a) this).f13231a) != null) {
            int length2 = cVarArr.length;
            int i10 = 0;
            interfaceC5380eArr = interfaceC5380eArr;
            while (i10 < length2) {
                Mi.c cVar = cVarArr[i10];
                if (cVar != null && (interfaceC5380e = (g10 = (G) cVar).f11855b) != null && V(g10) >= 0) {
                    int length3 = interfaceC5380eArr.length;
                    interfaceC5380eArr = interfaceC5380eArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(interfaceC5380eArr, Math.max(2, interfaceC5380eArr.length * 2));
                        AbstractC6492s.h(CopyOf, "copyOf(...)");
                        interfaceC5380eArr = CopyOf;
                    }
                    interfaceC5380eArr[length] = interfaceC5380e;
                    g10.f11855b = null;
                    length++;
                }
                i10++;
                interfaceC5380eArr = interfaceC5380eArr;
            }
        }
        return interfaceC5380eArr;
    }

    private final long L() {
        return M() + this.f11839k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long M() {
        return Math.min(this.f11838j, this.f11837i);
    }

    private final Object O(long j10) {
        Object[] objArr = this.f11836h;
        AbstractC6492s.f(objArr);
        Object objF = F.f(objArr, j10);
        return objF instanceof a ? ((a) objF).f11843c : objF;
    }

    private final long P() {
        return M() + this.f11839k + this.f11840l;
    }

    private final int Q() {
        return (int) ((M() + this.f11839k) - this.f11837i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R() {
        return this.f11839k + this.f11840l;
    }

    private final Object[] S(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f11836h = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jM = M();
        for (int i12 = 0; i12 < i10; i12++) {
            long j10 = i12 + jM;
            F.g(objArr2, j10, F.f(objArr, j10));
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T(Object obj) {
        if (n() == 0) {
            return U(obj);
        }
        if (this.f11839k >= this.f11834f && this.f11838j <= this.f11837i) {
            int i10 = b.f11845a[this.f11835g.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        J(obj);
        int i11 = this.f11839k + 1;
        this.f11839k = i11;
        if (i11 > this.f11834f) {
            G();
        }
        if (Q() > this.f11833e) {
            X(this.f11837i + 1, this.f11838j, L(), P());
        }
        return true;
    }

    private final boolean U(Object obj) {
        if (this.f11833e == 0) {
            return true;
        }
        J(obj);
        int i10 = this.f11839k + 1;
        this.f11839k = i10;
        if (i10 > this.f11833e) {
            G();
        }
        this.f11838j = M() + this.f11839k;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long V(G g10) {
        long j10 = g10.f11854a;
        if (j10 < L()) {
            return j10;
        }
        if (this.f11834f <= 0 && j10 <= M() && this.f11840l != 0) {
            return j10;
        }
        return -1L;
    }

    private final Object W(G g10) {
        Object obj;
        InterfaceC5380e[] interfaceC5380eArrY = Mi.b.f13235a;
        synchronized (this) {
            try {
                long jV = V(g10);
                if (jV < 0) {
                    obj = F.f11853a;
                } else {
                    long j10 = g10.f11854a;
                    Object objO = O(jV);
                    g10.f11854a = jV + 1;
                    interfaceC5380eArrY = Y(j10);
                    obj = objO;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (InterfaceC5380e interfaceC5380e : interfaceC5380eArrY) {
            if (interfaceC5380e != null) {
                u.a aVar = Yg.u.f25017b;
                interfaceC5380e.resumeWith(Yg.u.c(Yg.J.f24997a));
            }
        }
        return obj;
    }

    private final void X(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jM = M(); jM < jMin; jM++) {
            Object[] objArr = this.f11836h;
            AbstractC6492s.f(objArr);
            F.g(objArr, jM, null);
        }
        this.f11837i = j10;
        this.f11838j = j11;
        this.f11839k = (int) (j12 - jMin);
        this.f11840l = (int) (j13 - j12);
    }

    private final Object z(G g10, InterfaceC5380e interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        synchronized (this) {
            try {
                if (V(g10) < 0) {
                    g10.f11855b = c3073p;
                } else {
                    u.a aVar = Yg.u.f25017b;
                    c3073p.resumeWith(Yg.u.c(Yg.J.f24997a));
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU == AbstractC5467b.g() ? objU : Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mi.AbstractC3305a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public G i() {
        return new G();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mi.AbstractC3305a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public G[] k(int i10) {
        return new G[i10];
    }

    protected final Object N() {
        Object[] objArr = this.f11836h;
        AbstractC6492s.f(objArr);
        return F.f(objArr, (this.f11837i + Q()) - 1);
    }

    public final InterfaceC5380e[] Y(long j10) {
        long j11;
        long j12;
        long j13;
        Mi.c[] cVarArr;
        if (j10 > this.f11838j) {
            return Mi.b.f13235a;
        }
        long jM = M();
        long j14 = this.f11839k + jM;
        if (this.f11834f == 0 && this.f11840l > 0) {
            j14++;
        }
        if (((AbstractC3305a) this).f13232b != 0 && (cVarArr = ((AbstractC3305a) this).f13231a) != null) {
            for (Mi.c cVar : cVarArr) {
                if (cVar != null) {
                    long j15 = ((G) cVar).f11854a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f11838j) {
            return Mi.b.f13235a;
        }
        long jL = L();
        int iMin = n() > 0 ? Math.min(this.f11840l, this.f11834f - ((int) (jL - j14))) : this.f11840l;
        InterfaceC5380e[] interfaceC5380eArr = Mi.b.f13235a;
        long j16 = this.f11840l + jL;
        if (iMin > 0) {
            interfaceC5380eArr = new InterfaceC5380e[iMin];
            Object[] objArr = this.f11836h;
            AbstractC6492s.f(objArr);
            long j17 = jL;
            int i10 = 0;
            while (true) {
                if (jL >= j16) {
                    j11 = j14;
                    j12 = j16;
                    break;
                }
                Object objF = F.f(objArr, jL);
                j11 = j14;
                Ni.C c10 = F.f11853a;
                if (objF != c10) {
                    AbstractC6492s.g(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j12 = j16;
                    interfaceC5380eArr[i10] = aVar.f11844d;
                    F.g(objArr, jL, c10);
                    F.g(objArr, j17, aVar.f11843c);
                    j13 = 1;
                    j17++;
                    if (i11 >= iMin) {
                        break;
                    }
                    i10 = i11;
                } else {
                    j12 = j16;
                    j13 = 1;
                }
                jL += j13;
                j14 = j11;
                j16 = j12;
            }
            jL = j17;
        } else {
            j11 = j14;
            j12 = j16;
        }
        int i12 = (int) (jL - jM);
        long j18 = n() == 0 ? jL : j11;
        long jMax = Math.max(this.f11837i, jL - Math.min(this.f11833e, i12));
        if (this.f11834f == 0 && jMax < j12) {
            Object[] objArr2 = this.f11836h;
            AbstractC6492s.f(objArr2);
            if (AbstractC6492s.d(F.f(objArr2, jMax), F.f11853a)) {
                jL++;
                jMax++;
            }
        }
        X(jMax, j18, jL, j12);
        B();
        return !(interfaceC5380eArr.length == 0) ? K(interfaceC5380eArr) : interfaceC5380eArr;
    }

    public final long Z() {
        long j10 = this.f11837i;
        if (j10 < this.f11838j) {
            this.f11838j = j10;
        }
        return j10;
    }

    @Override // Li.y, Li.InterfaceC3221h
    public Object a(Object obj, InterfaceC5380e interfaceC5380e) {
        return H(this, obj, interfaceC5380e);
    }

    @Override // Li.D, Li.InterfaceC3220g
    public Object b(InterfaceC3221h interfaceC3221h, InterfaceC5380e interfaceC5380e) {
        return C(this, interfaceC3221h, interfaceC5380e);
    }

    @Override // Mi.o
    public InterfaceC3220g d(InterfaceC5384i interfaceC5384i, int i10, Ki.a aVar) {
        return F.e(this, interfaceC5384i, i10, aVar);
    }

    @Override // Li.y
    public void h() {
        synchronized (this) {
            X(L(), this.f11838j, L(), P());
            Yg.J j10 = Yg.J.f24997a;
        }
    }

    @Override // Li.y
    public boolean j(Object obj) {
        int i10;
        boolean z10;
        InterfaceC5380e[] interfaceC5380eArrK = Mi.b.f13235a;
        synchronized (this) {
            if (T(obj)) {
                interfaceC5380eArrK = K(interfaceC5380eArrK);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (InterfaceC5380e interfaceC5380e : interfaceC5380eArrK) {
            if (interfaceC5380e != null) {
                u.a aVar = Yg.u.f25017b;
                interfaceC5380e.resumeWith(Yg.u.c(Yg.J.f24997a));
            }
        }
        return z10;
    }
}
