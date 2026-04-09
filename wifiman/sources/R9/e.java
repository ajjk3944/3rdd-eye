package R9;

import Q9.j;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.K;
import T.L;
import T.L0;
import T.O;
import T.X0;
import Yg.J;
import androidx.lifecycle.AbstractC4013k;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public abstract class e {

    public static final class a implements K {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4013k f19602a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ R9.a f19603b;

        public a(AbstractC4013k abstractC4013k, R9.a aVar) {
            this.f19602a = abstractC4013k;
            this.f19603b = aVar;
        }

        @Override // T.K
        public void dispose() {
            this.f19602a.c(this.f19603b);
            this.f19603b.a0();
            this.f19603b.Z();
        }
    }

    public static final void d(final R9.a aVar, final AbstractC4013k lifecycle, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(aVar, "<this>");
        AbstractC6492s.i(lifecycle, "lifecycle");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1811856667);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(lifecycle) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1811856667, i11, -1, "com.ui.core.ui.sso.arch.vm.AttachLifecycleCallbacks (UiViewModel.kt:47)");
            }
            interfaceC3540lR.U(626849524);
            boolean zL = interfaceC3540lR.l(aVar) | interfaceC3540lR.l(lifecycle);
            Object objF = interfaceC3540lR.f();
            if (zL || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: R9.b
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return e.e(aVar, lifecycle, (L) obj);
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            O.c(aVar, (InterfaceC6835l) objF, interfaceC3540lR, i11 & 14);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: R9.c
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return e.f(aVar, lifecycle, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final K e(R9.a aVar, AbstractC4013k abstractC4013k, L DisposableEffect) {
        AbstractC6492s.i(DisposableEffect, "$this$DisposableEffect");
        aVar.Y();
        abstractC4013k.a(aVar);
        return new a(abstractC4013k, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(R9.a aVar, AbstractC4013k abstractC4013k, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        d(aVar, abstractC4013k, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }

    public static final void g(final R9.a aVar, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(aVar, "<this>");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-66814515);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.l(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-66814515, i11, -1, "com.ui.core.ui.sso.arch.vm.AttachViewRouter (UiViewModel.kt:61)");
            }
            aVar.b0((j) interfaceC3540lR.t(Q9.h.j()));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: R9.d
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return e.h(aVar, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J h(R9.a aVar, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        g(aVar, interfaceC3540l, L0.a(i10 | 1));
        return J.f24997a;
    }
}
