package L0;

import L0.S;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;
import l0.C6533i;
import m0.AbstractC6688Y;
import m0.AbstractC6713l0;
import m0.InterfaceC6717n0;
import m0.U0;
import m0.g1;
import mh.InterfaceC6835l;
import o0.AbstractC7040g;
import sh.AbstractC7978m;

/* renamed from: L0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3181k {

    /* renamed from: a, reason: collision with root package name */
    private final C3182l f11153a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11154b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11155c;

    /* renamed from: d, reason: collision with root package name */
    private final float f11156d;

    /* renamed from: e, reason: collision with root package name */
    private final float f11157e;

    /* renamed from: f, reason: collision with root package name */
    private final int f11158f;

    /* renamed from: g, reason: collision with root package name */
    private final List f11159g;

    /* renamed from: h, reason: collision with root package name */
    private final List f11160h;

    /* renamed from: L0.k$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f11161a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float[] f11162b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.L f11163c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f11164d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, float[] fArr, kotlin.jvm.internal.L l10, kotlin.jvm.internal.K k10) {
            super(1);
            this.f11161a = j10;
            this.f11162b = fArr;
            this.f11163c = l10;
            this.f11164d = k10;
        }

        public final void a(C3187q c3187q) {
            long j10 = this.f11161a;
            float[] fArr = this.f11162b;
            kotlin.jvm.internal.L l10 = this.f11163c;
            kotlin.jvm.internal.K k10 = this.f11164d;
            long jB = T.b(c3187q.r(c3187q.f() > S.l(j10) ? c3187q.f() : S.l(j10)), c3187q.r(c3187q.b() < S.k(j10) ? c3187q.b() : S.k(j10)));
            c3187q.e().c(jB, fArr, l10.f51687a);
            int iJ = l10.f51687a + (S.j(jB) * 4);
            for (int i10 = l10.f51687a; i10 < iJ; i10 += 4) {
                int i11 = i10 + 1;
                float f10 = fArr[i11];
                float f11 = k10.f51686a;
                fArr[i11] = f10 + f11;
                int i12 = i10 + 3;
                fArr[i12] = fArr[i12] + f11;
            }
            l10.f51687a = iJ;
            k10.f51686a += c3187q.e().getHeight();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3187q) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: L0.k$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ U0 f11165a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11166b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11167c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(U0 u02, int i10, int i11) {
            super(1);
            this.f11165a = u02;
            this.f11166b = i10;
            this.f11167c = i11;
        }

        public final void a(C3187q c3187q) {
            U0.d(this.f11165a, c3187q.j(c3187q.e().A(c3187q.r(this.f11166b), c3187q.r(this.f11167c))), 0L, 2, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3187q) obj);
            return Yg.J.f24997a;
        }
    }

    public /* synthetic */ C3181k(C3182l c3182l, long j10, int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3182l, j10, i10, z10);
    }

    private final void G(int i10) {
        if (i10 < 0 || i10 >= b().k().length()) {
            throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + b().length() + ')').toString());
        }
    }

    private final void H(int i10) {
        if (i10 < 0 || i10 > b().k().length()) {
            throw new IllegalArgumentException(("offset(" + i10 + ") is out of bounds [0, " + b().length() + ']').toString());
        }
    }

    private final void I(int i10) {
        if (i10 < 0 || i10 >= this.f11158f) {
            throw new IllegalArgumentException(("lineIndex(" + i10 + ") is out of bounds [0, " + this.f11158f + ')').toString());
        }
    }

    private final C3174d b() {
        return this.f11153a.e();
    }

    public final float A() {
        return this.f11156d;
    }

    public final long B(int i10) {
        H(i10);
        C3187q c3187q = (C3187q) this.f11160h.get(i10 == b().length() ? AbstractC3689v.n(this.f11160h) : AbstractC3184n.a(this.f11160h, i10));
        return c3187q.k(c3187q.e().i(c3187q.r(i10)), false);
    }

    public final void C(InterfaceC6717n0 interfaceC6717n0, long j10, g1 g1Var, W0.k kVar, AbstractC7040g abstractC7040g, int i10) {
        interfaceC6717n0.j();
        List list = this.f11160h;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3187q c3187q = (C3187q) list.get(i11);
            c3187q.e().v(interfaceC6717n0, j10, g1Var, kVar, abstractC7040g, i10);
            interfaceC6717n0.c(0.0f, c3187q.e().getHeight());
        }
        interfaceC6717n0.r();
    }

    public final void E(InterfaceC6717n0 interfaceC6717n0, AbstractC6713l0 abstractC6713l0, float f10, g1 g1Var, W0.k kVar, AbstractC7040g abstractC7040g, int i10) {
        T0.b.a(this, interfaceC6717n0, abstractC6713l0, f10, g1Var, kVar, abstractC7040g, i10);
    }

    public final float[] a(long j10, float[] fArr, int i10) {
        G(S.l(j10));
        H(S.k(j10));
        kotlin.jvm.internal.L l10 = new kotlin.jvm.internal.L();
        l10.f51687a = i10;
        AbstractC3184n.d(this.f11160h, j10, new a(j10, fArr, l10, new kotlin.jvm.internal.K()));
        return fArr;
    }

    public final W0.i c(int i10) {
        H(i10);
        C3187q c3187q = (C3187q) this.f11160h.get(i10 == b().length() ? AbstractC3689v.n(this.f11160h) : AbstractC3184n.a(this.f11160h, i10));
        return c3187q.e().l(c3187q.r(i10));
    }

    public final C6533i d(int i10) {
        G(i10);
        C3187q c3187q = (C3187q) this.f11160h.get(AbstractC3184n.a(this.f11160h, i10));
        return c3187q.i(c3187q.e().p(c3187q.r(i10)));
    }

    public final C6533i e(int i10) {
        H(i10);
        C3187q c3187q = (C3187q) this.f11160h.get(i10 == b().length() ? AbstractC3689v.n(this.f11160h) : AbstractC3184n.a(this.f11160h, i10));
        return c3187q.i(c3187q.e().h(c3187q.r(i10)));
    }

    public final boolean f() {
        return this.f11155c;
    }

    public final float g() {
        if (this.f11160h.isEmpty()) {
            return 0.0f;
        }
        return ((C3187q) this.f11160h.get(0)).e().k();
    }

    public final float h() {
        return this.f11157e;
    }

    public final float i(int i10, boolean z10) {
        H(i10);
        C3187q c3187q = (C3187q) this.f11160h.get(i10 == b().length() ? AbstractC3689v.n(this.f11160h) : AbstractC3184n.a(this.f11160h, i10));
        return c3187q.e().B(c3187q.r(i10), z10);
    }

    public final C3182l j() {
        return this.f11153a;
    }

    public final float k() {
        if (this.f11160h.isEmpty()) {
            return 0.0f;
        }
        C3187q c3187q = (C3187q) AbstractC3689v.B0(this.f11160h);
        return c3187q.o(c3187q.e().g());
    }

    public final float l(int i10) {
        I(i10);
        C3187q c3187q = (C3187q) this.f11160h.get(AbstractC3184n.b(this.f11160h, i10));
        return c3187q.o(c3187q.e().m(c3187q.s(i10)));
    }

    public final int m() {
        return this.f11158f;
    }

    public final int n(int i10, boolean z10) {
        I(i10);
        C3187q c3187q = (C3187q) this.f11160h.get(AbstractC3184n.b(this.f11160h, i10));
        return c3187q.m(c3187q.e().s(c3187q.s(i10), z10));
    }

    public final int o(int i10) {
        C3187q c3187q = (C3187q) this.f11160h.get(i10 >= b().length() ? AbstractC3689v.n(this.f11160h) : i10 < 0 ? 0 : AbstractC3184n.a(this.f11160h, i10));
        return c3187q.n(c3187q.e().j(c3187q.r(i10)));
    }

    public final int p(float f10) {
        C3187q c3187q = (C3187q) this.f11160h.get(AbstractC3184n.c(this.f11160h, f10));
        return c3187q.d() == 0 ? c3187q.g() : c3187q.n(c3187q.e().z(c3187q.t(f10)));
    }

    public final float q(int i10) {
        I(i10);
        C3187q c3187q = (C3187q) this.f11160h.get(AbstractC3184n.b(this.f11160h, i10));
        return c3187q.e().C(c3187q.s(i10));
    }

    public final float r(int i10) {
        I(i10);
        C3187q c3187q = (C3187q) this.f11160h.get(AbstractC3184n.b(this.f11160h, i10));
        return c3187q.e().u(c3187q.s(i10));
    }

    public final int s(int i10) {
        I(i10);
        C3187q c3187q = (C3187q) this.f11160h.get(AbstractC3184n.b(this.f11160h, i10));
        return c3187q.m(c3187q.e().r(c3187q.s(i10)));
    }

    public final float t(int i10) {
        I(i10);
        C3187q c3187q = (C3187q) this.f11160h.get(AbstractC3184n.b(this.f11160h, i10));
        return c3187q.o(c3187q.e().f(c3187q.s(i10)));
    }

    public final int u(long j10) {
        C3187q c3187q = (C3187q) this.f11160h.get(AbstractC3184n.c(this.f11160h, C6531g.n(j10)));
        return c3187q.d() == 0 ? c3187q.f() : c3187q.m(c3187q.e().o(c3187q.q(j10)));
    }

    public final W0.i v(int i10) {
        H(i10);
        C3187q c3187q = (C3187q) this.f11160h.get(i10 == b().length() ? AbstractC3689v.n(this.f11160h) : AbstractC3184n.a(this.f11160h, i10));
        return c3187q.e().e(c3187q.r(i10));
    }

    public final List w() {
        return this.f11160h;
    }

    public final U0 x(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11 && i11 <= b().k().length()) {
            if (i10 == i11) {
                return AbstractC6688Y.a();
            }
            U0 u0A = AbstractC6688Y.a();
            AbstractC3184n.d(this.f11160h, T.b(i10, i11), new b(u0A, i10, i11));
            return u0A;
        }
        throw new IllegalArgumentException(("Start(" + i10 + ") or End(" + i11 + ") is out of range [0.." + b().k().length() + "), or start > end!").toString());
    }

    public final List y() {
        return this.f11159g;
    }

    public final long z(C6533i c6533i, int i10, J j10) {
        S.a aVar;
        S.a aVar2;
        int iC = AbstractC3184n.c(this.f11160h, c6533i.n());
        if (((C3187q) this.f11160h.get(iC)).a() >= c6533i.e() || iC == AbstractC3689v.n(this.f11160h)) {
            C3187q c3187q = (C3187q) this.f11160h.get(iC);
            return C3187q.l(c3187q, c3187q.e().n(c3187q.p(c6533i), i10, j10), false, 1, null);
        }
        int iC2 = AbstractC3184n.c(this.f11160h, c6533i.e());
        long jA = S.f11103b.a();
        while (true) {
            aVar = S.f11103b;
            if (!S.g(jA, aVar.a()) || iC > iC2) {
                break;
            }
            C3187q c3187q2 = (C3187q) this.f11160h.get(iC);
            jA = C3187q.l(c3187q2, c3187q2.e().n(c3187q2.p(c6533i), i10, j10), false, 1, null);
            iC++;
        }
        if (S.g(jA, aVar.a())) {
            return aVar.a();
        }
        long jA2 = aVar.a();
        while (true) {
            aVar2 = S.f11103b;
            if (!S.g(jA2, aVar2.a()) || iC > iC2) {
                break;
            }
            C3187q c3187q3 = (C3187q) this.f11160h.get(iC2);
            jA2 = C3187q.l(c3187q3, c3187q3.e().n(c3187q3.p(c6533i), i10, j10), false, 1, null);
            iC2--;
        }
        return S.g(jA2, aVar2.a()) ? jA : T.b(S.n(jA), S.i(jA2));
    }

    private C3181k(C3182l c3182l, long j10, int i10, boolean z10) {
        boolean z11;
        this.f11153a = c3182l;
        this.f11154b = i10;
        if (Y0.b.n(j10) != 0 || Y0.b.m(j10) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List listF = c3182l.f();
        int size = listF.size();
        int i11 = 0;
        int i12 = 0;
        float f10 = 0.0f;
        int i13 = 0;
        while (i13 < size) {
            r rVar = (r) listF.get(i13);
            InterfaceC3186p interfaceC3186pC = AbstractC3190u.c(rVar.b(), Y0.c.b(0, Y0.b.l(j10), 0, Y0.b.g(j10) ? AbstractC7978m.d(Y0.b.k(j10) - AbstractC3190u.d(f10), i11) : Y0.b.k(j10), 5, null), this.f11154b - i12, z10);
            float height = f10 + interfaceC3186pC.getHeight();
            int iT = i12 + interfaceC3186pC.t();
            List list = listF;
            arrayList.add(new C3187q(interfaceC3186pC, rVar.c(), rVar.a(), i12, iT, f10, height));
            if (interfaceC3186pC.x() || (iT == this.f11154b && i13 != AbstractC3689v.n(this.f11153a.f()))) {
                z11 = true;
                i12 = iT;
                f10 = height;
                break;
            } else {
                i13++;
                i12 = iT;
                f10 = height;
                i11 = 0;
                listF = list;
            }
        }
        z11 = false;
        this.f11157e = f10;
        this.f11158f = i12;
        this.f11155c = z11;
        this.f11160h = arrayList;
        this.f11156d = Y0.b.l(j10);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            C3187q c3187q = (C3187q) arrayList.get(i14);
            List listQ = c3187q.e().q();
            ArrayList arrayList3 = new ArrayList(listQ.size());
            int size3 = listQ.size();
            for (int i15 = 0; i15 < size3; i15++) {
                C6533i c6533i = (C6533i) listQ.get(i15);
                arrayList3.add(c6533i != null ? c3187q.i(c6533i) : null);
            }
            AbstractC3689v.C(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.f11153a.g().size()) {
            int size4 = this.f11153a.g().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(null);
            }
            arrayList2 = AbstractC3689v.M0(arrayList2, arrayList4);
        }
        this.f11159g = arrayList2;
    }
}
