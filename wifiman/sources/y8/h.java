package y8;

import Bc.a;
import Te.B0;
import Te.H;
import Te.J;
import Te.M;
import V7.b;
import W7.f;
import Zg.AbstractC3689v;
import com.ubnt.usurvey.R;
import gc.EnumC5895b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.N;
import s9.d;

/* loaded from: classes3.dex */
public final class h extends f implements g {

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f66447d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f66448e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f66449f;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f66450a;

        /* renamed from: b, reason: collision with root package name */
        private final a.C0052a f66451b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f66452c;

        /* renamed from: d, reason: collision with root package name */
        private final a.C0052a f66453d;

        public a(boolean z10, a.C0052a sim0, boolean z11, a.C0052a sim1) {
            AbstractC6492s.i(sim0, "sim0");
            AbstractC6492s.i(sim1, "sim1");
            this.f66450a = z10;
            this.f66451b = sim0;
            this.f66452c = z11;
            this.f66453d = sim1;
        }

        public final boolean a() {
            return this.f66450a;
        }

        public final a.C0052a b() {
            return this.f66451b;
        }

        public final boolean c() {
            return this.f66452c;
        }

        public final a.C0052a d() {
            return this.f66453d;
        }

        public final a.C0052a e() {
            return this.f66451b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f66450a == aVar.f66450a && AbstractC6492s.d(this.f66451b, aVar.f66451b) && this.f66452c == aVar.f66452c && AbstractC6492s.d(this.f66453d, aVar.f66453d);
        }

        public final boolean f() {
            return this.f66450a;
        }

        public final a.C0052a g() {
            return this.f66453d;
        }

        public final boolean h() {
            return this.f66452c;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f66450a) * 31) + this.f66451b.hashCode()) * 31) + Boolean.hashCode(this.f66452c)) * 31) + this.f66453d.hashCode();
        }

        public String toString() {
            return "CellularChartData(sim0primary=" + this.f66450a + ", sim0=" + this.f66451b + ", sim1primary=" + this.f66452c + ", sim1=" + this.f66453d + ")";
        }
    }

    static final class b implements kg.h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f66454a = new b();

        b() {
        }

        @Override // kg.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a a(a.b sim0State, a.C0052a sim0, a.b sim1State, a.C0052a sim1) {
            AbstractC6492s.i(sim0State, "sim0State");
            AbstractC6492s.i(sim0, "sim0");
            AbstractC6492s.i(sim1State, "sim1State");
            AbstractC6492s.i(sim1, "sim1");
            return new a(sim0State instanceof a.b.AbstractC0054a.AbstractC0056b.C0057a, sim0, sim1State instanceof a.b.AbstractC0054a.AbstractC0056b.C0057a, sim1);
        }
    }

    static final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J apply(a aVar) {
            AbstractC6492s.i(aVar, "<destruct>");
            boolean zA = aVar.a();
            a.C0052a c0052aB = aVar.b();
            boolean zC = aVar.c();
            a.C0052a c0052aD = aVar.d();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(h.this.k(c0052aB, zA, c0052aD.a() == null));
            arrayList.addAll(h.this.k(c0052aD, zC, c0052aB.a() == null));
            EnumC5895b enumC5895b = EnumC5895b.SIGNAL;
            M m10 = ((c0052aB.d() instanceof b.c) || (c0052aB.d() instanceof b.d) || (c0052aD.d() instanceof b.c) || (c0052aD.d() instanceof b.d)) ? M.b.a.C0799b.f21722a : M.b.a.C0798a.f21721a;
            return new J(enumC5895b, arrayList, m10, h.this.e(), AbstractC3689v.l(), AbstractC3689v.l());
        }
    }

    static final class d implements kg.n {
        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(a data) {
            AbstractC6492s.i(data, "data");
            h hVar = h.this;
            List listC = AbstractC3689v.c();
            if (data.e().a() != null) {
                listC.add(hVar.n(0, data.e(), data.f(), data.g()));
            }
            if (data.g().a() != null) {
                listC.add(hVar.n(1, data.g(), data.h(), data.e()));
            }
            return AbstractC3689v.a(listC);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Bc.a cellularService) {
        super(null);
        AbstractC6492s.i(cellularService, "cellularService");
        gg.i iVarT = gg.i.t(cellularService.e(), cellularService.b(), cellularService.d(), cellularService.c(), b.f66454a);
        AbstractC6492s.h(iVarT, "combineLatest(...)");
        gg.i iVarI2 = g(iVarT).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f66447d = iVarI2;
        gg.i iVarE1 = iVarI2.N0(new c()).e1();
        AbstractC6492s.h(iVarE1, "onBackpressureLatest(...)");
        this.f66448e = iVarE1;
        gg.i iVarI22 = iVarI2.N0(new d()).W().o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f66449f = iVarI22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List k(Bc.a.C0052a r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.h.k(Bc.a$a, boolean, boolean):java.util.List");
    }

    private static final void l(List list, boolean z10, N n10, h hVar, boolean z11) {
        Object aVar;
        if (z10) {
            Object obj = n10.f51689a;
            AbstractC6492s.f(obj);
            aVar = new H.b((List) obj);
        } else {
            Te.N nM = hVar.m(z11);
            Object obj2 = n10.f51689a;
            AbstractC6492s.f(obj2);
            aVar = new H.a(nM, (List) obj2);
        }
        list.add(aVar);
        n10.f51689a = null;
    }

    private final Te.N m(boolean z10) {
        return z10 ? Te.N.PRIMARY : Te.N.COMPARE_1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B0 n(int i10, a.C0052a c0052a, boolean z10, a.C0052a c0052a2) {
        s9.d bVar;
        s9.d cVar;
        s9.d dVar;
        s9.d bVar2;
        f.a aVarH;
        W7.e eVarB;
        s9.d dVarD = null;
        boolean z11 = (c0052a2 != null ? c0052a2.a() : null) == null;
        String str = "simStats" + i10;
        Te.N nM = !z11 ? m(z10) : null;
        if (z11) {
            String strC = c0052a.c();
            if (strC != null) {
                bVar = new d.c(strC);
                dVar = bVar;
            } else {
                cVar = new d.b(R.string.sim_card);
                dVar = cVar;
            }
        } else {
            String strC2 = c0052a.c();
            if (strC2 != null) {
                cVar = new d.c(strC2);
                dVar = cVar;
            } else {
                bVar = new d.b(R.string.sim_card_num_format, AbstractC3689v.e(Integer.valueOf(i10 + 1)));
                dVar = bVar;
            }
        }
        V7.b bVarD = c0052a.d();
        d.b bVar3 = bVarD != null ? new d.b(Ne.a.a(bVarD)) : null;
        V7.a aVarA = c0052a.a();
        if (aVarA == null || (bVar2 = Ne.f.h(aVarA, true, null, 2, null)) == null) {
            bVar2 = new d.b(R.string.signal_unavailable);
        }
        s9.d dVar2 = bVar2;
        boolean z12 = c0052a.a() == null;
        V7.a aVarA2 = c0052a.a();
        if (aVarA2 != null && (aVarH = aVarA2.h()) != null && (eVarB = Ne.f.b(aVarH)) != null) {
            dVarD = Ne.e.d(eVarB, false);
        }
        return new B0(str, nM, null, dVar, true, null, bVar3, dVar2, z12, dVarD, 32, null);
    }

    @Override // y8.c
    public gg.i a() {
        return this.f66449f;
    }

    @Override // y8.c
    public gg.i b() {
        return this.f66448e;
    }
}
