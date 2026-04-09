package ec;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.sz;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q2 f22898a;

    public m2(q2 q2Var) {
        this.f22898a = q2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046 A[Catch: all -> 0x0025, RuntimeException -> 0x0028, TryCatch #0 {RuntimeException -> 0x0028, blocks: (B:3:0x0002, B:5:0x0016, B:7:0x001c, B:22:0x0046, B:25:0x004d, B:27:0x0060, B:29:0x0068, B:35:0x0078, B:40:0x0085, B:15:0x002b, B:17:0x0032, B:19:0x003e), top: B:49:0x0002, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.android.gms.internal.measurement.v0 r9, android.os.Bundle r10) {
        /*
            r8 = this;
            ec.q2 r1 = r8.f22898a
            java.lang.Object r0 = r1.f218b     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            ec.o1 r0 = (ec.o1) r0     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            ec.s0 r2 = r0.f22954f     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            ec.o1.m(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            com.google.android.gms.internal.ads.or r2 = r2.f23060o     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = "onActivityCreated"
            r2.d(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            android.content.Intent r2 = r9.f19967c     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r2 == 0) goto L94
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r3 == 0) goto L2b
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r4 != 0) goto L23
            goto L2b
        L23:
            r5 = r3
            goto L44
        L25:
            r0 = move-exception
            goto Lb6
        L28:
            r0 = move-exception
            goto La1
        L2b:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            r4 = 0
            if (r3 == 0) goto L43
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r5 != 0) goto L43
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            goto L23
        L43:
            r5 = r4
        L44:
            if (r5 == 0) goto L94
            boolean r3 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L4d
            goto L94
        L4d:
            ec.l4 r3 = r0.f22956i     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            ec.o1.k(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            java.lang.String r3 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L75
            java.lang.String r3 = "https://www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L75
            java.lang.String r3 = "android-app://com.google.appcrawler"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r2 == 0) goto L71
            goto L75
        L71:
            java.lang.String r2 = "auto"
        L73:
            r6 = r2
            goto L78
        L75:
            java.lang.String r2 = "gs"
            goto L73
        L78:
            java.lang.String r2 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            if (r10 != 0) goto L83
            r2 = 1
        L81:
            r4 = r2
            goto L85
        L83:
            r2 = 0
            goto L81
        L85:
            ec.l1 r0 = r0.g     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            ec.o1.m(r0)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            ec.g2 r2 = new ec.g2     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            r0.K(r2)     // Catch: java.lang.Throwable -> L25 java.lang.RuntimeException -> L28
            goto Lb1
        L94:
            java.lang.Object r0 = r1.f218b
            ec.o1 r0 = (ec.o1) r0
        L98:
            ec.b3 r0 = r0.f22958l
            ec.o1.l(r0)
            r0.J(r9, r10)
            return
        La1:
            java.lang.Object r2 = r1.f218b     // Catch: java.lang.Throwable -> L25
            ec.o1 r2 = (ec.o1) r2     // Catch: java.lang.Throwable -> L25
            ec.s0 r2 = r2.f22954f     // Catch: java.lang.Throwable -> L25
            ec.o1.m(r2)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.internal.ads.or r2 = r2.g     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.e(r0, r3)     // Catch: java.lang.Throwable -> L25
        Lb1:
            java.lang.Object r0 = r1.f218b
            ec.o1 r0 = (ec.o1) r0
            goto L98
        Lb6:
            java.lang.Object r1 = r1.f218b
            ec.o1 r1 = (ec.o1) r1
            ec.b3 r1 = r1.f22958l
            ec.o1.l(r1)
            r1.J(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.m2.a(com.google.android.gms.internal.measurement.v0, android.os.Bundle):void");
    }

    public final void b(com.google.android.gms.internal.measurement.v0 v0Var) {
        b3 b3Var = ((o1) this.f22898a.f218b).f22958l;
        o1.l(b3Var);
        synchronized (b3Var.f22594m) {
            try {
                if (Objects.equals(b3Var.f22590h, v0Var)) {
                    b3Var.f22590h = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((o1) b3Var.f218b).f22952d.P()) {
            b3Var.g.remove(Integer.valueOf(v0Var.f19965a));
        }
    }

    public final void c(com.google.android.gms.internal.measurement.v0 v0Var) {
        o1 o1Var = (o1) this.f22898a.f218b;
        b3 b3Var = o1Var.f22958l;
        o1.l(b3Var);
        synchronized (b3Var.f22594m) {
            b3Var.f22593l = false;
            b3Var.f22591i = true;
        }
        o1 o1Var2 = (o1) b3Var.f218b;
        o1Var2.f22957k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (o1Var2.f22952d.P()) {
            y2 y2VarG = b3Var.G(v0Var);
            b3Var.f22588e = b3Var.f22587d;
            b3Var.f22587d = null;
            l1 l1Var = o1Var2.g;
            o1.m(l1Var);
            l1Var.K(new com.google.android.gms.internal.ads.f1(b3Var, y2VarG, jElapsedRealtime));
        } else {
            b3Var.f22587d = null;
            l1 l1Var2 = o1Var2.g;
            o1.m(l1Var2);
            l1Var2.K(new sz(b3Var, jElapsedRealtime));
        }
        r3 r3Var = o1Var.f22955h;
        o1.l(r3Var);
        o1 o1Var3 = (o1) r3Var.f218b;
        o1Var3.f22957k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        l1 l1Var3 = o1Var3.g;
        o1.m(l1Var3);
        l1Var3.K(new o3(r3Var, jElapsedRealtime2, 1));
    }

    public final void d(com.google.android.gms.internal.measurement.v0 v0Var) {
        o1 o1Var = (o1) this.f22898a.f218b;
        r3 r3Var = o1Var.f22955h;
        o1.l(r3Var);
        o1 o1Var2 = (o1) r3Var.f218b;
        o1Var2.f22957k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        l1 l1Var = o1Var2.g;
        o1.m(l1Var);
        l1Var.K(new o3(r3Var, jElapsedRealtime, 0));
        b3 b3Var = o1Var.f22958l;
        o1.l(b3Var);
        Object obj = b3Var.f22594m;
        synchronized (obj) {
            b3Var.f22593l = true;
            if (!Objects.equals(v0Var, b3Var.f22590h)) {
                synchronized (obj) {
                    b3Var.f22590h = v0Var;
                    b3Var.f22591i = false;
                    o1 o1Var3 = (o1) b3Var.f218b;
                    if (o1Var3.f22952d.P()) {
                        b3Var.j = null;
                        l1 l1Var2 = o1Var3.g;
                        o1.m(l1Var2);
                        l1Var2.K(new a3(b3Var, 1));
                    }
                }
            }
        }
        o1 o1Var4 = (o1) b3Var.f218b;
        if (!o1Var4.f22952d.P()) {
            b3Var.f22587d = b3Var.j;
            l1 l1Var3 = o1Var4.g;
            o1.m(l1Var3);
            l1Var3.K(new a3(b3Var, 0));
            return;
        }
        b3Var.K(v0Var.f19966b, b3Var.G(v0Var), false);
        w wVar = ((o1) b3Var.f218b).f22960n;
        o1.j(wVar);
        o1 o1Var5 = (o1) wVar.f218b;
        o1Var5.f22957k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        l1 l1Var4 = o1Var5.g;
        o1.m(l1Var4);
        l1Var4.K(new sz(wVar, jElapsedRealtime2));
    }

    public final void e(com.google.android.gms.internal.measurement.v0 v0Var, Bundle bundle) {
        y2 y2Var;
        b3 b3Var = ((o1) this.f22898a.f218b).f22958l;
        o1.l(b3Var);
        if (!((o1) b3Var.f218b).f22952d.P() || bundle == null || (y2Var = (y2) b3Var.g.get(Integer.valueOf(v0Var.f19965a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(FacebookMediationAdapter.KEY_ID, y2Var.f23206c);
        bundle2.putString("name", y2Var.f23204a);
        bundle2.putString("referrer_name", y2Var.f23205b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(com.google.android.gms.internal.measurement.v0.a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(com.google.android.gms.internal.measurement.v0.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(com.google.android.gms.internal.measurement.v0.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        d(com.google.android.gms.internal.measurement.v0.a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        e(com.google.android.gms.internal.measurement.v0.a(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
