package ba;

import Ii.N;
import N.C3319f0;
import N.O0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.K;
import T.L;
import T.L0;
import T.O;
import T.X0;
import Yg.J;
import Yg.v;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.P;
import ba.d;
import com.ui.core.ui.sso.SSOAccountVM;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q2.InterfaceC7418f;

/* loaded from: classes3.dex */
public abstract class d {

    static final class a implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SSOAccountVM f33017a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f33018b;

        /* renamed from: ba.d$a$a, reason: collision with other inner class name */
        static final class C1146a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SSOAccountVM f33019a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Fragment f33020b;

            /* renamed from: ba.d$a$a$a, reason: collision with other inner class name */
            static final class C1147a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

                /* renamed from: a, reason: collision with root package name */
                int f33021a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SSOAccountVM f33022b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1147a(SSOAccountVM sSOAccountVM, InterfaceC5380e interfaceC5380e) {
                    super(2, interfaceC5380e);
                    this.f33022b = sSOAccountVM;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                    return new C1147a(this.f33022b, interfaceC5380e);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    AbstractC5467b.g();
                    if (this.f33021a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    this.f33022b.s0();
                    return J.f24997a;
                }

                @Override // mh.InterfaceC6839p
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                    return ((C1147a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
                }
            }

            /* renamed from: ba.d$a$a$b */
            public static final class b implements K {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ SSOAccountVM f33023a;

                public b(SSOAccountVM sSOAccountVM) {
                    this.f33023a = sSOAccountVM;
                }

                @Override // T.K
                public void dispose() {
                    this.f33023a.s0();
                }
            }

            C1146a(SSOAccountVM sSOAccountVM, Fragment fragment) {
                this.f33019a = sSOAccountVM;
                this.f33020b = fragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final K c(SSOAccountVM sSOAccountVM, L DisposableEffect) {
                AbstractC6492s.i(DisposableEffect, "$this$DisposableEffect");
                return new b(sSOAccountVM);
            }

            public final void b(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-72158587, i10, -1, "com.ui.core.ui.sso.password.UiResetPassword.<anonymous>.<anonymous> (UiResetPassword.kt:25)");
                }
                interfaceC3540l.U(-72894159);
                boolean zL = interfaceC3540l.l(this.f33019a);
                SSOAccountVM sSOAccountVM = this.f33019a;
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C1147a(sSOAccountVM, null);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                O.f("resetPassword", (InterfaceC6839p) objF, interfaceC3540l, 6);
                interfaceC3540l.U(-72889502);
                boolean zL2 = interfaceC3540l.l(this.f33019a);
                final SSOAccountVM sSOAccountVM2 = this.f33019a;
                Object objF2 = interfaceC3540l.f();
                if (zL2 || objF2 == InterfaceC3540l.f21100a.a()) {
                    objF2 = new InterfaceC6835l() { // from class: ba.c
                        @Override // mh.InterfaceC6835l
                        public final Object invoke(Object obj) {
                            return d.a.C1146a.c(sSOAccountVM2, (L) obj);
                        }
                    };
                    interfaceC3540l.K(objF2);
                }
                interfaceC3540l.J();
                O.c("resetPassword", (InterfaceC6835l) objF2, interfaceC3540l, 6);
                AbstractC4013k abstractC4013kO = this.f33020b.O();
                AbstractC6492s.h(abstractC4013kO, "<get-lifecycle>(...)");
                j.f((l) Q9.h.m(l.class, null, abstractC4013kO, interfaceC3540l, 0, 2), interfaceC3540l, 0);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return J.f24997a;
            }
        }

        a(SSOAccountVM sSOAccountVM, Fragment fragment) {
            this.f33017a = sSOAccountVM;
            this.f33018b = fragment;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(906821705, i10, -1, "com.ui.core.ui.sso.password.UiResetPassword.<anonymous> (UiResetPassword.kt:21)");
            }
            O0.a(androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), null, C3319f0.f14419a.a(interfaceC3540l, C3319f0.f14420b).c(), 0L, null, 0.0f, b0.c.e(-72158587, true, new C1146a(this.f33017a, this.f33018b), interfaceC3540l, 54), interfaceC3540l, 1572870, 58);
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

    public static final void c(final Fragment fragment, final SSOAccountVM sessionVM, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(fragment, "<this>");
        AbstractC6492s.i(sessionVM, "sessionVM");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1875513573);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(fragment) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(sessionVM) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1875513573, i11, -1, "com.ui.core.ui.sso.password.UiResetPassword (UiResetPassword.kt:17)");
            }
            interfaceC3540lR.U(1752432502);
            boolean zL = interfaceC3540lR.l(fragment) | interfaceC3540lR.l(sessionVM);
            Object objF = interfaceC3540lR.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6839p() { // from class: ba.a
                    @Override // mh.InterfaceC6839p
                    public final Object invoke(Object obj, Object obj2) {
                        return d.d(fragment, sessionVM, (InterfaceC7418f) obj, (Bundle) obj2);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            R9.i.c(fragment, (InterfaceC6839p) objF, b0.c.e(906821705, true, new a(sessionVM, fragment), interfaceC3540lR, 54), interfaceC3540lR, (i11 & 14) | 384);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: ba.b
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return d.e(fragment, sessionVM, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P.c d(Fragment fragment, SSOAccountVM sSOAccountVM, InterfaceC7418f savedStateRegistryOwner, Bundle arguments) {
        AbstractC6492s.i(savedStateRegistryOwner, "savedStateRegistryOwner");
        AbstractC6492s.i(arguments, "arguments");
        Application application = fragment.o1().getApplication();
        AbstractC6492s.h(application, "getApplication(...)");
        return new m(application, sSOAccountVM, savedStateRegistryOwner, arguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(Fragment fragment, SSOAccountVM sSOAccountVM, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        c(fragment, sSOAccountVM, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
