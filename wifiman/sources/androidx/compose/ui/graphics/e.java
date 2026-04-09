package androidx.compose.ui.graphics;

import C0.D;
import E0.AbstractC2624c0;
import E0.AbstractC2633k;
import E0.B;
import E0.e0;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C6733v0;
import m0.d1;
import m0.i1;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class e extends e.c implements B {

    /* renamed from: A, reason: collision with root package name */
    private long f28919A;

    /* renamed from: B, reason: collision with root package name */
    private long f28920B;

    /* renamed from: C, reason: collision with root package name */
    private int f28921C;

    /* renamed from: D, reason: collision with root package name */
    private InterfaceC6835l f28922D;

    /* renamed from: n, reason: collision with root package name */
    private float f28923n;

    /* renamed from: o, reason: collision with root package name */
    private float f28924o;

    /* renamed from: p, reason: collision with root package name */
    private float f28925p;

    /* renamed from: q, reason: collision with root package name */
    private float f28926q;

    /* renamed from: r, reason: collision with root package name */
    private float f28927r;

    /* renamed from: s, reason: collision with root package name */
    private float f28928s;

    /* renamed from: t, reason: collision with root package name */
    private float f28929t;

    /* renamed from: u, reason: collision with root package name */
    private float f28930u;

    /* renamed from: v, reason: collision with root package name */
    private float f28931v;

    /* renamed from: w, reason: collision with root package name */
    private float f28932w;

    /* renamed from: x, reason: collision with root package name */
    private long f28933x;

    /* renamed from: y, reason: collision with root package name */
    private i1 f28934y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f28935z;

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        public final void a(c cVar) {
            cVar.i(e.this.n());
            cVar.g(e.this.K());
            cVar.a(e.this.E2());
            cVar.j(e.this.F());
            cVar.f(e.this.C());
            cVar.o(e.this.J2());
            cVar.m(e.this.H());
            cVar.d(e.this.u());
            cVar.e(e.this.w());
            cVar.l(e.this.E());
            cVar.y1(e.this.t1());
            cVar.I1(e.this.K2());
            cVar.G(e.this.G2());
            e.this.I2();
            cVar.k(null);
            cVar.D(e.this.F2());
            cVar.I(e.this.L2());
            cVar.t(e.this.H2());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c) obj);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f28937a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f28938b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t tVar, e eVar) {
            super(1);
            this.f28937a = tVar;
            this.f28938b = eVar;
        }

        public final void a(t.a aVar) {
            t.a.v(aVar, this.f28937a, 0, 0, 0.0f, this.f28938b.f28922D, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public /* synthetic */ e(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, i1 i1Var, boolean z10, d1 d1Var, long j11, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, i1Var, z10, d1Var, j11, j12, i10);
    }

    public final float C() {
        return this.f28927r;
    }

    public final void D(long j10) {
        this.f28919A = j10;
    }

    public final float E() {
        return this.f28932w;
    }

    public final float E2() {
        return this.f28925p;
    }

    public final float F() {
        return this.f28926q;
    }

    public final long F2() {
        return this.f28919A;
    }

    public final void G(boolean z10) {
        this.f28935z = z10;
    }

    public final boolean G2() {
        return this.f28935z;
    }

    public final float H() {
        return this.f28929t;
    }

    public final int H2() {
        return this.f28921C;
    }

    public final void I(long j10) {
        this.f28920B = j10;
    }

    public final void I1(i1 i1Var) {
        this.f28934y = i1Var;
    }

    public final d1 I2() {
        return null;
    }

    public final float J2() {
        return this.f28928s;
    }

    public final float K() {
        return this.f28924o;
    }

    public final i1 K2() {
        return this.f28934y;
    }

    public final long L2() {
        return this.f28920B;
    }

    public final void M2() {
        AbstractC2624c0 abstractC2624c0H2 = AbstractC2633k.h(this, e0.a(2)).H2();
        if (abstractC2624c0H2 != null) {
            abstractC2624c0H2.w3(this.f28922D, true);
        }
    }

    public final void a(float f10) {
        this.f28925p = f10;
    }

    @Override // E0.B
    public D b(m mVar, C0.B b10, long j10) {
        t tVarT = b10.T(j10);
        return m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new b(tVarT, this), 4, null);
    }

    public final void d(float f10) {
        this.f28930u = f10;
    }

    public final void e(float f10) {
        this.f28931v = f10;
    }

    public final void f(float f10) {
        this.f28927r = f10;
    }

    public final void g(float f10) {
        this.f28924o = f10;
    }

    public final void i(float f10) {
        this.f28923n = f10;
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return false;
    }

    public final void j(float f10) {
        this.f28926q = f10;
    }

    public final void k(d1 d1Var) {
    }

    public final void l(float f10) {
        this.f28932w = f10;
    }

    public final void m(float f10) {
        this.f28929t = f10;
    }

    public final float n() {
        return this.f28923n;
    }

    public final void o(float f10) {
        this.f28928s = f10;
    }

    public final void t(int i10) {
        this.f28921C = i10;
    }

    public final long t1() {
        return this.f28933x;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f28923n + ", scaleY=" + this.f28924o + ", alpha = " + this.f28925p + ", translationX=" + this.f28926q + ", translationY=" + this.f28927r + ", shadowElevation=" + this.f28928s + ", rotationX=" + this.f28929t + ", rotationY=" + this.f28930u + ", rotationZ=" + this.f28931v + ", cameraDistance=" + this.f28932w + ", transformOrigin=" + ((Object) f.i(this.f28933x)) + ", shape=" + this.f28934y + ", clip=" + this.f28935z + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) C6733v0.t(this.f28919A)) + ", spotShadowColor=" + ((Object) C6733v0.t(this.f28920B)) + ", compositingStrategy=" + ((Object) androidx.compose.ui.graphics.a.g(this.f28921C)) + ')';
    }

    public final float u() {
        return this.f28930u;
    }

    public final float w() {
        return this.f28931v;
    }

    public final void y1(long j10) {
        this.f28933x = j10;
    }

    private e(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, i1 i1Var, boolean z10, d1 d1Var, long j11, long j12, int i10) {
        this.f28923n = f10;
        this.f28924o = f11;
        this.f28925p = f12;
        this.f28926q = f13;
        this.f28927r = f14;
        this.f28928s = f15;
        this.f28929t = f16;
        this.f28930u = f17;
        this.f28931v = f18;
        this.f28932w = f19;
        this.f28933x = j10;
        this.f28934y = i1Var;
        this.f28935z = z10;
        this.f28919A = j11;
        this.f28920B = j12;
        this.f28921C = i10;
        this.f28922D = new a();
    }
}
