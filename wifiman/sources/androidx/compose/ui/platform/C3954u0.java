package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.ui.graphics.a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6529e;
import l0.C6531g;
import m0.AbstractC6670H;
import m0.AbstractC6682S;
import m0.AbstractC6688Y;
import m0.InterfaceC6671H0;
import m0.InterfaceC6717n0;
import m0.Q0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o0.C7034a;
import o0.InterfaceC7037d;
import o0.InterfaceC7039f;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.MPv3;
import org.snmp4j.transport.TLSTM;
import p0.AbstractC7181b;
import p0.AbstractC7184e;
import p0.C7182c;

/* renamed from: androidx.compose.ui.platform.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3954u0 implements E0.l0 {

    /* renamed from: a, reason: collision with root package name */
    private C7182c f29598a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6671H0 f29599b;

    /* renamed from: c, reason: collision with root package name */
    private final r f29600c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6839p f29601d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6824a f29602e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29604g;

    /* renamed from: i, reason: collision with root package name */
    private float[] f29606i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29607j;

    /* renamed from: n, reason: collision with root package name */
    private int f29611n;

    /* renamed from: p, reason: collision with root package name */
    private m0.Q0 f29613p;

    /* renamed from: q, reason: collision with root package name */
    private m0.U0 f29614q;

    /* renamed from: r, reason: collision with root package name */
    private m0.S0 f29615r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f29616s;

    /* renamed from: f, reason: collision with root package name */
    private long f29603f = Y0.s.a(MPv3.MAX_MESSAGE_ID, MPv3.MAX_MESSAGE_ID);

    /* renamed from: h, reason: collision with root package name */
    private final float[] f29605h = m0.O0.c(null, 1, null);

    /* renamed from: k, reason: collision with root package name */
    private Y0.d f29608k = Y0.f.b(1.0f, 0.0f, 2, null);

    /* renamed from: l, reason: collision with root package name */
    private Y0.t f29609l = Y0.t.Ltr;

    /* renamed from: m, reason: collision with root package name */
    private final C7034a f29610m = new C7034a();

    /* renamed from: o, reason: collision with root package name */
    private long f29612o = androidx.compose.ui.graphics.f.f28939b.a();

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC6835l f29617t = new a();

    /* renamed from: androidx.compose.ui.platform.u0$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        public final void a(InterfaceC7039f interfaceC7039f) {
            C3954u0 c3954u0 = C3954u0.this;
            InterfaceC6717n0 interfaceC6717n0D = interfaceC7039f.k1().d();
            InterfaceC6839p interfaceC6839p = c3954u0.f29601d;
            if (interfaceC6839p != null) {
                interfaceC6839p.invoke(interfaceC6717n0D, interfaceC7039f.k1().g());
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7039f) obj);
            return Yg.J.f24997a;
        }
    }

    public C3954u0(C7182c c7182c, InterfaceC6671H0 interfaceC6671H0, r rVar, InterfaceC6839p interfaceC6839p, InterfaceC6824a interfaceC6824a) {
        this.f29598a = c7182c;
        this.f29599b = interfaceC6671H0;
        this.f29600c = rVar;
        this.f29601d = interfaceC6839p;
        this.f29602e = interfaceC6824a;
    }

    private final void m(InterfaceC6717n0 interfaceC6717n0) {
        if (this.f29598a.k()) {
            m0.Q0 q0N = this.f29598a.n();
            if (q0N instanceof Q0.b) {
                InterfaceC6717n0.o(interfaceC6717n0, ((Q0.b) q0N).b(), 0, 2, null);
                return;
            }
            if (!(q0N instanceof Q0.c)) {
                if (q0N instanceof Q0.a) {
                    InterfaceC6717n0.t(interfaceC6717n0, ((Q0.a) q0N).b(), 0, 2, null);
                    return;
                }
                return;
            }
            m0.U0 u0A = this.f29614q;
            if (u0A == null) {
                u0A = AbstractC6688Y.a();
                this.f29614q = u0A;
            }
            u0A.a();
            m0.U0.t(u0A, ((Q0.c) q0N).b(), null, 2, null);
            InterfaceC6717n0.t(interfaceC6717n0, u0A, 0, 2, null);
        }
    }

    private final float[] n() {
        float[] fArrO = o();
        float[] fArrC = this.f29606i;
        if (fArrC == null) {
            fArrC = m0.O0.c(null, 1, null);
            this.f29606i = fArrC;
        }
        if (D0.a(fArrO, fArrC)) {
            return fArrC;
        }
        return null;
    }

    private final float[] o() {
        r();
        return this.f29605h;
    }

    private final void p(boolean z10) {
        if (z10 != this.f29607j) {
            this.f29607j = z10;
            this.f29600c.A0(this, z10);
        }
    }

    private final void q() {
        L1.f29246a.a(this.f29600c);
    }

    private final void r() {
        C7182c c7182c = this.f29598a;
        long jB = AbstractC6532h.d(c7182c.o()) ? AbstractC6538n.b(Y0.s.d(this.f29603f)) : c7182c.o();
        m0.O0.h(this.f29605h);
        float[] fArr = this.f29605h;
        float[] fArrC = m0.O0.c(null, 1, null);
        m0.O0.q(fArrC, -C6531g.m(jB), -C6531g.n(jB), 0.0f, 4, null);
        m0.O0.n(fArr, fArrC);
        float[] fArr2 = this.f29605h;
        float[] fArrC2 = m0.O0.c(null, 1, null);
        m0.O0.q(fArrC2, c7182c.x(), c7182c.y(), 0.0f, 4, null);
        m0.O0.i(fArrC2, c7182c.p());
        m0.O0.j(fArrC2, c7182c.q());
        m0.O0.k(fArrC2, c7182c.r());
        m0.O0.m(fArrC2, c7182c.s(), c7182c.t(), 0.0f, 4, null);
        m0.O0.n(fArr2, fArrC2);
        float[] fArr3 = this.f29605h;
        float[] fArrC3 = m0.O0.c(null, 1, null);
        m0.O0.q(fArrC3, C6531g.m(jB), C6531g.n(jB), 0.0f, 4, null);
        m0.O0.n(fArr3, fArrC3);
    }

    private final void s() {
        InterfaceC6824a interfaceC6824a;
        m0.Q0 q02 = this.f29613p;
        if (q02 == null) {
            return;
        }
        AbstractC7184e.b(this.f29598a, q02);
        if (!(q02 instanceof Q0.a) || Build.VERSION.SDK_INT >= 33 || (interfaceC6824a = this.f29602e) == null) {
            return;
        }
        interfaceC6824a.invoke();
    }

    @Override // E0.l0
    public void a(float[] fArr) {
        m0.O0.n(fArr, o());
    }

    @Override // E0.l0
    public boolean b(long j10) {
        float fM = C6531g.m(j10);
        float fN = C6531g.n(j10);
        if (this.f29598a.k()) {
            return AbstractC3939m1.c(this.f29598a.n(), fM, fN, null, null, 24, null);
        }
        return true;
    }

    @Override // E0.l0
    public void c(androidx.compose.ui.graphics.d dVar) {
        boolean z10;
        int iB;
        InterfaceC6824a interfaceC6824a;
        int iZ = dVar.z() | this.f29611n;
        this.f29609l = dVar.v();
        this.f29608k = dVar.s();
        int i10 = iZ & 4096;
        if (i10 != 0) {
            this.f29612o = dVar.t1();
        }
        if ((iZ & 1) != 0) {
            this.f29598a.X(dVar.n());
        }
        if ((iZ & 2) != 0) {
            this.f29598a.Y(dVar.K());
        }
        if ((iZ & 4) != 0) {
            this.f29598a.J(dVar.b());
        }
        if ((iZ & 8) != 0) {
            this.f29598a.d0(dVar.F());
        }
        if ((iZ & 16) != 0) {
            this.f29598a.e0(dVar.C());
        }
        if ((iZ & 32) != 0) {
            this.f29598a.Z(dVar.J());
            if (dVar.J() > 0.0f && !this.f29616s && (interfaceC6824a = this.f29602e) != null) {
                interfaceC6824a.invoke();
            }
        }
        if ((iZ & 64) != 0) {
            this.f29598a.K(dVar.p());
        }
        if ((iZ & 128) != 0) {
            this.f29598a.b0(dVar.M());
        }
        if ((iZ & 1024) != 0) {
            this.f29598a.V(dVar.w());
        }
        if ((iZ & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            this.f29598a.T(dVar.H());
        }
        if ((iZ & 512) != 0) {
            this.f29598a.U(dVar.u());
        }
        if ((iZ & 2048) != 0) {
            this.f29598a.L(dVar.E());
        }
        if (i10 != 0) {
            if (androidx.compose.ui.graphics.f.e(this.f29612o, androidx.compose.ui.graphics.f.f28939b.a())) {
                this.f29598a.P(C6531g.f52335b.b());
            } else {
                this.f29598a.P(AbstractC6532h.a(androidx.compose.ui.graphics.f.f(this.f29612o) * Y0.r.g(this.f29603f), androidx.compose.ui.graphics.f.g(this.f29612o) * Y0.r.f(this.f29603f)));
            }
        }
        if ((iZ & TLSTM.TLS_MAX_FRAGMENT_SIZE) != 0) {
            this.f29598a.M(dVar.q());
        }
        if ((131072 & iZ) != 0) {
            C7182c c7182c = this.f29598a;
            dVar.B();
            c7182c.S(null);
        }
        if ((32768 & iZ) != 0) {
            C7182c c7182c2 = this.f29598a;
            int iR = dVar.r();
            a.C1065a c1065a = androidx.compose.ui.graphics.a.f28894a;
            if (androidx.compose.ui.graphics.a.e(iR, c1065a.a())) {
                iB = AbstractC7181b.f57380a.a();
            } else if (androidx.compose.ui.graphics.a.e(iR, c1065a.c())) {
                iB = AbstractC7181b.f57380a.c();
            } else {
                if (!androidx.compose.ui.graphics.a.e(iR, c1065a.b())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iB = AbstractC7181b.f57380a.b();
            }
            c7182c2.N(iB);
        }
        if (AbstractC6492s.d(this.f29613p, dVar.A())) {
            z10 = false;
        } else {
            this.f29613p = dVar.A();
            s();
            z10 = true;
        }
        this.f29611n = dVar.z();
        if (iZ != 0 || z10) {
            q();
        }
    }

    @Override // E0.l0
    public void d(InterfaceC6717n0 interfaceC6717n0, C7182c c7182c) {
        Canvas canvasD = AbstractC6670H.d(interfaceC6717n0);
        if (canvasD.isHardwareAccelerated()) {
            j();
            this.f29616s = this.f29598a.u() > 0.0f;
            InterfaceC7037d interfaceC7037dK1 = this.f29610m.k1();
            interfaceC7037dK1.i(interfaceC6717n0);
            interfaceC7037dK1.h(c7182c);
            AbstractC7184e.a(this.f29610m, this.f29598a);
            return;
        }
        float fH = Y0.n.h(this.f29598a.w());
        float fI = Y0.n.i(this.f29598a.w());
        float fG = fH + Y0.r.g(this.f29603f);
        float f10 = fI + Y0.r.f(this.f29603f);
        if (this.f29598a.i() < 1.0f) {
            m0.S0 s0A = this.f29615r;
            if (s0A == null) {
                s0A = AbstractC6682S.a();
                this.f29615r = s0A;
            }
            s0A.a(this.f29598a.i());
            canvasD.saveLayer(fH, fI, fG, f10, s0A.x());
        } else {
            interfaceC6717n0.j();
        }
        interfaceC6717n0.c(fH, fI);
        interfaceC6717n0.n(o());
        if (this.f29598a.k()) {
            m(interfaceC6717n0);
        }
        InterfaceC6839p interfaceC6839p = this.f29601d;
        if (interfaceC6839p != null) {
            interfaceC6839p.invoke(interfaceC6717n0, null);
        }
        interfaceC6717n0.r();
    }

    @Override // E0.l0
    public void destroy() {
        this.f29601d = null;
        this.f29602e = null;
        this.f29604g = true;
        p(false);
        InterfaceC6671H0 interfaceC6671H0 = this.f29599b;
        if (interfaceC6671H0 != null) {
            interfaceC6671H0.a(this.f29598a);
            this.f29600c.J0(this);
        }
    }

    @Override // E0.l0
    public long e(long j10, boolean z10) {
        if (!z10) {
            return m0.O0.f(o(), j10);
        }
        float[] fArrN = n();
        return fArrN != null ? m0.O0.f(fArrN, j10) : C6531g.f52335b.a();
    }

    @Override // E0.l0
    public void f(long j10) {
        if (Y0.r.e(j10, this.f29603f)) {
            return;
        }
        this.f29603f = j10;
        invalidate();
    }

    @Override // E0.l0
    public void g(InterfaceC6839p interfaceC6839p, InterfaceC6824a interfaceC6824a) {
        InterfaceC6671H0 interfaceC6671H0 = this.f29599b;
        if (interfaceC6671H0 == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f29598a.z()) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.f29598a = interfaceC6671H0.b();
        this.f29604g = false;
        this.f29601d = interfaceC6839p;
        this.f29602e = interfaceC6824a;
        this.f29612o = androidx.compose.ui.graphics.f.f28939b.a();
        this.f29616s = false;
        this.f29603f = Y0.s.a(MPv3.MAX_MESSAGE_ID, MPv3.MAX_MESSAGE_ID);
        this.f29613p = null;
        this.f29611n = 0;
    }

    @Override // E0.l0
    public void h(float[] fArr) {
        float[] fArrN = n();
        if (fArrN != null) {
            m0.O0.n(fArr, fArrN);
        }
    }

    @Override // E0.l0
    public void i(long j10) {
        this.f29598a.c0(j10);
        q();
    }

    @Override // E0.l0
    public void invalidate() {
        if (this.f29607j || this.f29604g) {
            return;
        }
        this.f29600c.invalidate();
        p(true);
    }

    @Override // E0.l0
    public void j() {
        if (this.f29607j) {
            if (!androidx.compose.ui.graphics.f.e(this.f29612o, androidx.compose.ui.graphics.f.f28939b.a()) && !Y0.r.e(this.f29598a.v(), this.f29603f)) {
                this.f29598a.P(AbstractC6532h.a(androidx.compose.ui.graphics.f.f(this.f29612o) * Y0.r.g(this.f29603f), androidx.compose.ui.graphics.f.g(this.f29612o) * Y0.r.f(this.f29603f)));
            }
            this.f29598a.E(this.f29608k, this.f29609l, this.f29603f, this.f29617t);
            p(false);
        }
    }

    @Override // E0.l0
    public void k(C6529e c6529e, boolean z10) {
        if (!z10) {
            m0.O0.g(o(), c6529e);
            return;
        }
        float[] fArrN = n();
        if (fArrN == null) {
            c6529e.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            m0.O0.g(fArrN, c6529e);
        }
    }
}
