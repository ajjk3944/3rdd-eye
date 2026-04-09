package J8;

import com.facebook.applinks.AppLinkData;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: FacebookInstallData.kt */
/* renamed from: J8.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0705u {

    /* renamed from: a, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.d f2899a;

    /* renamed from: b, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.c f2900b;

    public C0705u(com.zipoapps.premiumhelper.d dVar) {
        this.f2899a = dVar;
        this.f2900b = new com.zipoapps.premiumhelper.c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(h9.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof J8.C0703s
            if (r0 == 0) goto L13
            r0 = r5
            J8.s r0 = (J8.C0703s) r0
            int r1 = r0.f2898n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2898n = r1
            goto L18
        L13:
            J8.s r0 = new J8.s
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f2896l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f2898n
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            b9.n.b(r5)     // Catch: java.lang.Exception -> L27
            goto L55
        L27:
            r5 = move-exception
            goto L58
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            b9.n.b(r5)
            r0.f2898n = r3     // Catch: java.lang.Exception -> L27
            A9.j r5 = new A9.j     // Catch: java.lang.Exception -> L27
            f9.e r0 = com.google.gson.internal.c.r(r0)     // Catch: java.lang.Exception -> L27
            r5.<init>(r3, r0)     // Catch: java.lang.Exception -> L27
            r5.s()     // Catch: java.lang.Exception -> L27
            com.zipoapps.premiumhelper.d r0 = r4.f2899a     // Catch: java.lang.Exception -> L27
            J8.t r2 = new J8.t     // Catch: java.lang.Exception -> L27
            r2.<init>()     // Catch: java.lang.Exception -> L27
            com.facebook.applinks.AppLinkData$CompletionHandler r2 = (com.facebook.applinks.AppLinkData.CompletionHandler) r2     // Catch: java.lang.Exception -> L27
            com.facebook.applinks.AppLinkData.fetchDeferredAppLinkData(r0, r2)     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.r()     // Catch: java.lang.Exception -> L27
            if (r5 != r1) goto L55
            return r1
        L55:
            com.facebook.applinks.AppLinkData r5 = (com.facebook.applinks.AppLinkData) r5     // Catch: java.lang.Exception -> L27
            return r5
        L58:
            va.a$b r0 = va.a.f47104a
            r0.d(r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: J8.C0705u.a(h9.c):java.lang.Object");
    }

    public final void b(AppLinkData appLinkData) {
        if (appLinkData != null) {
            FirebaseAnalytics.getInstance(this.f2899a).f23243a.zzx("fb_install", G0.d.a(new b9.l("uri", String.valueOf(appLinkData.getTargetUri())), new b9.l("promo", appLinkData.getPromotionCode())));
        }
    }
}
