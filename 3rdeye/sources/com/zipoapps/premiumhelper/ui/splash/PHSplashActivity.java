package com.zipoapps.premiumhelper.ui.splash;

import A2.l;
import A9.C0575f;
import A9.E;
import A9.F;
import D9.C;
import D9.InterfaceC0645g;
import E9.j;
import H8.c;
import H8.f;
import L0.U;
import U7.o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.C1784q;
import androidx.lifecycle.C1786t;
import androidx.lifecycle.N;
import b9.C1992A;
import b9.C2001h;
import b9.n;
import b9.p;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premium.start_like_pro.StartLikeProActivity;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import f9.InterfaceC4347e;
import h9.e;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import p9.InterfaceC5480a;
import p9.q;
import r8.d;
import w9.i;

/* compiled from: PHSplashActivity.kt */
/* loaded from: classes3.dex */
public class PHSplashActivity extends AppCompatActivity implements o {
    public static final /* synthetic */ i<Object>[] i;

    /* renamed from: c, reason: collision with root package name */
    public final d f37170c = new d("PremiumHelper");

    /* renamed from: d, reason: collision with root package name */
    public final p f37171d;

    /* renamed from: e, reason: collision with root package name */
    public final p f37172e;

    /* renamed from: f, reason: collision with root package name */
    public final p f37173f;

    /* renamed from: g, reason: collision with root package name */
    public final C f37174g;

    /* renamed from: h, reason: collision with root package name */
    public final C f37175h;

