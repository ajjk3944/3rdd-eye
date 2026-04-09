package D9;

import C0.AbstractC2538s;
import D9.k;
import Ii.N;
import N.O0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.O;
import T.t1;
import T.z1;
import Yg.J;
import Yg.v;
import androidx.compose.ui.e;
import androidx.compose.ui.window.r;
import c0.AbstractC4174c;
import c0.InterfaceC4182k;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.i1;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import r.AbstractC7521c;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final E.g f3157a = E.h.d(Y0.h.j(12));

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f3158a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f3159b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f3160c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f3161d;

        /* renamed from: D9.k$a$a, reason: collision with other inner class name */
        static final class C0150a implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC6839p f3162a;

            C0150a(InterfaceC6839p interfaceC6839p) {
                this.f3162a = interfaceC6839p;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-790575738, i10, -1, "com.ui.core.ui.component.popup.anchored.UiAnchoredPopup.<anonymous>.<anonymous> (AnchoredPopup.kt:153)");
                }
                this.f3162a.invoke(interfaceC3540l, 0);
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

        a(i1 i1Var, long j10, float f10, InterfaceC6839p interfaceC6839p) {
            this.f3158a = i1Var;
            this.f3159b = j10;
            this.f3160c = f10;
            this.f3161d = interfaceC6839p;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(float f10, androidx.compose.ui.graphics.c graphicsLayer) {
            AbstractC6492s.i(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.a(f10);
            return J.f24997a;
        }

        public final void b(final float f10, InterfaceC3540l interfaceC3540l, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC3540l.g(f10) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1693856074, i11, -1, "com.ui.core.ui.component.popup.anchored.UiAnchoredPopup.<anonymous> (AnchoredPopup.kt:144)");
            }
            e.a aVar = androidx.compose.ui.e.f28771b0;
            interfaceC3540l.U(1655971323);
            boolean z10 = (i11 & 14) == 4;
            Object objF = interfaceC3540l.f();
            if (z10 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: D9.j
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return k.a.c(f10, (androidx.compose.ui.graphics.c) obj);
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            O0.a(androidx.compose.ui.graphics.b.a(aVar, (InterfaceC6835l) objF), this.f3158a, this.f3159b, 0L, null, this.f3160c, b0.c.e(-790575738, true, new C0150a(this.f3161d), interfaceC3540l, 54), interfaceC3540l, 1572864, 24);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            b(((Number) obj).floatValue(), (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    static final class b implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f3163a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f3164b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6824a f3165c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ mh.q f3166d;

        static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f3167a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3551q0 f3168b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC3551q0 interfaceC3551q0, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f3168b = interfaceC3551q0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f3168b, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f3167a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                this.f3168b.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        b(InterfaceC3551q0 interfaceC3551q0, o oVar, InterfaceC6824a interfaceC6824a, mh.q qVar) {
            this.f3163a = interfaceC3551q0;
            this.f3164b = oVar;
            this.f3165c = interfaceC6824a;
            this.f3166d = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final J c(InterfaceC3551q0 interfaceC3551q0, o oVar, InterfaceC6824a interfaceC6824a, float f10) {
            if (!((Boolean) interfaceC3551q0.getValue()).booleanValue()) {
                oVar.c();
                interfaceC6824a.invoke();
            }
            return J.f24997a;
        }

        private static final float e(z1 z1Var) {
            return ((Number) z1Var.getValue()).floatValue();
        }

        public final void b(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1469283801, i10, -1, "com.ui.core.ui.component.popup.anchored.UiAnchoredPopupBase.<anonymous> (AnchoredPopup.kt:108)");
            }
            float f10 = ((Boolean) this.f3163a.getValue()).booleanValue() ? 1.0f : 0.0f;
            interfaceC3540l.U(1744586165);
            boolean zT = interfaceC3540l.T(this.f3164b) | interfaceC3540l.T(this.f3165c);
            final InterfaceC3551q0 interfaceC3551q0 = this.f3163a;
            final o oVar = this.f3164b;
            final InterfaceC6824a interfaceC6824a = this.f3165c;
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new InterfaceC6835l() { // from class: D9.l
                    @Override // mh.InterfaceC6835l
                    public final Object invoke(Object obj) {
                        return k.b.c(interfaceC3551q0, oVar, interfaceC6824a, ((Float) obj).floatValue());
                    }
                };
                interfaceC3540l.K(objF);
            }
            interfaceC3540l.J();
            this.f3166d.s(Float.valueOf(e(AbstractC7521c.d(f10, null, 0.0f, null, (InterfaceC6835l) objF, interfaceC3540l, 0, 14))), interfaceC3540l, 0);
            J j10 = J.f24997a;
            interfaceC3540l.U(1744594315);
            InterfaceC3551q0 interfaceC3551q02 = this.f3163a;
            Object objF2 = interfaceC3540l.f();
            if (objF2 == InterfaceC3540l.f21100a.a()) {
                objF2 = new a(interfaceC3551q02, null);
                interfaceC3540l.K(objF2);
            }
            interfaceC3540l.J();
            O.f(j10, (InterfaceC6839p) objF2, interfaceC3540l, 6);
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

    /* JADX WARN: Removed duplicated region for block: B:108:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(D9.o r19, androidx.compose.ui.window.r r20, mh.InterfaceC6824a r21, mh.InterfaceC6839p r22, long r23, m0.i1 r25, float r26, final mh.InterfaceC6839p r27, T.InterfaceC3540l r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.k.j(D9.o, androidx.compose.ui.window.r, mh.a, mh.p, long, m0.i1, float, mh.p, T.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(D9.o r17, androidx.compose.ui.window.r r18, mh.InterfaceC6824a r19, mh.InterfaceC6839p r20, final mh.q r21, T.InterfaceC3540l r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.k.k(D9.o, androidx.compose.ui.window.r, mh.a, mh.p, mh.q, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J l(o oVar, r rVar, InterfaceC6824a interfaceC6824a, InterfaceC6839p interfaceC6839p, mh.q qVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        k(oVar, rVar, interfaceC6824a, interfaceC6839p, qVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J m() {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J n(Y0.n nVar, Y0.r rVar) {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J o(InterfaceC3551q0 interfaceC3551q0) {
        interfaceC3551q0.setValue(Boolean.FALSE);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p() {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J q(Y0.n nVar, Y0.r rVar) {
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J r(o oVar, r rVar, InterfaceC6824a interfaceC6824a, InterfaceC6839p interfaceC6839p, long j10, i1 i1Var, float f10, InterfaceC6839p interfaceC6839p2, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        j(oVar, rVar, interfaceC6824a, interfaceC6839p, j10, i1Var, f10, interfaceC6839p2, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }

    public static final androidx.compose.ui.e s(androidx.compose.ui.e eVar, final o popupState) {
        AbstractC6492s.i(eVar, "<this>");
        AbstractC6492s.i(popupState, "popupState");
        return androidx.compose.ui.layout.o.a(eVar, new InterfaceC6835l() { // from class: D9.a
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return k.t(popupState, (C0.r) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J t(o oVar, C0.r it) {
        AbstractC6492s.i(it, "it");
        oVar.e(AbstractC2538s.c(it));
        return J.f24997a;
    }

    private static final r u(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-1515828075);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1515828075, i10, -1, "com.ui.core.ui.component.popup.anchored.rememberDefaultPopupProperties (AnchoredPopup.kt:80)");
        }
        interfaceC3540l.U(763512675);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = new r(true, true, true, false, 8, (DefaultConstructorMarker) null);
            interfaceC3540l.K(objF);
        }
        r rVar = (r) objF;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return rVar;
    }

    public static final o v(final p pVar, InterfaceC3540l interfaceC3540l, int i10, int i11) {
        interfaceC3540l.U(996453578);
        boolean z10 = true;
        if ((i11 & 1) != 0) {
            pVar = p.HIDDEN;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(996453578, i10, -1, "com.ui.core.ui.component.popup.anchored.rememberUiAnchoredPopupState (AnchoredPopup.kt:70)");
        }
        Object[] objArr = {pVar};
        InterfaceC4182k interfaceC4182kC = o.f3172c.c();
        interfaceC3540l.U(1459205905);
        if ((((i10 & 14) ^ 6) <= 4 || !interfaceC3540l.T(pVar)) && (i10 & 6) != 4) {
            z10 = false;
        }
        Object objF = interfaceC3540l.f();
        if (z10 || objF == InterfaceC3540l.f21100a.a()) {
            objF = new InterfaceC6824a() { // from class: D9.b
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return k.w(pVar);
                }
            };
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.J();
        o oVar = (o) AbstractC4174c.e(objArr, interfaceC4182kC, null, (InterfaceC6824a) objF, interfaceC3540l, 0, 4);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o w(p pVar) {
        return new o(t1.d(pVar, null, 2, null));
    }
}
