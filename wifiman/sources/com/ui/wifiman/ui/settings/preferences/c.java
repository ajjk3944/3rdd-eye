package com.ui.wifiman.ui.settings.preferences;

import F9.AbstractC2856u;
import F9.AbstractC2859x;
import F9.P;
import F9.u0;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.o1;
import T.z1;
import Yg.J;
import android.content.res.Resources;
import com.ui.wifiman.ui.settings.preferences.c;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import m8.AbstractC6780c;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import q.AbstractC7385d;
import q.InterfaceC7386e;
import z.InterfaceC8687j;
import z.N;

/* loaded from: classes4.dex */
public abstract class c {

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.ui.settings.preferences.a f44641a;

        /* renamed from: com.ui.wifiman.ui.settings.preferences.c$a$a, reason: collision with other inner class name */
        static final class C1574a implements mh.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.ui.settings.preferences.a f44642a;

            /* renamed from: com.ui.wifiman.ui.settings.preferences.c$a$a$a, reason: collision with other inner class name */
            static final class C1575a implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ com.ui.wifiman.ui.settings.preferences.a f44643a;

                /* renamed from: com.ui.wifiman.ui.settings.preferences.c$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1576a extends C6490p implements InterfaceC6835l {
                    C1576a(Object obj) {
                        super(1, obj, com.ui.wifiman.ui.settings.preferences.a.class, "onThemeFollowSystemChanged", "onThemeFollowSystemChanged(Z)V", 0);
                    }

                    public final void a(boolean z10) {
                        ((com.ui.wifiman.ui.settings.preferences.a) this.receiver).A0(z10);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Boolean) obj).booleanValue());
                        return J.f24997a;
                    }
                }

                /* renamed from: com.ui.wifiman.ui.settings.preferences.c$a$a$a$b */
                /* synthetic */ class b extends C6490p implements InterfaceC6835l {
                    b(Object obj) {
                        super(1, obj, com.ui.wifiman.ui.settings.preferences.a.class, "onThemeDarkChanged", "onThemeDarkChanged(Z)V", 0);
                    }

                    public final void a(boolean z10) {
                        ((com.ui.wifiman.ui.settings.preferences.a) this.receiver).z0(z10);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Boolean) obj).booleanValue());
                        return J.f24997a;
                    }
                }

                C1575a(com.ui.wifiman.ui.settings.preferences.a aVar) {
                    this.f44643a = aVar;
                }

                public final void a(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(643775939, i10, -1, "com.ui.wifiman.ui.settings.preferences.AppPreferencesUi.<anonymous>.<anonymous>.<anonymous> (AppPreferencesUi.kt:58)");
                    }
                    androidx.compose.ui.e eVarB = androidx.compose.animation.f.b(androidx.compose.ui.e.f28771b0, null, null, 3, null);
                    boolean zBooleanValue = ((Boolean) o1.b(this.f44643a.u0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) o1.b(this.f44643a.t0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    com.ui.wifiman.ui.settings.preferences.a aVar = this.f44643a;
                    interfaceC3540l.U(94183811);
                    boolean zT = interfaceC3540l.T(aVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C1576a(aVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    InterfaceC6835l interfaceC6835l = (InterfaceC6835l) ((th.g) objF);
                    com.ui.wifiman.ui.settings.preferences.a aVar2 = this.f44643a;
                    interfaceC3540l.U(94186363);
                    boolean zT2 = interfaceC3540l.T(aVar2);
                    Object objF2 = interfaceC3540l.f();
                    if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new b(aVar2);
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    K9.g.h(eVarB, zBooleanValue, zBooleanValue2, interfaceC6835l, (InterfaceC6835l) ((th.g) objF2), interfaceC3540l, 0, 0);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                    a((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: com.ui.wifiman.ui.settings.preferences.c$a$a$b */
            static final class b implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ com.ui.wifiman.ui.settings.preferences.a f44644a;

                /* renamed from: com.ui.wifiman.ui.settings.preferences.c$a$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C1577a extends C6490p implements InterfaceC6824a {
                    C1577a(Object obj) {
                        super(0, obj, com.ui.wifiman.ui.settings.preferences.a.class, "onLanguageClicked", "onLanguageClicked()V", 0);
                    }

                    public final void a() {
                        ((com.ui.wifiman.ui.settings.preferences.a) this.receiver).x0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                /* renamed from: com.ui.wifiman.ui.settings.preferences.c$a$a$b$b, reason: collision with other inner class name */
                /* synthetic */ class C1578b extends C6490p implements InterfaceC6824a {
                    C1578b(Object obj) {
                        super(0, obj, com.ui.wifiman.ui.settings.preferences.a.class, "onUnitSystemClicked", "onUnitSystemClicked()V", 0);
                    }

                    public final void a() {
                        ((com.ui.wifiman.ui.settings.preferences.a) this.receiver).B0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                /* renamed from: com.ui.wifiman.ui.settings.preferences.c$a$a$b$c, reason: collision with other inner class name */
                public /* synthetic */ class C1579c {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f44645a;

                    static {
                        int[] iArr = new int[T7.c.values().length];
                        try {
                            iArr[T7.c.METRIC.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[T7.c.IMPERIAL.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        f44645a = iArr;
                    }
                }

                b(com.ui.wifiman.ui.settings.preferences.a aVar) {
                    this.f44644a = aVar;
                }

                public final void a(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                    InterfaceC3540l interfaceC3540l2;
                    String strA;
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1712955092, i10, -1, "com.ui.wifiman.ui.settings.preferences.AppPreferencesUi.<anonymous>.<anonymous>.<anonymous> (AppPreferencesUi.kt:68)");
                    }
                    interfaceC3540l.U(94189931);
                    if (((Boolean) o1.b(this.f44644a.s0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue()) {
                        String strA2 = H0.f.a(AbstractC6780c.f53594v, interfaceC3540l, 0);
                        String displayName = Locale.getDefault().getDisplayName();
                        com.ui.wifiman.ui.settings.preferences.a aVar = this.f44644a;
                        interfaceC3540l.U(94199098);
                        boolean zT = interfaceC3540l.T(aVar);
                        Object objF = interfaceC3540l.f();
                        if (zT || objF == InterfaceC3540l.f21100a.a()) {
                            objF = new C1577a(aVar);
                            interfaceC3540l.K(objF);
                        }
                        interfaceC3540l.J();
                        interfaceC3540l2 = interfaceC3540l;
                        AbstractC2856u.c(null, null, strA2, null, displayName, null, null, false, null, null, (InterfaceC6824a) ((th.g) objF), null, 0.0f, null, interfaceC3540l, 0, 0, 15339);
                    } else {
                        interfaceC3540l2 = interfaceC3540l;
                    }
                    interfaceC3540l.J();
                    String strA3 = H0.f.a(AbstractC6780c.f53573s, interfaceC3540l2, 0);
                    InterfaceC3540l interfaceC3540l3 = interfaceC3540l2;
                    int i11 = C1579c.f44645a[((T7.c) o1.b(this.f44644a.r0(), null, interfaceC3540l3, 0, 1).getValue()).ordinal()];
                    if (i11 == 1) {
                        interfaceC3540l3.U(94209225);
                        strA = H0.f.a(AbstractC6780c.f53587u, interfaceC3540l3, 0);
                        interfaceC3540l.J();
                    } else {
                        if (i11 != 2) {
                            interfaceC3540l3.U(94206304);
                            interfaceC3540l.J();
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC3540l3.U(94213195);
                        strA = H0.f.a(AbstractC6780c.f53580t, interfaceC3540l3, 0);
                        interfaceC3540l.J();
                    }
                    String str = strA;
                    com.ui.wifiman.ui.settings.preferences.a aVar2 = this.f44644a;
                    interfaceC3540l3.U(94217116);
                    boolean zT2 = interfaceC3540l3.T(aVar2);
                    Object objF2 = interfaceC3540l.f();
                    if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new C1578b(aVar2);
                        interfaceC3540l3.K(objF2);
                    }
                    interfaceC3540l.J();
                    AbstractC2856u.c(null, null, strA3, null, str, null, null, false, null, null, (InterfaceC6824a) ((th.g) objF2), null, 0.0f, null, interfaceC3540l, 0, 0, 15339);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                    a((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: com.ui.wifiman.ui.settings.preferences.c$a$a$c, reason: collision with other inner class name */
            static final class C1580c implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ com.ui.wifiman.ui.settings.preferences.a f44646a;

                /* renamed from: com.ui.wifiman.ui.settings.preferences.c$a$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1581a extends C6490p implements InterfaceC6824a {
                    C1581a(Object obj) {
                        super(0, obj, com.ui.wifiman.ui.settings.preferences.a.class, "onDirectConnectInfoClicked", "onDirectConnectInfoClicked()V", 0);
                    }

                    public final void a() {
                        ((com.ui.wifiman.ui.settings.preferences.a) this.receiver).w0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                C1580c(com.ui.wifiman.ui.settings.preferences.a aVar) {
                    this.f44646a = aVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J c(com.ui.wifiman.ui.settings.preferences.a aVar, boolean z10) {
                    aVar.v0();
                    return J.f24997a;
                }

                public final void b(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(1545001803, i10, -1, "com.ui.wifiman.ui.settings.preferences.AppPreferencesUi.<anonymous>.<anonymous>.<anonymous> (AppPreferencesUi.kt:86)");
                    }
                    String strA = H0.f.a(AbstractC6780c.f53409U, interfaceC3540l, 0);
                    boolean zBooleanValue = ((Boolean) o1.b(this.f44646a.o0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) o1.b(this.f44646a.n0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    com.ui.wifiman.ui.settings.preferences.a aVar = this.f44646a;
                    interfaceC3540l.U(94230275);
                    boolean zT = interfaceC3540l.T(aVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C1581a(aVar);
                        interfaceC3540l.K(objF);
                    }
                    th.g gVar = (th.g) objF;
                    interfaceC3540l.J();
                    interfaceC3540l.U(94232560);
                    boolean zT2 = interfaceC3540l.T(this.f44646a);
                    final com.ui.wifiman.ui.settings.preferences.a aVar2 = this.f44646a;
                    Object objF2 = interfaceC3540l.f();
                    if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new InterfaceC6835l() { // from class: com.ui.wifiman.ui.settings.preferences.d
                            @Override // mh.InterfaceC6835l
                            public final Object invoke(Object obj) {
                                return c.a.C1574a.C1580c.c(aVar2, ((Boolean) obj).booleanValue());
                            }
                        };
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    u0.c(null, null, strA, null, zBooleanValue, (InterfaceC6835l) objF2, null, (InterfaceC6824a) gVar, zBooleanValue2, null, interfaceC3540l, 0, 587);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                    b((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: com.ui.wifiman.ui.settings.preferences.c$a$a$d */
            static final class d implements mh.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ com.ui.wifiman.ui.settings.preferences.a f44647a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1 f44648b;

                /* renamed from: com.ui.wifiman.ui.settings.preferences.c$a$a$d$a, reason: collision with other inner class name */
                static final class C1582a implements mh.q {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ com.ui.wifiman.ui.settings.preferences.a f44649a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ z1 f44650b;

                    C1582a(com.ui.wifiman.ui.settings.preferences.a aVar, z1 z1Var) {
                        this.f44649a = aVar;
                        this.f44650b = z1Var;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final J c(com.ui.wifiman.ui.settings.preferences.a aVar, z1 z1Var) {
                        aVar.y0(C1574a.e(z1Var));
                        return J.f24997a;
                    }

                    public final void b(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) throws Resources.NotFoundException {
                        String strA;
                        AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(-2134621717, i10, -1, "com.ui.wifiman.ui.settings.preferences.AppPreferencesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppPreferencesUi.kt:102)");
                        }
                        String strA2 = H0.f.a(AbstractC6780c.f53452a4, interfaceC3540l, 0);
                        boolean zE = C1574a.e(this.f44650b);
                        interfaceC3540l.U(-2004555945);
                        if (zE) {
                            strA = H0.f.a(AbstractC6780c.f53445Z3, interfaceC3540l, 0);
                        } else {
                            if (zE) {
                                throw new NoWhenBranchMatchedException();
                            }
                            strA = null;
                        }
                        String str = strA;
                        interfaceC3540l.J();
                        interfaceC3540l.U(-2004548201);
                        boolean zT = interfaceC3540l.T(this.f44649a) | interfaceC3540l.T(this.f44650b);
                        final com.ui.wifiman.ui.settings.preferences.a aVar = this.f44649a;
                        final z1 z1Var = this.f44650b;
                        Object objF = interfaceC3540l.f();
                        if (zT || objF == InterfaceC3540l.f21100a.a()) {
                            objF = new InterfaceC6824a() { // from class: com.ui.wifiman.ui.settings.preferences.e
                                @Override // mh.InterfaceC6824a
                                public final Object invoke() {
                                    return c.a.C1574a.d.C1582a.c(aVar, z1Var);
                                }
                            };
                            interfaceC3540l.K(objF);
                        }
                        interfaceC3540l.J();
                        AbstractC2856u.c(null, null, strA2, null, str, null, null, false, null, null, (InterfaceC6824a) objF, null, 0.0f, null, interfaceC3540l, 0, 0, 15339);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                    }

                    @Override // mh.q
                    public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Resources.NotFoundException {
                        b((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                        return J.f24997a;
                    }
                }

                d(com.ui.wifiman.ui.settings.preferences.a aVar, z1 z1Var) {
                    this.f44647a = aVar;
                    this.f44648b = z1Var;
                }

                public final void a(InterfaceC7386e AnimatedVisibility, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1089341853, i10, -1, "com.ui.wifiman.ui.settings.preferences.AppPreferencesUi.<anonymous>.<anonymous>.<anonymous> (AppPreferencesUi.kt:101)");
                    }
                    AbstractC2859x.c(null, null, null, null, null, null, null, null, b0.c.e(-2134621717, true, new C1582a(this.f44647a, this.f44648b), interfaceC3540l, 54), interfaceC3540l, 100663296, 255);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((InterfaceC7386e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            C1574a(com.ui.wifiman.ui.settings.preferences.a aVar) {
                this.f44642a = aVar;
            }

            private static final boolean c(z1 z1Var) {
                return ((Boolean) z1Var.getValue()).booleanValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean e(z1 z1Var) {
                return ((Boolean) z1Var.getValue()).booleanValue();
            }

            public final void b(InterfaceC8687j UiSettings, InterfaceC3540l interfaceC3540l, int i10) {
                int i11;
                AbstractC6492s.i(UiSettings, "$this$UiSettings");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (interfaceC3540l.T(UiSettings) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-847403461, i11, -1, "com.ui.wifiman.ui.settings.preferences.AppPreferencesUi.<anonymous>.<anonymous> (AppPreferencesUi.kt:57)");
                }
                AbstractC2859x.c(null, null, null, null, null, null, null, null, b0.c.e(643775939, true, new C1575a(this.f44642a), interfaceC3540l, 54), interfaceC3540l, 100663296, 255);
                AbstractC2859x.c(null, null, null, null, null, null, null, null, b0.c.e(-1712955092, true, new b(this.f44642a), interfaceC3540l, 54), interfaceC3540l, 100663296, 255);
                AbstractC2859x.c(null, null, null, null, null, null, null, null, b0.c.e(1545001803, true, new C1580c(this.f44642a), interfaceC3540l, 54), interfaceC3540l, 100663296, 255);
                AbstractC7385d.d(UiSettings, c(o1.b(this.f44642a.p0(), null, interfaceC3540l, 0, 1)), null, null, null, null, b0.c.e(-1089341853, true, new d(this.f44642a, o1.b(this.f44642a.q0(), null, interfaceC3540l, 0, 1)), interfaceC3540l, 54), interfaceC3540l, (i11 & 14) | 1572864, 30);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                b((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        a(com.ui.wifiman.ui.settings.preferences.a aVar) {
            this.f44641a = aVar;
        }

        public final void a(N scaffoldPadding, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(scaffoldPadding, "scaffoldPadding");
            if ((i10 & 6) == 0) {
                i10 |= interfaceC3540l.T(scaffoldPadding) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-489669806, i10, -1, "com.ui.wifiman.ui.settings.preferences.AppPreferencesUi.<anonymous> (AppPreferencesUi.kt:52)");
            }
            P.b(androidx.compose.foundation.layout.o.h(androidx.compose.foundation.layout.r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), scaffoldPadding), null, null, b0.c.e(-847403461, true, new C1574a(this.f44641a), interfaceC3540l, 54), interfaceC3540l, 3072, 6);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            a((N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
            return J.f24997a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.ui.wifiman.ui.settings.preferences.a r31, T.InterfaceC3540l r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.settings.preferences.c.b(com.ui.wifiman.ui.settings.preferences.a, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(com.ui.wifiman.ui.settings.preferences.a aVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(aVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
