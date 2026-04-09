package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C4353g1;

/* renamed from: com.google.android.gms.measurement.internal.h5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4867h5 implements Application.ActivityLifecycleCallbacks, InterfaceC4875i5 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36520a;

    C4867h5(C4945r4 c4945r4) {
        this.f36520a = c4945r4;
    }

    static /* synthetic */ void f(C4867h5 c4867h5, boolean z10, Uri uri, String str, String str2) {
        Bundle bundleY;
        Bundle bundleY2;
        c4867h5.f36520a.j();
        try {
            x7 x7VarG = c4867h5.f36520a.g();
            if (TextUtils.isEmpty(str2)) {
                bundleY = null;
            } else if (str2.contains("gclid") || str2.contains("gbraid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id")) {
                bundleY = x7VarG.y(Uri.parse("https://google.com/search?" + str2));
                if (bundleY != null) {
                    bundleY.putString("_cis", "referrer");
                }
            } else {
                x7VarG.zzj().B().a("Activity created with data 'referrer' without required params");
                bundleY = null;
            }
            if (z10 && (bundleY2 = c4867h5.f36520a.g().y(uri)) != null) {
                bundleY2.putString("_cis", "intent");
                if (!bundleY2.containsKey("gclid") && bundleY != null && bundleY.containsKey("gclid")) {
                    bundleY2.putString("_cer", String.format("gclid=%s", bundleY.getString("gclid")));
                }
                c4867h5.f36520a.c1(str, "_cmp", bundleY2);
                c4867h5.f36520a.f36703r.b(str, bundleY2);
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            c4867h5.f36520a.zzj().B().b("Activity created with referrer", str2);
            if (c4867h5.f36520a.a().p(N.f36020F0)) {
                if (bundleY != null) {
                    c4867h5.f36520a.c1(str, "_cmp", bundleY);
                    c4867h5.f36520a.f36703r.b(str, bundleY);
                } else {
                    c4867h5.f36520a.zzj().B().b("Referrer does not contain valid parameters", str2);
                }
                c4867h5.f36520a.n0("auto", "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                c4867h5.f36520a.zzj().B().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                c4867h5.f36520a.n0("auto", "_ldl", str2, true);
            }
        } catch (RuntimeException e10) {
            c4867h5.f36520a.zzj().C().b("Throwable caught in handleReferrerForOnActivityCreated", e10);
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4875i5
    public final void a(C4353g1 c4353g1) {
        this.f36520a.p().B(c4353g1);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4875i5
    public final void b(C4353g1 c4353g1) {
        C4987w6 c4987w6R = this.f36520a.r();
        c4987w6R.zzl().z(new RunnableC4979v6(c4987w6R, c4987w6R.zzb().c()));
        this.f36520a.p().O(c4353g1);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4875i5
    public final void c(C4353g1 c4353g1) {
        this.f36520a.p().M(c4353g1);
        C4987w6 c4987w6R = this.f36520a.r();
        c4987w6R.zzl().z(new RunnableC5003y6(c4987w6R, c4987w6R.zzb().c()));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    @Override // com.google.android.gms.measurement.internal.InterfaceC4875i5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.internal.measurement.C4353g1 r9, android.os.Bundle r10) {
        /*
            r8 = this;
            com.google.android.gms.measurement.internal.r4 r0 = r8.f36520a     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            com.google.android.gms.measurement.internal.L2 r0 = r0.zzj()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            com.google.android.gms.measurement.internal.N2 r0 = r0.G()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            java.lang.String r1 = "onActivityCreated"
            r0.a(r1)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            android.content.Intent r0 = r9.f35229c     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.r4 r0 = r8.f36520a
            com.google.android.gms.measurement.internal.x5 r0 = r0.p()
            r0.C(r9, r10)
            return
        L1d:
            android.net.Uri r1 = r0.getData()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r1 == 0) goto L31
            boolean r2 = r1.isHierarchical()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r2 == 0) goto L31
        L29:
            r5 = r1
            goto L4a
        L2b:
            r0 = move-exception
            goto Laf
        L2e:
            r0 = move-exception
            goto L96
        L31:
            android.os.Bundle r1 = r0.getExtras()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r1 == 0) goto L48
            java.lang.String r2 = "com.android.vending.referral_url"
            java.lang.String r1 = r1.getString(r2)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r2 != 0) goto L48
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            goto L29
        L48:
            r1 = 0
            goto L29
        L4a:
            if (r5 == 0) goto L8c
            boolean r1 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r1 != 0) goto L53
            goto L8c
        L53:
            com.google.android.gms.measurement.internal.r4 r1 = r8.f36520a     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            r1.g()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            boolean r0 = com.google.android.gms.measurement.internal.x7.c0(r0)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r0 == 0) goto L62
            java.lang.String r0 = "gs"
        L60:
            r6 = r0
            goto L65
        L62:
            java.lang.String r0 = "auto"
            goto L60
        L65:
            java.lang.String r0 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            if (r10 != 0) goto L70
            r0 = 1
        L6e:
            r4 = r0
            goto L72
        L70:
            r0 = 0
            goto L6e
        L72:
            com.google.android.gms.measurement.internal.r4 r0 = r8.f36520a     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            com.google.android.gms.measurement.internal.s3 r0 = r0.zzl()     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            com.google.android.gms.measurement.internal.k5 r1 = new com.google.android.gms.measurement.internal.k5     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            r2 = r1
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            r0.z(r1)     // Catch: java.lang.Throwable -> L2b java.lang.RuntimeException -> L2e
            com.google.android.gms.measurement.internal.r4 r0 = r8.f36520a
            com.google.android.gms.measurement.internal.x5 r0 = r0.p()
            r0.C(r9, r10)
            return
        L8c:
            com.google.android.gms.measurement.internal.r4 r0 = r8.f36520a
            com.google.android.gms.measurement.internal.x5 r0 = r0.p()
            r0.C(r9, r10)
            return
        L96:
            com.google.android.gms.measurement.internal.r4 r1 = r8.f36520a     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.L2 r1 = r1.zzj()     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.N2 r1 = r1.C()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "Throwable caught in onActivityCreated"
            r1.b(r2, r0)     // Catch: java.lang.Throwable -> L2b
            com.google.android.gms.measurement.internal.r4 r0 = r8.f36520a
            com.google.android.gms.measurement.internal.x5 r0 = r0.p()
            r0.C(r9, r10)
            return
        Laf:
            com.google.android.gms.measurement.internal.r4 r1 = r8.f36520a
            com.google.android.gms.measurement.internal.x5 r1 = r1.p()
            r1.C(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4867h5.d(com.google.android.gms.internal.measurement.g1, android.os.Bundle):void");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4875i5
    public final void e(C4353g1 c4353g1, Bundle bundle) {
        this.f36520a.p().N(c4353g1, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        d(C4353g1.b(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(C4353g1.b(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(C4353g1.b(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(C4353g1.b(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e(C4353g1.b(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
