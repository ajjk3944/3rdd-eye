package androidx.compose.foundation.layout;

import C0.D;
import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import E0.B;
import Y0.h;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
final class t extends e.c implements B {

    /* renamed from: n, reason: collision with root package name */
    private float f28217n;

    /* renamed from: o, reason: collision with root package name */
    private float f28218o;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f28219a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.t tVar) {
            super(1);
            this.f28219a = tVar;
        }

        public final void a(t.a aVar) {
            t.a.l(aVar, this.f28219a, 0, 0, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public /* synthetic */ t(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    @Override // E0.B
    public int A(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return AbstractC7978m.d(interfaceC2534n.S(i10), !Y0.h.n(this.f28217n, Y0.h.f24523b.c()) ? interfaceC2535o.x1(this.f28217n) : 0);
    }

    public final void D2(float f10) {
        this.f28218o = f10;
    }

    public final void E2(float f10) {
        this.f28217n = f10;
    }

    @Override // E0.B
    public D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        float f10 = this.f28217n;
        h.a aVar = Y0.h.f24523b;
        androidx.compose.ui.layout.t tVarT = b10.T(Y0.c.a((Y0.h.n(f10, aVar.c()) || Y0.b.n(j10) != 0) ? Y0.b.n(j10) : AbstractC7978m.d(AbstractC7978m.g(mVar.x1(this.f28217n), Y0.b.l(j10)), 0), Y0.b.l(j10), (Y0.h.n(this.f28218o, aVar.c()) || Y0.b.m(j10) != 0) ? Y0.b.m(j10) : AbstractC7978m.d(AbstractC7978m.g(mVar.x1(this.f28218o), Y0.b.k(j10)), 0), Y0.b.k(j10)));
        return androidx.compose.ui.layout.m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new a(tVarT), 4, null);
    }

    @Override // E0.B
    public int p(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return AbstractC7978m.d(interfaceC2534n.s0(i10), !Y0.h.n(this.f28218o, Y0.h.f24523b.c()) ? interfaceC2535o.x1(this.f28218o) : 0);
    }

    @Override // E0.B
    public int r(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return AbstractC7978m.d(interfaceC2534n.R(i10), !Y0.h.n(this.f28217n, Y0.h.f24523b.c()) ? interfaceC2535o.x1(this.f28217n) : 0);
    }

    @Override // E0.B
    public int v(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return AbstractC7978m.d(interfaceC2534n.s(i10), !Y0.h.n(this.f28218o, Y0.h.f24523b.c()) ? interfaceC2535o.x1(this.f28218o) : 0);
    }

    private t(float f10, float f11) {
        this.f28217n = f10;
        this.f28218o = f11;
    }
}
