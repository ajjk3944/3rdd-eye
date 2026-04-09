package androidx.compose.material;

import C0.D;
import E0.B;
import N.C3310b;
import Y0.r;
import Yg.J;
import Yg.s;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.m;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import oh.AbstractC7137b;
import w.q;

/* loaded from: classes.dex */
final class b extends e.c implements B {

    /* renamed from: n, reason: collision with root package name */
    private C3310b f28600n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC6839p f28601o;

    /* renamed from: p, reason: collision with root package name */
    private q f28602p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28603q;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f28604a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f28605b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f28606c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, b bVar, t tVar) {
            super(1);
            this.f28604a = mVar;
            this.f28605b = bVar;
            this.f28606c = tVar;
        }

        public final void a(t.a aVar) {
            float fE = this.f28604a.a1() ? this.f28605b.E2().o().e(this.f28605b.E2().x()) : this.f28605b.E2().A();
            float f10 = this.f28605b.D2() == q.Horizontal ? fE : 0.0f;
            if (this.f28605b.D2() != q.Vertical) {
                fE = 0.0f;
            }
            t.a.h(aVar, this.f28606c, AbstractC7137b.e(f10), AbstractC7137b.e(fE), 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public b(C3310b c3310b, InterfaceC6839p interfaceC6839p, q qVar) {
        this.f28600n = c3310b;
        this.f28601o = interfaceC6839p;
        this.f28602p = qVar;
    }

    public final q D2() {
        return this.f28602p;
    }

    public final C3310b E2() {
        return this.f28600n;
    }

    public final void F2(InterfaceC6839p interfaceC6839p) {
        this.f28601o = interfaceC6839p;
    }

    public final void G2(q qVar) {
        this.f28602p = qVar;
    }

    public final void H2(C3310b c3310b) {
        this.f28600n = c3310b;
    }

    @Override // E0.B
    public D b(m mVar, C0.B b10, long j10) {
        t tVarT = b10.T(j10);
        if (!mVar.a1() || !this.f28603q) {
            s sVar = (s) this.f28601o.invoke(r.b(Y0.s.a(tVarT.I0(), tVarT.C0())), Y0.b.a(j10));
            this.f28600n.I((N.D) sVar.h(), sVar.j());
        }
        this.f28603q = mVar.a1() || this.f28603q;
        return m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new a(mVar, this, tVarT), 4, null);
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        this.f28603q = false;
    }
}
