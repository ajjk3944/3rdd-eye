package com.ui.wifiman.ui.teleport;

import Be.AbstractC2480o;
import E0.InterfaceC2629g;
import L0.C3174d;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import Zg.AbstractC3689v;
import android.content.Context;
import com.ui.wifiman.ui.teleport.AbstractC5249b;
import com.ui.wifiman.ui.teleport.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import s9.d;
import sa.AbstractC7930a;
import vf.C8224d;

/* loaded from: classes4.dex */
public abstract class v {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45159a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C8224d.a c(int i10, String str) {
            AbstractC6492s.i(str, "<unused var>");
            return new C8224d.a("noHosts", "");
        }

        public final CharSequence b(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(2096948057);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(2096948057, i10, -1, "com.ui.wifiman.ui.teleport.message.<anonymous> (TeleportHomeUnavailableUi.kt:93)");
            }
            C8224d c8224d = C8224d.f63596a;
            String string = context.getString(AbstractC6780c.f53522k4);
            AbstractC6492s.h(string, "getString(...)");
            long jA = c8224d.a(interfaceC3540l, 6);
            interfaceC3540l.U(-547062146);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.u
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return v.a.c(((Integer) obj).intValue(), (String) obj2);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            C3174d c3174dD = C8224d.d(c8224d, string, jA, null, (InterfaceC6839p) objF, 4, null);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return c3174dD;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return b((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        public static final b f45160a = new b();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C8224d.a c(int i10, String str) {
            AbstractC6492s.i(str, "<unused var>");
            return new C8224d.a("noSSO", "");
        }

        public final CharSequence b(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(-690979120);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-690979120, i10, -1, "com.ui.wifiman.ui.teleport.message.<anonymous> (TeleportHomeUnavailableUi.kt:105)");
            }
            C8224d c8224d = C8224d.f63596a;
            String string = context.getString(AbstractC6780c.f53501h4);
            AbstractC6492s.h(string, "getString(...)");
            long jA = c8224d.a(interfaceC3540l, 6);
            interfaceC3540l.U(-547042948);
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.w
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return v.b.c(((Integer) obj).intValue(), (String) obj2);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            C3174d c3174dD = C8224d.d(c8224d, string, jA, null, (InterfaceC6839p) objF, 4, null);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return c3174dD;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return b((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final void d(final androidx.compose.ui.e modifier, final AbstractC5249b.a reason, final AbstractC5251d vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(reason, "reason");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1691913088);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(reason) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1691913088, i11, -1, "com.ui.wifiman.ui.teleport.TeleportHomeUnavailableUi (TeleportHomeUnavailableUi.kt:35)");
            }
            C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.e(), false);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, modifier);
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
            E1.c(interfaceC3540lA, cH, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f28130a;
            final C3174d c3174dA = AbstractC7930a.a(i(reason), interfaceC3540lR, 0);
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(eVarH, c6562a.d(interfaceC3540lR, i12).a().a().a(Y0.h.j(32)), c6562a.d(interfaceC3540lR, i12).a().b().d());
            s9.b bVarU = Pe.a.f18599a.U();
            s9.d dVarJ = j(reason);
            s9.d dVarI = i(reason);
            interfaceC3540lR.U(-1057331778);
            int i13 = i11 & 896;
            boolean zT = interfaceC3540lR.T(c3174dA) | (i13 == 256);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.teleport.r
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return v.e(c3174dA, vm, ((Integer) obj).intValue());
                    }
                };
                interfaceC3540lR.K(objF);
            }
            InterfaceC6835l interfaceC6835l = (InterfaceC6835l) objF;
            interfaceC3540lR.J();
            s9.d dVarH = h(reason);
            interfaceC3540lR.U(-1057310198);
            boolean z10 = ((i11 & 112) == 32) | (i13 == 256);
            Object objF2 = interfaceC3540lR.f();
            if (z10 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.teleport.s
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return v.f(reason, vm);
                    }
                };
                interfaceC3540lR.K(objF2);
            }
            interfaceC3540lR.J();
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC2480o.f(eVarJ, bVarU, dVarJ, dVarI, interfaceC6835l, dVarH, (InterfaceC6824a) objF2, null, null, interfaceC3540lR, 12582960, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: com.ui.wifiman.ui.teleport.t
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return v.g(modifier, reason, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(C3174d c3174d, AbstractC5251d abstractC5251d, int i10) {
        if (((C3174d.c) AbstractC3689v.s0(c3174d.j("noHosts", i10, i10))) != null || ((C3174d.c) AbstractC3689v.s0(c3174d.j("noSSO", i10, i10))) != null) {
            abstractC5251d.v0();
        }
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(AbstractC5249b.a aVar, AbstractC5251d abstractC5251d) {
        if (!(aVar instanceof AbstractC5249b.a.C1632a) && !(aVar instanceof AbstractC5249b.a.c)) {
            if (aVar instanceof AbstractC5249b.a.C1633b) {
                abstractC5251d.u0();
            } else {
                if (!(aVar instanceof AbstractC5249b.a.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC5251d.q0();
            }
        }
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J g(androidx.compose.ui.e eVar, AbstractC5249b.a aVar, AbstractC5251d abstractC5251d, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(eVar, aVar, abstractC5251d, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    private static final s9.d h(AbstractC5249b.a aVar) {
        if ((aVar instanceof AbstractC5249b.a.C1632a) || (aVar instanceof AbstractC5249b.a.c)) {
            return null;
        }
        if (aVar instanceof AbstractC5249b.a.C1633b) {
            return new d.b(AbstractC6780c.f53508i4);
        }
        if (aVar instanceof AbstractC5249b.a.d) {
            return new d.b(AbstractC6780c.f53329I3);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final s9.d i(AbstractC5249b.a aVar) {
        if (aVar instanceof AbstractC5249b.a.c) {
            return new d.a("no_hosts", a.f45159a);
        }
        if (aVar instanceof AbstractC5249b.a.C1633b) {
            return new d.a("no_hosts_no_sso", b.f45160a);
        }
        if (aVar instanceof AbstractC5249b.a.d) {
            return new d.b(AbstractC6780c.f53336J3);
        }
        if (aVar instanceof AbstractC5249b.a.C1632a) {
            return new d.b(AbstractC6780c.f53487f4);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final s9.d j(AbstractC5249b.a aVar) {
        if (aVar instanceof AbstractC5249b.a.c) {
            return new d.b(AbstractC6780c.f53529l4);
        }
        if (aVar instanceof AbstractC5249b.a.C1633b) {
            return new d.b(AbstractC6780c.f53515j4);
        }
        if (aVar instanceof AbstractC5249b.a.d) {
            return new d.b(AbstractC6780c.f53343K3);
        }
        if (aVar instanceof AbstractC5249b.a.C1632a) {
            return new d.b(AbstractC6780c.f53494g4);
        }
        throw new NoWhenBranchMatchedException();
    }
}
