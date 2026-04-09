package J0;

import C0.AbstractC2538s;
import E0.AbstractC2624c0;
import E0.AbstractC2633k;
import E0.G;
import E0.InterfaceC2632j;
import E0.e0;
import E0.v0;
import E0.w0;
import Yg.J;
import Zg.AbstractC3689v;
import androidx.compose.ui.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import l0.C6533i;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final e.c f9650a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9651b;

    /* renamed from: c, reason: collision with root package name */
    private final G f9652c;

    /* renamed from: d, reason: collision with root package name */
    private final j f9653d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9654e;

    /* renamed from: f, reason: collision with root package name */
    private n f9655f;

    /* renamed from: g, reason: collision with root package name */
    private final int f9656g;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f9657a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(1);
            this.f9657a = gVar;
        }

        public final void a(w wVar) {
            t.i0(wVar, this.f9657a.n());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((w) obj);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9658a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f9658a = str;
        }

        public final void a(w wVar) {
            t.a0(wVar, this.f9658a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((w) obj);
            return J.f24997a;
        }
    }

    public static final class c extends e.c implements v0 {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f9659n;

        c(InterfaceC6835l interfaceC6835l) {
            this.f9659n = interfaceC6835l;
        }

        @Override // E0.v0
        public void q(w wVar) {
            this.f9659n.invoke(wVar);
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final d f9660a = new d();

        d() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(G g10) {
            j jVarI = g10.I();
            boolean z10 = false;
            if (jVarI != null && jVarI.u()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final e f9661a = new e();

        e() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(G g10) {
            j jVarI = g10.I();
            boolean z10 = false;
            if (jVarI != null && jVarI.u()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final f f9662a = new f();

        f() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(G g10) {
            return Boolean.valueOf(g10.k0().q(e0.a(8)));
        }
    }

    public n(e.c cVar, boolean z10, G g10, j jVar) {
        this.f9650a = cVar;
        this.f9651b = z10;
        this.f9652c = g10;
        this.f9653d = jVar;
        this.f9656g = g10.q0();
    }

    private final void B(j jVar) {
        if (this.f9653d.s()) {
            return;
        }
        List listD = D(this, false, false, 3, null);
        int size = listD.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) listD.get(i10);
            if (!nVar.y()) {
                jVar.v(nVar.f9653d);
                nVar.B(jVar);
            }
        }
    }

    public static /* synthetic */ List D(n nVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return nVar.C(z10, z11);
    }

    private final void b(List list) {
        g gVarH = o.h(this);
        if (gVarH != null && this.f9653d.u() && !list.isEmpty()) {
            list.add(c(gVarH, new a(gVarH)));
        }
        j jVar = this.f9653d;
        q qVar = q.f9676a;
        if (jVar.f(qVar.d()) && !list.isEmpty() && this.f9653d.u()) {
            List list2 = (List) k.a(this.f9653d, qVar.d());
            String str = list2 != null ? (String) AbstractC3689v.s0(list2) : null;
            if (str != null) {
                list.add(0, c(null, new b(str)));
            }
        }
    }

    private final n c(g gVar, InterfaceC6835l interfaceC6835l) {
        j jVar = new j();
        jVar.x(false);
        jVar.w(false);
        interfaceC6835l.invoke(jVar);
        n nVar = new n(new c(interfaceC6835l), false, new G(true, gVar != null ? o.i(this) : o.e(this)), jVar);
        nVar.f9654e = true;
        nVar.f9655f = this;
        return nVar;
    }

    private final void d(G g10, List list, boolean z10) {
        V.b bVarV0 = g10.v0();
        int iO = bVarV0.o();
        if (iO > 0) {
            Object[] objArrM = bVarV0.m();
            int i10 = 0;
            do {
                G g11 = (G) objArrM[i10];
                if (g11.K0() && (z10 || !g11.L0())) {
                    if (g11.k0().q(e0.a(8))) {
                        list.add(o.a(g11, this.f9651b));
                    } else {
                        d(g11, list, z10);
                    }
                }
                i10++;
            } while (i10 < iO);
        }
    }

    private final List f(List list) {
        List listD = D(this, false, false, 3, null);
        int size = listD.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) listD.get(i10);
            if (nVar.y()) {
                list.add(nVar);
            } else if (!nVar.f9653d.s()) {
                nVar.f(list);
            }
        }
        return list;
    }

    static /* synthetic */ List g(n nVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return nVar.f(list);
    }

    public static /* synthetic */ List m(n nVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !nVar.f9651b;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        return nVar.l(z10, z11, z12);
    }

    private final boolean y() {
        return this.f9651b && this.f9653d.u();
    }

    public final boolean A() {
        return !this.f9654e && t().isEmpty() && o.f(this.f9652c, d.f9660a) == null;
    }

    public final List C(boolean z10, boolean z11) {
        if (this.f9654e) {
            return AbstractC3689v.l();
        }
        ArrayList arrayList = new ArrayList();
        d(this.f9652c, arrayList, z11);
        if (z10) {
            b(arrayList);
        }
        return arrayList;
    }

    public final n a() {
        return new n(this.f9650a, true, this.f9652c, this.f9653d);
    }

    public final AbstractC2624c0 e() {
        if (this.f9654e) {
            n nVarR = r();
            if (nVarR != null) {
                return nVarR.e();
            }
            return null;
        }
        InterfaceC2632j interfaceC2632jG = o.g(this.f9652c);
        if (interfaceC2632jG == null) {
            interfaceC2632jG = this.f9650a;
        }
        return AbstractC2633k.h(interfaceC2632jG, e0.a(8));
    }

    public final C6533i h() {
        C0.r rVarC1;
        n nVarR = r();
        if (nVarR == null) {
            return C6533i.f52340e.a();
        }
        AbstractC2624c0 abstractC2624c0E = e();
        if (abstractC2624c0E != null) {
            if (!abstractC2624c0E.M()) {
                abstractC2624c0E = null;
            }
            if (abstractC2624c0E != null && (rVarC1 = abstractC2624c0E.c1()) != null) {
                return C0.r.c0(AbstractC2633k.h(nVarR.f9650a, e0.a(8)), rVarC1, false, 2, null);
            }
        }
        return C6533i.f52340e.a();
    }

    public final C6533i i() {
        C6533i c6533iB;
        AbstractC2624c0 abstractC2624c0E = e();
        if (abstractC2624c0E != null) {
            if (!abstractC2624c0E.M()) {
                abstractC2624c0E = null;
            }
            if (abstractC2624c0E != null && (c6533iB = AbstractC2538s.b(abstractC2624c0E)) != null) {
                return c6533iB;
            }
        }
        return C6533i.f52340e.a();
    }

    public final C6533i j() {
        C6533i c6533iC;
        AbstractC2624c0 abstractC2624c0E = e();
        if (abstractC2624c0E != null) {
            if (!abstractC2624c0E.M()) {
                abstractC2624c0E = null;
            }
            if (abstractC2624c0E != null && (c6533iC = AbstractC2538s.c(abstractC2624c0E)) != null) {
                return c6533iC;
            }
        }
        return C6533i.f52340e.a();
    }

    public final List k() {
        return m(this, false, false, false, 7, null);
    }

    public final List l(boolean z10, boolean z11, boolean z12) {
        return (z10 || !this.f9653d.s()) ? y() ? g(this, null, 1, null) : C(z11, z12) : AbstractC3689v.l();
    }

    public final j n() {
        if (!y()) {
            return this.f9653d;
        }
        j jVarI = this.f9653d.i();
        B(jVarI);
        return jVarI;
    }

    public final int o() {
        return this.f9656g;
    }

    public final C0.v p() {
        return this.f9652c;
    }

    public final G q() {
        return this.f9652c;
    }

    public final n r() {
        n nVar = this.f9655f;
        if (nVar != null) {
            return nVar;
        }
        G gF = this.f9651b ? o.f(this.f9652c, e.f9661a) : null;
        if (gF == null) {
            gF = o.f(this.f9652c, f.f9662a);
        }
        if (gF == null) {
            return null;
        }
        return o.a(gF, this.f9651b);
    }

    public final long s() {
        AbstractC2624c0 abstractC2624c0E = e();
        if (abstractC2624c0E != null) {
            if (!abstractC2624c0E.M()) {
                abstractC2624c0E = null;
            }
            if (abstractC2624c0E != null) {
                return AbstractC2538s.e(abstractC2624c0E);
            }
        }
        return C6531g.f52335b.c();
    }

    public final List t() {
        return m(this, false, true, false, 4, null);
    }

    public final long u() {
        AbstractC2624c0 abstractC2624c0E = e();
        return abstractC2624c0E != null ? abstractC2624c0E.h() : Y0.r.f24545b.a();
    }

    public final C6533i v() {
        InterfaceC2632j interfaceC2632jG;
        if (!this.f9653d.u() || (interfaceC2632jG = o.g(this.f9652c)) == null) {
            interfaceC2632jG = this.f9650a;
        }
        return w0.c(interfaceC2632jG.h1(), w0.a(this.f9653d));
    }

    public final j w() {
        return this.f9653d;
    }

    public final boolean x() {
        return this.f9654e;
    }

    public final boolean z() {
        AbstractC2624c0 abstractC2624c0E = e();
        if (abstractC2624c0E != null) {
            return abstractC2624c0E.T2();
        }
        return false;
    }
}
