package androidx.compose.foundation.layout;

import C0.D;
import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import E0.B;
import Yg.J;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
abstract class j extends e.c implements B {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f28139a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.t tVar) {
            super(1);
            this.f28139a = tVar;
        }

        public final void a(t.a aVar) {
            t.a.n(aVar, this.f28139a, Y0.n.f24536b.a(), 0.0f, 2, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    @Override // E0.B
    public int A(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return interfaceC2534n.S(i10);
    }

    public abstract long D2(androidx.compose.ui.layout.m mVar, C0.B b10, long j10);

    public abstract boolean E2();

    @Override // E0.B
    public final D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        long jD2 = D2(mVar, b10, j10);
        if (E2()) {
            jD2 = Y0.c.g(j10, jD2);
        }
        androidx.compose.ui.layout.t tVarT = b10.T(jD2);
        return androidx.compose.ui.layout.m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new a(tVarT), 4, null);
    }

    public int p(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return interfaceC2534n.s0(i10);
    }

    @Override // E0.B
    public int r(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return interfaceC2534n.R(i10);
    }

    public int v(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return interfaceC2534n.s(i10);
    }
}