    /* compiled from: PHSplashActivity.kt */
    public /* synthetic */ class a extends k implements InterfaceC5480a<C1992A> {
        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            PHSplashActivity pHSplashActivity = (PHSplashActivity) this.receiver;
            i<Object>[] iVarArr = PHSplashActivity.i;
            pHSplashActivity.getClass();
            C1786t c1786tY = l.y(pHSplashActivity);
            C0575f.e(c1786tY, null, null, new C1784q(c1786tY, new f(pHSplashActivity, null), null), 3);
            return C1992A.f18074a;
        }
    }

    /* compiled from: PHSplashActivity.kt */
    @e(c = "com.zipoapps.premiumhelper.ui.splash.PHSplashActivity$onCreate$2", f = "PHSplashActivity.kt", l = {79}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f37176l;

        /* compiled from: PHSplashActivity.kt */
        @e(c = "com.zipoapps.premiumhelper.ui.splash.PHSplashActivity$onCreate$2$1", f = "PHSplashActivity.kt", l = {82}, m = "invokeSuspend")
        public static final class a extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public int f37178l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ PHSplashActivity f37179m;

            /* compiled from: PHSplashActivity.kt */
            @e(c = "com.zipoapps.premiumhelper.ui.splash.PHSplashActivity$onCreate$2$1$1", f = "PHSplashActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.zipoapps.premiumhelper.ui.splash.PHSplashActivity$b$a$a, reason: collision with other inner class name */
            public static final class C0433a extends h9.i implements q<Boolean, Boolean, InterfaceC4347e<? super C1992A>, Object> {
                @Override // p9.q
                public final Object invoke(Boolean bool, Boolean bool2, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                    bool.booleanValue();
                    bool2.booleanValue();
                    return new C0433a(3, interfaceC4347e).invokeSuspend(C1992A.f18074a);
                }

                @Override // h9.AbstractC4424a
                public final Object invokeSuspend(Object obj) {
                    g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                    n.b(obj);
                    return C1992A.f18074a;
                }
            }

            /* compiled from: PHSplashActivity.kt */
            /* renamed from: com.zipoapps.premiumhelper.ui.splash.PHSplashActivity$b$a$b, reason: collision with other inner class name */
            public static final class C0434b<T> implements InterfaceC0645g {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PHSplashActivity f37180b;

                public C0434b(PHSplashActivity pHSplashActivity) {
                    this.f37180b = pHSplashActivity;
                }

                @Override // D9.InterfaceC0645g
                public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
                    PHSplashActivity pHSplashActivity = this.f37180b;
                    com.zipoapps.premiumhelper.e.f37006D.getClass();
                    com.zipoapps.premiumhelper.e eVarA = e.a.a();
                    l8.d<Boolean> PH_DISABLE_PREMIUM_OFFERING = i8.d.f38576r;
                    kotlin.jvm.internal.l.e(PH_DISABLE_PREMIUM_OFFERING, "PH_DISABLE_PREMIUM_OFFERING");
                    Boolean bool = (Boolean) eVarA.f37020j.h(PH_DISABLE_PREMIUM_OFFERING);
                    com.zipoapps.premiumhelper.e eVarA2 = e.a.a();
                    l8.d<Boolean> PH_DISABLE_ONBOARDING_PREMIUM_OFFERING = i8.d.f38575q;
                    kotlin.jvm.internal.l.e(PH_DISABLE_ONBOARDING_PREMIUM_OFFERING, "PH_DISABLE_ONBOARDING_PREMIUM_OFFERING");
                    Boolean bool2 = (Boolean) eVarA2.f37020j.h(PH_DISABLE_ONBOARDING_PREMIUM_OFFERING);
                    boolean z10 = e.a.a().i.f37004a.getBoolean("is_onboarding_complete", false);
                    boolean zJ = e.a.a().i.j();
                    boolean zBooleanValue = bool.booleanValue();
                    d dVar = pHSplashActivity.f37170c;
                    if (zBooleanValue) {
                        dVar.a(pHSplashActivity, PHSplashActivity.i[0]).g("Onboarding premium offering is disabled by ".concat(PH_DISABLE_PREMIUM_OFFERING.f43924a), new Object[0]);
                    } else {
                        if (!bool2.booleanValue()) {
                            if (!z10 && !zJ) {
                                pHSplashActivity.l(new Intent(pHSplashActivity, (Class<?>) StartLikeProActivity.class));
                            }
                            return C1992A.f18074a;
                        }
                        dVar.a(pHSplashActivity, PHSplashActivity.i[0]).g("Onboarding premium offering is disabled by ".concat(PH_DISABLE_ONBOARDING_PREMIUM_OFFERING.f43924a), new Object[0]);
                    }
                    if (e.a.a().h()) {
                        pHSplashActivity.l(new Intent(pHSplashActivity, e.a.a().f37020j.f43910b.getMainActivityClass()));
                    } else {
                        pHSplashActivity.l(new Intent(pHSplashActivity, e.a.a().f37020j.f43910b.getIntroActivityClass()));
                    }
                    return C1992A.f18074a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PHSplashActivity pHSplashActivity, InterfaceC4347e<? super a> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f37179m = pHSplashActivity;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                return new a(this.f37179m, interfaceC4347e);
            }

            @Override // p9.p
            public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                Object obj2 = g9.a.COROUTINE_SUSPENDED;
                int i = this.f37178l;
                if (i == 0) {
                    n.b(obj);
                    PHSplashActivity pHSplashActivity = this.f37179m;
                    C c10 = pHSplashActivity.f37174g;
                    C c11 = pHSplashActivity.f37175h;
                    C0433a c0433a = new C0433a(3, null);
                    C0434b c0434b = new C0434b(pHSplashActivity);
                    this.f37178l = 1;
                    Object objC = F.c(new j(c11, c10, c0434b, c0433a, null), this);
                    if (objC != obj2) {
                        objC = C1992A.f18074a;
                    }
                    if (objC == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                }
                return C1992A.f18074a;
            }
        }

        public b(InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return PHSplashActivity.this.new b(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = g9.a.COROUTINE_SUSPENDED;
            int i = this.f37176l;
            if (i == 0) {
                n.b(obj);
                AbstractC1781n.b bVar = AbstractC1781n.b.STARTED;
                PHSplashActivity pHSplashActivity = PHSplashActivity.this;
                a aVar = new a(pHSplashActivity, null);
                this.f37176l = 1;
                Object objA = N.a(pHSplashActivity.getLifecycle(), bVar, aVar, this);
                if (objA != obj2) {
                    objA = C1992A.f18074a;
                }
                if (objA == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    static {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q(PHSplashActivity.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        x.f43661a.getClass();
        i = new i[]{qVar};
    }

    public PHSplashActivity() {
        C2001h.b(new c(this, 0));
        this.f37171d = C2001h.b(new H8.d(this, 0));
        this.f37172e = C2001h.b(new G1.e(this, 2));
        this.f37173f = C2001h.b(new B8.c(this, 1));
        this.f37174g = D9.E.a((7 & 1) != 0 ? 0 : 1, C9.a.SUSPEND);
        this.f37175h = D9.E.a((7 & 1) != 0 ? 0 : 1, C9.a.SUSPEND);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (r2.h(r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object k(com.zipoapps.premiumhelper.ui.splash.PHSplashActivity r6, h9.c r7) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.ui.splash.PHSplashActivity.k(com.zipoapps.premiumhelper.ui.splash.PHSplashActivity, h9.c):java.lang.Object");
    }

    public final void l(Intent intent) {
        startActivity(intent);
        StartupPerformanceTracker.f37057b.getClass();
        StartupPerformanceTracker startupPerformanceTrackerA = StartupPerformanceTracker.a.a();
        synchronized (startupPerformanceTrackerA) {
            StartupPerformanceTracker.StartupData startupData = startupPerformanceTrackerA.f37059a;
            if (startupData != null) {
                t8.e.a(new A8.j(2, startupPerformanceTrackerA, startupData));
            }
        }
        finish();
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        StartupPerformanceTracker.f37057b.getClass();
        StartupPerformanceTracker.StartupData startupData = StartupPerformanceTracker.a.a().f37059a;
        if (startupData != null) {
            startupData.setSplashScreenShown(true);
        }
        p pVar = this.f37173f;
        ((H8.i) pVar.getValue()).b();
        super.onCreate(bundle);
        setContentView(R.layout.ph_activity_splash);
        H8.i iVar = (H8.i) pVar.getValue();
        a aVar = new a(0, this, PHSplashActivity.class, "onSplashConfigurationCompleted", "onSplashConfigurationCompleted()V", 0);
        iVar.getClass();
        iVar.f2328b = aVar;
        U.a(getWindow(), false);
        Object value = this.f37171d.getValue();
        kotlin.jvm.internal.l.e(value, "getValue(...)");
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        com.zipoapps.premiumhelper.e eVarA = e.a.a();
        Context applicationContext = getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        eVarA.f37015d.getClass();
        ((ImageView) value).setImageResource(applicationContext.getApplicationInfo().icon);
        Object value2 = this.f37172e.getValue();
        kotlin.jvm.internal.l.e(value2, "getValue(...)");
        com.zipoapps.premiumhelper.e eVarA2 = e.a.a();
        Context applicationContext2 = getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext2, "getApplicationContext(...)");
        ((TextView) value2).setText(eVarA2.f37015d.c(applicationContext2));
        ((H8.i) pVar.getValue()).a();
        C0575f.e(l.y(this), null, null, new b(null), 3);
    }
}
