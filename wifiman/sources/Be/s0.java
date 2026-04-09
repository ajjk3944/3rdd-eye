package Be;

import Be.s0;
import E0.InterfaceC2629g;
import N.a1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3563x;
import T.L0;
import T.X0;
import T.z1;
import j0.AbstractC6234e;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import ma.AbstractC6784a;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import q.AbstractC7402u;
import y.AbstractC8557l;
import y.InterfaceC8558m;
import z.AbstractC8696t;
import z.C8680c;
import z.InterfaceC8675A;

/* loaded from: classes4.dex */
public abstract class s0 {

    static final class a implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ mh.q f1647a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1648b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f1649c;

        a(mh.q qVar, int i10, Object obj) {
            this.f1647a = qVar;
            this.f1648b = i10;
            this.f1649c = obj;
        }

        public final void a(z.Y UiSelectorHorizontalBase, Object obj, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(UiSelectorHorizontalBase, "$this$UiSelectorHorizontalBase");
            if ((i10 & 48) == 0) {
                i10 |= (i10 & 64) == 0 ? interfaceC3540l.T(obj) : interfaceC3540l.l(obj) ? 32 : 16;
            }
            if ((i10 & 145) == 144 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1308139330, i10, -1, "com.ui.wifiman.ui.component.UiSelectorHorizontal.<anonymous> (UiSelectorHorizontal.kt:51)");
            }
            s0.k(null, (String) this.f1647a.s(obj, interfaceC3540l, Integer.valueOf(((i10 >> 3) & 14) | ((this.f1648b >> 3) & 8))), AbstractC6492s.d(obj, this.f1649c), interfaceC3540l, 0, 1);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            a((z.Y) obj, obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue());
            return Yg.J.f24997a;
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ci.c f1650a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f1651b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f1652c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mh.r f1653d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f1654e;

        static final class a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ mh.r f1655a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f1656b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f1657c;

            a(mh.r rVar, Object obj, int i10) {
                this.f1655a = rVar;
                this.f1656b = obj;
                this.f1657c = i10;
            }

