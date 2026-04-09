package P7;

import A9.C0575f;
import D9.J;
import F9.C0663f;
import b9.C1992A;
import b9.C2001h;
import com.applovin.sdk.AppLovinSdk;
import com.google.android.gms.ads.MobileAds;
import com.zipoapps.premiumhelper.e;
import i8.C4461a;
import io.appmetrica.analytics.impl.Oo;
import java.util.List;
import java.util.Locale;
import l8.b;

/* compiled from: AdManager.kt */
/* renamed from: P7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1484a {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w9.i<Object>[] f10712m;

    /* renamed from: n, reason: collision with root package name */
    public static final List<b.a> f10713n;

    /* renamed from: a, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.d f10714a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.b f10715b;

    /* renamed from: d, reason: collision with root package name */
    public final U7.f f10717d;

    /* renamed from: e, reason: collision with root package name */
    public final Y7.a f10718e;

    /* renamed from: f, reason: collision with root package name */
    public final com.zipoapps.ads.banner.a f10719f;

    /* renamed from: g, reason: collision with root package name */
    public final X7.a f10720g;
    public boolean i;

    /* renamed from: c, reason: collision with root package name */
    public final r8.d f10716c = new r8.d("PremiumHelper");

    /* renamed from: h, reason: collision with root package name */
    public final b9.p f10721h = C2001h.b(new G2.j(this, 1));

    /* renamed from: j, reason: collision with root package name */
    public final J f10722j = D9.E.c(Boolean.FALSE);

    /* renamed from: k, reason: collision with root package name */
    public final J f10723k = D9.E.c(null);

    /* renamed from: l, reason: collision with root package name */
    public final J f10724l = D9.E.c(null);

    /* compiled from: AdManager.kt */
    /* renamed from: P7.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0122a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10725a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[b.a.ADMOB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.APPLOVIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10725a = iArr;
        }
    }

    static {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q(C1484a.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        kotlin.jvm.internal.x.f43661a.getClass();
        f10712m = new w9.i[]{qVar};
        f10713n = E.u.G(b.a.APPLOVIN);
    }

    public C1484a(C0663f c0663f, com.zipoapps.premiumhelper.d dVar, l8.b bVar, com.zipoapps.premiumhelper.c cVar, C4461a c4461a) {
        this.f10714a = dVar;
        this.f10715b = bVar;
        this.f10717d = new U7.f(c0663f, dVar, bVar, cVar, c4461a);
        this.f10718e = new Y7.a(c0663f, dVar, bVar, cVar, c4461a);
        this.f10719f = new com.zipoapps.ads.banner.a(c0663f, dVar, bVar, c4461a);
        this.f10720g = new X7.a(c0663f, dVar, bVar, c4461a);
        C0575f.e(c0663f, null, null, new C1487d(this, null), 3);
        C0575f.e(c0663f, null, null, new C1489f(this, null), 3);
    }

    public static final void a(C1484a c1484a) {
        try {
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            l8.b bVar = e.a.a().f37020j;
            l8.d<Boolean> PH_INTERSTITIAL_MUTED = i8.d.f38522B;
            kotlin.jvm.internal.l.e(PH_INTERSTITIAL_MUTED, "PH_INTERSTITIAL_MUTED");
            if (((Boolean) bVar.h(PH_INTERSTITIAL_MUTED)).booleanValue()) {
                int i = C0122a.f10725a[c1484a.d().ordinal()];
                if (i == 1) {
                    MobileAds.setAppMuted(true);
                } else {
                    if (i != 2) {
                        throw new b9.j();
                    }
                    AppLovinSdk.getInstance(c1484a.f10714a).getSettings().setMuted(true);
                }
            }
            C1992A c1992a = C1992A.f18074a;
        } catch (Throwable th) {
            b9.n.a(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r10.a(r8, false, r6, r1) == r2) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r9v4, types: [p9.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(androidx.appcompat.app.AppCompatActivity r8, B8.a r9, h9.c r10) {
        /*
            r7 = this;
            r0 = 2
            boolean r1 = r10 instanceof P7.C1485b
            if (r1 == 0) goto L14
            r1 = r10
            P7.b r1 = (P7.C1485b) r1
            int r2 = r1.f10731q
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.f10731q = r2
            goto L19
        L14:
            P7.b r1 = new P7.b
            r1.<init>(r7, r10)
        L19:
            java.lang.Object r10 = r1.f10729o
            g9.a r2 = g9.a.COROUTINE_SUSPENDED
            int r3 = r1.f10731q
            r4 = 3
            r5 = 1
            if (r3 == 0) goto L4d
            if (r3 == r5) goto L3e
            if (r3 == r0) goto L36
            if (r3 != r4) goto L2e
            b9.n.b(r10)
            goto La1
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r1.f10726l
            p9.a r8 = (p9.InterfaceC5480a) r8
            b9.n.b(r10)
            goto L82
        L3e:
            p9.a r8 = r1.f10728n
            r9 = r8
            p9.a r9 = (p9.InterfaceC5480a) r9
            androidx.appcompat.app.AppCompatActivity r8 = r1.f10727m
            java.lang.Object r3 = r1.f10726l
            P7.a r3 = (P7.C1484a) r3
            b9.n.b(r10)
            goto L60
        L4d:
            b9.n.b(r10)
            r1.f10726l = r7
            r1.f10727m = r8
            r1.f10728n = r9
            r1.f10731q = r5
            java.lang.Object r10 = r7.h(r1)
            if (r10 != r2) goto L5f
            goto La0
        L5f:
            r3 = r7
        L60:
            com.zipoapps.premiumhelper.e$a r10 = com.zipoapps.premiumhelper.e.f37006D
            r10.getClass()
            com.zipoapps.premiumhelper.e r10 = com.zipoapps.premiumhelper.e.a.a()
            com.zipoapps.premiumhelper.c r10 = r10.i
            boolean r10 = r10.j()
            r5 = 0
            if (r10 == 0) goto L88
            r1.f10726l = r9
            r1.f10727m = r5
            r1.f10728n = r5
            r1.f10731q = r0
            java.lang.Object r8 = r3.f(r1)
            if (r8 != r2) goto L81
            goto La0
        L81:
            r8 = r9
        L82:
            r8.invoke()
            b9.A r8 = b9.C1992A.f18074a
            return r8
        L88:
            P7.x r10 = r3.c()
            A8.i r6 = new A8.i
            r6.<init>(r0, r9, r3)
            r1.f10726l = r5
            r1.f10727m = r5
            r1.f10728n = r5
            r1.f10731q = r4
            r9 = 0
            java.lang.Object r8 = r10.a(r8, r9, r6, r1)
            if (r8 != r2) goto La1
        La0:
            return r2
        La1:
            b9.A r8 = b9.C1992A.f18074a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.C1484a.b(androidx.appcompat.app.AppCompatActivity, B8.a, h9.c):java.lang.Object");
    }

    public final x c() {
        return (x) this.f10721h.getValue();
    }

    public final b.a d() {
        Enum enumValueOf;
        l8.d<String> PH_ADS_PROVIDER = i8.d.f38547a;
        kotlin.jvm.internal.l.e(PH_ADS_PROVIDER, "PH_ADS_PROVIDER");
        l8.a aVar = this.f10715b;
        String str = PH_ADS_PROVIDER.f43924a;
        String str2 = PH_ADS_PROVIDER.f43925b;
        String str3 = (String) aVar.a(aVar, str, str2);
        try {
            String upperCase = str3.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(upperCase, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.a.class, upperCase);
            kotlin.jvm.internal.l.c(enumValueOf);
        } catch (IllegalArgumentException unused) {
            va.a.f47104a.c(Oo.h("Invalid remote value for for '", str.getClass().getSimpleName(), "': ", str3, ". Returning key's default value."), new Object[0]);
            String upperCase2 = str2.toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l.e(upperCase2, "toUpperCase(...)");
            enumValueOf = Enum.valueOf(b.a.class, upperCase2);
        }
        return (b.a) enumValueOf;
    }

    public final r8.c e() {
        return this.f10716c.a(this, f10712m[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0122, code lost:
    
        if (A9.F.c(r10, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(h9.c r10) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.C1484a.f(h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(h9.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof P7.n
            if (r0 == 0) goto L13
            r0 = r5
            P7.n r0 = (P7.n) r0
            int r1 = r0.f10778n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10778n = r1
            goto L18
        L13:
            P7.n r0 = new P7.n
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10776l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f10778n
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            b9.n.b(r5)     // Catch: java.lang.Exception -> L27
            goto L43
        L27:
            r5 = move-exception
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            b9.n.b(r5)
            P7.o r5 = new P7.o     // Catch: java.lang.Exception -> L27
            r2 = 0
            r5.<init>(r4, r2)     // Catch: java.lang.Exception -> L27
            r0.f10778n = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = A9.F.c(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L43
            return r1
        L43:
            J8.E r5 = (J8.E) r5     // Catch: java.lang.Exception -> L27
            return r5
        L46:
            va.a$b r0 = va.a.f47104a
            java.lang.String r1 = "PremiumHelper"
            r0.o(r1)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Exception while waiting for configuration"
            r0.c(r2, r1)
            J8.E$b r0 = new J8.E$b
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.C1484a.g(h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(h9.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof P7.p
            if (r0 == 0) goto L13
            r0 = r5
            P7.p r0 = (P7.p) r0
            int r1 = r0.f10787n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10787n = r1
            goto L18
        L13:
            P7.p r0 = new P7.p
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f10785l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f10787n
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            b9.n.b(r5)     // Catch: java.lang.Exception -> L27
            goto L43
        L27:
            r5 = move-exception
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            b9.n.b(r5)
            P7.q r5 = new P7.q     // Catch: java.lang.Exception -> L27
            r2 = 0
            r5.<init>(r4, r2)     // Catch: java.lang.Exception -> L27
            r0.f10787n = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = A9.F.c(r5, r0)     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L43
            return r1
        L43:
            J8.E r5 = (J8.E) r5     // Catch: java.lang.Exception -> L27
            return r5
        L46:
            va.a$b r0 = va.a.f47104a
            java.lang.String r1 = "PremiumHelper"
            r0.o(r1)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Exception while waiting for premium status"
            r0.c(r2, r1)
            J8.E$b r0 = new J8.E$b
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.C1484a.h(h9.c):java.lang.Object");
    }
}
