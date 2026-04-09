package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.b5;
import io.sentry.d5;
import io.sentry.e4;
import io.sentry.g4;
import io.sentry.g5;
import io.sentry.n4;
import io.sentry.z5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class g0 implements io.sentry.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11576a;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f11577d;

    /* renamed from: g, reason: collision with root package name */
    public final SentryAndroidOptions f11578g;

    /* renamed from: r, reason: collision with root package name */
    public final Future f11579r;

    /* renamed from: x, reason: collision with root package name */
    public final io.sentry.util.e f11580x = new io.sentry.util.e(new d5.v(28));

    public g0(Context context, f0 f0Var, SentryAndroidOptions sentryAndroidOptions) {
        Future futureSubmit;
        Context applicationContext = context.getApplicationContext();
        this.f11576a = applicationContext != null ? applicationContext : context;
        this.f11577d = f0Var;
        ir.f0.T(sentryAndroidOptions, "The options object is required.");
        this.f11578g = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new n4(this, 4, sentryAndroidOptions));
        } catch (RejectedExecutionException e4) {
            sentryAndroidOptions.getLogger().g(b5.WARNING, "Device info caching task rejected.", e4);
            futureSubmit = null;
        }
        this.f11579r = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    public final void a(g4 g4Var, io.sentry.h0 h0Var) {
        PackageInfo packageInfo;
        Boolean bool;
        io.sentry.protocol.a aVarD = g4Var.f12269d.d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
        }
        aVarD.f12521x = (String) e0.f11564c.b(this.f11576a);
        io.sentry.android.core.performance.g gVarA = io.sentry.android.core.performance.f.b().a(this.f11578g);
        i0 i0Var = null;
        if (gVarA.b()) {
            aVarD.f12518d = (gVarA.b() ? new g5(gVarA.f11733d * 1000000) : null) == null ? null : dr.a.r(Double.valueOf(r2.f12274a / 1000000.0d).longValue());
        }
        if (!dr.a.C(h0Var) && aVarD.G == null && (bool = d0.f11554x.f11558r) != null) {
            aVarD.G = Boolean.valueOf(!bool.booleanValue());
        }
        Context context = this.f11576a;
        SentryAndroidOptions sentryAndroidOptions = this.f11578g;
        io.sentry.u0 logger = sentryAndroidOptions.getLogger();
        f0 f0Var = this.f11577d;
        try {
            f0Var.getClass();
            packageInfo = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (Throwable th2) {
            logger.g(b5.ERROR, "Error getting package info.", th2);
            packageInfo = null;
        }
        if (packageInfo != null) {
            String strH = e0.h(packageInfo, f0Var);
            if (g4Var.H == null) {
                g4Var.H = strH;
            }
            Future future = this.f11579r;
            if (future != null) {
                try {
                    i0Var = (i0) future.get();
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().g(b5.ERROR, "Failed to retrieve device info", th3);
                }
            } else {
                sentryAndroidOptions.getLogger().m(b5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            aVarD.f12517a = packageInfo.packageName;
            aVarD.f12522y = packageInfo.versionName;
            aVarD.B = e0.h(packageInfo, f0Var);
            HashMap map = new HashMap();
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    String str = strArr[i10];
                    map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i10] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            aVarD.D = map;
            if (i0Var != null) {
                try {
                    ab.g gVar = i0Var.f11598f;
                    if (gVar != null) {
                        aVarD.H = Boolean.valueOf(gVar.f308d);
                        String[] strArr2 = (String[]) gVar.f309g;
                        if (strArr2 != null) {
                            aVarD.I = Arrays.asList(strArr2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        g4Var.f12269d.l(aVarD);
    }

    @Override // io.sentry.c0
    public final z5 b(z5 z5Var, io.sentry.h0 h0Var) {
        boolean zD = d(z5Var, h0Var);
        if (zD) {
            a(z5Var, h0Var);
        }
        c(z5Var, false, zD);
        return z5Var;
    }

    public final void c(g4 g4Var, boolean z10, boolean z11) {
        io.sentry.protocol.e0 e0Var = g4Var.E;
        if (e0Var == null) {
            e0Var = new io.sentry.protocol.e0();
            g4Var.E = e0Var;
        }
        String str = e0Var.f12535d;
        SentryAndroidOptions sentryAndroidOptions = this.f11578g;
        if (str == null) {
            e0Var.f12535d = (String) sentryAndroidOptions.getRuntimeManager().c(new bf.a(24, this));
        }
        if (e0Var.f12537r == null && sentryAndroidOptions.isSendDefaultPii()) {
            e0Var.f12537r = "{{auto}}";
        }
        io.sentry.protocol.c cVar = g4Var.f12269d;
        io.sentry.protocol.f fVarE = cVar.e();
        Future future = this.f11579r;
        if (fVarE == null) {
            if (future != null) {
                try {
                    cVar.n(((i0) future.get()).a(z10, z11));
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().g(b5.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().m(b5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            io.sentry.protocol.m mVarF = cVar.f();
            if (future != null) {
                try {
                    cVar.p(((i0) future.get()).f11599g);
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().g(b5.ERROR, "Failed to retrieve os system", th3);
                }
            } else {
                sentryAndroidOptions.getLogger().m(b5.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            if (mVarF != null) {
                String str2 = mVarF.f12590a;
                cVar.j(mVarF, (str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT));
            }
        }
        if (future == null) {
            sentryAndroidOptions.getLogger().m(b5.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            cc.f0 f0Var = ((i0) future.get()).f11597e;
            if (f0Var != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(f0Var.f3648b));
                String str3 = f0Var.f3649c;
                if (str3 != null) {
                    map.put("installerStore", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    g4Var.b((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().g(b5.ERROR, "Error getting side loaded info.", th4);
        }
    }

    public final boolean d(g4 g4Var, io.sentry.h0 h0Var) {
        if (dr.a.H(h0Var)) {
            return true;
        }
        this.f11578g.getLogger().m(b5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", g4Var.f12268a);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    @Override // io.sentry.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.t4 f(io.sentry.t4 r10, io.sentry.h0 r11) {
        /*
            r9 = this;
            boolean r0 = r9.d(r10, r11)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L68
            r9.a(r10, r11)
            fh.f r3 = r10.O
            if (r3 == 0) goto L12
            java.util.ArrayList r3 = r3.f8871a
            goto L13
        L12:
            r3 = r1
        L13:
            if (r3 == 0) goto L68
            boolean r11 = dr.a.C(r11)
            fh.f r3 = r10.O
            if (r3 == 0) goto L20
            java.util.ArrayList r3 = r3.f8871a
            goto L21
        L20:
            r3 = r1
        L21:
            java.util.Iterator r3 = r3.iterator()
        L25:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r3.next()
            io.sentry.protocol.z r4 = (io.sentry.protocol.z) r4
            io.sentry.android.core.internal.util.e r5 = io.sentry.android.core.internal.util.e.f11647a
            r5.getClass()
            java.lang.Long r5 = r4.f12661a
            if (r5 == 0) goto L50
            long r5 = r5.longValue()
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            java.lang.Thread r7 = r7.getThread()
            long r7 = r7.getId()
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto L50
            r5 = r2
            goto L51
        L50:
            r5 = 0
        L51:
            java.lang.Boolean r6 = r4.f12666y
            if (r6 != 0) goto L5b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            r4.f12666y = r6
        L5b:
            if (r11 != 0) goto L25
            java.lang.Boolean r6 = r4.D
            if (r6 != 0) goto L25
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.D = r5
            goto L25
        L68:
            r9.c(r10, r2, r0)
            fh.f r11 = r10.P
            if (r11 != 0) goto L70
            goto L72
        L70:
            java.util.ArrayList r1 = r11.f8871a
        L72:
            if (r1 == 0) goto Laf
            int r11 = r1.size()
            if (r11 <= r2) goto Laf
            java.lang.Object r11 = h0.b.f(r2, r1)
            io.sentry.protocol.s r11 = (io.sentry.protocol.s) r11
            java.lang.String r0 = "java.lang"
            java.lang.String r2 = r11.f12632g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Laf
            io.sentry.protocol.y r11 = r11.f12634x
            if (r11 == 0) goto Laf
            java.util.List r11 = r11.f12657a
            if (r11 == 0) goto Laf
            java.util.Iterator r11 = r11.iterator()
        L96:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r11.next()
            io.sentry.protocol.x r0 = (io.sentry.protocol.x) r0
            java.lang.String r2 = "com.android.internal.os.RuntimeInit$MethodAndArgsCaller"
            java.lang.String r0 = r0.f12656y
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L96
            java.util.Collections.reverse(r1)
        Laf:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.g0.f(io.sentry.t4, io.sentry.h0):io.sentry.t4");
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.a0 h(io.sentry.protocol.a0 a0Var, io.sentry.h0 h0Var) {
        boolean zD = d(a0Var, h0Var);
        if (zD) {
            a(a0Var, h0Var);
        }
        c(a0Var, false, zD);
        return a0Var;
    }

    @Override // io.sentry.c0
    public final d5 i(d5 d5Var) {
        SentryAndroidOptions sentryAndroidOptions = this.f11578g;
        try {
            e4 e4Var = e4.STRING;
            d5Var.a("device.brand", new io.sentry.protocol.j(e4Var, (Object) Build.BRAND));
            d5Var.a("device.model", new io.sentry.protocol.j(Build.MODEL, e4Var.apiName()));
            d5Var.a("device.family", new io.sentry.protocol.j(this.f11580x.a(), e4Var.apiName()));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().g(b5.ERROR, "Failed to retrieve device info", th2);
        }
        try {
            e4 e4Var2 = e4.STRING;
            d5Var.a("os.name", new io.sentry.protocol.j(e4Var2, (Object) "Android"));
            d5Var.a("os.version", new io.sentry.protocol.j(Build.VERSION.RELEASE, e4Var2.apiName()));
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().g(b5.ERROR, "Failed to retrieve os system", th3);
        }
        return d5Var;
    }
}