            public final void a(z.Y UiSelectorHorizontalItem, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiSelectorHorizontalItem, "$this$UiSelectorHorizontalItem");
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(UiSelectorHorizontalItem) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1450834369, i10, -1, "com.ui.wifiman.ui.component.UiSelectorHorizontalBase.<anonymous>.<anonymous>.<anonymous> (UiSelectorHorizontal.kt:78)");
                }
                this.f1655a.y(UiSelectorHorizontalItem, this.f1656b, interfaceC3540l, Integer.valueOf((i10 & 14) | (((this.f1657c >> 3) & 8) << 3)));
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((z.Y) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return Yg.J.f24997a;
            }
        }

        b(Ci.c cVar, Object obj, InterfaceC6835l interfaceC6835l, mh.r rVar, int i10) {
            this.f1650a = cVar;
            this.f1651b = obj;
            this.f1652c = interfaceC6835l;
            this.f1653d = rVar;
            this.f1654e = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Yg.J c(InterfaceC6835l interfaceC6835l, Object obj) {
            interfaceC6835l.invoke(obj);
            return Yg.J.f24997a;
        }

        public final void b(InterfaceC8675A FlowRow, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(FlowRow, "$this$FlowRow");
            if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(822908576, i10, -1, "com.ui.wifiman.ui.component.UiSelectorHorizontalBase.<anonymous> (UiSelectorHorizontal.kt:73)");
            }
            Ci.c cVar = this.f1650a;
            Object obj = this.f1651b;
            final InterfaceC6835l interfaceC6835l = this.f1652c;
            mh.r rVar = this.f1653d;
            int i11 = this.f1654e;
            for (final Object obj2 : cVar) {
                boolean zD = AbstractC6492s.d(obj2, obj);
                interfaceC3540l.U(2029499155);
                boolean zT = interfaceC3540l.T(interfaceC6835l) | interfaceC3540l.l(obj2);
                Object objF = interfaceC3540l.f();
                if (zT || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new InterfaceC6824a() { // from class: Be.t0
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return s0.b.c(interfaceC6835l, obj2);
                        }
                    };
                    interfaceC3540l.K(objF);
                }
                interfaceC3540l.J();
                s0.i(null, zD, (InterfaceC6824a) objF, b0.c.e(-1450834369, true, new a(rVar, obj2, i11), interfaceC3540l, 54), interfaceC3540l, 3072, 1);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b((InterfaceC8675A) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return Yg.J.f24997a;
        }
    }

    public static final void e(androidx.compose.ui.e eVar, final Object obj, final Ci.c items, final InterfaceC6835l onItemSelected, final mh.q text, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        final androidx.compose.ui.e eVar3;
        AbstractC6492s.i(items, "items");
        AbstractC6492s.i(onItemSelected, "onItemSelected");
        AbstractC6492s.i(text, "text");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(824515019);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            eVar2 = eVar;
        } else if ((i10 & 6) == 0) {
            eVar2 = eVar;
            i12 = (interfaceC3540lR.T(eVar) ? 4 : 2) | i10;
        } else {
            eVar2 = eVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? interfaceC3540lR.T(obj) : interfaceC3540lR.l(obj) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? interfaceC3540lR.T(items) : interfaceC3540lR.l(items) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.l(onItemSelected) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= interfaceC3540lR.l(text) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        if ((i12 & 9363) == 9362 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            androidx.compose.ui.e eVar4 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(824515019, i12, -1, "com.ui.wifiman.ui.component.UiSelectorHorizontal (UiSelectorHorizontal.kt:44)");
            }
            int i14 = (i12 >> 3) & 8;
            g(eVar4, obj, items, onItemSelected, b0.c.e(-1308139330, true, new a(text, i12, obj), interfaceC3540lR, 54), interfaceC3540lR, (i12 & 14) | 24576 | (i14 << 3) | (i12 & 112) | (i14 << 6) | (i12 & 896) | (i12 & 7168), 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar3 = eVar4;
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Be.p0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj2, Object obj3) {
                    return s0.f(eVar3, obj, items, onItemSelected, text, i10, i11, (InterfaceC3540l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J f(androidx.compose.ui.e eVar, Object obj, Ci.c cVar, InterfaceC6835l interfaceC6835l, mh.q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        e(eVar, obj, cVar, interfaceC6835l, qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    public static final void g(androidx.compose.ui.e eVar, final Object obj, final Ci.c items, final InterfaceC6835l onItemSelected, final mh.r itemContent, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        AbstractC6492s.i(items, "items");
        AbstractC6492s.i(onItemSelected, "onItemSelected");
        AbstractC6492s.i(itemContent, "itemContent");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-2026094021);
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? interfaceC3540lR.T(obj) : interfaceC3540lR.l(obj) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= (i10 & 512) == 0 ? interfaceC3540lR.T(items) : interfaceC3540lR.l(items) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.l(onItemSelected) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= interfaceC3540lR.l(itemContent) ? TLSTM.TLS_MAX_FRAGMENT_SIZE : 8192;
        }
        int i14 = i12;
        if ((i14 & 9363) == 9362 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2026094021, i14, -1, "com.ui.wifiman.ui.component.UiSelectorHorizontalBase (UiSelectorHorizontal.kt:67)");
            }
            C8680c c8680c = C8680c.f66832a;
            interfaceC3540l2 = interfaceC3540lR;
            AbstractC8696t.a(eVar3, c8680c.n(Y0.h.j(2)), c8680c.n(Y0.h.j(4)), 0, 0, null, b0.c.e(822908576, true, new b(items, obj, onItemSelected, itemContent, i14), interfaceC3540lR, 54), interfaceC3540l2, (i14 & 14) | 1573296, 56);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar2 = eVar3;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar4 = eVar2;
            x0Z.a(new InterfaceC6839p() { // from class: Be.r0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj2, Object obj3) {
                    return s0.h(eVar4, obj, items, onItemSelected, itemContent, i10, i11, (InterfaceC3540l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J h(androidx.compose.ui.e eVar, Object obj, Ci.c cVar, InterfaceC6835l interfaceC6835l, mh.r rVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        g(eVar, obj, cVar, interfaceC6835l, rVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(androidx.compose.ui.e eVar, final boolean z10, final InterfaceC6824a interfaceC6824a, final mh.q qVar, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        androidx.compose.ui.e eVar3;
        long jA;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(682660983);
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.c(z10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.l(interfaceC6824a) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= interfaceC3540lR.l(qVar) ? 2048 : 1024;
        }
        int i14 = i12;
        if ((i14 & 1171) == 1170 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
        } else {
            eVar3 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(682660983, i14, -1, "com.ui.wifiman.ui.component.UiSelectorHorizontalItem (UiSelectorHorizontal.kt:91)");
            }
            if (z10) {
                interfaceC3540lR.U(-1684799455);
                jA = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).a().b().f();
            } else {
                interfaceC3540lR.U(-1684798455);
                jA = C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).e().a();
            }
            interfaceC3540lR.J();
            androidx.compose.ui.e eVarJ = androidx.compose.foundation.layout.o.j(androidx.compose.foundation.b.d(AbstractC6234e.a(androidx.compose.foundation.layout.r.B(eVar3, Y0.h.j(64), 0.0f, 2, null), E.h.d(Y0.h.j(16))), ((C6733v0) AbstractC7402u.a(jA, null, "selectorItemColor", null, interfaceC3540lR, 384, 10).getValue()).u(), null, 2, null), Y0.h.j(12), Y0.h.j(4));
            interfaceC3540lR.U(-1684778362);
            Object objF = interfaceC3540lR.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = AbstractC8557l.a();
                interfaceC3540lR.K(objF);
            }
            interfaceC3540lR.J();
            androidx.compose.ui.e eVarB = androidx.compose.foundation.d.b(eVarJ, (InterfaceC8558m) objF, null, false, null, null, interfaceC6824a, 28, null);
            int i15 = (i14 & 7168) | 432;
            C0.C cB = z.W.b(C8680c.f66832a.b(), f0.c.f46573a.i(), interfaceC3540lR, 54);
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
            E1.c(interfaceC3540lA, cB, aVar.e());
            E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
            InterfaceC6839p interfaceC6839pB = aVar.b();
            if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                interfaceC3540lA.K(Integer.valueOf(iA));
                interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
            }
            E1.c(interfaceC3540lA, eVarE, aVar.f());
            qVar.s(z.Z.f66823a, interfaceC3540lR, Integer.valueOf(((i15 >> 6) & 112) | 6));
            interfaceC3540lR.R();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            final androidx.compose.ui.e eVar4 = eVar3;
            x0Z.a(new InterfaceC6839p() { // from class: Be.o0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return s0.j(eVar4, z10, interfaceC6824a, qVar, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J j(androidx.compose.ui.e eVar, boolean z10, InterfaceC6824a interfaceC6824a, mh.q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        i(eVar, z10, interfaceC6824a, qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }

    public static final void k(androidx.compose.ui.e eVar, final String text, final boolean z10, InterfaceC3540l interfaceC3540l, final int i10, final int i11) {
        androidx.compose.ui.e eVar2;
        int i12;
        InterfaceC3540l interfaceC3540l2;
        final androidx.compose.ui.e eVar3;
        AbstractC6492s.i(text, "text");
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-295927244);
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC3540lR.T(text) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC3540lR.c(z10) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i14 = i12;
        if ((i14 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
            eVar3 = eVar2;
            interfaceC3540l2 = interfaceC3540lR;
        } else {
            androidx.compose.ui.e eVar4 = i13 != 0 ? androidx.compose.ui.e.f28771b0 : eVar2;
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-295927244, i14, -1, "com.ui.wifiman.ui.component.UiSelectorHorizontalText (UiSelectorHorizontal.kt:121)");
            }
            interfaceC3540lR.U(-1383124896);
            long jA = z10 ? AbstractC6784a.b.f53648a.f().a() : C6562a.f52458a.a(interfaceC3540lR, C6562a.f52459b).f().c();
            interfaceC3540lR.J();
            z1 z1VarA = AbstractC7402u.a(jA, null, "textColor", null, interfaceC3540lR, 384, 10);
            int iA = W0.j.f23523b.a();
            interfaceC3540l2 = interfaceC3540lR;
            androidx.compose.ui.e eVar5 = eVar4;
            a1.b(text, eVar5, ((C6733v0) z1VarA.getValue()).u(), 0L, null, null, null, 0L, null, W0.j.h(iA), 0L, W0.t.f23567a.a(), false, 1, 0, null, C6562a.f52458a.c(interfaceC3540lR, C6562a.f52459b).b().f(), interfaceC3540l2, ((i14 >> 3) & 14) | ((i14 << 3) & 112), 3120, 54776);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            eVar3 = eVar4;
        }
        X0 x0Z = interfaceC3540l2.z();
        if (x0Z != null) {
            x0Z.a(new InterfaceC6839p() { // from class: Be.q0
                @Override // mh.InterfaceC6839p
                public final Object invoke(Object obj, Object obj2) {
                    return s0.l(eVar3, text, z10, i10, i11, (InterfaceC3540l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J l(androidx.compose.ui.e eVar, String str, boolean z10, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        k(eVar, str, z10, interfaceC3540l, L0.a(i10 | 1), i11);
        return Yg.J.f24997a;
    }
}
