package androidx.compose.foundation.layout;

import C0.D;
import E0.B;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;
import z.EnumC8691n;

/* loaded from: classes.dex */
final class g extends e.c implements B {

    /* renamed from: n, reason: collision with root package name */
    private EnumC8691n f28132n;

    /* renamed from: o, reason: collision with root package name */
    private float f28133o;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f28134a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.t tVar) {
            super(1);
            this.f28134a = tVar;
        }

        public final void a(t.a aVar) {
            t.a.l(aVar, this.f28134a, 0, 0, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public g(EnumC8691n enumC8691n, float f10) {
        this.f28132n = enumC8691n;
        this.f28133o = f10;
    }

    public final void D2(EnumC8691n enumC8691n) {
        this.f28132n = enumC8691n;
    }

    public final void E2(float f10) {
        this.f28133o = f10;
    }

    @Override // E0.B
    public D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        int iN;
        int iL;
        int iK;
        int iK2;
        if (!Y0.b.h(j10) || this.f28132n == EnumC8691n.Vertical) {
            iN = Y0.b.n(j10);
            iL = Y0.b.l(j10);
        } else {
            iN = AbstractC7978m.k(Math.round(Y0.b.l(j10) * this.f28133o), Y0.b.n(j10), Y0.b.l(j10));
            iL = iN;
        }
        if (!Y0.b.g(j10) || this.f28132n == EnumC8691n.Horizontal) {
            int iM = Y0.b.m(j10);
            iK = Y0.b.k(j10);
            iK2 = iM;
        } else {
            iK2 = AbstractC7978m.k(Math.round(Y0.b.k(j10) * this.f28133o), Y0.b.m(j10), Y0.b.k(j10));
            iK = iK2;
        }
        androidx.compose.ui.layout.t tVarT = b10.T(Y0.c.a(iN, iL, iK2, iK));
        return androidx.compose.ui.layout.m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new a(tVarT), 4, null);
    }
}
