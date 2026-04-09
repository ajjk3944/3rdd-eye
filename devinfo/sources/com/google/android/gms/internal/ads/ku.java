package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ku {

    /* renamed from: a, reason: collision with root package name */
    public int f13241a;

    /* renamed from: b, reason: collision with root package name */
    public int f13242b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13243c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13244d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13245e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13246f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13247h;

    /* renamed from: i, reason: collision with root package name */
    public final String f13248i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final float f13249k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13250l;

    /* renamed from: m, reason: collision with root package name */
    public final int f13251m;

    /* renamed from: n, reason: collision with root package name */
    public final String f13252n;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ku(android.content.Context r8) {
        /*
            r7 = this;
            r7.<init>()
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            com.google.android.gms.internal.ads.sk.a(r8)
            r7.b(r8)
            r7.c(r8)
            r7.d(r8)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = e(r2, r0)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L23
            r2 = r4
            goto L24
        L23:
            r2 = r3
        L24:
            r7.f13243c = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = e(r2, r0)
            if (r2 == 0) goto L30
            r2 = r4
            goto L31
        L30:
            r2 = r3
        L31:
            r7.f13244d = r2
            java.lang.String r2 = r1.getCountry()
            r7.f13245e = r2
            ua.j r2 = ua.j.C
            ya.f0 r2 = r2.f35261c
            va.r r2 = va.r.g
            za.d r2 = r2.f36157a
            boolean r2 = za.d.o()
            r7.f13246f = r2
            boolean r2 = tb.b.j(r8)
            r7.g = r2
            boolean r2 = tb.b.n(r8)
            r7.f13247h = r2
            java.lang.String r1 = r1.getLanguage()
            r7.f13248i = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = e(r1, r0)
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
            j1.q r5 = ub.b.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r6 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            android.content.pm.PackageInfo r3 = r5.e(r3, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
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
            r7.j = r0
            j1.q r0 = ub.b.a(r8)     // Catch: java.lang.Exception -> Ld7
            java.lang.String r3 = "com.android.vending"
            r5 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.e(r5, r3)     // Catch: java.lang.Exception -> Ld7
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
            r7.f13252n = r2
            android.content.res.Resources r8 = r8.getResources()
            if (r8 != 0) goto Le0
            goto Lf2
        Le0:
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            if (r8 == 0) goto Lf2
            float r0 = r8.density
            r7.f13249k = r0
            int r0 = r8.widthPixels
            r7.f13250l = r0
            int r8 = r8.heightPixels
            r7.f13251m = r8
        Lf2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ku.<init>(android.content.Context):void");
    }

    public static ResolveInfo e(String str, PackageManager packageManager) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th2) {
            ua.j.C.f35265h.f("DeviceInfo.getResolveInfo", th2);
            return null;
        }
    }

    public final lu a() {
        return new lu(this.f13243c, this.f13244d, this.f13245e, this.f13246f, this.g, this.f13247h, this.f13248i, this.j, this.f13252n, this.f13241a, this.f13242b, this.f13249k, this.f13250l, this.f13251m);
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
            } catch (Throwable th2) {
                ua.j.C.f35265h.f("DeviceInfo.gatherAudioInfo", th2);
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
            boolean r2 = tb.b.h()
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.pk r2 = com.google.android.gms.internal.ads.sk.M9
            va.s r3 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r3 = r3.f36166c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2d
            r2 = 0
            goto L31
        L2d:
            int r2 = r0.getNetworkType()
        L31:
            r4.f13242b = r2
            r0.getPhoneType()
            r0 = -2
            r4.f13241a = r0
            ua.j r0 = ua.j.C
            ya.f0 r0 = r0.f35261c
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r5 = ya.f0.d(r5, r0)
            if (r5 == 0) goto L5f
            android.net.NetworkInfo r5 = r1.getActiveNetworkInfo()
            if (r5 == 0) goto L59
            int r0 = r5.getType()
            r4.f13241a = r0
            android.net.NetworkInfo$DetailedState r5 = r5.getDetailedState()
            r5.ordinal()
            goto L5c
        L59:
            r5 = -1
            r4.f13241a = r5
        L5c:
            r1.isActiveNetworkMetered()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ku.c(android.content.Context):void");
    }

    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) va.s.f36163e.f36166c.a(sk.f16230mc)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            intentRegisterReceiver.getIntExtra("status", -1);
            intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            intentRegisterReceiver.getIntExtra("scale", -1);
        }
    }

    public ku(Context context, lu luVar) {
        sk.a(context);
        b(context);
        c(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        al.a(context);
        this.f13243c = luVar.f13619a;
        this.f13244d = luVar.f13620b;
        this.f13245e = luVar.f13621c;
        this.f13246f = luVar.f13622d;
        this.g = luVar.f13623e;
        this.f13247h = luVar.f13624f;
        this.f13248i = luVar.g;
        this.j = luVar.f13625h;
        this.f13252n = luVar.f13626i;
        this.f13249k = luVar.f13628l;
        this.f13250l = luVar.f13629m;
        this.f13251m = luVar.f13630n;
    }
}
