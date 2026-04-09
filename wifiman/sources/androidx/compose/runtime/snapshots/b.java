package androidx.compose.runtime.snapshots;

import T.B0;
import Yg.J;
import Yg.s;
import Yg.z;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import androidx.compose.runtime.snapshots.h;
import d0.InterfaceC5279k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o.I;
import o.U;

/* loaded from: classes.dex */
public class b extends g {

    /* renamed from: p, reason: collision with root package name */
    private static final a f28613p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f28614q = 8;

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f28615r = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6835l f28616g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC6835l f28617h;

    /* renamed from: i, reason: collision with root package name */
    private int f28618i;

    /* renamed from: j, reason: collision with root package name */
    private I f28619j;

    /* renamed from: k, reason: collision with root package name */
    private List f28620k;

    /* renamed from: l, reason: collision with root package name */
    private i f28621l;

    /* renamed from: m, reason: collision with root package name */
    private int[] f28622m;

    /* renamed from: n, reason: collision with root package name */
    private int f28623n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28624o;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(int i10, i iVar, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        super(i10, iVar, null);
        this.f28616g = interfaceC6835l;
        this.f28617h = interfaceC6835l2;
        this.f28621l = i.f28640e.a();
        this.f28622m = f28615r;
        this.f28623n = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A() {
        /*
            r15 = this;
            o.I r0 = r15.E()
            if (r0 == 0) goto L77
            r15.R()
            r1 = 0
            r15.P(r1)
            int r1 = r15.f()
            java.lang.Object[] r2 = r0.f54929b
            long[] r0 = r0.f54928a
            int r3 = r0.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L77
            r4 = 0
            r5 = r4
        L1c:
            r6 = r0[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L72
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L36:
            if (r10 >= r8) goto L70
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L6c
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            d0.k r11 = (d0.InterfaceC5279k) r11
            androidx.compose.runtime.snapshots.n r11 = r11.i()
        L4c:
            if (r11 == 0) goto L6c
            int r12 = r11.f()
            if (r12 == r1) goto L64
            androidx.compose.runtime.snapshots.i r12 = r15.f28621l
            int r13 = r11.f()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            boolean r12 = Zg.AbstractC3689v.f0(r12, r13)
            if (r12 == 0) goto L67
        L64:
            r11.h(r4)
        L67:
            androidx.compose.runtime.snapshots.n r11 = r11.e()
            goto L4c
        L6c:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L36
        L70:
            if (r8 != r9) goto L77
        L72:
            if (r5 == r3) goto L77
            int r5 = r5 + 1
            goto L1c
        L77:
            r15.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.b.A():void");
    }

    private final void N() {
        int length = this.f28622m.length;
        for (int i10 = 0; i10 < length; i10++) {
            j.Y(this.f28622m[i10]);
        }
    }

    private final void R() {
        if (this.f28624o) {
            B0.b("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void S() {
        if (!this.f28624o || ((g) this).f28637d >= 0) {
            return;
        }
        B0.b("Unsupported operation on a disposed or applied snapshot");
    }

    public final void B() {
        J(f());
        J j10 = J.f24997a;
        if (D() || e()) {
            return;
        }
        int iF = f();
        synchronized (j.I()) {
            int i10 = j.f28656e;
            j.f28656e = i10 + 1;
            u(i10);
            j.f28655d = j.f28655d.v(f());
        }
        v(j.z(g(), iF + 1, f()));
    }

    public h C() throws Throwable {
        I iE;
        int i10;
        I iE2 = E();
        Map mapR = iE2 != null ? j.R((b) j.f28661j.get(), this, j.f28655d.k(((androidx.compose.runtime.snapshots.a) j.f28661j.get()).f())) : null;
        List listL = AbstractC3689v.l();
        synchronized (j.I()) {
            try {
                j.g0(this);
                if (iE2 == null || iE2.c() == 0) {
                    c();
                    androidx.compose.runtime.snapshots.a aVar = (androidx.compose.runtime.snapshots.a) j.f28661j.get();
                    j.a0(aVar, j.f28652a);
                    iE = aVar.E();
                    if (iE == null || !iE.e()) {
                        iE = null;
                    } else {
                        listL = j.f28659h;
                    }
                } else {
                    androidx.compose.runtime.snapshots.a aVar2 = (androidx.compose.runtime.snapshots.a) j.f28661j.get();
                    h hVarI = I(j.f28656e, mapR, j.f28655d.k(aVar2.f()));
                    if (!AbstractC6492s.d(hVarI, h.b.f28639a)) {
                        return hVarI;
                    }
                    c();
                    j.a0(aVar2, j.f28652a);
                    iE = aVar2.E();
                    P(null);
                    aVar2.P(null);
                    listL = j.f28659h;
                }
                J j10 = J.f24997a;
                this.f28624o = true;
                if (iE != null) {
                    Set setA = V.e.a(iE);
                    if (!setA.isEmpty()) {
                        int size = listL.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((InterfaceC6839p) listL.get(i11)).invoke(setA, this);
                        }
                    }
                }
                if (iE2 != null && iE2.e()) {
                    Set setA2 = V.e.a(iE2);
                    int size2 = listL.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        ((InterfaceC6839p) listL.get(i12)).invoke(setA2, this);
                    }
                }
                synchronized (j.I()) {
                    try {
                        r();
                        j.C();
                        if (iE != null) {
                            try {
                                Object[] objArr = iE.f54929b;
                                long[] jArr = iE.f54928a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j11 = jArr[i13];
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                                            for (int i15 = 0; i15 < i14; i15++) {
                                                if ((j11 & 255) < 128) {
                                                    j.U((InterfaceC5279k) objArr[(i13 << 3) + i15]);
                                                }
                                                j11 >>= 8;
                                            }
                                            if (i14 != 8) {
                                                break;
                                            }
                                        }
                                        if (i13 == length) {
                                            break;
                                        }
                                        i13++;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        if (iE2 != null) {
                            Object[] objArr2 = iE2.f54929b;
                            long[] jArr2 = iE2.f54928a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j12 = jArr2[i16];
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j12 & 255) < 128) {
                                                j.U((InterfaceC5279k) objArr2[(i16 << 3) + i18]);
                                            }
                                            j12 >>= 8;
                                        }
                                        i10 = 1;
                                        if (i17 != 8) {
                                            break;
                                        }
                                    } else {
                                        i10 = 1;
                                    }
                                    if (i16 == length2) {
                                        break;
                                    }
                                    i16 += i10;
                                }
                            }
                        }
                        List list = this.f28620k;
                        if (list != null) {
                            int size3 = list.size();
                            for (int i19 = 0; i19 < size3; i19++) {
                                j.U((InterfaceC5279k) list.get(i19));
                            }
                        }
                        this.f28620k = null;
                        J j13 = J.f24997a;
                        return h.b.f28639a;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final boolean D() {
        return this.f28624o;
    }

    public I E() {
        return this.f28619j;
    }

    public final i F() {
        return this.f28621l;
    }

    public final int[] G() {
        return this.f28622m;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: H */
    public InterfaceC6835l h() {
        return this.f28616g;
    }

    public final h I(int i10, Map map, i iVar) {
        I i11;
        List listM0;
        i iVar2;
        Object[] objArr;
        long[] jArr;
        int i12;
        i iVar3;
        I i13;
        Object[] objArr2;
        long[] jArr2;
        int i14;
        n nVarW;
        n nVarJ;
        i iVarU = g().v(f()).u(this.f28621l);
        I iE = E();
        AbstractC6492s.f(iE);
        Object[] objArr3 = iE.f54929b;
        long[] jArr3 = iE.f54928a;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        if (length >= 0) {
            listM0 = null;
            int i15 = 0;
            while (true) {
                long j10 = jArr3[i15];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8;
                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((j10 & 255) < 128) {
                            InterfaceC5279k interfaceC5279k = (InterfaceC5279k) objArr3[(i15 << 3) + i18];
                            n nVarI = interfaceC5279k.i();
                            i13 = iE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            n nVarW2 = j.W(nVarI, i10, iVar);
                            if (nVarW2 == null || (nVarW = j.W(nVarI, f(), iVarU)) == null) {
                                iVar3 = iVarU;
                            } else {
                                iVar3 = iVarU;
                                if (nVarW.f() != 1 && !AbstractC6492s.d(nVarW2, nVarW)) {
                                    n nVarW3 = j.W(nVarI, f(), g());
                                    if (nVarW3 == null) {
                                        j.V();
                                        throw new KotlinNothingValueException();
                                    }
                                    if (map == null || (nVarJ = (n) map.get(nVarW2)) == null) {
                                        nVarJ = interfaceC5279k.j(nVarW, nVarW2, nVarW3);
                                    }
                                    if (nVarJ == null) {
                                        return new h.a(this);
                                    }
                                    if (!AbstractC6492s.d(nVarJ, nVarW3)) {
                                        if (AbstractC6492s.d(nVarJ, nVarW2)) {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(z.a(interfaceC5279k, nVarW2.d()));
                                            if (listM0 == null) {
                                                listM0 = new ArrayList();
                                            }
                                            listM0.add(interfaceC5279k);
                                        } else {
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(!AbstractC6492s.d(nVarJ, nVarW) ? z.a(interfaceC5279k, nVarJ) : z.a(interfaceC5279k, nVarW.d()));
                                        }
                                    }
                                }
                            }
                            i14 = 8;
                        } else {
                            iVar3 = iVarU;
                            i13 = iE;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i14 = i16;
                        }
                        j10 >>= i14;
                        i18++;
                        i16 = i14;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iE = i13;
                        iVarU = iVar3;
                    }
                    iVar2 = iVarU;
                    i11 = iE;
                    objArr = objArr3;
                    jArr = jArr3;
                    i12 = 1;
                    if (i17 != i16) {
                        break;
                    }
                } else {
                    iVar2 = iVarU;
                    i11 = iE;
                    objArr = objArr3;
                    jArr = jArr3;
                    i12 = 1;
                }
                if (i15 == length) {
                    break;
                }
                i15 += i12;
                objArr3 = objArr;
                jArr3 = jArr;
                iE = i11;
                iVarU = iVar2;
            }
        } else {
            i11 = iE;
            listM0 = null;
        }
        if (arrayList != null) {
            B();
            int size = arrayList.size();
            for (int i19 = 0; i19 < size; i19++) {
                s sVar = (s) arrayList.get(i19);
                InterfaceC5279k interfaceC5279k2 = (InterfaceC5279k) sVar.a();
                n nVar = (n) sVar.c();
                nVar.h(f());
                synchronized (j.I()) {
                    nVar.g(interfaceC5279k2.i());
                    interfaceC5279k2.g(nVar);
                    J j11 = J.f24997a;
                }
            }
        }
        if (listM0 != null) {
            int size2 = listM0.size();
            for (int i20 = 0; i20 < size2; i20++) {
                i11.x((InterfaceC5279k) listM0.get(i20));
            }
            List list = this.f28620k;
            if (list != null) {
                listM0 = AbstractC3689v.M0(list, listM0);
            }
            this.f28620k = listM0;
        }
        return h.b.f28639a;
    }

