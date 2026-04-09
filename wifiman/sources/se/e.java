package Se;

import B9.b;
import F9.AbstractC2856u;
import F9.AbstractC2859x;
import F9.M;
import F9.P;
import F9.k0;
import F9.u0;
import L0.C3174d;
import Se.e;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.L0;
import T.o1;
import T.t1;
import T.z1;
import Yg.J;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.q;
import z.InterfaceC8687j;
import z.N;

/* loaded from: classes4.dex */
public abstract class e {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f20550a;

        /* renamed from: Se.e$a$a, reason: collision with other inner class name */
        static final class C0747a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Se.c f20551a;

            /* renamed from: Se.e$a$a$a, reason: collision with other inner class name */
            static final class C0748a implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Se.c f20552a;

                /* renamed from: Se.e$a$a$a$a, reason: collision with other inner class name */
                /* synthetic */ class C0749a extends C6490p implements InterfaceC6824a {
                    C0749a(Object obj) {
                        super(0, obj, Se.c.class, "onSendLogsClicked", "onSendLogsClicked()V", 0);
                    }

                    public final void a() {
                        ((Se.c) this.receiver).O0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                C0748a(Se.c cVar) {
                    this.f20552a = cVar;
                }

                public final void a(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-800103738, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:61)");
                    }
                    Se.c cVar = this.f20552a;
                    interfaceC3540l.U(-250519415);
                    boolean zT = interfaceC3540l.T(cVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0749a(cVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    AbstractC2856u.c(null, null, "Send Logs to Firebase Crashlytics", null, null, null, null, false, null, null, (InterfaceC6824a) ((th.g) objF), null, 0.0f, null, interfaceC3540l, 196992, 0, 15323);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: Se.e$a$a$b */
            static final class b implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Se.c f20553a;

                b(Se.c cVar) {
                    this.f20553a = cVar;
                }

                private static final String c(z1 z1Var) {
                    return (String) z1Var.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final J e(InterfaceC3551q0 interfaceC3551q0, Se.c cVar, String it) {
                    AbstractC6492s.i(it, "it");
                    interfaceC3551q0.setValue(it);
                    cVar.W0(it);
                    return J.f24997a;
                }

                public final void b(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(1361135655, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:199)");
                    }
                    if (c(o1.b(this.f20553a.B0(), null, interfaceC3540l, 0, 1)) != null) {
                        String str = (String) o1.b(this.f20553a.B0(), null, interfaceC3540l, 0, 1).getValue();
                        interfaceC3540l.U(-250329148);
                        Object objF = interfaceC3540l.f();
                        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
                        if (objF == aVar.a()) {
                            if (str == null) {
                                str = "1";
                            }
                            objF = t1.d(str, null, 2, null);
                            interfaceC3540l.K(objF);
                        }
                        final InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
                        interfaceC3540l.J();
                        String str2 = (String) interfaceC3551q0.getValue();
                        interfaceC3540l.U(-250316123);
                        boolean zT = interfaceC3540l.T(this.f20553a);
                        final Se.c cVar = this.f20553a;
                        Object objF2 = interfaceC3540l.f();
                        if (zT || objF2 == aVar.a()) {
                            objF2 = new InterfaceC6835l() { // from class: Se.f
                                @Override // mh.InterfaceC6835l
                                public final Object invoke(Object obj) {
                                    return e.a.C0747a.b.e(interfaceC3551q0, cVar, (String) obj);
                                }
                            };
                            interfaceC3540l.K(objF2);
                        }
                        interfaceC3540l.J();
                        k0.d(null, "Infinite speedtest coefficient", null, str2, (InterfaceC6835l) objF2, null, null, null, false, null, 0, "How many times throughput on Signal -> Throughput will be faster", null, 0L, null, false, false, null, null, null, null, interfaceC3540l, 48, 48, 0, 2095077);
                    }
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    b((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: Se.e$a$a$c */
            static final class c implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Se.c f20554a;

                /* renamed from: Se.e$a$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C0750a extends C6490p implements InterfaceC6835l {
                    C0750a(Object obj) {
                        super(1, obj, Se.c.class, "onCloudEnvChanged", "onCloudEnvChanged(Ljava/lang/String;)V", 0);
                    }

                    public final void a(String p02) {
                        AbstractC6492s.i(p02, "p0");
                        ((Se.c) this.receiver).K0(p02);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((String) obj);
                        return J.f24997a;
                    }
                }

                /* renamed from: Se.e$a$a$c$b */
                static final class b implements q {

                    /* renamed from: a, reason: collision with root package name */
                    public static final b f20555a = new b();

                    b() {
                    }

                    public final C3174d a(String it, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(it, "it");
                        interfaceC3540l.U(-1484810949);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(-1484810949, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:76)");
                        }
                        C3174d c3174d = new C3174d(it, null, null, 6, null);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                        interfaceC3540l.J();
                        return c3174d;
                    }

                    @Override // mh.q
                    public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                        return a((String) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    }
                }

                /* renamed from: Se.e$a$a$c$c, reason: collision with other inner class name */
                /* synthetic */ class C0751c extends C6490p implements InterfaceC6835l {
                    C0751c(Object obj) {
                        super(1, obj, Se.c.class, "onSpeedtestEnvChanged", "onSpeedtestEnvChanged(Ljava/lang/String;)V", 0);
                    }

                    public final void a(String p02) {
                        AbstractC6492s.i(p02, "p0");
                        ((Se.c) this.receiver).P0(p02);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((String) obj);
                        return J.f24997a;
                    }
                }

                /* renamed from: Se.e$a$a$c$d */
                static final class d implements q {

                    /* renamed from: a, reason: collision with root package name */
                    public static final d f20556a = new d();

                    d() {
                    }

                    public final C3174d a(String it, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(it, "it");
                        interfaceC3540l.U(-1198357724);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(-1198357724, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:84)");
                        }
                        C3174d c3174d = new C3174d(it, null, null, 6, null);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                        interfaceC3540l.J();
                        return c3174d;
                    }

                    @Override // mh.q
                    public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                        return a((String) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    }
                }

                c(Se.c cVar) {
                    this.f20554a = cVar;
                }

                public final void a(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(555810607, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:71)");
                    }
                    Ci.c cVar = (Ci.c) o1.b(this.f20554a.s0(), null, interfaceC3540l, 0, 1).getValue();
                    String str = (String) o1.b(this.f20554a.r0(), null, interfaceC3540l, 0, 1).getValue();
                    Se.c cVar2 = this.f20554a;
                    interfaceC3540l.U(-250501303);
                    boolean zT = interfaceC3540l.T(cVar2);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0750a(cVar2);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    M.c(null, "Cloud Environment", null, "App needs to be killed and restarted for speedtest api change to take effect", cVar, b.f20555a, str, (InterfaceC6835l) ((th.g) objF), null, false, null, interfaceC3540l, 3120, 0, 1797);
                    Ci.c cVar3 = (Ci.c) o1.b(this.f20554a.x0(), null, interfaceC3540l, 0, 1).getValue();
                    String str2 = (String) o1.b(this.f20554a.w0(), null, interfaceC3540l, 0, 1).getValue();
                    Se.c cVar4 = this.f20554a;
                    interfaceC3540l.U(-250485811);
                    boolean zT2 = interfaceC3540l.T(cVar4);
                    Object objF2 = interfaceC3540l.f();
                    if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new C0751c(cVar4);
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    M.c(null, "Speedtest Environment", null, "App needs to be killed and restarted for speedtest api change to take effect", cVar3, d.f20556a, str2, (InterfaceC6835l) ((th.g) objF2), null, false, null, interfaceC3540l, 3120, 0, 1797);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: Se.e$a$a$d */
            static final class d implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Se.c f20557a;

                /* renamed from: Se.e$a$a$d$a, reason: collision with other inner class name */
                /* synthetic */ class C0752a extends C6490p implements InterfaceC6835l {
                    C0752a(Object obj) {
                        super(1, obj, Se.c.class, "onSsoEnvChanged", "onSsoEnvChanged(Ljava/lang/String;)V", 0);
                    }

                    public final void a(String p02) {
                        AbstractC6492s.i(p02, "p0");
                        ((Se.c) this.receiver).R0(p02);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((String) obj);
                        return J.f24997a;
                    }
                }

                /* renamed from: Se.e$a$a$d$b */
                static final class b implements q {

                    /* renamed from: a, reason: collision with root package name */
                    public static final b f20558a = new b();

                    b() {
                    }

                    public final C3174d a(String it, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(it, "it");
                        interfaceC3540l.U(226467418);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(226467418, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:97)");
                        }
                        C3174d c3174d = new C3174d(it, null, null, 6, null);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                        interfaceC3540l.J();
                        return c3174d;
                    }

                    @Override // mh.q
                    public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                        return a((String) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    }
                }

                /* renamed from: Se.e$a$a$d$c */
                /* synthetic */ class c extends C6490p implements InterfaceC6835l {
                    c(Object obj) {
                        super(1, obj, Se.c.class, "onSsoPkceChanged", "onSsoPkceChanged(Z)V", 0);
                    }

                    public final void a(boolean z10) {
                        ((Se.c) this.receiver).S0(z10);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Boolean) obj).booleanValue());
                        return J.f24997a;
                    }
                }

