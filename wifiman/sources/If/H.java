package If;

import E0.InterfaceC2629g;
import If.E;
import L0.C3174d;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.o1;
import W0.j;
import android.content.Context;
import androidx.compose.ui.e;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import s9.c;
import s9.d;
import sa.AbstractC7930a;
import ta.AbstractC8049c;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;
import z.a0;

/* loaded from: classes4.dex */
public abstract class H {

    /* synthetic */ class a extends C6490p implements InterfaceC6824a {
        a(Object obj) {
            super(0, obj, F.class, "onButtonClicked", "onButtonClicked()V", 0);
        }

        public final void a() {
            ((F) this.receiver).o0();
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f9139a;

        b(E e10) {
            this.f9139a = e10;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(189731647);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(189731647, i10, -1, "com.ui.wifiman.ui.wmw.message.<anonymous> (WmwStatusPopupFwUpgrade.kt:69)");
            }
            String string = it.getString(AbstractC6780c.f53401S5);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{((E.a) this.f9139a).a()}, 1));
            AbstractC6492s.h(str, "format(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class c implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f9140a;

        c(E e10) {
            this.f9140a = e10;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-177296152);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-177296152, i10, -1, "com.ui.wifiman.ui.wmw.message.<anonymous> (WmwStatusPopupFwUpgrade.kt:73)");
            }
            String string = it.getString(AbstractC6780c.f53394R5);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{((E.c) this.f9140a).a()}, 1));
            AbstractC6492s.h(str, "format(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class d implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f9141a;

        d(E e10) {
            this.f9141a = e10;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-1110650489);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1110650489, i10, -1, "com.ui.wifiman.ui.wmw.message.<anonymous> (WmwStatusPopupFwUpgrade.kt:77)");
            }
            String string = it.getString(AbstractC6780c.f53380P5);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{((E.b) this.f9141a).a()}, 1));
            AbstractC6492s.h(str, "format(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final void b(final androidx.compose.ui.e modifier, final InterfaceC6824a onCancelClicked, final F vm, InterfaceC3540l interfaceC3540l, final int i10) {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(onCancelClicked, "onCancelClicked");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(125274085);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.l(onCancelClicked) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(125274085, i11, -1, "com.ui.wifiman.ui.wmw.WmwStatusPopupFwUpgrade (WmwStatusPopupFwUpgrade.kt:100)");
            }
            C6562a c6562a = C6562a.f52458a;
            int i12 = C6562a.f52459b;
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(modifier, c6562a.d(interfaceC3540lR, i12).a().a().c(), 0.0f, 2, null);
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.g(), f0.c.f46573a.k(), interfaceC3540lR, 0);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVarK);
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
            E e10 = (E) o1.b(vm.n0(), null, interfaceC3540lR, 0, 1).getValue();
            com.ubnt.usurvey.product.r rVarA = com.ubnt.usurvey.product.s.a(com.ubnt.usurvey.product.l.WM_W_d64);
            AbstractC6492s.f(rVarA);
            c.a aVar2 = new c.a(rVarA.a(), null, 2, null);
            e.a aVar3 = androidx.compose.ui.e.f28771b0;
            AbstractC8049c.e(aVar2, androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), 0.0f, c6562a.d(interfaceC3540lR, i12).a().a().c(), 1, null), L.b(EnumC3021a.FW_UPDATE)), null, null, null, null, null, 0.0f, null, interfaceC3540lR, 0, 254);
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null);
            C3174d c3174dA = AbstractC7930a.a(g(e10), interfaceC3540lR, 0);
            L0.U uD = c6562a.c(interfaceC3540lR, i12).a().d();
            long jA = c6562a.a(interfaceC3540lR, i12).f().a();
            j.a aVar4 = W0.j.f23523b;
            a1.c(c3174dA, eVarH, jA, 0L, null, null, null, 0L, null, W0.j.h(aVar4.a()), 0L, 0, false, 0, 0, null, null, uD, interfaceC3540lR, 48, 0, 130552);
            float f10 = 16;
            a0.a(androidx.compose.foundation.layout.r.i(aVar3, Y0.h.j(f10)), interfaceC3540lR, 6);
            a1.c(AbstractC7930a.a(f(e10), interfaceC3540lR, 0), androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), c6562a.a(interfaceC3540lR, i12).f().b(), 0L, null, null, null, 0L, null, W0.j.h(aVar4.a()), 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540lR, i12).b().a(), interfaceC3540lR, 48, 0, 130552);
            a0.a(androidx.compose.foundation.layout.r.i(aVar3, Y0.h.j(f10)), interfaceC3540lR, 6);
            androidx.compose.ui.e eVarH2 = androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null);
            String strB = AbstractC7930a.b(d(e10), interfaceC3540lR, 0);
            interfaceC3540lR.U(-860293709);
            boolean z10 = (i11 & 896) == 256;
            Object objF = interfaceC3540lR.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new a(vm);
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            w9.r.b(eVarH2, (InterfaceC6824a) ((th.g) objF), false, false, null, null, strB, null, interfaceC3540lR, 6, 188);
            s9.d dVarE = e(e10);
            interfaceC3540lR.U(-860291283);
            if (dVarE == null) {
                interfaceC3540l2 = interfaceC3540lR;
            } else {
                a0.a(androidx.compose.foundation.layout.r.i(aVar3, Y0.h.j(4)), interfaceC3540lR, 6);
                interfaceC3540l2 = interfaceC3540lR;
                w9.k.c(androidx.compose.foundation.layout.o.i(androidx.compose.foundation.layout.r.h(aVar3, 0.0f, 1, null), Y0.h.j(12)), onCancelClicked, false, false, null, null, AbstractC7930a.b(dVarE, interfaceC3540lR, 0), null, interfaceC3540lR, (i11 & 112) | 6, 188);
            }
            interfaceC3540l2.J();
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: If.G
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return H.c(modifier, onCancelClicked, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J c(androidx.compose.ui.e eVar, InterfaceC6824a interfaceC6824a, F f10, int i10, InterfaceC3540l interfaceC3540l, int i11) {
        b(eVar, interfaceC6824a, f10, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }

    private static final s9.d d(E e10) {
        if (e10 instanceof E.a) {
            return new d.b(AbstractC6780c.f53373O5);
        }
        if (!(e10 instanceof E.c) && !(e10 instanceof E.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return new d.b(AbstractC6780c.f53482f);
    }

    private static final s9.d e(E e10) {
        if (e10 instanceof E.a) {
            return new d.b(AbstractC6780c.f53447a);
        }
        if ((e10 instanceof E.c) || (e10 instanceof E.b)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final s9.d f(E e10) {
        if (e10 instanceof E.a) {
            return new d.a("available" + ((E.a) e10).a(), new b(e10));
        }
        if (e10 instanceof E.c) {
            return new d.a("success" + ((E.c) e10).a(), new c(e10));
        }
        if (!(e10 instanceof E.b)) {
            throw new NoWhenBranchMatchedException();
        }
        return new d.a("failed" + ((E.b) e10).a(), new d(e10));
    }

    private static final s9.d g(E e10) {
        if (!(e10 instanceof E.a) && !(e10 instanceof E.c)) {
            if (e10 instanceof E.b) {
                return new d.b(AbstractC6780c.f53387Q5);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new d.b(AbstractC6780c.f53415U5);
    }
}
