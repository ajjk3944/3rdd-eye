package af;

import C9.h;
import C9.i;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import af.AbstractC3805N;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import s9.b;
import s9.d;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* renamed from: af.N, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3805N {

    /* renamed from: af.N$a */
    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC3801J f26012a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f26013b;

        /* renamed from: af.N$a$a, reason: collision with other inner class name */
        static final class C1005a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            public static final C1005a f26014a = new C1005a();

            C1005a() {
            }

            public final long a(InterfaceC3540l interfaceC3540l, int i10) {
                interfaceC3540l.U(-646889706);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-646889706, i10, -1, "com.ui.wifiman.ui.speed.component.SpeedTabPermissionCardUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedTabPermissionCardUi.kt:46)");
                }
                long jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().h().f();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return jF;
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return C6733v0.g(a((InterfaceC3540l) obj, ((Number) obj2).intValue()));
            }
        }

        a(EnumC3801J enumC3801J, InterfaceC6835l interfaceC6835l) {
            this.f26012a = enumC3801J;
            this.f26013b = interfaceC6835l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J e(InterfaceC6835l interfaceC6835l, EnumC3801J enumC3801J) {
            interfaceC6835l.invoke(enumC3801J.name());
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J f() {
            return Yg.J.f24997a;
        }

        public final void c(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-550539028, i10, -1, "com.ui.wifiman.ui.speed.component.SpeedTabPermissionCardUi.<anonymous>.<anonymous>.<anonymous> (SpeedTabPermissionCardUi.kt:40)");
            }
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            C9.i iVar = new C9.i(this.f26012a.name(), N9.b.f16117a.v().f(new b.C2145b("orange", C1005a.f26014a)), this.f26012a.getText(), new i.a.b(new d.b(AbstractC6780c.f53334J1)), null, 16, null);
            interfaceC3540l.U(-1426304378);
            boolean zT = interfaceC3540l.T(this.f26013b) | interfaceC3540l.T(this.f26012a);
            final InterfaceC6835l interfaceC6835l = this.f26013b;
            final EnumC3801J enumC3801J = this.f26012a;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: af.L
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return AbstractC3805N.a.e(interfaceC6835l, enumC3801J);
                    }
                };
                interfaceC3540l.K(objF);
            }
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF;
            interfaceC3540l.J();
            interfaceC3540l.U(-1426301828);
            Object objF2 = interfaceC3540l.f();
            if (objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6824a() { // from class: af.M
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return AbstractC3805N.a.f();
                    }
                };
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            C9.s.o(eVarH, iVar, false, interfaceC6824a, (InterfaceC6824a) objF2, h.a.f2378a, interfaceC3540l, 221190, 4);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            c((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final C3800I model, final InterfaceC6835l onPermissionsActionClicked, InterfaceC3540l interfaceC3540l, final int i10) {
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        AbstractC6492s.i(onPermissionsActionClicked, "onPermissionsActionClicked");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1651277247);
        int i11 = (i10 & 6) == 0 ? (interfaceC3540lR.T(modifier) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.l(onPermissionsActionClicked) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1651277247, i11, -1, "com.ui.wifiman.ui.speed.component.SpeedTabPermissionCardUi (SpeedTabPermissionCardUi.kt:27)");
            }
            float f10 = 0.0f;
            Object obj = null;
            androidx.compose.ui.e eVarB = androidx.compose.animation.f.b(androidx.compose.foundation.layout.o.k(modifier, C6562a.f52458a.d(interfaceC3540lR, C6562a.f52459b).a().a().c(), 0.0f, 2, null), null, null, 3, null);
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(8)), f0.c.f46573a.k(), interfaceC3540lR, 6);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarB);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            List listA = model.a();
            interfaceC3540lR.U(2074479349);
            for (EnumC3801J enumC3801J : EnumC3801J.getEntries()) {
                AbstractC7385d.d(c8688k, listA.contains(enumC3801J), androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, f10, 1, obj), null, null, null, b0.c.e(-550539028, true, new a(enumC3801J, onPermissionsActionClicked), interfaceC3540lR, 54), interfaceC3540lR, 1573254, 28);
                f10 = f10;
                listA = listA;
                obj = obj;
            }
            interfaceC3540lR.J();
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: af.K
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj2, Object obj3) {
                    return AbstractC3805N.c(modifier, model, onPermissionsActionClicked, i10, (InterfaceC3540l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, C3800I c3800i, InterfaceC6835l interfaceC6835l, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, c3800i, interfaceC6835l, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
