package com.zipoapps.premiumhelper;

import A8.k;
import A9.C0575f;
import A9.C0580h0;
import A9.F;
import A9.L0;
import D9.A;
import D9.E;
import D9.G;
import D9.J;
import F9.C0663f;
import J8.H;
import J8.L;
import J8.S;
import J8.U;
import J8.x;
import P7.C1484a;
import T1.z;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.work.b;
import b0.C1810a;
import b8.C1991a;
import b9.C1992A;
import com.google.android.ump.ConsentInformation;
import com.zipoapps.blytics.SessionManager;
import com.zipoapps.premium.relaunch.RelaunchActivity;
import com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration;
import com.zipoapps.premiumhelper.toto.TotoManager;
import f9.InterfaceC4350h;
import i8.C4461a;
import i8.n;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import j8.C5201c;
import k8.t;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.q;
import l8.a;
import o8.C5433b;
import r7.s;
import w9.i;

/* compiled from: PremiumHelper.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: D, reason: collision with root package name */
    public static final a f37006D;

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ i<Object>[] f37007E;

    /* renamed from: F, reason: collision with root package name */
    public static e f37008F;

    /* renamed from: A, reason: collision with root package name */
    public final s f37009A;

    /* renamed from: B, reason: collision with root package name */
    public final k f37010B;

    /* renamed from: C, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.ui.settings.c f37011C;

    /* renamed from: a, reason: collision with root package name */
    public final d f37012a;

    /* renamed from: b, reason: collision with root package name */
    public final r8.d f37013b = new r8.d("PremiumHelper");

    /* renamed from: c, reason: collision with root package name */
    public final C0663f f37014c;

    /* renamed from: d, reason: collision with root package name */
    public final C5201c f37015d;

    /* renamed from: e, reason: collision with root package name */
    public final L f37016e;

    /* renamed from: f, reason: collision with root package name */
    public final n8.f f37017f;

    /* renamed from: g, reason: collision with root package name */
    public final C5433b f37018g;

    /* renamed from: h, reason: collision with root package name */
    public final B0.f f37019h;
    public final c i;

    /* renamed from: j, reason: collision with root package name */
    public final l8.b f37020j;

    /* renamed from: k, reason: collision with root package name */
    public final C4461a f37021k;

    /* renamed from: l, reason: collision with root package name */
    public final H f37022l;

    /* renamed from: m, reason: collision with root package name */
    public final x f37023m;

    /* renamed from: n, reason: collision with root package name */
    public final U7.a f37024n;

    /* renamed from: o, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.ui.rate.f f37025o;

    /* renamed from: p, reason: collision with root package name */
    public final w8.i f37026p;

    /* renamed from: q, reason: collision with root package name */
    public final t f37027q;

    /* renamed from: r, reason: collision with root package name */
    public final J f37028r;

    /* renamed from: s, reason: collision with root package name */
    public final A f37029s;

    /* renamed from: t, reason: collision with root package name */
    public final U f37030t;

    /* renamed from: u, reason: collision with root package name */
    public final SessionManager f37031u;

    /* renamed from: v, reason: collision with root package name */
    public final S f37032v;

    /* renamed from: w, reason: collision with root package name */
    public final TotoManager f37033w;

    /* renamed from: x, reason: collision with root package name */
    public final C1484a f37034x;

    /* renamed from: y, reason: collision with root package name */
    public final G f37035y;

    /* renamed from: z, reason: collision with root package name */
    public final v8.b f37036z;

    /* compiled from: PremiumHelper.kt */
    public static final class a {
        public static e a() {
            e eVar = e.f37008F;
            if (eVar != null) {
                return eVar;
            }
            throw new IllegalStateException("Please call getInstance() with context first");
        }
    }

    static {
        q qVar = new q(e.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        kotlin.jvm.internal.x.f43661a.getClass();
        f37007E = new i[]{qVar};
        f37006D = new a();
    }

    public e(d dVar, PremiumHelperConfiguration premiumHelperConfiguration) {
        int i = 1;
        int i10 = 2;
        this.f37012a = dVar;
        L0 l0A = C0575f.a();
        I9.c cVar = A9.U.f211a;
        C0663f c0663fA = F.a(InterfaceC4350h.a.C0456a.d(l0A, F9.q.f1782a.R0()));
        this.f37014c = c0663fA;
        C5201c c5201c = new C5201c();
        this.f37015d = c5201c;
        this.f37016e = new L(dVar, c0663fA);
        n8.f fVar = new n8.f();
        this.f37017f = fVar;
        C5433b c5433b = new C5433b();
        this.f37018g = c5433b;
        this.f37019h = new B0.f(dVar);
        c cVar2 = new c(dVar);
        this.i = cVar2;
        l8.b bVar = new l8.b(dVar, fVar, premiumHelperConfiguration, c5433b);
        this.f37020j = bVar;
        C4461a c4461a = new C4461a(dVar, bVar, new C1991a(dVar), cVar2, c5201c);
        this.f37021k = c4461a;
        this.f37022l = new H(dVar);
        this.f37023m = new x(dVar);
        this.f37024n = new U7.a(dVar, bVar);
        com.zipoapps.premiumhelper.ui.rate.f fVar2 = new com.zipoapps.premiumhelper.ui.rate.f(bVar, cVar2);
        this.f37025o = fVar2;
        this.f37026p = new w8.i(fVar2, bVar, cVar2);
        t tVar = new t(c0663fA, dVar, bVar, cVar2, c5201c, c4461a);
        this.f37027q = tVar;
        J jC = E.c(Boolean.FALSE);
        this.f37028r = jC;
        this.f37029s = D9.H.a(jC);
        this.f37030t = new U(bVar, cVar2, c4461a);
        this.f37031u = new SessionManager(dVar, bVar, c5201c);
        this.f37032v = new S(new G1.e(new G1.c(2), 4), 0L, true);
        this.f37033w = new TotoManager(dVar, c0663fA, bVar, cVar2, tVar, c4461a, c5201c);
        C1484a c1484a = new C1484a(c0663fA, dVar, bVar, cVar2, c4461a);
        this.f37034x = c1484a;
        this.f37035y = new G(c1484a);
        this.f37036z = new v8.b(c0663fA, bVar, c5201c);
        this.f37009A = new s();
        this.f37010B = new k(dVar, cVar2, bVar, c1484a.f10717d, premiumHelperConfiguration, c5201c);
        this.f37011C = new com.zipoapps.premiumhelper.ui.settings.c();
        try {
            b.a aVar = new b.a();
            String packageName = dVar.getPackageName();
            l.e(packageName, "getPackageName(...)");
            aVar.f16879c = packageName;
            aVar.f16877a = new C1810a(i10);
            aVar.f16878b = new T.a(i);
            z.d(dVar, new androidx.work.b(aVar));
        } catch (Exception e4) {
            va.a.f47104a.g("WorkManager init exception", new Object[0]);
            K4.e.a().b(e4);
        }
        d dVar2 = this.f37012a;
        l8.b configuration = this.f37020j;
        l.f(configuration, "configuration");
        dVar2.registerActivityLifecycleCallbacks(new H8.a(new H8.b(), configuration, dVar2));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(5:12|37|(1:39)|40|41)(2:13|14))(1:15))(2:16|(1:45)(1:19))|20|42|21|(3:23|(2:26|24)|44)|30|(1:32)|33|(1:46)(5:36|37|(0)|40|41)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        r9.e().d(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.zipoapps.premiumhelper.e r9, h9.c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.e.a(com.zipoapps.premiumhelper.e, h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.zipoapps.premiumhelper.e r10, h9.c r11) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.e.b(com.zipoapps.premiumhelper.e, h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.zipoapps.premiumhelper.e r6, h9.c r7) {
        /*
            boolean r0 = r7 instanceof i8.k
            if (r0 == 0) goto L13
            r0 = r7
            i8.k r0 = (i8.k) r0
            int r1 = r0.f38605n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38605n = r1
            goto L18
        L13:
            i8.k r0 = new i8.k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f38603l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f38605n
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            b9.n.b(r7)
            goto L53
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            b9.n.b(r7)
            com.zipoapps.premiumhelper.performance.StartupPerformanceTracker$a r7 = com.zipoapps.premiumhelper.performance.StartupPerformanceTracker.f37057b
            r7.getClass()
            com.zipoapps.premiumhelper.performance.StartupPerformanceTracker r7 = com.zipoapps.premiumhelper.performance.StartupPerformanceTracker.a.a()
            com.zipoapps.premiumhelper.performance.StartupPerformanceTracker$StartupData r7 = r7.f37059a
            if (r7 == 0) goto L46
            long r4 = java.lang.System.currentTimeMillis()
            r7.setTestyStartTimestamp(r4)
        L46:
            r0.f38605n = r3
            com.zipoapps.premiumhelper.d r7 = r6.f37012a
            o8.b r6 = r6.f37018g
            java.lang.Object r6 = r6.f(r7, r0)
            if (r6 != r1) goto L53
            return r1
        L53:
            com.zipoapps.premiumhelper.performance.StartupPerformanceTracker$a r6 = com.zipoapps.premiumhelper.performance.StartupPerformanceTracker.f37057b
            r6.getClass()
            com.zipoapps.premiumhelper.performance.StartupPerformanceTracker r6 = com.zipoapps.premiumhelper.performance.StartupPerformanceTracker.a.a()
            com.zipoapps.premiumhelper.performance.StartupPerformanceTracker$StartupData r6 = r6.f37059a
            if (r6 == 0) goto L67
            long r0 = java.lang.System.currentTimeMillis()
            r6.setTestyEndTimestamp(r0)
        L67:
            b9.A r6 = b9.C1992A.f18074a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.e.c(com.zipoapps.premiumhelper.e, h9.c):java.lang.Object");
    }

    public static final void d(e eVar) {
        d dVar = eVar.f37012a;
        C5201c c5201c = eVar.f37015d;
        if (!c5201c.f(dVar)) {
            eVar.e().c(androidx.work.s.d("PremiumHelper initialization disabled for process ", c5201c.e(dVar)), new Object[0]);
            return;
        }
        C0575f.e(F.a(A9.U.f212b), null, null, new i8.i(eVar, null), 3);
        try {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    WebView.setDataDirectorySuffix(Application.getProcessName());
                }
            } catch (Exception e4) {
                K4.e.a().b(e4);
                va.a.f47104a.d(e4);
            }
            B4.e.f(dVar);
            C0575f.e(C0580h0.f248b, null, null, new n(eVar, null), 3);
        } catch (Exception e10) {
            eVar.e().e(e10, "Initialization failed", new Object[0]);
            C1992A c1992a = C1992A.f18074a;
        }
    }

    public static void i(e eVar, AppCompatActivity activity, int i) {
        l.f(activity, "activity");
        eVar.f37024n.f12499h = true;
        C0575f.e(A2.l.y(activity), null, null, new i8.l(eVar, activity, -1, null), 3);
    }

    public static void j(Activity activity, String str) {
        k.f132j.getClass();
        Intent intent = new Intent(activity, (Class<?>) RelaunchActivity.class);
        intent.putExtra(AdRevenueConstants.SOURCE_KEY, str);
        activity.startActivity(intent);
    }

    public static void k(e eVar, String source) {
        l.f(source, "source");
        k.f132j.getClass();
        d dVar = eVar.f37012a;
        Intent intent = new Intent(dVar, (Class<?>) RelaunchActivity.class);
        intent.putExtra(AdRevenueConstants.SOURCE_KEY, source);
        intent.addFlags(268435456);
        dVar.startActivity(intent);
    }

    public static void m(e eVar, androidx.fragment.app.x xVar, int i) {
        eVar.f37025o.f(xVar, -1, (i & 4) != 0 ? null : "preferences", null);
    }

    public final r8.c e() {
        return this.f37013b.a(this, f37007E[0]);
    }

    public final void f() {
        SharedPreferences.Editor editorEdit = this.i.f37004a.edit();
        editorEdit.putBoolean("is_next_app_start_ignored", true);
        editorEdit.apply();
    }

    public final boolean g() {
        P7.x xVarC = this.f37034x.c();
        xVarC.getClass();
        f37006D.getClass();
        if (a.a().i.j() || !P7.x.b().booleanValue()) {
            return false;
        }
        ConsentInformation consentInformation = xVarC.f10825b;
        if (consentInformation != null && consentInformation.getConsentStatus() == 3) {
            return true;
        }
        ConsentInformation consentInformation2 = xVarC.f10825b;
        return consentInformation2 != null && consentInformation2.getConsentStatus() == 2;
    }

    public final boolean h() {
        if (this.f37020j.f43910b.getIntroActivityClass() == null) {
            return true;
        }
        c cVar = this.i;
        cVar.getClass();
        return a.C0491a.a(cVar, "intro_complete", false);
    }

    public final void l(Activity activity) {
        l8.d<String> PH_PRIVACY_URL = i8.d.f38535O;
        l.e(PH_PRIVACY_URL, "PH_PRIVACY_URL");
        Object objH = this.f37020j.h(PH_PRIVACY_URL);
        l.e(objH, "get(...)");
        this.f37015d.h(activity, (String) objH);
    }

    public final void n(Activity activity) {
        l8.d<String> PH_TERMS_URL = i8.d.f38562h0;
        l.e(PH_TERMS_URL, "PH_TERMS_URL");
        Object objH = this.f37020j.h(PH_TERMS_URL);
        l.e(objH, "get(...)");
        this.f37015d.h(activity, (String) objH);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:12:0x002a, B:25:0x006d, B:31:0x007f, B:33:0x00ac, B:34:0x00af), top: B:39:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [f9.e, i8.o] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(h9.c r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Initialization timeout expired: "
            boolean r1 = r10 instanceof i8.o
            if (r1 == 0) goto L15
            r1 = r10
            i8.o r1 = (i8.o) r1
            int r2 = r1.f38619p
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f38619p = r2
            goto L1a
        L15:
            i8.o r1 = new i8.o
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.f38617n
            g9.a r2 = g9.a.COROUTINE_SUSPENDED
            int r3 = r1.f38619p
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L3b
            if (r3 != r5) goto L33
            long r2 = r1.f38616m
            com.zipoapps.premiumhelper.e r1 = r1.f38615l
            b9.n.b(r10)     // Catch: java.lang.Exception -> L2e A9.O0 -> L31
            goto L6d
        L2e:
            r10 = move-exception
            goto Lb5
        L31:
            r10 = move-exception
            goto L7f
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3b:
            b9.n.b(r10)
            l8.d<java.lang.Integer> r10 = i8.d.f38583y
            java.lang.String r3 = "PH_INITIALIZATION_TIMEOUT_SECONDS"
            kotlin.jvm.internal.l.e(r10, r3)
            l8.b r3 = r9.f37020j
            java.lang.Object r10 = r3.h(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            long r6 = (long) r10
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            long r6 = r10.toMillis(r6)
            i8.p r10 = new i8.p     // Catch: java.lang.Exception -> L79 A9.O0 -> L7c
            r3 = 0
            r10.<init>(r6, r9, r3)     // Catch: java.lang.Exception -> L79 A9.O0 -> L7c
            r1.f38615l = r9     // Catch: java.lang.Exception -> L79 A9.O0 -> L7c
            r1.f38616m = r6     // Catch: java.lang.Exception -> L79 A9.O0 -> L7c
            r1.f38619p = r5     // Catch: java.lang.Exception -> L79 A9.O0 -> L7c
            java.lang.Object r10 = A9.F.c(r10, r1)     // Catch: java.lang.Exception -> L79 A9.O0 -> L7c
            if (r10 != r2) goto L6b
            return r2
        L6b:
            r1 = r9
            r2 = r6
        L6d:
            i8.a r10 = r1.f37021k     // Catch: java.lang.Exception -> L2e A9.O0 -> L31
            r10.f38489g = r4     // Catch: java.lang.Exception -> L2e A9.O0 -> L31
            J8.E$c r10 = new J8.E$c     // Catch: java.lang.Exception -> L2e A9.O0 -> L31
            b9.A r6 = b9.C1992A.f18074a     // Catch: java.lang.Exception -> L2e A9.O0 -> L31
            r10.<init>(r6)     // Catch: java.lang.Exception -> L2e A9.O0 -> L31
            goto Lc2
        L79:
            r10 = move-exception
            r1 = r9
            goto Lb5
        L7c:
            r10 = move-exception
            r1 = r9
            r2 = r6
        L7f:
            r8.c r6 = r1.e()     // Catch: java.lang.Exception -> L2e
            java.lang.String r7 = r10.getMessage()     // Catch: java.lang.Exception -> L2e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e
            r8.<init>(r0)     // Catch: java.lang.Exception -> L2e
            r8.append(r7)     // Catch: java.lang.Exception -> L2e
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Exception -> L2e
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L2e
            r6.c(r0, r4)     // Catch: java.lang.Exception -> L2e
            r1.f()     // Catch: java.lang.Exception -> L2e
            i8.a r0 = r1.f37021k     // Catch: java.lang.Exception -> L2e
            r0.f38489g = r5     // Catch: java.lang.Exception -> L2e
            com.zipoapps.premiumhelper.performance.StartupPerformanceTracker$a r0 = com.zipoapps.premiumhelper.performance.StartupPerformanceTracker.f37057b     // Catch: java.lang.Exception -> L2e
            r0.getClass()     // Catch: java.lang.Exception -> L2e
            com.zipoapps.premiumhelper.performance.StartupPerformanceTracker r0 = com.zipoapps.premiumhelper.performance.StartupPerformanceTracker.a.a()     // Catch: java.lang.Exception -> L2e
            com.zipoapps.premiumhelper.performance.StartupPerformanceTracker$StartupData r0 = r0.f37059a     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto Laf
            r0.setPremiumHelperTimeout(r2)     // Catch: java.lang.Exception -> L2e
        Laf:
            J8.E$b r0 = new J8.E$b     // Catch: java.lang.Exception -> L2e
            r0.<init>(r10)     // Catch: java.lang.Exception -> L2e
            goto Lc1
        Lb5:
            r8.c r0 = r1.e()
            r0.d(r10)
            J8.E$b r0 = new J8.E$b
            r0.<init>(r10)
        Lc1:
            r10 = r0
        Lc2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.e.o(h9.c):java.lang.Object");
    }
}
