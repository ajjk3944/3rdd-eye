package androidx.compose.runtime.snapshots;

import T.AbstractC3517c;
import d0.AbstractC5277i;
import d0.InterfaceC5279k;
import kotlin.KotlinNothingValueException;
import mh.InterfaceC6835l;
import o.I;

/* loaded from: classes.dex */
public final class p extends b {

    /* renamed from: s, reason: collision with root package name */
    private final b f28717s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f28718t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f28719u;

    /* renamed from: v, reason: collision with root package name */
    private InterfaceC6835l f28720v;

    /* renamed from: w, reason: collision with root package name */
    private InterfaceC6835l f28721w;

    /* renamed from: x, reason: collision with root package name */
    private final long f28722x;

    public p(b bVar, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, boolean z10, boolean z11) {
        InterfaceC6835l interfaceC6835lK;
        InterfaceC6835l interfaceC6835lH;
        super(0, i.f28640e.a(), j.K(interfaceC6835l, (bVar == null || (interfaceC6835lH = bVar.h()) == null) ? ((a) j.f28661j.get()).h() : interfaceC6835lH, z10), j.M(interfaceC6835l2, (bVar == null || (interfaceC6835lK = bVar.k()) == null) ? ((a) j.f28661j.get()).k() : interfaceC6835lK));
        this.f28717s = bVar;
        this.f28718t = z10;
        this.f28719u = z11;
        this.f28720v = super.h();
        this.f28721w = super.k();
        this.f28722x = AbstractC3517c.a();
    }

    private final b T() {
        b bVar = this.f28717s;
        return bVar == null ? (b) j.f28661j.get() : bVar;
    }

    @Override // androidx.compose.runtime.snapshots.b
    public h C() {
        return T().C();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public I E() {
        return T().E();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public InterfaceC6835l h() {
        return this.f28720v;
    }

    @Override // androidx.compose.runtime.snapshots.b
    public void P(I i10) {
        AbstractC5277i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b
    public b Q(InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2) {
        InterfaceC6835l interfaceC6835lL = j.L(interfaceC6835l, h(), false, 4, null);
        InterfaceC6835l interfaceC6835lM = j.M(interfaceC6835l2, k());
        return !this.f28718t ? new p(T().Q(null, interfaceC6835lM), interfaceC6835lL, interfaceC6835lM, false, true) : T().Q(interfaceC6835lL, interfaceC6835lM);
    }

    public final long U() {
        return this.f28722x;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public Void m(g gVar) {
        AbstractC5277i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Void n(g gVar) {
        AbstractC5277i.a();
        throw new KotlinNothingValueException();
    }

    public void X(InterfaceC6835l interfaceC6835l) {
        this.f28720v = interfaceC6835l;
    }

    public void Y(InterfaceC6835l interfaceC6835l) {
        this.f28721w = interfaceC6835l;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void d() {
        b bVar;
        t(true);
        if (!this.f28719u || (bVar = this.f28717s) == null) {
            return;
        }
        bVar.d();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public int f() {
        return T().f();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public i g() {
        return T().g();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public boolean i() {
        return T().i();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public int j() {
        return T().j();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public InterfaceC6835l k() {
        return this.f28721w;
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void o() {
        T().o();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void p(InterfaceC5279k interfaceC5279k) {
        T().p(interfaceC5279k);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void u(int i10) {
        AbstractC5277i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void v(i iVar) {
        AbstractC5277i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public void w(int i10) {
        T().w(i10);
    }

    @Override // androidx.compose.runtime.snapshots.b, androidx.compose.runtime.snapshots.g
    public g x(InterfaceC6835l interfaceC6835l) {
        InterfaceC6835l interfaceC6835lL = j.L(interfaceC6835l, h(), false, 4, null);
        return !this.f28718t ? j.D(T().x(null), interfaceC6835lL, true) : T().x(interfaceC6835lL);
    }
}
