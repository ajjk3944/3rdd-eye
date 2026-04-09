package O;

import Ii.N;
import T.A;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.O;
import T.o1;
import T.z1;
import Yg.J;
import androidx.compose.ui.platform.AbstractC3932k0;
import dh.C5385j;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.K;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class h {

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f16721a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16722b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f16723c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ K f16724d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, boolean z10, K k10, K k11) {
            super(0);
            this.f16721a = gVar;
            this.f16722b = z10;
            this.f16723c = k10;
            this.f16724d = k11;
        }

        public final void a() {
            this.f16721a.t(this.f16722b);
            this.f16721a.v(this.f16723c.f51686a);
            this.f16721a.u(this.f16724d.f51686a);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public static final g a(boolean z10, InterfaceC6824a interfaceC6824a, float f10, float f11, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        if ((i11 & 4) != 0) {
            f10 = b.f16660a.a();
        }
        if ((i11 & 8) != 0) {
            f11 = b.f16660a.b();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-174977512, i10, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:62)");
        }
        if (Y0.h.h(f10, Y0.h.j(0)) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            Object a10 = new A(O.i(C5385j.f46088a, interfaceC3540l));
            interfaceC3540l.K(a10);
            objF = a10;
        }
        N nA = ((A) objF).a();
        z1 z1VarN = o1.n(interfaceC6824a, interfaceC3540l, (i10 >> 3) & 14);
        K k10 = new K();
        K k11 = new K();
        Y0.d dVar = (Y0.d) interfaceC3540l.t(AbstractC3932k0.g());
        k10.f51686a = dVar.d1(f10);
        k11.f51686a = dVar.d1(f11);
        boolean zT = interfaceC3540l.T(nA);
        Object objF2 = interfaceC3540l.f();
        if (zT || objF2 == aVar.a()) {
            objF2 = new g(nA, z1VarN, k11.f51686a, k10.f51686a);
            interfaceC3540l.K(objF2);
        }
        g gVar = (g) objF2;
        boolean zL = interfaceC3540l.l(gVar) | ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.c(z10)) || (i10 & 6) == 4) | interfaceC3540l.g(k10.f51686a) | interfaceC3540l.g(k11.f51686a);
        Object objF3 = interfaceC3540l.f();
        if (zL || objF3 == aVar.a()) {
            objF3 = new a(gVar, z10, k10, k11);
            interfaceC3540l.K(objF3);
        }
        O.g((InterfaceC6824a) objF3, interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return gVar;
    }
}
