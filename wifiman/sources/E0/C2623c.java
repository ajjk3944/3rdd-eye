package E0;

import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import androidx.compose.ui.e;
import f.AbstractC5487d;
import j0.InterfaceC6231b;
import j0.InterfaceC6236g;
import java.util.HashSet;
import k0.InterfaceC6354b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import o0.InterfaceC7036c;
import org.conscrypt.PSKKeyManager;
import y0.C8593n;
import y0.EnumC8595p;
import y0.InterfaceC8566F;

/* renamed from: E0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2623c extends e.c implements B, r, v0, s0, D0.h, D0.k, p0, A, InterfaceC2641t, InterfaceC6354b, k0.h, k0.k, n0, InterfaceC6231b {

    /* renamed from: n, reason: collision with root package name */
    private e.b f3840n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3841o;

    /* renamed from: p, reason: collision with root package name */
    private D0.a f3842p;

    /* renamed from: q, reason: collision with root package name */
    private HashSet f3843q;

    /* renamed from: r, reason: collision with root package name */
    private C0.r f3844r;

    /* renamed from: E0.c$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        public final void a() {
            C2623c.this.J2();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: E0.c$b */
    static final class b extends AbstractC6494u implements InterfaceC6824a {
        b() {
            super(0);
        }

        public final void a() {
            e.b bVarD2 = C2623c.this.D2();
            AbstractC6492s.g(bVarD2, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((D0.d) bVarD2).Z0(C2623c.this);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public C2623c(e.b bVar) {
        x2(f0.f(bVar));
        this.f3840n = bVar;
        this.f3841o = true;
        this.f3843q = new HashSet();
    }

    private final void F2(boolean z10) {
        if (!k2()) {
            B0.a.b("initializeModifier called on unattached node");
        }
        e.b bVar = this.f3840n;
        if ((e0.a(32) & f2()) != 0) {
            if (bVar instanceof D0.d) {
                B2(new a());
            }
            if (bVar instanceof D0.j) {
                K2((D0.j) bVar);
            }
        }
        if ((e0.a(4) & f2()) != 0 && !z10) {
            E.a(this);
        }
        if ((e0.a(2) & f2()) != 0) {
            if (AbstractC2625d.d(this)) {
                AbstractC2624c0 abstractC2624c0C2 = c2();
                AbstractC6492s.f(abstractC2624c0C2);
                ((C) abstractC2624c0C2).G3(this);
                abstractC2624c0C2.W2();
            }
            if (!z10) {
                E.a(this);
                AbstractC2633k.m(this).F0();
            }
        }
        if (bVar instanceof C0.O) {
            ((C0.O) bVar).X(AbstractC2633k.m(this));
        }
        e0.a(128);
        f2();
        if ((e0.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES) & f2()) != 0 && (bVar instanceof C0.J) && AbstractC2625d.d(this)) {
            AbstractC2633k.m(this).F0();
        }
        if ((e0.a(16) & f2()) != 0 && (bVar instanceof InterfaceC8566F)) {
            ((InterfaceC8566F) bVar).L0().f(c2());
        }
        if ((e0.a(8) & f2()) != 0) {
            AbstractC2633k.n(this).z();
        }
    }

    private final void I2() {
        if (!k2()) {
            B0.a.b("unInitializeModifier called on unattached node");
        }
        e.b bVar = this.f3840n;
        if ((e0.a(32) & f2()) != 0) {
            if (bVar instanceof D0.j) {
                AbstractC2633k.n(this).getModifierLocalManager().d(this, ((D0.j) bVar).getKey());
            }
            if (bVar instanceof D0.d) {
                ((D0.d) bVar).Z0(AbstractC2625d.f3908a);
            }
        }
        if ((e0.a(8) & f2()) != 0) {
            AbstractC2633k.n(this).z();
        }
    }

    private final void K2(D0.j jVar) {
        D0.a aVar = this.f3842p;
        if (aVar != null && aVar.a(jVar.getKey())) {
            aVar.c(jVar);
            AbstractC2633k.n(this).getModifierLocalManager().f(this, jVar.getKey());
        } else {
            this.f3842p = new D0.a(jVar);
            if (AbstractC2625d.d(this)) {
                AbstractC2633k.n(this).getModifierLocalManager().a(this, jVar.getKey());
            }
        }
    }

    @Override // E0.B
    public int A(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        e.b bVar = this.f3840n;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C0.x) bVar).A(interfaceC2535o, interfaceC2534n, i10);
    }

    @Override // E0.InterfaceC2641t
    public void B(C0.r rVar) {
        e.b bVar = this.f3840n;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((C0.J) bVar).B(rVar);
    }

    @Override // E0.s0
    public void C0() {
        e.b bVar = this.f3840n;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((InterfaceC8566F) bVar).L0().d();
    }

    public final e.b D2() {
        return this.f3840n;
    }

    @Override // E0.s0
    public boolean E1() {
        e.b bVar = this.f3840n;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((InterfaceC8566F) bVar).L0().c();
    }

    public final HashSet E2() {
        return this.f3843q;
    }

    public final void G2() {
        this.f3841o = true;
        AbstractC2640s.a(this);
    }

    @Override // E0.r
    public void H0() {
        this.f3841o = true;
        AbstractC2640s.a(this);
    }

    public final void H2(e.b bVar) {
        if (k2()) {
            I2();
        }
        this.f3840n = bVar;
        x2(f0.f(bVar));
        if (k2()) {
            F2(false);
        }
    }

    @Override // E0.s0
    public boolean I0() {
        e.b bVar = this.f3840n;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((InterfaceC8566F) bVar).L0().a();
    }

    @Override // E0.r
    public void J(InterfaceC7036c interfaceC7036c) {
        e.b bVar = this.f3840n;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((InterfaceC6236g) bVar).J(interfaceC7036c);
    }

    @Override // k0.InterfaceC6354b
    public void J1(k0.l lVar) {
        e.b bVar = this.f3840n;
        B0.a.b("onFocusEvent called on wrong node");
        AbstractC5487d.a(bVar);
        throw null;
    }

    public final void J2() {
        if (k2()) {
            this.f3843q.clear();
            AbstractC2633k.n(this).getSnapshotObserver().i(this, AbstractC2625d.f3910c, new b());
        }
    }

    @Override // E0.p0
    public Object M(Y0.d dVar, Object obj) {
        e.b bVar = this.f3840n;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((C0.K) bVar).M(dVar, obj);
    }

    @Override // D0.h
    public D0.g S0() {
        D0.a aVar = this.f3842p;
        return aVar != null ? aVar : D0.i.a();
    }

    @Override // E0.A
    public void Y1(C0.r rVar) {
        this.f3844r = rVar;
    }

    @Override // E0.A
    public void a0(long j10) {
    }

    @Override // E0.B
    public C0.D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        e.b bVar = this.f3840n;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C0.x) bVar).b(mVar, b10, j10);
    }

    @Override // j0.InterfaceC6231b
    public long c() {
        return Y0.s.d(AbstractC2633k.h(this, e0.a(128)).h());
    }

    @Override // j0.InterfaceC6231b
    public Y0.d getDensity() {
        return AbstractC2633k.m(this).K();
    }

    @Override // j0.InterfaceC6231b
    public Y0.t getLayoutDirection() {
        return AbstractC2633k.m(this).getLayoutDirection();
    }

    @Override // E0.n0
    public boolean h0() {
        return k2();
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        F2(true);
    }

    @Override // k0.h
    public void o0(androidx.compose.ui.focus.k kVar) {
        e.b bVar = this.f3840n;
        B0.a.b("applyFocusProperties called on wrong node");
        AbstractC5487d.a(bVar);
        new k0.f(kVar);
        throw null;
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        I2();
    }

    @Override // E0.B
    public int p(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        e.b bVar = this.f3840n;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C0.x) bVar).p(interfaceC2535o, interfaceC2534n, i10);
    }

    @Override // E0.v0
    public void q(J0.w wVar) {
        e.b bVar = this.f3840n;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        J0.j jVarU1 = ((J0.l) bVar).U1();
        AbstractC6492s.g(wVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((J0.j) wVar).e(jVarU1);
    }

    @Override // E0.B
    public int r(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        e.b bVar = this.f3840n;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C0.x) bVar).r(interfaceC2535o, interfaceC2534n, i10);
    }

    @Override // E0.s0
    public void s0(C8593n c8593n, EnumC8595p enumC8595p, long j10) {
        e.b bVar = this.f3840n;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((InterfaceC8566F) bVar).L0().e(c8593n, enumC8595p, j10);
    }

    public String toString() {
        return this.f3840n.toString();
    }

    @Override // E0.B
    public int v(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        e.b bVar = this.f3840n;
        AbstractC6492s.g(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C0.x) bVar).v(interfaceC2535o, interfaceC2534n, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // D0.h, D0.k
    public Object z(D0.c cVar) {
        C2620a0 c2620a0K0;
        this.f3843q.add(cVar);
        int iA = e0.a(32);
        if (!h1().k2()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        e.c cVarH2 = h1().h2();
        G gM = AbstractC2633k.m(this);
        while (gM != null) {
            if ((gM.k0().k().a2() & iA) != 0) {
                while (cVarH2 != null) {
                    if ((cVarH2.f2() & iA) != 0) {
                        AbstractC2635m abstractC2635mG = cVarH2;
                        ?? bVar = 0;
                        while (abstractC2635mG != 0) {
                            if (abstractC2635mG instanceof D0.h) {
                                D0.h hVar = (D0.h) abstractC2635mG;
                                if (hVar.S0().a(cVar)) {
                                    return hVar.S0().b(cVar);
                                }
                            } else if ((abstractC2635mG.f2() & iA) != 0 && (abstractC2635mG instanceof AbstractC2635m)) {
                                e.c cVarE2 = abstractC2635mG.E2();
                                int i10 = 0;
                                abstractC2635mG = abstractC2635mG;
                                bVar = bVar;
                                while (cVarE2 != null) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i10++;
                                        bVar = bVar;
                                        if (i10 == 1) {
                                            abstractC2635mG = cVarE2;
                                        } else {
                                            if (bVar == 0) {
                                                bVar = new V.b(new e.c[16], 0);
                                            }
                                            if (abstractC2635mG != 0) {
                                                bVar.b(abstractC2635mG);
                                                abstractC2635mG = 0;
                                            }
                                            bVar.b(cVarE2);
                                        }
                                    }
                                    cVarE2 = cVarE2.b2();
                                    abstractC2635mG = abstractC2635mG;
                                    bVar = bVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC2635mG = AbstractC2633k.g(bVar);
                        }
                    }
                    cVarH2 = cVarH2.h2();
                }
            }
            gM = gM.o0();
            cVarH2 = (gM == null || (c2620a0K0 = gM.k0()) == null) ? null : c2620a0K0.o();
        }
        return cVar.a().invoke();
    }
}
