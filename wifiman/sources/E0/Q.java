package E0;

import C0.AbstractC2521a;
import E0.L;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public abstract class Q extends P implements C0.B {

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC2624c0 f3787p;

    /* renamed from: r, reason: collision with root package name */
    private Map f3789r;

    /* renamed from: t, reason: collision with root package name */
    private C0.D f3791t;

    /* renamed from: q, reason: collision with root package name */
    private long f3788q = Y0.n.f24536b.a();

    /* renamed from: s, reason: collision with root package name */
    private final C0.z f3790s = new C0.z(this);

    /* renamed from: u, reason: collision with root package name */
    private final Map f3792u = new LinkedHashMap();

    public Q(AbstractC2624c0 abstractC2624c0) {
        this.f3787p = abstractC2624c0;
    }

    private final void h2(long j10) {
        if (!Y0.n.g(r1(), j10)) {
            k2(j10);
            L.a aVarH = G1().U().H();
            if (aVarH != null) {
                aVarH.E1();
            }
            B1(this.f3787p);
        }
        if (L1()) {
            return;
        }
        W0(h1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2(C0.D d10) {
        Yg.J j10;
        Map map;
        if (d10 != null) {
            Q0(Y0.s.a(d10.getWidth(), d10.getHeight()));
            j10 = Yg.J.f24997a;
        } else {
            j10 = null;
        }
        if (j10 == null) {
            Q0(Y0.r.f24545b.a());
        }
        if (!AbstractC6492s.d(this.f3791t, d10) && d10 != null && ((((map = this.f3789r) != null && !map.isEmpty()) || !d10.p().isEmpty()) && !AbstractC6492s.d(d10.p(), this.f3789r))) {
            Z1().p().m();
            Map linkedHashMap = this.f3789r;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f3789r = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(d10.p());
        }
        this.f3791t = d10;
    }

    @Override // E0.P, E0.T
    public G G1() {
        return this.f3787p.G1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.compose.ui.layout.t
    public final void K0(long j10, float f10, InterfaceC6835l interfaceC6835l) {
        h2(j10);
        if (M1()) {
            return;
        }
        g2();
    }

    public abstract int R(int i10);

    @Override // E0.P
    public void R1() {
        K0(r1(), 0.0f, null);
    }

    public abstract int S(int i10);

    @Override // E0.P
    public P Z0() {
        AbstractC2624c0 abstractC2624c0H2 = this.f3787p.H2();
        if (abstractC2624c0H2 != null) {
            return abstractC2624c0H2.C2();
        }
        return null;
    }

    public InterfaceC2621b Z1() {
        InterfaceC2621b interfaceC2621bC = this.f3787p.G1().U().C();
        AbstractC6492s.f(interfaceC2621bC);
        return interfaceC2621bC;
    }

    @Override // E0.P, C0.InterfaceC2535o
    public boolean a1() {
        return true;
    }

    public final int a2(AbstractC2521a abstractC2521a) {
        Integer num = (Integer) this.f3792u.get(abstractC2521a);
        return num != null ? num.intValue() : PduHandle.NONE;
    }

    @Override // C0.E, C0.InterfaceC2534n
    public Object b() {
        return this.f3787p.b();
    }

    protected final Map b2() {
        return this.f3792u;
    }

    @Override // E0.P
    public C0.r c1() {
        return this.f3790s;
    }

    public final long c2() {
        return H0();
    }

    public final AbstractC2624c0 d2() {
        return this.f3787p;
    }

    public final C0.z e2() {
        return this.f3790s;
    }

    public final long f2() {
        return Y0.s.a(I0(), C0());
    }

    @Override // E0.P
    public boolean g1() {
        return this.f3791t != null;
    }

    protected void g2() {
        h1().q();
    }

    @Override // Y0.d
    public float getDensity() {
        return this.f3787p.getDensity();
    }

    @Override // C0.InterfaceC2535o
    public Y0.t getLayoutDirection() {
        return this.f3787p.getLayoutDirection();
    }

    @Override // E0.P
    public C0.D h1() {
        C0.D d10 = this.f3791t;
        if (d10 != null) {
            return d10;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    public final void i2(long j10) {
        h2(Y0.n.l(j10, A0()));
    }

    public final long j2(Q q10, boolean z10) {
        long jA = Y0.n.f24536b.a();
        Q qC2 = this;
        while (!AbstractC6492s.d(qC2, q10)) {
            if (!qC2.J1() || !z10) {
                jA = Y0.n.l(jA, qC2.r1());
            }
            AbstractC2624c0 abstractC2624c0I2 = qC2.f3787p.I2();
            AbstractC6492s.f(abstractC2624c0I2);
            qC2 = abstractC2624c0I2.C2();
            AbstractC6492s.f(qC2);
        }
        return jA;
    }

    public void k2(long j10) {
        this.f3788q = j10;
    }

    @Override // E0.P
    public P o1() {
        AbstractC2624c0 abstractC2624c0I2 = this.f3787p.I2();
        if (abstractC2624c0I2 != null) {
            return abstractC2624c0I2.C2();
        }
        return null;
    }

    @Override // E0.P
    public long r1() {
        return this.f3788q;
    }

    public abstract int s(int i10);

    public abstract int s0(int i10);

    @Override // Y0.l
    public float y() {
        return this.f3787p.y();
    }
}
