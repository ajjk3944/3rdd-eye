package If;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import T.o1;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import s9.d;

/* renamed from: If.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3028h {

    /* renamed from: If.h$a */
    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, AbstractC3026f.class, "onButtonClicked", "onButtonClicked()V", 0);
        }

        public final void a() {
            ((AbstractC3026f) this.receiver).o0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final AbstractC3026f vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(1993725453);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1993725453, i11, -1, "com.ui.wifiman.ui.wmw.WmwStatusPopupAdoptionFailed (WmwStatusPopupAdoptionFailed.kt:35)");
            }
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(modifier, C6562a.f52458a.d(interfaceC3540lR, C6562a.f52459b).a().a().c(), 0.0f, 2, null);
            s9.d dVar = (s9.d) o1.b(vm.getTitle(), null, interfaceC3540lR, 0, 1).getValue();
            s9.d dVar2 = (s9.d) o1.b(vm.n0(), null, interfaceC3540lR, 0, 1).getValue();
            d.b bVar = new d.b(AbstractC6780c.f53482f);
            interfaceC3540lR.U(814366130);
            boolean z10 = (i11 & 112) == 32;
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(vm);
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            Jf.g.c(eVarK, dVar, dVar2, bVar, (InterfaceC6824a) ((th.g) objF), interfaceC3540lR, 0, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: If.g
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3028h.c(modifier, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, AbstractC3026f abstractC3026f, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, abstractC3026f, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
