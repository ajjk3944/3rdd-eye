package Q;

import C0.C;
import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.E1;
import T.H0;
import T.I0;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import Yg.J;
import androidx.compose.ui.platform.AbstractC3932k0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import j0.AbstractC6234e;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import m0.C6733v0;
import m0.c1;
import m0.i1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s.AbstractC7844e;
import s.C7846g;
import y0.AbstractC8576P;
import y0.InterfaceC8567G;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f18929a = AbstractC3561w.d(null, a.f18930a, 1, null);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18930a = new a();

        a() {
            super(0);
        }

        public final float a() {
            return Y0.h.j(0);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            return Y0.h.d(a());
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f18931a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f18932b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f18933c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f18934d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C7846g f18935e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f18936f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f18937g;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f18938a = new a();

            a() {
                super(1);
            }

            public final void a(J0.w wVar) {
                J0.t.Z(wVar, true);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((J0.w) obj);
                return J.f24997a;
            }
        }

        /* renamed from: Q.w$b$b, reason: collision with other inner class name */
        static final class C0667b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f18939a;

            C0667b(InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C0667b(interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f18939a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
                return ((C0667b) create(interfaceC8567G, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, i1 i1Var, long j10, float f10, C7846g c7846g, float f11, InterfaceC6839p interfaceC6839p) {
            super(2);
            this.f18931a = eVar;
            this.f18932b = i1Var;
            this.f18933c = j10;
            this.f18934d = f10;
            this.f18935e = c7846g;
            this.f18936f = f11;
            this.f18937g = interfaceC6839p;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-70914509, i10, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
            }
            androidx.compose.ui.e eVarD = AbstractC8576P.d(J0.m.b(w.d(this.f18931a, this.f18932b, w.e(this.f18933c, this.f18934d, interfaceC3540l, 0), this.f18935e, ((Y0.d) interfaceC3540l.t(AbstractC3932k0.g())).d1(this.f18936f)), false, a.f18938a), J.f24997a, new C0667b(null));
            InterfaceC6839p interfaceC6839p = this.f18937g;
            C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), true);
            int iA = AbstractC3536j.a(interfaceC3540l, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarD);
            InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
            InterfaceC6824a interfaceC6824aA = aVar.a();
            if (interfaceC3540l.x() == null) {
                AbstractC3536j.c();
            }
            interfaceC3540l.u();
            if (interfaceC3540l.o()) {
                interfaceC3540l.D(interfaceC6824aA);
            } else {
                interfaceC3540l.I();
            }
            InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
            E1.c(interfaceC3540lA, cH, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            interfaceC6839p.invoke(interfaceC3540l, 0);
            interfaceC3540l.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public static final void a(androidx.compose.ui.e eVar, i1 i1Var, long j10, long j11, float f10, float f11, C7846g c7846g, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        androidx.compose.ui.e eVar2 = (i11 & 1) != 0 ? androidx.compose.ui.e.f28771b0 : eVar;
        i1 i1VarA = (i11 & 2) != 0 ? c1.a() : i1Var;
        long jU = (i11 & 4) != 0 ? l.f18839a.a(interfaceC3540l, 6).u() : j10;
        long jC = (i11 & 8) != 0 ? d.c(jU, interfaceC3540l, (i10 >> 6) & 14) : j11;
        float fJ = (i11 & 16) != 0 ? Y0.h.j(0) : f10;
        float fJ2 = (i11 & 32) != 0 ? Y0.h.j(0) : f11;
        C7846g c7846g2 = (i11 & 64) != 0 ? null : c7846g;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-513881741, i10, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        H0 h02 = f18929a;
        float fJ3 = Y0.h.j(((Y0.h) interfaceC3540l.t(h02)).s() + fJ);
        AbstractC3561w.b(new I0[]{f.a().d(C6733v0.g(jC)), h02.d(Y0.h.d(fJ3))}, b0.c.e(-70914509, true, new b(eVar2, i1VarA, jU, fJ3, c7846g2, fJ2, interfaceC6839p), interfaceC3540l, 54), interfaceC3540l, I0.f20869i | 48);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, i1 i1Var, long j10, C7846g c7846g, float f10) {
        i1 i1Var2;
        androidx.compose.ui.e eVarE;
        androidx.compose.ui.e eVarB0 = eVar.b0(f10 > 0.0f ? androidx.compose.ui.graphics.b.c(androidx.compose.ui.e.f28771b0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0L, i1Var, false, null, 0L, 0L, 0, 124895, null) : androidx.compose.ui.e.f28771b0);
        if (c7846g != null) {
            i1Var2 = i1Var;
            eVarE = AbstractC7844e.e(androidx.compose.ui.e.f28771b0, c7846g, i1Var2);
        } else {
            i1Var2 = i1Var;
            eVarE = androidx.compose.ui.e.f28771b0;
        }
        return AbstractC6234e.a(androidx.compose.foundation.b.c(eVarB0.b0(eVarE), j10, i1Var2), i1Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j10, float f10, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-2079918090, i10, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long jA = d.a(l.f18839a.a(interfaceC3540l, 6), j10, f10, interfaceC3540l, (i10 << 3) & 1008);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return jA;
    }
}
