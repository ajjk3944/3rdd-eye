package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1915te {

    /* renamed from: a, reason: collision with root package name */
    public int f16938a;

    /* renamed from: b, reason: collision with root package name */
    public int f16939b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16940c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16941d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16942e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16943f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16944g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16945h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f16946j;

    /* renamed from: k, reason: collision with root package name */
    public final float f16947k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16948l;

    /* renamed from: m, reason: collision with root package name */
    public final int f16949m;

    /* renamed from: n, reason: collision with root package name */
    public final String f16950n;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1915te(android.content.Context r8) {
        /*
            r7 = this;
            r7.<init>()
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            com.google.android.gms.internal.ads.H9.a(r8)
            r7.b(r8)
            r7.c(r8)
            r7.d(r8)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = e(r0, r2)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L23
            r2 = r4
            goto L24
        L23:
            r2 = r3
        L24:
            r7.f16940c = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = e(r0, r2)
            if (r2 == 0) goto L30
            r2 = r4
            goto L31
        L30:
            r2 = r3
        L31:
            r7.f16941d = r2
            java.lang.String r2 = r1.getCountry()
            r7.f16942e = r2
            p2.j r2 = p2.j.f22785C
            t2.G r2 = r2.f22790c
            q2.r r2 = q2.r.f23260g
            u2.f r2 = r2.f23261a
            boolean r2 = u2.f.o()
            r7.f16943f = r2
            boolean r2 = Q2.b.g(r8)
            r7.f16944g = r2
            boolean r2 = Q2.b.j(r8)
            r7.f16945h = r2
            java.lang.String r1 = r1.getLanguage()
            r7.i = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = e(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L66
        L64:
            r0 = r2
            goto L9f
        L66:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L6b
            goto L64
        L6b:
            J2.i r5 = R2.b.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r6 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            android.content.pm.PackageInfo r3 = r5.h(r3, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            if (r3 == 0) goto L64
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            int r5 = r5.length()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            int r5 = r5 + r4
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            int r6 = r6.length()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r6.<init>(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r6.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r6.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            r6.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r0 = r6.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
        L9f:
            r7.f16946j = r0
            J2.i r0 = R2.b.a(r8)     // Catch: java.lang.Exception -> Ld7
            java.lang.String r3 = "com.android.vending"
            r5 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.h(r5, r3)     // Catch: java.lang.Exception -> Ld7
            if (r0 == 0) goto Ld7
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Ld7
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Ld7
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> Ld7
            int r5 = r5.length()     // Catch: java.lang.Exception -> Ld7
            int r5 = r5 + r4
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Ld7
            int r4 = r4.length()     // Catch: java.lang.Exception -> Ld7
            int r5 = r5 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld7
            r4.<init>(r5)     // Catch: java.lang.Exception -> Ld7
            r4.append(r3)     // Catch: java.lang.Exception -> Ld7
            r4.append(r1)     // Catch: java.lang.Exception -> Ld7
            r4.append(r0)     // Catch: java.lang.Exception -> Ld7
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Ld7
        Ld7:
            r7.f16950n = r2
            android.content.res.Resources r8 = r8.getResources()
            if (r8 != 0) goto Le0
            goto Lf2
        Le0:
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            if (r8 == 0) goto Lf2
            float r0 = r8.density
            r7.f16947k = r0
            int r0 = r8.widthPixels
            r7.f16948l = r0
            int r8 = r8.heightPixels
            r7.f16949m = r8
        Lf2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1915te.<init>(android.content.Context):void");
    }

    public static ResolveInfo e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            p2.j.f22785C.f22795h.f("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final C1969ue a() {
        return new C1969ue(this.f16940c, this.f16941d, this.f16942e, this.f16943f, this.f16944g, this.f16945h, this.i, this.f16946j, this.f16950n, this.f16938a, this.f16939b, this.f16947k, this.f16948l, this.f16949m);
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                p2.j.f22785C.f22795h.f("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r5.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r0.getNetworkOperator()
            boolean r2 = Q2.b.f()
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.E9 r2 = com.google.android.gms.internal.ads.H9.K9
            q2.s r3 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r3 = r3.f23270c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2d
            r2 = 0
            goto L31
        L2d:
            int r2 = r0.getNetworkType()
        L31:
            r4.f16939b = r2
            r0.getPhoneType()
            r0 = -2
            r4.f16938a = r0
            p2.j r0 = p2.j.f22785C
            t2.G r0 = r0.f22790c
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r5 = t2.C2911G.d(r5, r0)
            if (r5 == 0) goto L5f
            android.net.NetworkInfo r5 = r1.getActiveNetworkInfo()
            if (r5 == 0) goto L59
            int r0 = r5.getType()
            r4.f16938a = r0
            android.net.NetworkInfo$DetailedState r5 = r5.getDetailedState()
            r5.ordinal()
            goto L5c
        L59:
            r5 = -1
            r4.f16938a = r5
        L5c:
            r1.isActiveNetworkMetered()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1915te.c(android.content.Context):void");
    }

    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) C2841s.f23267e.f23270c.a(H9.kc)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            intentRegisterReceiver.getIntExtra("status", -1);
            intentRegisterReceiver.getIntExtra("level", -1);
            intentRegisterReceiver.getIntExtra("scale", -1);
        }
    }

    public C1915te(Context context, C1969ue c1969ue) {
        H9.a(context);
        b(context);
        c(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        Q9.a(context);
        this.f16940c = c1969ue.f17130a;
        this.f16941d = c1969ue.f17131b;
        this.f16942e = c1969ue.f17132c;
        this.f16943f = c1969ue.f17133d;
        this.f16944g = c1969ue.f17134e;
        this.f16945h = c1969ue.f17135f;
        this.i = c1969ue.f17136g;
        this.f16946j = c1969ue.f17137h;
        this.f16950n = c1969ue.i;
        this.f16947k = c1969ue.f17140l;
        this.f16948l = c1969ue.f17141m;
        this.f16949m = c1969ue.f17142n;
    }
}