                /* renamed from: Se.e$a$a$d$d, reason: collision with other inner class name */
                /* synthetic */ class C0753d extends C6490p implements InterfaceC6824a {
                    C0753d(Object obj) {
                        super(0, obj, Se.c.class, "onSsoAccountInvalidateClicked", "onSsoAccountInvalidateClicked()V", 0);
                    }

                    public final void a() {
                        ((Se.c) this.receiver).Q0();
                    }

                    @Override // mh.InterfaceC6824a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        a();
                        return J.f24997a;
                    }
                }

                d(Se.c cVar) {
                    this.f20557a = cVar;
                }

                public final void a(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-2027878322, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:92)");
                    }
                    Ci.c cVar = (Ci.c) o1.b(this.f20557a.z0(), null, interfaceC3540l, 0, 1).getValue();
                    String str = (String) o1.b(this.f20557a.y0(), null, interfaceC3540l, 0, 1).getValue();
                    Se.c cVar2 = this.f20557a;
                    interfaceC3540l.U(-250467929);
                    boolean zT = interfaceC3540l.T(cVar2);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0752a(cVar2);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    M.c(null, "SSO Environment", null, "App needs to be killed and restarted for speedtest api change to take effect", cVar, b.f20558a, str, (InterfaceC6835l) ((th.g) objF), null, false, null, interfaceC3540l, 3120, 0, 1797);
                    boolean zBooleanValue = ((Boolean) o1.b(this.f20557a.A0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    Se.c cVar3 = this.f20557a;
                    interfaceC3540l.U(-250458520);
                    boolean zT2 = interfaceC3540l.T(cVar3);
                    Object objF2 = interfaceC3540l.f();
                    if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new c(cVar3);
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    u0.c(null, null, "PKCE Auth", "PKCE Auth will be requested when logging in", zBooleanValue, (InterfaceC6835l) ((th.g) objF2), null, null, false, null, interfaceC3540l, 3456, 963);
                    Se.c cVar4 = this.f20557a;
                    interfaceC3540l.U(-250451947);
                    boolean zT3 = interfaceC3540l.T(cVar4);
                    Object objF3 = interfaceC3540l.f();
                    if (zT3 || objF3 == InterfaceC3540l.f21100a.a()) {
                        objF3 = new C0753d(cVar4);
                        interfaceC3540l.K(objF3);
                    }
                    interfaceC3540l.J();
                    AbstractC2856u.c(null, null, "Invalidate current SSO account", null, null, null, null, false, null, null, (InterfaceC6824a) ((th.g) objF3), null, 0.0f, null, interfaceC3540l, 196992, 0, 15323);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: Se.e$a$a$e, reason: collision with other inner class name */
            static final class C0754e implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Se.c f20559a;

                /* renamed from: Se.e$a$a$e$a, reason: collision with other inner class name */
                /* synthetic */ class C0755a extends C6490p implements InterfaceC6835l {
                    C0755a(Object obj) {
                        super(1, obj, Se.c.class, "onApiUnifiEnabledChanged", "onApiUnifiEnabledChanged(Z)V", 0);
                    }

                    public final void a(boolean z10) {
                        ((Se.c) this.receiver).H0(z10);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Boolean) obj).booleanValue());
                        return J.f24997a;
                    }
                }

                /* renamed from: Se.e$a$a$e$b */
                /* synthetic */ class b extends C6490p implements InterfaceC6835l {
                    b(Object obj) {
                        super(1, obj, Se.c.class, "onApiUispEnabledChanged", "onApiUispEnabledChanged(Z)V", 0);
                    }

                    public final void a(boolean z10) {
                        ((Se.c) this.receiver).G0(z10);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Boolean) obj).booleanValue());
                        return J.f24997a;
                    }
                }

                C0754e(Se.c cVar) {
                    this.f20559a = cVar;
                }

                public final void a(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-316599955, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:116)");
                    }
                    boolean zBooleanValue = ((Boolean) o1.b(this.f20559a.o0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    Se.c cVar = this.f20559a;
                    interfaceC3540l.U(-250440912);
                    boolean zT = interfaceC3540l.T(cVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0755a(cVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    u0.c(null, null, "WiFiman API - UniFi", null, zBooleanValue, (InterfaceC6835l) ((th.g) objF), null, null, false, null, interfaceC3540l, 384, 971);
                    boolean zBooleanValue2 = ((Boolean) o1.b(this.f20559a.n0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    Se.c cVar2 = this.f20559a;
                    interfaceC3540l.U(-250433201);
                    boolean zT2 = interfaceC3540l.T(cVar2);
                    Object objF2 = interfaceC3540l.f();
                    if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new b(cVar2);
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    u0.c(null, null, "WiFiman API - UISP", null, zBooleanValue2, (InterfaceC6835l) ((th.g) objF2), null, null, false, null, interfaceC3540l, 384, 971);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: Se.e$a$a$f */
            static final class f implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Se.c f20560a;

                /* renamed from: Se.e$a$a$f$a, reason: collision with other inner class name */
                /* synthetic */ class C0756a extends C6490p implements InterfaceC6835l {
                    C0756a(Object obj) {
                        super(1, obj, Se.c.class, "onWizardUpdateAlwaysRecommendedChanged", "onWizardUpdateAlwaysRecommendedChanged(Z)V", 0);
                    }

                    public final void a(boolean z10) {
                        ((Se.c) this.receiver).U0(z10);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Boolean) obj).booleanValue());
                        return J.f24997a;
                    }
                }

                /* renamed from: Se.e$a$a$f$b */
                /* synthetic */ class b extends C6490p implements InterfaceC6835l {
                    b(Object obj) {
                        super(1, obj, Se.c.class, "onWizardUpdateFwChannelChanged", "onWizardUpdateFwChannelChanged(Ljava/lang/String;)V", 0);
                    }

                    public final void a(String p02) {
                        AbstractC6492s.i(p02, "p0");
                        ((Se.c) this.receiver).V0(p02);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a((String) obj);
                        return J.f24997a;
                    }
                }

                /* renamed from: Se.e$a$a$f$c */
                static final class c implements q {

                    /* renamed from: a, reason: collision with root package name */
                    public static final c f20561a = new c();

                    c() {
                    }

                    public final C3174d a(String it, InterfaceC3540l interfaceC3540l, int i10) {
                        AbstractC6492s.i(it, "it");
                        interfaceC3540l.U(-645943144);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.Q(-645943144, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:141)");
                        }
                        C3174d c3174d = new C3174d(it, null, null, 6, null);
                        if (AbstractC3546o.H()) {
                            AbstractC3546o.P();
                        }
                        interfaceC3540l.J();
                        return c3174d;
                    }

                    @Override // mh.q
                    public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                        return a((String) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    }
                }

                f(Se.c cVar) {
                    this.f20560a = cVar;
                }

                public final void a(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(1394678412, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:131)");
                    }
                    boolean zBooleanValue = ((Boolean) o1.b(this.f20560a.D0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    Se.c cVar = this.f20560a;
                    interfaceC3540l.U(-250421506);
                    boolean zT = interfaceC3540l.T(cVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0756a(cVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    u0.c(null, null, "FW Update always recommended", null, zBooleanValue, (InterfaceC6835l) ((th.g) objF), null, null, false, null, interfaceC3540l, 384, 971);
                    Ci.c cVar2 = (Ci.c) o1.b(this.f20560a.F0(), null, interfaceC3540l, 0, 1).getValue();
                    String str = (String) o1.b(this.f20560a.E0(), null, interfaceC3540l, 0, 1).getValue();
                    Se.c cVar3 = this.f20560a;
                    interfaceC3540l.U(-250404970);
                    boolean zT2 = interfaceC3540l.T(cVar3);
                    Object objF2 = interfaceC3540l.f();
                    if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new b(cVar3);
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    M.c(null, "FW Update Channel", null, "App needs to be killed and restarted for speedtest api change to take effect", cVar2, c.f20561a, str, (InterfaceC6835l) ((th.g) objF2), null, false, null, interfaceC3540l, 3120, 0, 1797);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: Se.e$a$a$g */
            static final class g implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Se.c f20562a;

                /* renamed from: Se.e$a$a$g$a, reason: collision with other inner class name */
                /* synthetic */ class C0757a extends C6490p implements InterfaceC6835l {
                    C0757a(Object obj) {
                        super(1, obj, Se.c.class, "onWifiScanEnabledChanged", "onWifiScanEnabledChanged(Z)V", 0);
                    }

                    public final void a(boolean z10) {
                        ((Se.c) this.receiver).T0(z10);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Boolean) obj).booleanValue());
                        return J.f24997a;
                    }
                }

                g(Se.c cVar) {
                    this.f20562a = cVar;
                }

                public final void a(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-1189010517, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:149)");
                    }
                    boolean zBooleanValue = ((Boolean) o1.b(this.f20562a.C0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    Se.c cVar = this.f20562a;
                    interfaceC3540l.U(-250394032);
                    boolean zT = interfaceC3540l.T(cVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0757a(cVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    u0.c(null, null, "Wifi scan enabled", null, zBooleanValue, (InterfaceC6835l) ((th.g) objF), null, null, false, null, interfaceC3540l, 384, 971);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: Se.e$a$a$h */
            static final class h implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Se.c f20563a;

                /* renamed from: Se.e$a$a$h$a, reason: collision with other inner class name */
                /* synthetic */ class C0758a extends C6490p implements InterfaceC6835l {
                    C0758a(Object obj) {
                        super(1, obj, Se.c.class, "onDiscoveryEnabledChanged", "onDiscoveryEnabledChanged(Z)V", 0);
                    }

                    public final void a(boolean z10) {
                        ((Se.c) this.receiver).L0(z10);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Boolean) obj).booleanValue());
                        return J.f24997a;
                    }
                }

                h(Se.c cVar) {
                    this.f20563a = cVar;
                }

                public final void a(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(522267850, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:159)");
                    }
                    boolean zBooleanValue = ((Boolean) o1.b(this.f20563a.t0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    Se.c cVar = this.f20563a;
                    interfaceC3540l.U(-250383247);
                    boolean zT = interfaceC3540l.T(cVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0758a(cVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    u0.c(null, null, "Network Discovery", null, zBooleanValue, (InterfaceC6835l) ((th.g) objF), null, null, false, null, interfaceC3540l, 384, 971);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: Se.e$a$a$i */
            static final class i implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Se.c f20564a;

                /* renamed from: Se.e$a$a$i$a, reason: collision with other inner class name */
                /* synthetic */ class C0759a extends C6490p implements InterfaceC6835l {
                    C0759a(Object obj) {
                        super(1, obj, Se.c.class, "onBluetoothScanClassicEnabledChanged", "onBluetoothScanClassicEnabledChanged(Z)V", 0);
                    }

                    public final void a(boolean z10) {
                        ((Se.c) this.receiver).J0(z10);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Boolean) obj).booleanValue());
                        return J.f24997a;
                    }
                }

                /* renamed from: Se.e$a$a$i$b */
                /* synthetic */ class b extends C6490p implements InterfaceC6835l {
                    b(Object obj) {
                        super(1, obj, Se.c.class, "onBluetoothScanBLEEnabledChanged", "onBluetoothScanBLEEnabledChanged(Z)V", 0);
                    }

                    public final void a(boolean z10) {
                        ((Se.c) this.receiver).I0(z10);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Boolean) obj).booleanValue());
                        return J.f24997a;
                    }
                }

                i(Se.c cVar) {
                    this.f20564a = cVar;
                }

                public final void a(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-2061421079, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:169)");
                    }
                    boolean zBooleanValue = ((Boolean) o1.b(this.f20564a.q0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    Se.c cVar = this.f20564a;
                    interfaceC3540l.U(-250371940);
                    boolean zT = interfaceC3540l.T(cVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0759a(cVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    u0.c(null, null, "Bluetoth Classic", null, zBooleanValue, (InterfaceC6835l) ((th.g) objF), null, null, false, null, interfaceC3540l, 384, 971);
                    boolean zBooleanValue2 = ((Boolean) o1.b(this.f20564a.p0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    Se.c cVar2 = this.f20564a;
                    interfaceC3540l.U(-250363784);
                    boolean zT2 = interfaceC3540l.T(cVar2);
                    Object objF2 = interfaceC3540l.f();
                    if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new b(cVar2);
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    u0.c(null, null, "Bluetoth LE", null, zBooleanValue2, (InterfaceC6835l) ((th.g) objF2), null, null, false, null, interfaceC3540l, 384, 971);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            /* renamed from: Se.e$a$a$j */
            static final class j implements q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Se.c f20565a;

                /* renamed from: Se.e$a$a$j$a, reason: collision with other inner class name */
                /* synthetic */ class C0760a extends C6490p implements InterfaceC6835l {
                    C0760a(Object obj) {
                        super(1, obj, Se.c.class, "onFloorplanCamBackgroundChanged", "onFloorplanCamBackgroundChanged(Z)V", 0);
                    }

                    public final void a(boolean z10) {
                        ((Se.c) this.receiver).M0(z10);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Boolean) obj).booleanValue());
                        return J.f24997a;
                    }
                }

                /* renamed from: Se.e$a$a$j$b */
                /* synthetic */ class b extends C6490p implements InterfaceC6835l {
                    b(Object obj) {
                        super(1, obj, Se.c.class, "onFloorplanObjectDetectionChanged", "onFloorplanObjectDetectionChanged(Z)V", 0);
                    }

                    public final void a(boolean z10) {
                        ((Se.c) this.receiver).N0(z10);
                    }

                    @Override // mh.InterfaceC6835l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        a(((Boolean) obj).booleanValue());
                        return J.f24997a;
                    }
                }

                j(Se.c cVar) {
                    this.f20565a = cVar;
                }

                public final void a(A9.i UiSettingsCard, InterfaceC3540l interfaceC3540l, int i10) {
                    AbstractC6492s.i(UiSettingsCard, "$this$UiSettingsCard");
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.Q(-350142712, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous>.<anonymous> (DevPreferencesUi.kt:184)");
                    }
                    boolean zBooleanValue = ((Boolean) o1.b(this.f20565a.u0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    Se.c cVar = this.f20565a;
                    interfaceC3540l.U(-250352553);
                    boolean zT = interfaceC3540l.T(cVar);
                    Object objF = interfaceC3540l.f();
                    if (zT || objF == InterfaceC3540l.f21100a.a()) {
                        objF = new C0760a(cVar);
                        interfaceC3540l.K(objF);
                    }
                    interfaceC3540l.J();
                    u0.c(null, null, "Camera background", null, zBooleanValue, (InterfaceC6835l) ((th.g) objF), null, null, false, null, interfaceC3540l, 384, 971);
                    boolean zBooleanValue2 = ((Boolean) o1.b(this.f20565a.v0(), null, interfaceC3540l, 0, 1).getValue()).booleanValue();
                    Se.c cVar2 = this.f20565a;
                    interfaceC3540l.U(-250344359);
                    boolean zT2 = interfaceC3540l.T(cVar2);
                    Object objF2 = interfaceC3540l.f();
                    if (zT2 || objF2 == InterfaceC3540l.f21100a.a()) {
                        objF2 = new b(cVar2);
                        interfaceC3540l.K(objF2);
                    }
                    interfaceC3540l.J();
                    u0.c(null, null, "Object Detection", null, zBooleanValue2, (InterfaceC6835l) ((th.g) objF2), null, null, false, null, interfaceC3540l, 384, 971);
                    if (AbstractC3546o.H()) {
                        AbstractC3546o.P();
                    }
                }

                @Override // mh.q
                public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                    a((A9.i) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                    return J.f24997a;
                }
            }

            C0747a(Se.c cVar) {
                this.f20551a = cVar;
            }

            public final void a(InterfaceC8687j UiSettings, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(UiSettings, "$this$UiSettings");
                if ((i10 & 17) == 16 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1471791934, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous>.<anonymous> (DevPreferencesUi.kt:54)");
                }
                AbstractC2859x.c(null, "Logs", new b.a("By clicking on the above button, latest dev logs will be sent to Firebase Crashylitics so the developer can reach them.\nPlease restart the app after clicking this button to make sure the logs were sent properly."), null, null, null, null, null, b0.c.e(-800103738, true, new C0748a(this.f20551a), interfaceC3540l, 54), interfaceC3540l, 100663728, 249);
                AbstractC2859x.c(null, "UI Cloud", null, null, null, null, null, null, b0.c.e(555810607, true, new c(this.f20551a), interfaceC3540l, 54), interfaceC3540l, 100663344, 253);
                AbstractC2859x.c(null, "SSO", null, null, null, null, null, null, b0.c.e(-2027878322, true, new d(this.f20551a), interfaceC3540l, 54), interfaceC3540l, 100663344, 253);
                AbstractC2859x.c(null, "WiFiman API", null, null, null, null, null, null, b0.c.e(-316599955, true, new C0754e(this.f20551a), interfaceC3540l, 54), interfaceC3540l, 100663344, 253);
                AbstractC2859x.c(null, "WiFiman Wizard", null, null, null, null, null, null, b0.c.e(1394678412, true, new f(this.f20551a), interfaceC3540l, 54), interfaceC3540l, 100663344, 253);
                AbstractC2859x.c(null, "WiFi Scan", null, null, null, null, null, null, b0.c.e(-1189010517, true, new g(this.f20551a), interfaceC3540l, 54), interfaceC3540l, 100663344, 253);
                AbstractC2859x.c(null, "Discovery", null, null, null, null, null, null, b0.c.e(522267850, true, new h(this.f20551a), interfaceC3540l, 54), interfaceC3540l, 100663344, 253);
                AbstractC2859x.c(null, "Bluetooth Scan", null, null, null, null, null, null, b0.c.e(-2061421079, true, new i(this.f20551a), interfaceC3540l, 54), interfaceC3540l, 100663344, 253);
                AbstractC2859x.c(null, "Floorplan", null, null, null, null, null, null, b0.c.e(-350142712, true, new j(this.f20551a), interfaceC3540l, 54), interfaceC3540l, 100663344, 253);
                AbstractC2859x.c(null, "Throughput Speed", null, null, null, null, null, null, b0.c.e(1361135655, true, new b(this.f20551a), interfaceC3540l, 54), interfaceC3540l, 100663344, 253);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
                a((InterfaceC8687j) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        a(c cVar) {
            this.f20550a = cVar;
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
                AbstractC3546o.Q(1866620757, i10, -1, "com.ui.wifiman.ui.settings.dev.DevPreferencesUi.<anonymous> (DevPreferencesUi.kt:49)");
            }
            P.b(o.h(r.f(androidx.compose.ui.e.f28771b0, 0.0f, 1, null), scaffoldPadding), null, null, b0.c.e(1471791934, true, new C0747a(this.f20550a), interfaceC3540l, 54), interfaceC3540l, 3072, 6);
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
    public static final void b(Se.c r31, T.InterfaceC3540l r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Se.e.b(Se.c, T.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(c cVar, int i10, int i11, InterfaceC3540l interfaceC3540l, int i12) {
        b(cVar, interfaceC3540l, L0.a(i10 | 1), i11);
        return J.f24997a;
    }
}