    public final void J(int i10) {
        synchronized (j.I()) {
            this.f28621l = this.f28621l.v(i10);
            J j10 = J.f24997a;
        }
    }

    public final void K(i iVar) {
        synchronized (j.I()) {
            this.f28621l = this.f28621l.u(iVar);
            J j10 = J.f24997a;
        }
    }

    public final void L(int i10) {
        if (i10 >= 0) {
            this.f28622m = AbstractC3682n.A(this.f28622m, i10);
        }
    }

    public final void M(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.f28622m;
        if (iArr2.length != 0) {
            iArr = AbstractC3682n.B(iArr2, iArr);
        }
        this.f28622m = iArr;
    }

    public final void O(boolean z10) {
        this.f28624o = z10;
    }

    public void P(I i10) {
        this.f28619j = i10;
    }

    public b Q(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        c cVar;
        z();
        S();
        J(f());
        synchronized (j.I()) {
            int i10 = j.f28656e;
            j.f28656e = i10 + 1;
            j.f28655d = j.f28655d.v(i10);
            i iVarG = g();
            v(iVarG.v(i10));
            cVar = new c(i10, j.z(iVarG, f() + 1, i10), j.L(interfaceC6835l, h(), false, 4, null), j.M(interfaceC6835l2, k()), this);
        }
        if (!D() && !e()) {
            int iF = f();
            synchronized (j.I()) {
                int i11 = j.f28656e;
                j.f28656e = i11 + 1;
                u(i11);
                j.f28655d = j.f28655d.v(f());
                J j10 = J.f24997a;
            }
            v(j.z(g(), iF + 1, f()));
        }
        return cVar;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void c() {
        j.f28655d = j.f28655d.k(f()).j(this.f28621l);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        n(this);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public boolean i() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public int j() {
        return this.f28618i;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public InterfaceC6835l k() {
        return this.f28617h;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void m(g gVar) {
        this.f28623n++;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void n(g gVar) {
        if (!(this.f28623n > 0)) {
            B0.a("no pending nested snapshots");
        }
        int i10 = this.f28623n - 1;
        this.f28623n = i10;
        if (i10 != 0 || this.f28624o) {
            return;
        }
        A();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void o() {
        if (this.f28624o || e()) {
            return;
        }
        B();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void p(InterfaceC5279k interfaceC5279k) {
        I iE = E();
        if (iE == null) {
            iE = U.a();
            P(iE);
        }
        iE.h(interfaceC5279k);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void r() {
        N();
        super.r();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void w(int i10) {
        this.f28618i = i10;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public g x(InterfaceC6835l interfaceC6835l) {
        d dVar;
        z();
        S();
        int iF = f();
        J(f());
        synchronized (j.I()) {
            int i10 = j.f28656e;
            j.f28656e = i10 + 1;
            j.f28655d = j.f28655d.v(i10);
            dVar = new d(i10, j.z(g(), iF + 1, i10), j.L(interfaceC6835l, h(), false, 4, null), this);
        }
        if (!D() && !e()) {
            int iF2 = f();
            synchronized (j.I()) {
                int i11 = j.f28656e;
                j.f28656e = i11 + 1;
                u(i11);
                j.f28655d = j.f28655d.v(f());
                J j10 = J.f24997a;
            }
            v(j.z(g(), iF2 + 1, f()));
        }
        return dVar;
    }
}
