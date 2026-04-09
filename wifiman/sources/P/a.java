package P;

import Ii.N;
import T.InterfaceC3551q0;
import T.S0;
import T.t1;
import T.z1;
import Yg.J;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6537m;
import m0.AbstractC6670H;
import m0.C6733v0;
import m0.InterfaceC6717n0;
import mh.InterfaceC6824a;
import o0.InterfaceC7036c;
import oh.AbstractC7137b;
import y.InterfaceC8560o;

/* loaded from: classes.dex */
public final class a extends o implements S0, k {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17867c;

    /* renamed from: d, reason: collision with root package name */
    private final float f17868d;

    /* renamed from: e, reason: collision with root package name */
    private final z1 f17869e;

    /* renamed from: f, reason: collision with root package name */
    private final z1 f17870f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f17871g;

    /* renamed from: h, reason: collision with root package name */
    private j f17872h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3551q0 f17873i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3551q0 f17874j;

    /* renamed from: k, reason: collision with root package name */
    private long f17875k;

    /* renamed from: l, reason: collision with root package name */
    private int f17876l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC6824a f17877m;

    /* renamed from: P.a$a, reason: collision with other inner class name */
    static final class C0628a extends AbstractC6494u implements InterfaceC6824a {
        C0628a() {
            super(0);
        }

        public final void a() {
            a.this.o(!r0.l());
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public /* synthetic */ a(boolean z10, float f10, z1 z1Var, z1 z1Var2, ViewGroup viewGroup, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, z1Var, z1Var2, viewGroup);
    }

    private final void k() {
        j jVar = this.f17872h;
        if (jVar != null) {
            jVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        return ((Boolean) this.f17874j.getValue()).booleanValue();
    }

    private final j m() {
        j jVar = this.f17872h;
        if (jVar != null) {
            AbstractC6492s.f(jVar);
            return jVar;
        }
        j jVarC = t.c(this.f17871g);
        this.f17872h = jVarC;
        AbstractC6492s.f(jVarC);
        return jVarC;
    }

    private final n n() {
        return (n) this.f17873i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(boolean z10) {
        this.f17874j.setValue(Boolean.valueOf(z10));
    }

    private final void p(n nVar) {
        this.f17873i.setValue(nVar);
    }

    @Override // P.k
    public void E0() {
        p(null);
    }

    @Override // s.InterfaceC7835H
    public void a(InterfaceC7036c interfaceC7036c) {
        this.f17875k = interfaceC7036c.c();
        this.f17876l = Float.isNaN(this.f17868d) ? AbstractC7137b.e(i.a(interfaceC7036c, this.f17867c, interfaceC7036c.c())) : interfaceC7036c.x1(this.f17868d);
        long jU = ((C6733v0) this.f17869e.getValue()).u();
        float fD = ((g) this.f17870f.getValue()).d();
        interfaceC7036c.X1();
        f(interfaceC7036c, this.f17868d, jU);
        InterfaceC6717n0 interfaceC6717n0D = interfaceC7036c.k1().d();
        l();
        n nVarN = n();
        if (nVarN != null) {
            nVarN.f(interfaceC7036c.c(), jU, fD);
            nVarN.draw(AbstractC6670H.d(interfaceC6717n0D));
        }
    }

    @Override // T.S0
    public void b() {
        k();
    }

    @Override // T.S0
    public void c() {
        k();
    }

    @Override // T.S0
    public void d() {
    }

    @Override // P.o
    public void e(InterfaceC8560o.b bVar, N n10) {
        n nVarB = m().b(this);
        nVarB.b(bVar, this.f17867c, this.f17875k, this.f17876l, ((C6733v0) this.f17869e.getValue()).u(), ((g) this.f17870f.getValue()).d(), this.f17877m);
        p(nVarB);
    }

    @Override // P.o
    public void g(InterfaceC8560o.b bVar) {
        n nVarN = n();
        if (nVarN != null) {
            nVarN.e();
        }
    }

    private a(boolean z10, float f10, z1 z1Var, z1 z1Var2, ViewGroup viewGroup) {
        super(z10, z1Var2);
        this.f17867c = z10;
        this.f17868d = f10;
        this.f17869e = z1Var;
        this.f17870f = z1Var2;
        this.f17871g = viewGroup;
        this.f17873i = t1.d(null, null, 2, null);
        this.f17874j = t1.d(Boolean.TRUE, null, 2, null);
        this.f17875k = C6537m.f52356b.b();
        this.f17876l = -1;
        this.f17877m = new C0628a();
    }
}
