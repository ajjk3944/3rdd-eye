package kg;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.zzdf;
import io.sentry.android.core.e0;
import java.util.ArrayDeque;
import java.util.Objects;
import zc.a1;
import zc.b3;
import zc.c1;
import zc.d2;
import zc.e3;
import zc.l2;
import zc.n2;
import zc.o2;

/* loaded from: classes.dex */
public final class j implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14372a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14373d;

    public j(d2 d2Var) {
        this.f14372a = 1;
        this.f14373d = d2Var;
    }

    public void a(Intent intent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f14373d;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e4) {
            e0.q("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e4);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    we.b bVar = (we.b) se.f.c().b(we.b.class);
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (bVar != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        we.c cVar = (we.c) bVar;
                        if (xe.a.a("fcm") && xe.a.c("fcm", "_ln")) {
                            i1 i1Var = (i1) cVar.f24485a.f25996d;
                            i1Var.c(new v0(i1Var, string2, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        cVar.a("fcm", "_cmp", bundle2);
                    } else {
                        e0.p("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
            }
            kc.f.H("_no", bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[Catch: all -> 0x0028, RuntimeException -> 0x002b, TryCatch #1 {RuntimeException -> 0x002b, blocks: (B:3:0x0005, B:5:0x0019, B:7:0x001f, B:22:0x0049, B:25:0x0050, B:27:0x0063, B:29:0x006b, B:35:0x007b, B:40:0x0088, B:15:0x002e, B:17:0x0035, B:19:0x0041), top: B:49:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(com.google.android.gms.internal.measurement.zzdf r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f14373d
            r1 = r0
            zc.d2 r1 = (zc.d2) r1
            java.lang.Object r0 = r1.f1504d     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            zc.c1 r0 = (zc.c1) r0     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            zc.j0 r2 = r0.f26889y     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            zc.c1.g(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            su.b r2 = r2.K     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "onActivityCreated"
            r2.b(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            android.content.Intent r2 = r9.f5297g     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L97
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 == 0) goto L2e
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r4 != 0) goto L26
            goto L2e
        L26:
            r5 = r3
            goto L47
        L28:
            r0 = move-exception
            goto Lb9
        L2b:
            r0 = move-exception
            goto La4
        L2e:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r4 = 0
            if (r3 == 0) goto L46
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r5 != 0) goto L46
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto L26
        L46:
            r5 = r4
        L47:
            if (r5 == 0) goto L97
            boolean r3 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L50
            goto L97
        L50:
            zc.s3 r3 = r0.E     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            zc.c1.e(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L78
            java.lang.String r3 = "https://www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L78
            java.lang.String r3 = "android-app://com.google.appcrawler"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L74
            goto L78
        L74:
            java.lang.String r2 = "auto"
        L76:
            r6 = r2
            goto L7b
        L78:
            java.lang.String r2 = "gs"
            goto L76
        L7b:
            java.lang.String r2 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r10 != 0) goto L86
            r2 = 1
        L84:
            r4 = r2
            goto L88
        L86:
            r2 = 0
            goto L84
        L88:
            zc.a1 r0 = r0.B     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            zc.c1.g(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            zc.u1 r2 = new zc.u1     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r0.B1(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto Lb4
        L97:
            java.lang.Object r0 = r1.f1504d
            zc.c1 r0 = (zc.c1) r0
        L9b:
            zc.o2 r0 = r0.H
            zc.c1.f(r0)
            r0.A1(r9, r10)
            return
        La4:
            java.lang.Object r2 = r1.f1504d     // Catch: java.lang.Throwable -> L28
            zc.c1 r2 = (zc.c1) r2     // Catch: java.lang.Throwable -> L28
            zc.j0 r2 = r2.f26889y     // Catch: java.lang.Throwable -> L28
            zc.c1.g(r2)     // Catch: java.lang.Throwable -> L28
            su.b r2 = r2.B     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.c(r0, r3)     // Catch: java.lang.Throwable -> L28
        Lb4:
            java.lang.Object r0 = r1.f1504d
            zc.c1 r0 = (zc.c1) r0
            goto L9b
        Lb9:
            java.lang.Object r1 = r1.f1504d
            zc.c1 r1 = (zc.c1) r1
            zc.o2 r1 = r1.H
            zc.c1.f(r1)
            r1.A1(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.j.j(com.google.android.gms.internal.measurement.zzdf, android.os.Bundle):void");
    }

    public void k(zzdf zzdfVar) {
        o2 o2Var = ((c1) ((d2) this.f14373d).f1504d).H;
        c1.f(o2Var);
        synchronized (o2Var.I) {
            try {
                if (Objects.equals(o2Var.D, zzdfVar)) {
                    o2Var.D = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((c1) o2Var.f1504d).f26887r.G1()) {
            o2Var.B.remove(Integer.valueOf(zzdfVar.f5295a));
        }
    }

    public void l(zzdf zzdfVar) {
        c1 c1Var = (c1) ((d2) this.f14373d).f1504d;
        o2 o2Var = c1Var.H;
        c1.f(o2Var);
        synchronized (o2Var.I) {
            o2Var.H = false;
            o2Var.E = true;
        }
        c1 c1Var2 = (c1) o2Var.f1504d;
        c1Var2.G.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (c1Var2.f26887r.G1()) {
            l2 l2VarX1 = o2Var.x1(zzdfVar);
            o2Var.f27056x = o2Var.f27055r;
            o2Var.f27055r = null;
            a1 a1Var = c1Var2.B;
            c1.g(a1Var);
            a1Var.B1(new io.sentry.android.core.w(o2Var, l2VarX1, jElapsedRealtime));
        } else {
            o2Var.f27055r = null;
            a1 a1Var2 = c1Var2.B;
            c1.g(a1Var2);
            a1Var2.B1(new mh.j(o2Var, jElapsedRealtime));
        }
        e3 e3Var = c1Var.D;
        c1.f(e3Var);
        c1 c1Var3 = (c1) e3Var.f1504d;
        c1Var3.G.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        a1 a1Var3 = c1Var3.B;
        c1.g(a1Var3);
        a1Var3.B1(new b3(e3Var, jElapsedRealtime2, 1));
    }

    public void m(zzdf zzdfVar) {
        c1 c1Var = (c1) ((d2) this.f14373d).f1504d;
        e3 e3Var = c1Var.D;
        c1.f(e3Var);
        c1 c1Var2 = (c1) e3Var.f1504d;
        c1Var2.G.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a1 a1Var = c1Var2.B;
        c1.g(a1Var);
        a1Var.B1(new b3(e3Var, jElapsedRealtime, 0));
        o2 o2Var = c1Var.H;
        c1.f(o2Var);
        Object obj = o2Var.I;
        synchronized (obj) {
            o2Var.H = true;
            if (!Objects.equals(zzdfVar, o2Var.D)) {
                synchronized (obj) {
                    o2Var.D = zzdfVar;
                    o2Var.E = false;
                    c1 c1Var3 = (c1) o2Var.f1504d;
                    if (c1Var3.f26887r.G1()) {
                        o2Var.F = null;
                        a1 a1Var2 = c1Var3.B;
                        c1.g(a1Var2);
                        a1Var2.B1(new n2(o2Var, 1));
                    }
                }
            }
        }
        c1 c1Var4 = (c1) o2Var.f1504d;
        if (!c1Var4.f26887r.G1()) {
            o2Var.f27055r = o2Var.F;
            a1 a1Var3 = c1Var4.B;
            c1.g(a1Var3);
            a1Var3.B1(new n2(o2Var, 0));
            return;
        }
        o2Var.B1(zzdfVar.f5296d, o2Var.x1(zzdfVar), false);
        zc.r rVar = ((c1) o2Var.f1504d).J;
        c1.d(rVar);
        c1 c1Var5 = (c1) rVar.f1504d;
        c1Var5.G.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        a1 a1Var4 = c1Var5.B;
        c1.g(a1Var4);
        a1Var4.B1(new mh.j(rVar, jElapsedRealtime2));
    }

    public void n(zzdf zzdfVar, Bundle bundle) {
        l2 l2Var;
        o2 o2Var = ((c1) ((d2) this.f14373d).f1504d).H;
        c1.f(o2Var);
        if (!((c1) o2Var.f1504d).f26887r.G1() || bundle == null || (l2Var = (l2) o2Var.B.get(Integer.valueOf(zzdfVar.f5295a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", l2Var.f26995c);
        bundle2.putString("name", l2Var.f26993a);
        bundle2.putString("referrer_name", l2Var.f26994b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f14372a) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                        break;
                    } else {
                        new Handler(Looper.getMainLooper()).post(new io.sentry.cache.e(this, 11, intent));
                        break;
                    }
                }
                break;
            default:
                j(zzdf.d(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f14372a) {
            case 0:
                break;
            default:
                k(zzdf.d(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f14372a) {
            case 0:
                break;
            default:
                l(zzdf.d(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f14372a) {
            case 0:
                break;
            default:
                m(zzdf.d(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f14372a) {
            case 0:
                break;
            default:
                n(zzdf.d(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i10 = this.f14372a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i10 = this.f14372a;
    }

    public j() {
        this.f14372a = 0;
        this.f14373d = new ArrayDeque(10);
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void e(Activity activity, Bundle bundle) {
    }
}
