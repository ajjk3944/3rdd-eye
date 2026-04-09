package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6529e;
import l0.C6531g;
import m0.AbstractC6670H;
import m0.AbstractC6682S;
import m0.AbstractC6737x0;
import m0.C6719o0;
import m0.InterfaceC6717n0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import p0.C7182c;

/* renamed from: androidx.compose.ui.platform.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3918f1 implements E0.l0 {

    /* renamed from: n, reason: collision with root package name */
    public static final b f29366n = new b(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f29367o = 8;

    /* renamed from: p, reason: collision with root package name */
    private static final InterfaceC6839p f29368p = a.f29382a;

    /* renamed from: a, reason: collision with root package name */
    private final r f29369a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6839p f29370b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6824a f29371c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29372d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29374f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29375g;

    /* renamed from: h, reason: collision with root package name */
    private m0.S0 f29376h;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3941n0 f29380l;

    /* renamed from: m, reason: collision with root package name */
    private int f29381m;

    /* renamed from: e, reason: collision with root package name */
    private final K0 f29373e = new K0();

    /* renamed from: i, reason: collision with root package name */
    private final F0 f29377i = new F0(f29368p);

    /* renamed from: j, reason: collision with root package name */
    private final C6719o0 f29378j = new C6719o0();

    /* renamed from: k, reason: collision with root package name */
    private long f29379k = androidx.compose.ui.graphics.f.f28939b.a();

    /* renamed from: androidx.compose.ui.platform.f1$a */
    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29382a = new a();

        a() {
            super(2);
        }

        public final void a(InterfaceC3941n0 interfaceC3941n0, Matrix matrix) {
            interfaceC3941n0.K(matrix);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3941n0) obj, (Matrix) obj2);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.f1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: androidx.compose.ui.platform.f1$c */
    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f29383a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC6839p interfaceC6839p) {
            super(1);
            this.f29383a = interfaceC6839p;
        }

        public final void a(InterfaceC6717n0 interfaceC6717n0) {
            this.f29383a.invoke(interfaceC6717n0, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC6717n0) obj);
            return Yg.J.f24997a;
        }
    }

    public C3918f1(r rVar, InterfaceC6839p interfaceC6839p, InterfaceC6824a interfaceC6824a) {
        this.f29369a = rVar;
        this.f29370b = interfaceC6839p;
        this.f29371c = interfaceC6824a;
        InterfaceC3941n0 c3912d1 = Build.VERSION.SDK_INT >= 29 ? new C3912d1(rVar) : new Q0(rVar);
        c3912d1.H(true);
        c3912d1.w(false);
        this.f29380l = c3912d1;
    }

    private final void l(InterfaceC6717n0 interfaceC6717n0) {
        if (this.f29380l.F() || this.f29380l.C()) {
            this.f29373e.a(interfaceC6717n0);
        }
    }

    private final void m(boolean z10) {
        if (z10 != this.f29372d) {
            this.f29372d = z10;
            this.f29369a.A0(this, z10);
        }
    }

    private final void n() {
        L1.f29246a.a(this.f29369a);
    }

    @Override // E0.l0
    public void a(float[] fArr) {
        m0.O0.n(fArr, this.f29377i.b(this.f29380l));
    }

    @Override // E0.l0
    public boolean b(long j10) {
        float fM = C6531g.m(j10);
        float fN = C6531g.n(j10);
        if (this.f29380l.C()) {
            return 0.0f <= fM && fM < ((float) this.f29380l.getWidth()) && 0.0f <= fN && fN < ((float) this.f29380l.getHeight());
        }
        if (this.f29380l.F()) {
            return this.f29373e.f(j10);
        }
        return true;
    }

    @Override // E0.l0
    public void c(androidx.compose.ui.graphics.d dVar) {
        InterfaceC6824a interfaceC6824a;
        int iZ = dVar.z() | this.f29381m;
        int i10 = iZ & 4096;
        if (i10 != 0) {
            this.f29379k = dVar.t1();
        }
        boolean z10 = false;
        boolean z11 = this.f29380l.F() && !this.f29373e.e();
        if ((iZ & 1) != 0) {
            this.f29380l.i(dVar.n());
        }
        if ((iZ & 2) != 0) {
            this.f29380l.g(dVar.K());
        }
        if ((iZ & 4) != 0) {
            this.f29380l.a(dVar.b());
        }
        if ((iZ & 8) != 0) {
            this.f29380l.j(dVar.F());
        }
        if ((iZ & 16) != 0) {
            this.f29380l.f(dVar.C());
        }
        if ((iZ & 32) != 0) {
            this.f29380l.z(dVar.J());
        }
        if ((iZ & 64) != 0) {
            this.f29380l.E(AbstractC6737x0.j(dVar.p()));
        }
        if ((iZ & 128) != 0) {
            this.f29380l.J(AbstractC6737x0.j(dVar.M()));
        }
        if ((iZ & 1024) != 0) {
            this.f29380l.e(dVar.w());
        }
        if ((iZ & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            this.f29380l.m(dVar.H());
        }
        if ((iZ & 512) != 0) {
            this.f29380l.d(dVar.u());
        }
        if ((iZ & 2048) != 0) {
            this.f29380l.l(dVar.E());
        }
        if (i10 != 0) {
            this.f29380l.v(androidx.compose.ui.graphics.f.f(this.f29379k) * this.f29380l.getWidth());
            this.f29380l.y(androidx.compose.ui.graphics.f.g(this.f29379k) * this.f29380l.getHeight());
        }
        boolean z12 = dVar.q() && dVar.L() != m0.c1.a();
        if ((iZ & 24576) != 0) {
            this.f29380l.G(z12);
            this.f29380l.w(dVar.q() && dVar.L() == m0.c1.a());
        }
        if ((131072 & iZ) != 0) {
            InterfaceC3941n0 interfaceC3941n0 = this.f29380l;
            dVar.B();
            interfaceC3941n0.k(null);
        }
        if ((32768 & iZ) != 0) {
            this.f29380l.t(dVar.r());
        }
        boolean zH = this.f29373e.h(dVar.A(), dVar.b(), z12, dVar.J(), dVar.c());
        if (this.f29373e.c()) {
            this.f29380l.B(this.f29373e.b());
        }
        if (z12 && !this.f29373e.e()) {
            z10 = true;
        }
        if (z11 != z10 || (z10 && zH)) {
            invalidate();
        } else {
            n();
        }
        if (!this.f29375g && this.f29380l.L() > 0.0f && (interfaceC6824a = this.f29371c) != null) {
            interfaceC6824a.invoke();
        }
        if ((iZ & 7963) != 0) {
            this.f29377i.c();
        }
        this.f29381m = dVar.z();
    }

    @Override // E0.l0
    public void d(InterfaceC6717n0 interfaceC6717n0, C7182c c7182c) {
        Canvas canvasD = AbstractC6670H.d(interfaceC6717n0);
        if (canvasD.isHardwareAccelerated()) {
            j();
            boolean z10 = this.f29380l.L() > 0.0f;
            this.f29375g = z10;
            if (z10) {
                interfaceC6717n0.y();
            }
            this.f29380l.u(canvasD);
            if (this.f29375g) {
                interfaceC6717n0.k();
                return;
            }
            return;
        }
        float fC = this.f29380l.c();
        float fD = this.f29380l.D();
        float fN = this.f29380l.n();
        float fS = this.f29380l.s();
        if (this.f29380l.b() < 1.0f) {
            m0.S0 s0A = this.f29376h;
            if (s0A == null) {
                s0A = AbstractC6682S.a();
                this.f29376h = s0A;
            }
            s0A.a(this.f29380l.b());
            canvasD.saveLayer(fC, fD, fN, fS, s0A.x());
        } else {
            interfaceC6717n0.j();
        }
        interfaceC6717n0.c(fC, fD);
        interfaceC6717n0.n(this.f29377i.b(this.f29380l));
        l(interfaceC6717n0);
        InterfaceC6839p interfaceC6839p = this.f29370b;
        if (interfaceC6839p != null) {
            interfaceC6839p.invoke(interfaceC6717n0, null);
        }
        interfaceC6717n0.r();
        m(false);
    }

    @Override // E0.l0
    public void destroy() {
        if (this.f29380l.q()) {
            this.f29380l.h();
        }
        this.f29370b = null;
        this.f29371c = null;
        this.f29374f = true;
        m(false);
        this.f29369a.L0();
        this.f29369a.J0(this);
    }

    @Override // E0.l0
    public long e(long j10, boolean z10) {
        if (!z10) {
            return m0.O0.f(this.f29377i.b(this.f29380l), j10);
        }
        float[] fArrA = this.f29377i.a(this.f29380l);
        return fArrA != null ? m0.O0.f(fArrA, j10) : C6531g.f52335b.a();
    }

    @Override // E0.l0
    public void f(long j10) {
        int iG = Y0.r.g(j10);
        int iF = Y0.r.f(j10);
        this.f29380l.v(androidx.compose.ui.graphics.f.f(this.f29379k) * iG);
        this.f29380l.y(androidx.compose.ui.graphics.f.g(this.f29379k) * iF);
        InterfaceC3941n0 interfaceC3941n0 = this.f29380l;
        if (interfaceC3941n0.x(interfaceC3941n0.c(), this.f29380l.D(), this.f29380l.c() + iG, this.f29380l.D() + iF)) {
            this.f29380l.B(this.f29373e.b());
            invalidate();
            this.f29377i.c();
        }
    }

    @Override // E0.l0
    public void g(InterfaceC6839p interfaceC6839p, InterfaceC6824a interfaceC6824a) {
        m(false);
        this.f29374f = false;
        this.f29375g = false;
        this.f29379k = androidx.compose.ui.graphics.f.f28939b.a();
        this.f29370b = interfaceC6839p;
        this.f29371c = interfaceC6824a;
    }

    @Override // E0.l0
    public void h(float[] fArr) {
        float[] fArrA = this.f29377i.a(this.f29380l);
        if (fArrA != null) {
            m0.O0.n(fArr, fArrA);
        }
    }

    @Override // E0.l0
    public void i(long j10) {
        int iC = this.f29380l.c();
        int iD = this.f29380l.D();
        int iH = Y0.n.h(j10);
        int i10 = Y0.n.i(j10);
        if (iC == iH && iD == i10) {
            return;
        }
        if (iC != iH) {
            this.f29380l.r(iH - iC);
        }
        if (iD != i10) {
            this.f29380l.A(i10 - iD);
        }
        n();
        this.f29377i.c();
    }

    @Override // E0.l0
    public void invalidate() {
        if (this.f29372d || this.f29374f) {
            return;
        }
        this.f29369a.invalidate();
        m(true);
    }

    @Override // E0.l0
    public void j() {
        if (this.f29372d || !this.f29380l.q()) {
            m0.U0 u0D = (!this.f29380l.F() || this.f29373e.e()) ? null : this.f29373e.d();
            InterfaceC6839p interfaceC6839p = this.f29370b;
            if (interfaceC6839p != null) {
                this.f29380l.I(this.f29378j, u0D, new c(interfaceC6839p));
            }
            m(false);
        }
    }

    @Override // E0.l0
    public void k(C6529e c6529e, boolean z10) {
        if (!z10) {
            m0.O0.g(this.f29377i.b(this.f29380l), c6529e);
            return;
        }
        float[] fArrA = this.f29377i.a(this.f29380l);
        if (fArrA == null) {
            c6529e.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            m0.O0.g(fArrA, c6529e);
        }
    }
}
