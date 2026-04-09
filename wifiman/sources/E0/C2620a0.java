package E0;

import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: E0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2620a0 {

    /* renamed from: a, reason: collision with root package name */
    private final G f3824a;

    /* renamed from: b, reason: collision with root package name */
    private final C2644w f3825b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC2624c0 f3826c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c f3827d;

    /* renamed from: e, reason: collision with root package name */
    private e.c f3828e;

    /* renamed from: f, reason: collision with root package name */
    private V.b f3829f;

    /* renamed from: g, reason: collision with root package name */
    private V.b f3830g;

    /* renamed from: h, reason: collision with root package name */
    private a f3831h;

    /* renamed from: E0.a0$a */
    private final class a implements InterfaceC2638p {

        /* renamed from: a, reason: collision with root package name */
        private e.c f3832a;

        /* renamed from: b, reason: collision with root package name */
        private int f3833b;

        /* renamed from: c, reason: collision with root package name */
        private V.b f3834c;

        /* renamed from: d, reason: collision with root package name */
        private V.b f3835d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3836e;

        public a(e.c cVar, int i10, V.b bVar, V.b bVar2, boolean z10) {
            this.f3832a = cVar;
            this.f3833b = i10;
            this.f3834c = bVar;
            this.f3835d = bVar2;
            this.f3836e = z10;
        }

        @Override // E0.InterfaceC2638p
        public void a(int i10, int i11) {
            e.c cVarB2 = this.f3832a.b2();
            AbstractC6492s.f(cVarB2);
            C2620a0.d(C2620a0.this);
            if ((e0.a(2) & cVarB2.f2()) != 0) {
                AbstractC2624c0 abstractC2624c0C2 = cVarB2.c2();
                AbstractC6492s.f(abstractC2624c0C2);
                AbstractC2624c0 abstractC2624c0I2 = abstractC2624c0C2.I2();
                AbstractC2624c0 abstractC2624c0H2 = abstractC2624c0C2.H2();
                AbstractC6492s.f(abstractC2624c0H2);
                if (abstractC2624c0I2 != null) {
                    abstractC2624c0I2.m3(abstractC2624c0H2);
                }
                abstractC2624c0H2.n3(abstractC2624c0I2);
                C2620a0.this.v(this.f3832a, abstractC2624c0H2);
            }
            this.f3832a = C2620a0.this.h(cVarB2);
        }

        @Override // E0.InterfaceC2638p
        public boolean b(int i10, int i11) {
            return AbstractC2622b0.d((e.b) this.f3834c.m()[this.f3833b + i10], (e.b) this.f3835d.m()[this.f3833b + i11]) != 0;
        }

        @Override // E0.InterfaceC2638p
        public void c(int i10, int i11) {
            e.c cVarB2 = this.f3832a.b2();
            AbstractC6492s.f(cVarB2);
            this.f3832a = cVarB2;
            V.b bVar = this.f3834c;
            e.b bVar2 = (e.b) bVar.m()[this.f3833b + i10];
            V.b bVar3 = this.f3835d;
            e.b bVar4 = (e.b) bVar3.m()[this.f3833b + i11];
            if (AbstractC6492s.d(bVar2, bVar4)) {
                C2620a0.d(C2620a0.this);
            } else {
                C2620a0.this.F(bVar2, bVar4, this.f3832a);
                C2620a0.d(C2620a0.this);
            }
        }

        @Override // E0.InterfaceC2638p
        public void d(int i10) {
            int i11 = this.f3833b + i10;
            this.f3832a = C2620a0.this.g((e.b) this.f3835d.m()[i11], this.f3832a);
            C2620a0.d(C2620a0.this);
            if (!this.f3836e) {
                this.f3832a.w2(true);
                return;
            }
            e.c cVarB2 = this.f3832a.b2();
            AbstractC6492s.f(cVarB2);
            AbstractC2624c0 abstractC2624c0C2 = cVarB2.c2();
            AbstractC6492s.f(abstractC2624c0C2);
            B bD = AbstractC2633k.d(this.f3832a);
            if (bD != null) {
                C c10 = new C(C2620a0.this.m(), bD);
                this.f3832a.C2(c10);
                C2620a0.this.v(this.f3832a, c10);
                c10.n3(abstractC2624c0C2.I2());
                c10.m3(abstractC2624c0C2);
                abstractC2624c0C2.n3(c10);
            } else {
                this.f3832a.C2(abstractC2624c0C2);
            }
            this.f3832a.l2();
            this.f3832a.r2();
            f0.a(this.f3832a);
        }

        public final void e(V.b bVar) {
            this.f3835d = bVar;
        }

        public final void f(V.b bVar) {
            this.f3834c = bVar;
        }

        public final void g(e.c cVar) {
            this.f3832a = cVar;
        }

        public final void h(int i10) {
            this.f3833b = i10;
        }

        public final void i(boolean z10) {
            this.f3836e = z10;
        }
    }

    /* renamed from: E0.a0$b */
    public interface b {
    }

    public C2620a0(G g10) {
        this.f3824a = g10;
        C2644w c2644w = new C2644w(g10);
        this.f3825b = c2644w;
        this.f3826c = c2644w;
        y0 y0VarB3 = c2644w.G2();
        this.f3827d = y0VarB3;
        this.f3828e = y0VarB3;
    }

    private final void A(int i10, V.b bVar, V.b bVar2, e.c cVar, boolean z10) {
        Y.e(bVar.o() - i10, bVar2.o() - i10, j(cVar, i10, bVar, bVar2, z10));
        B();
    }

    private final void B() {
        int iF2 = 0;
        for (e.c cVarH2 = this.f3827d.h2(); cVarH2 != null && cVarH2 != AbstractC2622b0.f3838a; cVarH2 = cVarH2.h2()) {
            iF2 |= cVarH2.f2();
            cVarH2.t2(iF2);
        }
    }

    private final e.c D(e.c cVar) {
        if (!(cVar == AbstractC2622b0.f3838a)) {
            B0.a.b("trimChain called on already trimmed chain");
        }
        e.c cVarB2 = AbstractC2622b0.f3838a.b2();
        if (cVarB2 == null) {
            cVarB2 = this.f3827d;
        }
        cVarB2.z2(null);
        AbstractC2622b0.f3838a.v2(null);
        AbstractC2622b0.f3838a.t2(-1);
        AbstractC2622b0.f3838a.C2(null);
        if (!(cVarB2 != AbstractC2622b0.f3838a)) {
            B0.a.b("trimChain did not update the head");
        }
        return cVarB2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(e.b bVar, e.b bVar2, e.c cVar) {
        if ((bVar instanceof V) && (bVar2 instanceof V)) {
            AbstractC2622b0.f((V) bVar2, cVar);
            if (cVar.k2()) {
                f0.e(cVar);
                return;
            } else {
                cVar.A2(true);
                return;
            }
        }
        if (!(cVar instanceof C2623c)) {
            throw new IllegalStateException("Unknown Modifier.Node type");
        }
        ((C2623c) cVar).H2(bVar2);
        if (cVar.k2()) {
            f0.e(cVar);
        } else {
            cVar.A2(true);
        }
    }

    public static final /* synthetic */ b d(C2620a0 c2620a0) {
        c2620a0.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.c g(e.b bVar, e.c cVar) {
        e.c c2623c;
        if (bVar instanceof V) {
            c2623c = ((V) bVar).a();
            c2623c.x2(f0.h(c2623c));
        } else {
            c2623c = new C2623c(bVar);
        }
        if (c2623c.k2()) {
            B0.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        c2623c.w2(true);
        return r(c2623c, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.c h(e.c cVar) {
        if (cVar.k2()) {
            f0.d(cVar);
            cVar.s2();
            cVar.m2();
        }
        return w(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i() {
        return this.f3828e.a2();
    }

    private final a j(e.c cVar, int i10, V.b bVar, V.b bVar2, boolean z10) {
        a aVar = this.f3831h;
        if (aVar == null) {
            a aVar2 = new a(cVar, i10, bVar, bVar2, z10);
            this.f3831h = aVar2;
            return aVar2;
        }
        aVar.g(cVar);
        aVar.h(i10);
        aVar.f(bVar);
        aVar.e(bVar2);
        aVar.i(z10);
        return aVar;
    }

    private final e.c r(e.c cVar, e.c cVar2) {
        e.c cVarB2 = cVar2.b2();
        if (cVarB2 != null) {
            cVarB2.z2(cVar);
            cVar.v2(cVarB2);
        }
        cVar2.v2(cVar);
        cVar.z2(cVar2);
        return cVar;
    }

    private final e.c u() {
        if (!(this.f3828e != AbstractC2622b0.f3838a)) {
            B0.a.b("padChain called on already padded chain");
        }
        e.c cVar = this.f3828e;
        cVar.z2(AbstractC2622b0.f3838a);
        AbstractC2622b0.f3838a.v2(cVar);
        return AbstractC2622b0.f3838a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(e.c cVar, AbstractC2624c0 abstractC2624c0) {
        for (e.c cVarH2 = cVar.h2(); cVarH2 != null; cVarH2 = cVarH2.h2()) {
            if (cVarH2 == AbstractC2622b0.f3838a) {
                G gO0 = this.f3824a.o0();
                abstractC2624c0.n3(gO0 != null ? gO0.P() : null);
                this.f3826c = abstractC2624c0;
                return;
            } else {
                if ((e0.a(2) & cVarH2.f2()) != 0) {
                    return;
                }
                cVarH2.C2(abstractC2624c0);
            }
        }
    }

    private final e.c w(e.c cVar) {
        e.c cVarB2 = cVar.b2();
        e.c cVarH2 = cVar.h2();
        if (cVarB2 != null) {
            cVarB2.z2(cVarH2);
            cVar.v2(null);
        }
        if (cVarH2 != null) {
            cVarH2.v2(cVarB2);
            cVar.z2(null);
        }
        AbstractC6492s.f(cVarH2);
        return cVarH2;
    }

    public final void C() {
        AbstractC2624c0 c10;
        AbstractC2624c0 abstractC2624c0 = this.f3825b;
        for (e.c cVarH2 = this.f3827d.h2(); cVarH2 != null; cVarH2 = cVarH2.h2()) {
            B bD = AbstractC2633k.d(cVarH2);
            if (bD != null) {
                if (cVarH2.c2() != null) {
                    AbstractC2624c0 abstractC2624c0C2 = cVarH2.c2();
                    AbstractC6492s.g(abstractC2624c0C2, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    c10 = (C) abstractC2624c0C2;
                    B bC3 = c10.C3();
                    c10.G3(bD);
                    if (bC3 != cVarH2) {
                        c10.W2();
                    }
                } else {
                    c10 = new C(this.f3824a, bD);
                    cVarH2.C2(c10);
                }
                abstractC2624c0.n3(c10);
                c10.m3(abstractC2624c0);
                abstractC2624c0 = c10;
            } else {
                cVarH2.C2(abstractC2624c0);
            }
        }
        G gO0 = this.f3824a.o0();
        abstractC2624c0.n3(gO0 != null ? gO0.P() : null);
        this.f3826c = abstractC2624c0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r2 >= r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r7 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (r5 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        A(r2, r7, r13, r5, !r12.f3824a.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        B0.a.c("structuralUpdate requires a non-null tail");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        B0.a.c("expected prior modifier list to be non-empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(androidx.compose.ui.e r13) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.C2620a0.E(androidx.compose.ui.e):void");
    }

    public final e.c k() {
        return this.f3828e;
    }

    public final C2644w l() {
        return this.f3825b;
    }

    public final G m() {
        return this.f3824a;
    }

    public final AbstractC2624c0 n() {
        return this.f3826c;
    }

    public final e.c o() {
        return this.f3827d;
    }

    public final boolean p(int i10) {
        return (i10 & i()) != 0;
    }

    public final boolean q(int i10) {
        return (i10 & i()) != 0;
    }

    public final void s() {
        for (e.c cVarK = k(); cVarK != null; cVarK = cVarK.b2()) {
            cVarK.l2();
        }
    }

    public final void t() {
        for (e.c cVarO = o(); cVarO != null; cVarO = cVarO.h2()) {
            if (cVarO.k2()) {
                cVarO.m2();
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        if (this.f3828e == this.f3827d) {
            sb2.append("]");
        } else {
            e.c cVarK = k();
            while (true) {
                if (cVarK == null || cVarK == o()) {
                    break;
                }
                sb2.append(String.valueOf(cVarK));
                if (cVarK.b2() == this.f3827d) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                cVarK = cVarK.b2();
            }
        }
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void x() {
        for (e.c cVarO = o(); cVarO != null; cVarO = cVarO.h2()) {
            if (cVarO.k2()) {
                cVarO.q2();
            }
        }
        z();
        t();
    }

    public final void y() {
        for (e.c cVarK = k(); cVarK != null; cVarK = cVarK.b2()) {
            cVarK.r2();
            if (cVarK.e2()) {
                f0.a(cVarK);
            }
            if (cVarK.j2()) {
                f0.e(cVarK);
            }
            cVarK.w2(false);
            cVarK.A2(false);
        }
    }

    public final void z() {
        for (e.c cVarO = o(); cVarO != null; cVarO = cVarO.h2()) {
            if (cVarO.k2()) {
                cVarO.s2();
            }
        }
    }
}
