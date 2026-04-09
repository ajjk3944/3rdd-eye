package Le;

import C0.C;
import E0.InterfaceC2629g;
import Ee.B;
import Ee.C2706g;
import Ee.z;
import Ii.N;
import Ii.Y;
import Le.b;
import Le.m;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.InterfaceC3563x;
import T.L0;
import T.O;
import T.X0;
import T.o1;
import T.t1;
import Yg.J;
import Yg.v;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import f0.c;
import j0.AbstractC6234e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.AbstractC7385d;
import q.InterfaceC7386e;

/* loaded from: classes4.dex */
public abstract class m {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f11617a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f11618b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3551q0 interfaceC3551q0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f11618b = interfaceC3551q0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f11618b, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f11617a;
            if (i10 == 0) {
                v.b(obj);
                if (((Boolean) this.f11618b.getValue()).booleanValue()) {
                    this.f11617a = 1;
                    if (Y.a(500L, this) == objG) {
                        return objG;
                    }
                }
                return J.f24997a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            this.f11618b.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* synthetic */ class b extends C6490p implements InterfaceC6835l {
        b(Object obj) {
            super(1, obj, Le.d.class, "onDeviceCategoryHeaderButtonClicked", "onDeviceCategoryHeaderButtonClicked(Ljava/lang/String;)V", 0);
        }

        public final void a(String p02) {
            AbstractC6492s.i(p02, "p0");
            ((Le.d) this.receiver).t0(p02);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return J.f24997a;
        }
    }

    static final class c implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Le.d f11619a;

        c(Le.d dVar) {
            this.f11619a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J e(Le.d dVar, Me.f fVar) {
            dVar.u0(((Me.g) fVar).getId());
            return J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J f(Le.d dVar, Me.f fVar) {
            dVar.u0(((Me.c) fVar).getId());
            return J.f24997a;
        }

        public final void c(androidx.compose.ui.e itemModifier, final Me.f item, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            AbstractC6492s.i(itemModifier, "itemModifier");
            AbstractC6492s.i(item, "item");
            if ((i10 & 6) == 0) {
                i11 = (interfaceC3540l.T(itemModifier) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= (i10 & 64) == 0 ? interfaceC3540l.T(item) : interfaceC3540l.l(item) ? 32 : 16;
            }
            if ((i11 & 147) == 146 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-660764908, i11, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeResults.<anonymous>.<anonymous> (DiscoveryHomeResults.kt:66)");
            }
            boolean z10 = true;
            if (item instanceof Me.g) {
                interfaceC3540l.U(-937429316);
                interfaceC3540l.U(-937426298);
                boolean zT = interfaceC3540l.T(this.f11619a);
                if ((i11 & 112) != 32 && ((i11 & 64) == 0 || !interfaceC3540l.l(item))) {
                    z10 = false;
                }
                boolean z11 = zT | z10;
                final Le.d dVar = this.f11619a;
                Object objF = interfaceC3540l.f();
                if (z11 || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: Le.n
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return m.c.e(dVar, item);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                Me.i.b(androidx.compose.foundation.d.d(itemModifier, false, null, null, (InterfaceC6824a) objF, 7, null), (Me.g) item, interfaceC3540l, 0);
                interfaceC3540l.J();
            } else {
                if (!(item instanceof Me.c)) {
                    interfaceC3540l.U(-937430772);
                    interfaceC3540l.J();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC3540l.U(-937421982);
                interfaceC3540l.U(-937418778);
                boolean zT2 = interfaceC3540l.T(this.f11619a);
                if ((i11 & 112) != 32 && ((i11 & 64) == 0 || !interfaceC3540l.l(item))) {
                    z10 = false;
                }
                boolean z12 = zT2 | z10;
                final Le.d dVar2 = this.f11619a;
                Object objF2 = interfaceC3540l.f();
                if (z12 || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new InterfaceC6824a() { // from class: Le.o
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return m.c.f(dVar2, item);
                        }
                    };
                    interfaceC3540l.K(objF2);
                }
                interfaceC3540l.J();
                Me.e.b(androidx.compose.foundation.d.d(itemModifier, false, null, null, (InterfaceC6824a) objF2, 7, null), (Me.c) item, interfaceC3540l, 0);
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            c((androidx.compose.ui.e) obj, (Me.f) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return J.f24997a;
        }
    }

    static final class d implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Le.b f11620a;

        d(Le.b bVar) {
            this.f11620a = bVar;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            float fA;
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-904571516, i10, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeResults.<anonymous>.<anonymous> (DiscoveryHomeResults.kt:99)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            C6562a c6562a = C6562a.f52458a;
            int i11 = C6562a.f52459b;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(aVar, c6562a.d(interfaceC3540l, i11).a().a().d(), c6562a.d(interfaceC3540l, i11).a().b().a(Y0.h.j(24)));
            Le.b bVar = this.f11620a;
            if ((bVar instanceof b.a) || (bVar instanceof b.AbstractC0461b.a)) {
                fA = 1.0f;
            } else {
                if (!(bVar instanceof b.AbstractC0461b.C0462b)) {
                    throw new NoWhenBranchMatchedException();
                }
                fA = ((b.AbstractC0461b.C0462b) bVar).a();
            }
            Me.b.b(eVarJ, fA, interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    public static final void c(final androidx.compose.ui.e modifier, final boolean z10, final Le.d vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(2141634210);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.c(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2141634210, i11, -1, "com.ui.wifiman.ui.discovery.DiscoveryHomeResults (DiscoveryHomeResults.kt:34)");
            }
            interfaceC3540lR.U(-620518485);
            Object objF = interfaceC3540lR.f();
            InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
            if (objF == aVar.a()) {
                objF = t1.d(Boolean.FALSE, null, 2, null);
                interfaceC3540lR.K(objF);
            }
            final InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
            interfaceC3540lR.J();
            boolean zBooleanValue = ((Boolean) interfaceC3551q0.getValue()).booleanValue();
            interfaceC3540lR.U(-620513675);
            int i12 = i11 & 896;
            boolean z11 = i12 == 256;
            Object objF2 = interfaceC3540lR.f();
            if (z11 || objF2 == aVar.a()) {
                objF2 = new InterfaceC6824a() { // from class: Le.k
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return m.d(vm, interfaceC3551q0);
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            O.g gVarA = O.h.a(zBooleanValue, (InterfaceC6824a) objF2, 0.0f, 0.0f, interfaceC3540lR, 0, 12);
            Object value = interfaceC3551q0.getValue();
            interfaceC3540lR.U(-620506671);
            Object objF3 = interfaceC3540lR.f();
            if (objF3 == aVar.a()) {
                objF3 = new a(interfaceC3551q0, null);
                interfaceC3540lR.K(objF3);
            }
            interfaceC3540lR.J();
            O.f(value, (InterfaceC6839p) objF3, interfaceC3540lR, 0);
            androidx.compose.ui.e eVarB = O.e.b(AbstractC6234e.b(modifier), gVarA, z10);
            c.a aVar2 = f0.c.f46573a;
            C cH = androidx.compose.foundation.layout.d.h(aVar2.o(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarB);
            InterfaceC2629g.a aVar3 = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar3.a();
            if (interfaceC3540lR.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540lR.u();
            if (interfaceC3540lR.o()) {
                interfaceC3540lR.D(interfaceC6824aA);
            } else {
                interfaceC3540lR.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540lR);
            E1.c(interfaceC3540lA, cH, aVar3.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar3.g());
            InterfaceC6839p interfaceC6839pB = aVar3.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar3.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            e.a aVar4 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.r.f(aVar4, 0.0f, 1, null);
            C2706g c2706g = (C2706g) o1.b(vm.n0(), null, interfaceC3540lR, 0, 1).getValue();
            interfaceC3540lR.U(1408949903);
            boolean z12 = i12 == 256;
            Object objF4 = interfaceC3540lR.f();
            if (z12 || objF4 == aVar.a()) {
                objF4 = new b(vm);
                interfaceC3540lR.K(objF4);
            }
            interfaceC3540lR.J();
            z.L(eVarF, c2706g, null, false, false, null, (InterfaceC6835l) ((th.g) objF4), b0.c.e(-660764908, true, new c(vm), interfaceC3540lR, 54), interfaceC3540lR, 12582918, 60);
            O.c.d(((Boolean) interfaceC3551q0.getValue()).booleanValue(), gVarA, fVar.f(aVar4, aVar2.m()), 0L, 0L, false, interfaceC3540lR, O.g.f16703j << 3, 56);
            interfaceC3540l2 = interfaceC3540lR;
            B.b(null, C6562a.f52458a.a(interfaceC3540l2, C6562a.f52459b).e().a(), interfaceC3540l2, 0, 1);
            Le.b bVar = (Le.b) o1.b(vm.p0(), null, interfaceC3540l2, 0, 1).getValue();
            AbstractC7385d.f(bVar instanceof b.AbstractC0461b, fVar.f(aVar4, aVar2.b()), androidx.compose.animation.g.o(null, 0.0f, 3, null), androidx.compose.animation.g.q(null, 0.0f, 3, null), null, b0.c.e(-904571516, true, new d(bVar), interfaceC3540l2, 54), interfaceC3540l2, 200064, 16);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Le.l
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return m.e(modifier, z10, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(Le.d dVar, InterfaceC3551q0 interfaceC3551q0) {
        dVar.x0();
        interfaceC3551q0.setValue(Boolean.TRUE);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(androidx.compose.ui.e eVar, boolean z10, Le.d dVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        c(eVar, z10, dVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
