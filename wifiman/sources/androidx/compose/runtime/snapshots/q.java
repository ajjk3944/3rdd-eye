package androidx.compose.runtime.snapshots;

import T.AbstractC3517c;
import d0.AbstractC5277i;
import d0.InterfaceC5279k;
import kotlin.KotlinNothingValueException;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class q extends g {

    /* renamed from: g, reason: collision with root package name */
    private final g f28723g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f28724h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f28725i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC6835l f28726j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC6835l f28727k;

    /* renamed from: l, reason: collision with root package name */
    private final long f28728l;

    /* renamed from: m, reason: collision with root package name */
    private final g f28729m;

    public q(g gVar, InterfaceC6835l interfaceC6835l, boolean z10, boolean z11) {
        InterfaceC6835l interfaceC6835lH;
        super(0, i.f28640e.a(), null);
        this.f28723g = gVar;
        this.f28724h = z10;
        this.f28725i = z11;
        this.f28726j = j.K(interfaceC6835l, (gVar == null || (interfaceC6835lH = gVar.h()) == null) ? ((a) j.f28661j.get()).h() : interfaceC6835lH, z10);
        this.f28728l = AbstractC3517c.a();
        this.f28729m = this;
    }

    private final g A() {
        g gVar = this.f28723g;
        return gVar == null ? (g) j.f28661j.get() : gVar;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public InterfaceC6835l h() {
        return this.f28726j;
    }

    public final long C() {
        return this.f28728l;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void m(g gVar) {
        AbstractC5277i.a();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Void n(g gVar) {
        AbstractC5277i.a();
        throw new KotlinNothingValueException();
    }

    public void F(InterfaceC6835l interfaceC6835l) {
        this.f28726j = interfaceC6835l;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void d() {
        g gVar;
        t(true);
        if (!this.f28725i || (gVar = this.f28723g) == null) {
            return;
        }
        gVar.d();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public int f() {
        return A().f();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public i g() {
        return A().g();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public boolean i() {
        return A().i();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public InterfaceC6835l k() {
        return this.f28727k;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void o() {
        A().o();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void p(InterfaceC5279k interfaceC5279k) {
        A().p(interfaceC5279k);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public g x(InterfaceC6835l interfaceC6835l) {
        InterfaceC6835l interfaceC6835lL = j.L(interfaceC6835l, h(), false, 4, null);
        return !this.f28724h ? j.D(A().x(null), interfaceC6835lL, true) : A().x(interfaceC6835lL);
    }
}
