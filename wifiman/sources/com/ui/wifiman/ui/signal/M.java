package com.ui.wifiman.ui.signal;

import E0.InterfaceC2629g;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.o1;
import Te.A0;
import Te.AbstractC3570a0;
import Te.AbstractC3576d0;
import Te.AbstractC3577e;
import Te.AbstractC3588j0;
import Te.D0;
import Te.J0;
import Te.K0;
import Te.M;
import Te.M0;
import Te.w0;
import Te.x0;
import Zg.AbstractC3689v;
import android.content.res.Resources;
import com.ui.wifiman.ui.signal.M;
import gc.EnumC5895b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import la.C6562a;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import s9.d;

/* loaded from: classes4.dex */
public abstract class M {

    static final class a implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f44759a;

        /* renamed from: com.ui.wifiman.ui.signal.M$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1600a extends C6490p implements InterfaceC6835l {
            C1600a(Object obj) {
                super(1, obj, N.class, "onSignalTypeSelected", "onSignalTypeSelected(Lcom/ui/wifiman/domain/signal/SignalTabSignalType;)V", 0);
            }

            public final void a(gc.c p02) {
                AbstractC6492s.i(p02, "p0");
                ((N) this.receiver).v0(p02);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((gc.c) obj);
                return Yg.J.f24997a;
            }
        }

        /* synthetic */ class b extends C6490p implements InterfaceC6824a {
            b(Object obj) {
                super(0, obj, N.class, "onAPComparisonClicked", "onAPComparisonClicked()V", 0);
            }

            public final void a() {
                ((N) this.receiver).q0();
            }

            @Override // mh.InterfaceC6824a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Yg.J.f24997a;
            }
        }

        static final class c implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ K0 f44760a;

            c(K0 k02) {
                this.f44760a = k02;
            }

            public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1432922712, i10, -1, "com.ui.wifiman.ui.signal.SignalMapperTabSignalUi.<anonymous>.<anonymous>.<anonymous> (SignalTabSignalStrengthUi.kt:134)");
                }
                Te.S sA = ((K0.b) this.f44760a).a();
                if (sA != null) {
                    Te.U.b(androidx.compose.ui.e.f28771b0, sA, interfaceC3540l, 6);
                }
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

        a(N n10) {
            this.f44759a = n10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J f(N n10, J9.a tab) {
            Object next;
            AbstractC6492s.i(tab, "tab");
            Iterator<E> it = EnumC5895b.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((EnumC5895b) next).ordinal() == tab.c()) {
                    break;
                }
            }
            EnumC5895b enumC5895b = (EnumC5895b) next;
            if (enumC5895b != null) {
                n10.r0(enumC5895b);
            }
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J h(N n10, K0 k02) {
            n10.t0(((K0.h) k02).a().c());
            return Yg.J.f24997a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J i(N n10, K0 k02) {
            n10.s0(((K0.f) k02).getId());
            return Yg.J.f24997a;
        }

        public final void e(androidx.compose.ui.e itemModifier, final K0 item, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
            int i11;
            AbstractC6492s.i(itemModifier, "itemModifier");
            AbstractC6492s.i(item, "item");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.T(itemModifier) ? 4 : 2);
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
                AbstractC3546o.Q(-431139643, i11, -1, "com.ui.wifiman.ui.signal.SignalMapperTabSignalUi.<anonymous> (SignalTabSignalStrengthUi.kt:81)");
            }
            if (item instanceof K0.j) {
                interfaceC3540l.U(-1543816621);
                C6562a c6562a = C6562a.f52458a;
                int i12 = C6562a.f52459b;
                androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(itemModifier, c6562a.d(interfaceC3540l, i12).a().a().c(), c6562a.d(interfaceC3540l, i12).a().b().d());
                x0 x0VarA = ((K0.j) item).a();
                N n10 = this.f44759a;
                interfaceC3540l.U(-1543806467);
                boolean zT = interfaceC3540l.T(n10);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C1600a(n10);
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                A0.c(eVarJ, x0VarA, (InterfaceC6835l) ((th.g) objF), interfaceC3540l, 0, 0);
                interfaceC3540l.J();
            } else {
                boolean z10 = false;
                if (item instanceof K0.a) {
                    interfaceC3540l.U(-1543803039);
                    androidx.compose.ui.e eVarM = androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.o.k(androidx.compose.foundation.layout.r.H(itemModifier, f0.c.f46573a.k(), false, 2, null), Y0.h.j(16), 0.0f, 2, null), 0.0f, Y0.h.j(8), 0.0f, 0.0f, 13, null);
                    s9.d dVarA = ((K0.a) item).a();
                    N n11 = this.f44759a;
                    interfaceC3540l.U(-1543794466);
                    boolean zT2 = interfaceC3540l.T(n11);
                    Object objF2 = interfaceC3540l.f();
                    if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new b(n11);
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    AbstractC3588j0.c(eVarM, dVarA, (InterfaceC6824a) ((th.g) objF2), interfaceC3540l, 0, 0);
                    interfaceC3540l.J();
                } else if (item instanceof K0.e) {
                    interfaceC3540l.U(-1543791099);
                    float f10 = 16;
                    float f11 = 8;
                    w0.o(androidx.compose.foundation.layout.o.l(itemModifier, Y0.h.j(f10), Y0.h.j(f11), Y0.h.j(f10), Y0.h.j(f11)), ((K0.e) item).a(), interfaceC3540l, 0);
                    interfaceC3540l.J();
                } else {
                    boolean z11 = true;
                    if (item instanceof K0.b) {
                        interfaceC3540l.U(-1543778439);
                        androidx.compose.ui.e eVarJ2 = androidx.compose.foundation.layout.o.j(itemModifier, Y0.h.j(16), Y0.h.j(8));
                        N n12 = this.f44759a;
                        C0.C cH = androidx.compose.foundation.layout.d.h(f0.c.f46573a.o(), false);
                        int iA = AbstractC3536j.a(interfaceC3540l, 0);
                        InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                        androidx.compose.ui.e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarJ2);
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
                        Te.J j10 = (Te.J) o1.b(n12.n0(), null, interfaceC3540l, 0, 1).getValue();
                        androidx.compose.ui.e eVarH = androidx.compose.foundation.layout.r.h(androidx.compose.ui.e.f28771b0, 0.0f, 1, null);
                        if (j10 == null) {
                            j10 = new Te.J(EnumC5895b.SIGNAL, AbstractC3689v.l(), M.b.C0800b.f21723a, new Te.L(0.0f, 1.0f), AbstractC3689v.l(), AbstractC3689v.l());
                        }
                        Te.Q.c(eVarH, j10, interfaceC3540l, 6);
                        AbstractC7385d.f(((K0.b) item).a() != null, null, androidx.compose.animation.g.o(null, 0.0f, 3, null), androidx.compose.animation.g.q(null, 0.0f, 3, null), null, b0.c.e(-1432922712, true, new c(item), interfaceC3540l, 54), interfaceC3540l, 200064, 18);
                        interfaceC3540l.R();
                        interfaceC3540l.J();
                    } else if (item instanceof K0.d) {
                        interfaceC3540l.U(-1543737792);
                        M0.b(androidx.compose.foundation.layout.o.j(itemModifier, Y0.h.j(16), Y0.h.j(8)), interfaceC3540l, 0);
                        interfaceC3540l.J();
                    } else if (item instanceof K0.k) {
                        interfaceC3540l.U(-610947582);
                        androidx.compose.ui.e eVarJ3 = androidx.compose.foundation.layout.o.j(itemModifier, Y0.h.j(16), Y0.h.j(4));
                        J9.i iVar = J9.i.DARK_BACKGROUND;
                        J9.j jVarG = M.g((K0.k) item);
                        interfaceC3540l.U(-1543718858);
                        boolean zT3 = interfaceC3540l.T(this.f44759a);
                        final N n13 = this.f44759a;
                        Object objF3 = interfaceC3540l.f();
                        if (zT3 || objF3 == InterfaceC3540l.f21100a.a()) {
                            objF3 = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.signal.J
                                @Override // mh.InterfaceC6835l
                                public final Object invoke(Object obj) {
                                    return M.a.f(n13, (J9.a) obj);
                                }
                            };
                            interfaceC3540l.K(objF3);
                        }
                        interfaceC3540l.J();
                        J9.h.g(eVarJ3, jVarG, false, iVar, (InterfaceC6835l) objF3, interfaceC3540l, 3072, 4);
                        interfaceC3540l.J();
                    } else if (item instanceof K0.c) {
                        interfaceC3540l.U(-1543712006);
                        D0.b(androidx.compose.foundation.layout.o.j(itemModifier, Y0.h.j(16), Y0.h.j(8)), ((K0.c) item).a(), interfaceC3540l, 0);
                        interfaceC3540l.J();
                    } else if (item instanceof K0.l) {
                        interfaceC3540l.U(-1543702370);
                        J0.h(androidx.compose.foundation.layout.o.j(itemModifier, Y0.h.j(16), Y0.h.j(8)), ((K0.l) item).a(), interfaceC3540l, 0);
                        interfaceC3540l.J();
                    } else if (item instanceof K0.h) {
                        interfaceC3540l.U(-1543692839);
                        interfaceC3540l.U(-1543689975);
                        boolean zT4 = interfaceC3540l.T(this.f44759a);
                        if ((i11 & 112) != 32 && ((i11 & 64) == 0 || !interfaceC3540l.l(item))) {
                            z11 = false;
                        }
                        boolean z12 = zT4 | z11;
                        final N n14 = this.f44759a;
                        Object objF4 = interfaceC3540l.f();
                        if (z12 || objF4 == InterfaceC3540l.f21100a.a()) {
                            objF4 = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.signal.K
                                @Override // mh.InterfaceC6824a
                                public final Object invoke() {
                                    return M.a.h(n14, item);
                                }
                            };
                            interfaceC3540l.K(objF4);
                        }
                        interfaceC3540l.J();
                        AbstractC3576d0.b(androidx.compose.foundation.d.d(itemModifier, false, null, null, (InterfaceC6824a) objF4, 7, null), ((K0.h) item).a(), interfaceC3540l, 0);
                        interfaceC3540l.J();
                    } else if (item instanceof K0.f) {
                        interfaceC3540l.U(-1543684984);
                        K0.f fVar2 = (K0.f) item;
                        s9.d dVarC = fVar2.c();
                        s9.d dVarB = fVar2.b();
                        s9.d dVarA2 = fVar2.a();
                        interfaceC3540l.U(-1543678643);
                        boolean zT5 = interfaceC3540l.T(this.f44759a);
                        if ((i11 & 112) == 32 || ((i11 & 64) != 0 && interfaceC3540l.l(item))) {
                            z10 = true;
                        }
                        boolean z13 = zT5 | z10;
                        final N n15 = this.f44759a;
                        Object objF5 = interfaceC3540l.f();
                        if (z13 || objF5 == InterfaceC3540l.f21100a.a()) {
                            objF5 = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.signal.L
                                @Override // mh.InterfaceC6824a
                                public final Object invoke() {
                                    return M.a.i(n15, item);
                                }
                            };
                            interfaceC3540l.K(objF5);
                        }
                        interfaceC3540l.J();
                        AbstractC3570a0.c(itemModifier, dVarC, dVarB, dVarA2, (InterfaceC6824a) objF5, interfaceC3540l, i11 & 14, 0);
                        interfaceC3540l.J();
                    } else if (item instanceof K0.g) {
                        interfaceC3540l.U(-1543675210);
                        Ee.F.b(itemModifier, ((K0.g) item).a(), interfaceC3540l, i11 & 14);
                        interfaceC3540l.J();
                    } else {
                        if (!(item instanceof K0.i)) {
                            interfaceC3540l.U(-1543814813);
                            interfaceC3540l.J();
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC3540l.U(-1543669898);
                        AbstractC3577e.d(itemModifier, ((K0.i) item).a(), interfaceC3540l, i11 & 14);
                        interfaceC3540l.J();
                    }
                }
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) throws Resources.NotFoundException {
            e((androidx.compose.ui.e) obj, (K0) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return Yg.J.f24997a;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44761a;

        static {
            int[] iArr = new int[EnumC5895b.values().length];
            try {
                iArr[EnumC5895b.SIGNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5895b.THROUGHPUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5895b.LATENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44761a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r18, com.ui.wifiman.ui.signal.N r19, T.InterfaceC3540l r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.signal.M.c(androidx.compose.ui.e, com.ui.wifiman.ui.signal.N, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J d(N n10, String str) {
        AbstractC6492s.i(str, "<unused var>");
        n10.u0();
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J e(androidx.compose.ui.e eVar, N n10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        c(eVar, n10, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J9.j g(K0.k kVar) {
        int i10;
        List<EnumC5895b> listB = kVar.b();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listB, 10));
        for (EnumC5895b enumC5895b : listB) {
            int iOrdinal = enumC5895b.ordinal();
            int i11 = b.f44761a[enumC5895b.ordinal()];
            if (i11 == 1) {
                i10 = AbstractC6780c.f53534m2;
            } else if (i11 == 2) {
                i10 = AbstractC6780c.f53541n2;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = AbstractC6780c.f53527l2;
            }
            arrayList.add(new J9.a(iOrdinal, new d.b(i10), null, enumC5895b == kVar.a(), null, null, 48, null));
        }
        return new J9.j(arrayList);
    }
}
