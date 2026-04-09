package I;

import C0.AbstractC2522b;
import E0.AbstractC2631i;
import E0.InterfaceC2630h;
import E0.InterfaceC2641t;
import Q0.AbstractC3434k;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.platform.AbstractC3932k0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class j1 extends e.c implements E0.B, InterfaceC2641t, InterfaceC2630h {

    /* renamed from: n, reason: collision with root package name */
    private l1 f8358n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f8359o;

    /* renamed from: p, reason: collision with root package name */
    private Map f8360p;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f8361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.t tVar) {
            super(1);
            this.f8361a = tVar;
        }

        public final void a(t.a aVar) {
            t.a.h(aVar, this.f8361a, 0, 0, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    public j1(l1 l1Var, o1 o1Var, L0.U u10, boolean z10, InterfaceC6839p interfaceC6839p) {
        this.f8358n = l1Var;
        this.f8359o = z10;
        l1Var.p(interfaceC6839p);
        l1 l1Var2 = this.f8358n;
        boolean z11 = this.f8359o;
        l1Var2.r(o1Var, u10, z11, !z11);
    }

    @Override // E0.InterfaceC2641t
    public void B(C0.r rVar) {
        this.f8358n.q(rVar);
    }

    public final void D2(l1 l1Var, o1 o1Var, L0.U u10, boolean z10, InterfaceC6839p interfaceC6839p) {
        this.f8358n = l1Var;
        l1Var.p(interfaceC6839p);
        this.f8359o = z10;
        this.f8358n.r(o1Var, u10, z10, !z10);
    }

    @Override // E0.B
    public C0.D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        L0.M mL = this.f8358n.l(mVar, mVar.getLayoutDirection(), (AbstractC3434k.b) AbstractC2631i.a(this, AbstractC3932k0.i()), j10);
        androidx.compose.ui.layout.t tVarT = b10.T(Y0.b.f24516b.b(Y0.r.g(mL.B()), Y0.r.g(mL.B()), Y0.r.f(mL.B()), Y0.r.f(mL.B())));
        this.f8358n.o(this.f8359o ? mVar.x(F.T.a(mL.m(0))) : Y0.h.j(0));
        Map linkedHashMap = this.f8360p;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap(2);
        }
        linkedHashMap.put(AbstractC2522b.a(), Integer.valueOf(Math.round(mL.h())));
        linkedHashMap.put(AbstractC2522b.b(), Integer.valueOf(Math.round(mL.k())));
        this.f8360p = linkedHashMap;
        int iG = Y0.r.g(mL.B());
        int iF = Y0.r.f(mL.B());
        Map map = this.f8360p;
        AbstractC6492s.f(map);
        return mVar.v1(iG, iF, map, new a(tVarT));
    }
}
