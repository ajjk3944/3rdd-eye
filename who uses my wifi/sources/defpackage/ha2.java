package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ha2 {
    public int a;
    public int b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final float k;
    public final int l;
    public final int m;
    public final String n;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ha2(android.content.Context r8) {
        /*
            r7 = this;
            r7.<init>()
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            defpackage.mz1.a(r8)
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
            r7.c = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = e(r0, r2)
            if (r2 == 0) goto L30
            r2 = r4
            goto L31
        L30:
            r2 = r3
        L31:
            r7.d = r2
            java.lang.String r2 = r1.getCountry()
            r7.e = r2
            hg4 r2 = defpackage.hg4.C
            lf4 r2 = r2.c
            sv1 r2 = defpackage.sv1.f
            j63 r2 = r2.a
            boolean r2 = defpackage.j63.n()
            r7.f = r2
            boolean r2 = defpackage.i30.F(r8)
            r7.g = r2
            boolean r2 = defpackage.i30.d0(r8)
            r7.h = r2
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
            zj0 r5 = defpackage.za1.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            java.lang.String r6 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
            android.content.pm.PackageInfo r3 = r5.b(r6, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L64
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
            zj0 r0 = defpackage.za1.a(r8)     // Catch: java.lang.Exception -> Ld7
            java.lang.String r3 = "com.android.vending"
            r5 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.b(r3, r5)     // Catch: java.lang.Exception -> Ld7
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
            r7.n = r2
            android.content.res.Resources r8 = r8.getResources()
            if (r8 != 0) goto Le0
            goto Lf2
        Le0:
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            if (r8 == 0) goto Lf2
            float r0 = r8.density
            r7.k = r0
            int r0 = r8.widthPixels
            r7.l = r0
            int r8 = r8.heightPixels
            r7.m = r8
        Lf2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha2.<init>(android.content.Context):void");
    }

    public static ResolveInfo e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            hg4.C.h.d("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final ia2 a() {
        return new ia2(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.n, this.a, this.b, this.k, this.l, this.m);
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
                hg4.C.h.d("DeviceInfo.gatherAudioInfo", th);
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
            boolean r2 = defpackage.ob1.m()
            if (r2 == 0) goto L2d
            iz1 r2 = defpackage.mz1.n9
            tw1 r3 = defpackage.tw1.e
            kz1 r3 = r3.c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2d
            r2 = 0
            goto L31
        L2d:
            int r2 = r0.getNetworkType()
        L31:
            r4.b = r2
            r0.getPhoneType()
            r0 = -2
            r4.a = r0
            hg4 r0 = defpackage.hg4.C
            lf4 r0 = r0.c
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r5 = defpackage.lf4.c(r5, r0)
            if (r5 == 0) goto L5f
            android.net.NetworkInfo r5 = r1.getActiveNetworkInfo()
            if (r5 == 0) goto L59
            int r0 = r5.getType()
            r4.a = r0
            android.net.NetworkInfo$DetailedState r5 = r5.getDetailedState()
            r5.ordinal()
            goto L5c
        L59:
            r5 = -1
            r4.a = r5
        L5c:
            r1.isActiveNetworkMetered()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha2.c(android.content.Context):void");
    }

    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) tw1.e.c.a(mz1.Nb)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            intentRegisterReceiver.getIntExtra("status", -1);
            intentRegisterReceiver.getIntExtra("level", -1);
            intentRegisterReceiver.getIntExtra("scale", -1);
        }
    }

    public ha2(Context context, ia2 ia2Var) {
        mz1.a(context);
        b(context);
        c(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        yz1.a(context);
        this.c = ia2Var.a;
        this.d = ia2Var.b;
        this.e = ia2Var.c;
        this.f = ia2Var.d;
        this.g = ia2Var.e;
        this.h = ia2Var.f;
        this.i = ia2Var.g;
        this.j = ia2Var.h;
        this.n = ia2Var.i;
        this.k = ia2Var.l;
        this.l = ia2Var.m;
        this.m = ia2Var.n;
    }
}
