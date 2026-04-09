package jj;

import C0.C;
import C0.w;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.X0;
import T.Z0;
import Y0.t;
import Yg.J;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.w1;
import f0.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import mh.r;

/* loaded from: classes4.dex */
public abstract class e {

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f50907a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f50908b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f50909c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f50910d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f50911e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f50912f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ r f50913g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f50914h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f50915i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, Object obj, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, boolean z10, Integer num, r rVar, int i10, int i11) {
            super(2);
            this.f50907a = iVar;
            this.f50908b = obj;
            this.f50909c = eVar;
            this.f50910d = eVar2;
            this.f50911e = z10;
            this.f50912f = num;
            this.f50913g = rVar;
            this.f50914h = i10;
            this.f50915i = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            e.a(this.f50907a, this.f50908b, this.f50909c, this.f50910d, this.f50911e, this.f50912f, this.f50913g, interfaceC3540l, this.f50914h | 1, this.f50915i);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f50916a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f50917b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, i iVar) {
            super(1);
            this.f50916a = z10;
            this.f50917b = iVar;
        }

        public final void a(androidx.compose.ui.graphics.c graphicsLayer) {
            AbstractC6492s.i(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.j((this.f50916a && this.f50917b.I()) ? 0.0f : this.f50917b.q());
            graphicsLayer.f((!this.f50916a || this.f50917b.I()) ? this.f50917b.r() : 0.0f);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f50918a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f50919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, i iVar) {
            super(1);
            this.f50918a = z10;
            this.f50919b = iVar;
        }

        public final void a(androidx.compose.ui.graphics.c graphicsLayer) {
            AbstractC6492s.i(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.j((this.f50918a && this.f50919b.I()) ? 0.0f : C6531g.m(this.f50919b.m().a()));
            graphicsLayer.f((!this.f50918a || this.f50919b.I()) ? C6531g.n(this.f50919b.m().a()) : 0.0f);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return J.f24997a;
        }
    }

    public static final void a(i state, Object obj, androidx.compose.ui.e eVar, androidx.compose.ui.e eVar2, boolean z10, Integer num, r content, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        boolean zD;
        androidx.compose.ui.e eVarA;
        AbstractC6492s.i(state, "state");
        AbstractC6492s.i(content, "content");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(148083348);
        androidx.compose.ui.e eVar3 = (i11 & 4) != 0 ? androidx.compose.ui.e.f28771b0 : eVar;
        androidx.compose.ui.e eVar4 = (i11 & 8) != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
        boolean z11 = (i11 & 16) != 0 ? true : z10;
        Integer num2 = (i11 & 32) != 0 ? null : num;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(148083348, i10, -1, "org.burnoutcrew.reorderable.ReorderableItem (ReorderableItem.kt:49)");
        }
        boolean zD2 = num2 != null ? AbstractC6492s.d(num2, state.o()) : AbstractC6492s.d(obj, state.p());
        if (zD2) {
            eVarA = androidx.compose.ui.graphics.b.a(l.a(androidx.compose.ui.e.f28771b0, 1.0f), new b(z11, state));
        } else {
            if (num2 != null) {
                d position = state.m().getPosition();
                zD = AbstractC6492s.d(num2, position != null ? Integer.valueOf(position.a()) : null);
            } else {
                d position2 = state.m().getPosition();
                zD = AbstractC6492s.d(obj, position2 != null ? position2.b() : null);
            }
            eVarA = zD ? androidx.compose.ui.graphics.b.a(l.a(androidx.compose.ui.e.f28771b0, 1.0f), new c(z11, state)) : eVar4;
        }
        androidx.compose.ui.e eVarB0 = eVar3.b0(eVarA);
        interfaceC3540lR.e(733328855);
        C cJ = androidx.compose.foundation.layout.d.j(f0.c.f46573a.o(), false, interfaceC3540lR, 0);
        interfaceC3540lR.e(-1323940314);
        Y0.d dVar = (Y0.d) interfaceC3540lR.t(AbstractC3932k0.g());
        t tVar = (t) interfaceC3540lR.t(AbstractC3932k0.m());
        w1 w1Var = (w1) interfaceC3540lR.t(AbstractC3932k0.t());
        InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
        InterfaceC6824a interfaceC6824aA = aVar.a();
        q qVarC = w.c(eVarB0);
        if (interfaceC3540lR.x() == null) {
            AbstractC3536j.c();
        }
        interfaceC3540lR.u();
        if (interfaceC3540lR.o()) {
            interfaceC3540lR.D(interfaceC6824aA);
        } else {
            interfaceC3540lR.I();
        }
        interfaceC3540lR.w();
        InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
        E1.c(interfaceC3540lA, cJ, aVar.e());
        E1.c(interfaceC3540lA, dVar, aVar.c());
        E1.c(interfaceC3540lA, tVar, aVar.d());
        E1.c(interfaceC3540lA, w1Var, aVar.h());
        interfaceC3540lR.h();
        qVarC.s(Z0.a(Z0.b(interfaceC3540lR)), interfaceC3540lR, 0);
        interfaceC3540lR.e(2058660585);
        interfaceC3540lR.e(-2137368960);
        content.y(androidx.compose.foundation.layout.f.f28130a, Boolean.valueOf(zD2), interfaceC3540lR, Integer.valueOf(((i10 >> 12) & 896) | 6));
        interfaceC3540lR.P();
        interfaceC3540lR.P();
        interfaceC3540lR.R();
        interfaceC3540lR.P();
        interfaceC3540lR.P();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z == null) {
            return;
        }
        x0Z.a(new a(state, obj, eVar3, eVar4, z11, num2, content, i10, i11));
    }
}
