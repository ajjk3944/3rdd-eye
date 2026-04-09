package Ke;

import Be.AbstractC2487w;
import C0.C;
import E0.InterfaceC2629g;
import Ke.a;
import L0.C3174d;
import L0.U;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import W0.t;
import Yg.J;
import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AbstractC3932k0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InterfaceC3923h0;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import sa.AbstractC7930a;
import vf.C8221a;
import z.AbstractC8685h;
import z.AbstractC8696t;
import z.C8680c;
import z.C8688k;
import z.InterfaceC8675A;
import z.a0;

/* loaded from: classes4.dex */
public abstract class i {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.C0430a f10718a;

        /* renamed from: Ke.i$a$a, reason: collision with other inner class name */
        static final class C0431a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a.C0430a f10719a;

            C0431a(a.C0430a c0430a) {
                this.f10719a = c0430a;
            }

            public final void a(InterfaceC8675A FlowRow, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(FlowRow, "$this$FlowRow");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(647332233, i10, -1, "com.ui.wifiman.ui.device.card.DeviceDetailCardHeader.<anonymous>.<anonymous>.<anonymous> (DeviceDetailCardHeader.kt:109)");
                }
                Iterator it = this.f10719a.c().iterator();
                while (it.hasNext()) {
                    ((De.g) it.next()).c(interfaceC3540l, 0);
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((InterfaceC8675A) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        a(a.C0430a c0430a) {
            this.f10718a = c0430a;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1591491314, i10, -1, "com.ui.wifiman.ui.device.card.DeviceDetailCardHeader.<anonymous>.<anonymous> (DeviceDetailCardHeader.kt:103)");
            }
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(androidx.compose.ui.e.f28771b0, 0.0f, Y0.h.j(12), 0.0f, 0.0f, 13, null);
            C8680c c8680c = C8680c.f66832a;
            AbstractC8696t.a(eVarM, c8680c.n(Y0.h.j(8)), c8680c.n(Y0.h.j(4)), 0, 0, null, b0.c.e(647332233, true, new C0431a(this.f10718a), interfaceC3540l, 54), interfaceC3540l, 1573302, 56);
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

    public static final void f(final androidx.compose.ui.e modifier, final a.C0430a model, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        C3174d c3174d;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        int i13;
        pa.b bVarB;
        long jC;
        InterfaceC3540l interfaceC3540l3;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(model, "model");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(819701532);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(model) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l3 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(819701532, i11, -1, "com.ui.wifiman.ui.device.card.DeviceDetailCardHeader (DeviceDetailCardHeader.kt:36)");
            }
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(modifier, c6562a.d(interfaceC3540lR, i14).a().a().a(Y0.h.j(32)), c6562a.d(interfaceC3540lR, i14).a().b().c());
            C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.g(), interfaceC3540lR, 48);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarJ);
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
            C3174d c3174dA = AbstractC7930a.a(model.e(), interfaceC3540lR, 0);
            if (model.b() != null) {
                interfaceC3540lR.U(693675094);
                c3174d = c3174dA;
                i12 = i14;
                AbstractC2487w.b(model.b(), androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(81)), 0.0f, Y0.h.j(16), 0.0f, 0.0f, 13, null), null, null, c3174dA.k(), 0.0f, 0L, interfaceC3540lR, 48, 54);
                interfaceC3540lR.J();
                interfaceC3540l2 = interfaceC3540lR;
            } else {
                c3174d = c3174dA;
                i12 = i14;
                interfaceC3540l2 = interfaceC3540lR;
                interfaceC3540l2.U(693995200);
                a0.a(androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.v(androidx.compose.ui.e.f28771b0, Y0.h.j(81)), 0.0f, Y0.h.j(16), 0.0f, 0.0f, 13, null), interfaceC3540l2, 6);
                interfaceC3540l2.J();
            }
            final InterfaceC3923h0 interfaceC3923h0 = (InterfaceC3923h0) interfaceC3540l2.t(AbstractC3932k0.f());
            final Context context = (Context) interfaceC3540l2.t(AndroidCompositionLocals_androidKt.g());
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            float f10 = 8;
            androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(aVar2, 0.0f, Y0.h.j(f10), 0.0f, 0.0f, 13, null);
            interfaceC3540l2.U(160950078);
            final C3174d c3174d2 = c3174d;
            boolean zL = interfaceC3540l2.l(interfaceC3923h0) | interfaceC3540l2.T(c3174d2);
            Object objF = interfaceC3540l2.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: Ke.d
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return i.h(interfaceC3923h0, c3174d2);
                    }
                };
                interfaceC3540l2.K(objF);
            }
            InterfaceC6824a interfaceC6824a = (InterfaceC6824a) objF;
            interfaceC3540l2.J();
            interfaceC3540l2.U(160953673);
            Object objF2 = interfaceC3540l2.f();
            InterfaceC3540l.a aVar3 = InterfaceC3540l.f21100a;
            if (objF2 == aVar3.a()) {
                objF2 = new InterfaceC6824a() { // from class: Ke.e
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return i.i();
                    }
                };
                interfaceC3540l2.K(objF2);
            }
            interfaceC3540l2.J();
            androidx.compose.ui.e eVarG = androidx.compose.foundation.d.g(eVarM, (46 & 1) != 0, (46 & 2) != 0 ? null : null, (46 & 4) != 0 ? null : null, (46 & 8) != 0 ? null : null, (46 & 16) != 0 ? null : interfaceC6824a, (46 & 32) != 0 ? null : null, (InterfaceC6824a) objF2);
            if (model.a()) {
                interfaceC3540l2.U(160959381);
                i13 = i12;
                bVarB = c6562a.c(interfaceC3540l2, i13).a();
            } else {
                i13 = i12;
                interfaceC3540l2.U(160960693);
                bVarB = c6562a.c(interfaceC3540l2, i13).b();
            }
            U uC = bVarB.c();
            interfaceC3540l2.J();
            if (model.a()) {
                interfaceC3540l2.U(160963183);
                jC = c6562a.a(interfaceC3540l2, i13).f().a();
            } else {
                interfaceC3540l2.U(160964079);
                jC = c6562a.a(interfaceC3540l2, i13).f().c();
            }
            interfaceC3540l2.J();
            long j10 = jC;
            t.a aVar4 = W0.t.f23567a;
            int i15 = i13;
            InterfaceC3540l interfaceC3540l4 = interfaceC3540l2;
            a1.c(c3174d2, eVarG, j10, 0L, null, null, null, 0L, null, null, 0L, aVar4.b(), false, 1, 0, null, null, uC, interfaceC3540l4, 0, 3120, 120824);
            s9.d dVarD = model.d();
            interfaceC3540l4.U(160968266);
            if (dVarD == null) {
                interfaceC3540l3 = interfaceC3540l4;
            } else {
                final C3174d c3174dA2 = AbstractC7930a.a(dVarD, interfaceC3540l4, 0);
                androidx.compose.ui.e eVarM2 = androidx.compose.foundation.layout.o.m(aVar2, 0.0f, Y0.h.j(f10), 0.0f, 0.0f, 13, null);
                interfaceC3540l4.U(-1881366735);
                boolean zL2 = interfaceC3540l4.l(interfaceC3923h0) | interfaceC3540l4.T(c3174dA2) | interfaceC3540l4.l(context);
                Object objF3 = interfaceC3540l4.f();
                if (zL2 || objF3 == aVar3.a()) {
                    objF3 = new InterfaceC6824a() { // from class: Ke.f
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return i.j(interfaceC3923h0, c3174dA2, context);
                        }
                    };
                    interfaceC3540l4.K(objF3);
                }
                InterfaceC6824a interfaceC6824a2 = (InterfaceC6824a) objF3;
                interfaceC3540l4.J();
                interfaceC3540l4.U(-1881360400);
                Object objF4 = interfaceC3540l4.f();
                if (objF4 == aVar3.a()) {
                    objF4 = new InterfaceC6824a() { // from class: Ke.g
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return i.k();
                        }
                    };
                    interfaceC3540l4.K(objF4);
                }
                interfaceC3540l4.J();
                androidx.compose.ui.e eVarG2 = androidx.compose.foundation.d.g(eVarM2, (46 & 1) != 0, (46 & 2) != 0 ? null : null, (46 & 4) != 0 ? null : null, (46 & 8) != 0 ? null : null, (46 & 16) != 0 ? null : interfaceC6824a2, (46 & 32) != 0 ? null : null, (InterfaceC6824a) objF4);
                U uA = c6562a.c(interfaceC3540l4, i15).b().a();
                long jC2 = c6562a.a(interfaceC3540l4, i15).f().c();
                interfaceC3540l3 = interfaceC3540l4;
                a1.c(c3174dA2, eVarG2, jC2, 0L, null, null, null, 0L, null, null, 0L, aVar4.b(), false, 1, 0, null, null, uA, interfaceC3540l3, 0, 3120, 120824);
                J j11 = J.f24997a;
            }
            interfaceC3540l3.J();
            AbstractC7385d.d(c8688k, !model.c().isEmpty(), null, null, null, null, b0.c.e(-1591491314, true, new a(model), interfaceC3540l3, 54), interfaceC3540l3, 1572870, 30);
            interfaceC3540l3.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l3.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Ke.h
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return i.g(modifier, model, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(androidx.compose.ui.e eVar, a.C0430a c0430a, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        f(eVar, c0430a, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(InterfaceC3923h0 interfaceC3923h0, C3174d c3174d) {
        interfaceC3923h0.b(c3174d);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J i() {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J j(InterfaceC3923h0 interfaceC3923h0, C3174d c3174d, Context context) {
        interfaceC3923h0.b(c3174d);
        C8221a.f63590a.a(context);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J k() {
        return J.f24997a;
    }
}
