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
final class s extends e.c implements B {

    /* renamed from: n, reason: collision with root package name */
    private float f28211n;

    /* renamed from: o, reason: collision with root package name */
    private float f28212o;

    /* renamed from: p, reason: collision with root package name */
    private float f28213p;

    /* renamed from: q, reason: collision with root package name */
    private float f28214q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f28215r;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f28216a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.t tVar) {
            super(1);
            this.f28216a = tVar;
        }

        public final void a(t.a aVar) {
            t.a.l(aVar, this.f28216a, 0, 0, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public /* synthetic */ s(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    private final long D2(Y0.d dVar) {
        int iD;
        int iD2;
        float f10 = this.f28213p;
        h.a aVar = Y0.h.f24523b;
        int i10 = 0;
        int iD3 = !Y0.h.n(f10, aVar.c()) ? AbstractC7978m.d(dVar.x1(this.f28213p), 0) : Integer.MAX_VALUE;
        int iD4 = !Y0.h.n(this.f28214q, aVar.c()) ? AbstractC7978m.d(dVar.x1(this.f28214q), 0) : Integer.MAX_VALUE;
        if (Y0.h.n(this.f28211n, aVar.c()) || (iD = AbstractC7978m.d(AbstractC7978m.g(dVar.x1(this.f28211n), iD3), 0)) == Integer.MAX_VALUE) {
            iD = 0;
        }
        if (!Y0.h.n(this.f28212o, aVar.c()) && (iD2 = AbstractC7978m.d(AbstractC7978m.g(dVar.x1(this.f28212o), iD4), 0)) != Integer.MAX_VALUE) {
            i10 = iD2;
        }
        return Y0.c.a(iD, iD3, i10, iD4);
    }

    @Override // E0.B
    public int A(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        long jD2 = D2(interfaceC2535o);
        return Y0.b.j(jD2) ? Y0.b.l(jD2) : Y0.c.i(jD2, interfaceC2534n.S(i10));
    }

    public final void E2(boolean z10) {
        this.f28215r = z10;
    }

    public final void F2(float f10) {
        this.f28214q = f10;
    }

    public final void G2(float f10) {
        this.f28213p = f10;
    }

    public final void H2(float f10) {
        this.f28212o = f10;
    }

    public final void I2(float f10) {
        this.f28211n = f10;
    }

    @Override // E0.B
    public D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        long jA;
        long jD2 = D2(mVar);
        if (this.f28215r) {
            jA = Y0.c.g(j10, jD2);
        } else {
            float f10 = this.f28211n;
            h.a aVar = Y0.h.f24523b;
            jA = Y0.c.a(!Y0.h.n(f10, aVar.c()) ? Y0.b.n(jD2) : AbstractC7978m.g(Y0.b.n(j10), Y0.b.l(jD2)), !Y0.h.n(this.f28213p, aVar.c()) ? Y0.b.l(jD2) : AbstractC7978m.d(Y0.b.l(j10), Y0.b.n(jD2)), !Y0.h.n(this.f28212o, aVar.c()) ? Y0.b.m(jD2) : AbstractC7978m.g(Y0.b.m(j10), Y0.b.k(jD2)), !Y0.h.n(this.f28214q, aVar.c()) ? Y0.b.k(jD2) : AbstractC7978m.d(Y0.b.k(j10), Y0.b.m(jD2)));
        }
        androidx.compose.ui.layout.t tVarT = b10.T(jA);
        return androidx.compose.ui.layout.m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new a(tVarT), 4, null);
    }

    @Override // E0.B
    public int p(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        long jD2 = D2(interfaceC2535o);
        return Y0.b.i(jD2) ? Y0.b.k(jD2) : Y0.c.h(jD2, interfaceC2534n.s0(i10));
    }

    @Override // E0.B
    public int r(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        long jD2 = D2(interfaceC2535o);
        return Y0.b.j(jD2) ? Y0.b.l(jD2) : Y0.c.i(jD2, interfaceC2534n.R(i10));
    }

    @Override // E0.B
    public int v(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        long jD2 = D2(interfaceC2535o);
        return Y0.b.i(jD2) ? Y0.b.k(jD2) : Y0.c.h(jD2, interfaceC2534n.s(i10));
    }

    private s(float f10, float f11, float f12, float f13, boolean z10) {
        this.f28211n = f10;
        this.f28212o = f11;
        this.f28213p = f12;
        this.f28214q = f13;
        this.f28215r = z10;
    }
}
