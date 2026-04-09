package If;

import Be.AbstractC2487w;
import E0.InterfaceC2629g;
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
import android.content.res.Resources;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import sa.AbstractC7930a;
import z.AbstractC8685h;
import z.C8680c;
import z.C8688k;

/* renamed from: If.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3033m {

    /* renamed from: If.m$a */
    static final class a implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3024d f9180a;

        a(C3024d c3024d) {
            this.f9180a = c3024d;
        }

        public final void a(C.v HorizontalPager, int i10, InterfaceC3540l interfaceC3540l, int i11) {
            AbstractC6492s.i(HorizontalPager, "$this$HorizontalPager");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1905221419, i11, -1, "com.ui.wifiman.ui.wmw.WmwStatusPopupAdoption.<anonymous>.<anonymous> (WmwStatusPopupAdoption.kt:111)");
            }
            AbstractC3033m.e(androidx.compose.ui.e.f28771b0, (C3023c) this.f9180a.a().get(i10), interfaceC3540l, 6, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C.v) obj, ((Number) obj2).intValue(), (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: If.m$b */
    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C.C f9181a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3024d f9182b;

        b(C.C c10, C3024d c3024d) {
            this.f9181a = c10;
            this.f9182b = c3024d;
        }

        public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1765849633, i10, -1, "com.ui.wifiman.ui.wmw.WmwStatusPopupAdoption.<anonymous>.<anonymous> (WmwStatusPopupAdoption.kt:118)");
            }
            Y2.a.a(this.f9181a, this.f9182b.a().size(), null, null, C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f(), 0L, 0.0f, 0.0f, 0.0f, null, interfaceC3540l, 0, 1004);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(androidx.compose.ui.e eVar, final C3023c c3023c, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        final androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(868792772);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar2) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((2 & i11) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(c3023c) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(868792772, i12, -1, "com.ui.wifiman.ui.wmw.DeviceItem (WmwStatusPopupAdoption.kt:68)");
            }
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(16)), f0.c.f46573a.g(), interfaceC3540lR, 54);
            int iA = AbstractC3536j.a(interfaceC3540lR, 0);
            InterfaceC3563x interfaceC3563xG = interfaceC3540lR.G();
            androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540lR, eVar3);
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
            s9.c cVarB = c3023c.b();
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            androidx.compose.ui.e eVar4 = eVar3;
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC2487w.b(cVarB, androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.i(aVar2, Y0.h.j(150)), 0.0f, 1, null), null, null, null, 0.0f, 0L, interfaceC3540lR, 48, 62);
            androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(aVar2, 0.0f, 1, null);
            C3174d c3174dA = AbstractC7930a.a(c3023c.c(), interfaceC3540l2, 0);
            C6562a c6562a = C6562a.f52458a;
            int i14 = C6562a.f52459b;
            a1.c(c3174dA, eVarH, c6562a.a(interfaceC3540l2, i14).f().a(), 0L, null, null, null, 0L, null, W0.j.h(W0.j.f23523b.a()), 0L, 0, false, 0, 0, null, null, c6562a.c(interfaceC3540l2, i14).a().b(), interfaceC3540l2, 48, 0, 130552);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar4;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: If.l
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3033m.f(eVar2, c3023c, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(androidx.compose.ui.e eVar, C3023c c3023c, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, c3023c, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    public static final void g(final androidx.compose.ui.e modifier, final AbstractC3025e vm, InterfaceC3540l interfaceC3540l, final int i10) throws Resources.NotFoundException {
        int i11;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(modifier, "modifier");
        AbstractC6492s.i(vm, "vm");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1776333587);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC3540lR.T(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC3540lR.T(vm) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1776333587, i12, -1, "com.ui.wifiman.ui.wmw.WmwStatusPopupAdoption (WmwStatusPopupAdoption.kt:97)");
            }
            C0.C cA = AbstractC8685h.a(C8680c.f66832a.n(Y0.h.j(16)), f0.c.f46573a.g(), interfaceC3540lR, 54);
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
            E1.c(interfaceC3540lA, cA, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            C8688k c8688k = C8688k.f66923a;
            final C3024d c3024d = (C3024d) o1.b(vm.n0(), null, interfaceC3540lR, 0, 1).getValue();
            interfaceC3540lR.U(-1261631658);
            boolean zT = interfaceC3540lR.T(c3024d);
            Object objF = interfaceC3540lR.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6824a() { // from class: If.i
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return Integer.valueOf(AbstractC3033m.h(c3024d));
                    }
                };
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            final C.C cK = C.D.k(0, 0.0f, (InterfaceC6824a) objF, interfaceC3540lR, 0, 3);
            e.a aVar2 = androidx.compose.ui.e.f28771b0;
            C.m.a(cK, androidx.compose.foundation.layout.r.h(aVar2, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, b0.c.e(-1905221419, true, new a(c3024d), interfaceC3540lR, 54), interfaceC3540lR, 48, 3072, 8188);
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC7385d.d(c8688k, c3024d.a().size() > 1, null, null, null, null, b0.c.e(-1765849633, true, new b(cK, c3024d), interfaceC3540lR, 54), interfaceC3540lR, 1572870, 30);
            androidx.compose.ui.e eVarK = androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.h(aVar2, 0.0f, 1, null), C6562a.f52458a.d(interfaceC3540l2, C6562a.f52459b).a().a().c(), 0.0f, 2, null);
            String strA = H0.f.a(AbstractC6780c.f53338J5, interfaceC3540l2, 0);
            interfaceC3540l2.U(-1261605670);
            boolean zT2 = interfaceC3540l2.T(c3024d) | ((i12 & 112) == 32) | interfaceC3540l2.T(cK);
            Object objF2 = interfaceC3540l2.f();
            if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new InterfaceC6824a() { // from class: If.j
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return AbstractC3033m.i(vm, c3024d, cK);
                    }
                };
                interfaceC3540l2.K(objF2);
            }
            interfaceC3540l2.J();
            w9.r.b(eVarK, (InterfaceC6824a) objF2, false, false, null, null, strA, null, interfaceC3540l2, 0, 188);
            interfaceC3540l2.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: If.k
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3033m.j(modifier, vm, i10, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(C3024d c3024d) {
        return c3024d.a().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J i(AbstractC3025e abstractC3025e, C3024d c3024d, C.C c10) {
        abstractC3025e.o0((C3023c) c3024d.a().get(c10.v()));
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J j(androidx.compose.ui.e eVar, AbstractC3025e abstractC3025e, int i10, InterfaceC3540l interfaceC3540l, int i11) throws Resources.NotFoundException {
        g(eVar, abstractC3025e, interfaceC3540l, L0.a(i10 | 1));
        return Yg.J.f24997a;
    }
}
