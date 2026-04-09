package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dn0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final ApplicationInfo f10525a;

    /* renamed from: b, reason: collision with root package name */
    public final PackageInfo f10526b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f10527c;

    public dn0(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.f10525a = applicationInfo;
        this.f10526b = packageInfo;
        this.f10527c = context;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        return 29;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    @Override // com.google.android.gms.internal.ads.qn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final vd.b b() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r9 = this;
            android.content.Context r0 = r9.f10527c
            android.content.pm.ApplicationInfo r1 = r9.f10525a
            java.lang.String r3 = r1.packageName
            r1 = 0
            android.content.pm.PackageInfo r2 = r9.f10526b
            if (r2 != 0) goto Ld
            r4 = r1
            goto L13
        Ld:
            int r4 = r2.versionCode
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L13:
            if (r2 != 0) goto L17
            r5 = r1
            goto L1a
        L17:
            java.lang.String r2 = r2.versionName
            r5 = r2
        L1a:
            ya.b0 r2 = ya.f0.f37440l     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            j1.q r2 = ub.b.a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            java.lang.Object r2 = r2.f27058a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            android.content.Context r2 = (android.content.Context) r2     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            android.content.pm.PackageManager r6 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            r7 = 0
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            java.lang.CharSequence r2 = r6.getApplicationLabel(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            r6 = r2
            goto L3c
        L3b:
            r6 = r1
        L3c:
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r2 < r7) goto L8a
            com.google.android.gms.internal.ads.pk r2 = com.google.android.gms.internal.ads.sk.f16048ae
            va.s r7 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r7 = r7.f36166c
            java.lang.Object r2 = r7.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L8a
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L88
            android.content.pm.InstallSourceInfo r0 = r0.getInstallSourceInfo(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L88
            if (r0 == 0) goto L8a
            java.lang.String r2 = r0.getInstallingPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L88
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            if (r7 == 0) goto L6e
            java.lang.String r7 = "No installing package name found"
            ya.a0.m(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            r2 = r1
        L6e:
            java.lang.String r7 = r0.getInitiatingPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L86
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L80
            if (r0 == 0) goto L82
            java.lang.String r0 = "No initiating package name found"
            ya.a0.m(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L80
        L7d:
            r8 = r1
        L7e:
            r7 = r2
            goto L98
        L80:
            r0 = move-exception
            goto L84
        L82:
            r8 = r7
            goto L7e
        L84:
            r1 = r7
            goto L8e
        L86:
            r0 = move-exception
            goto L8e
        L88:
            r0 = move-exception
            goto L8d
        L8a:
            r7 = r1
            r8 = r7
            goto L98
        L8d:
            r2 = r1
        L8e:
            ua.j r7 = ua.j.C
            com.google.android.gms.internal.ads.zw r7 = r7.f35265h
            java.lang.String r8 = "PackageInfoSignalSource.getInstallSourceInfo"
            r7.f(r8, r0)
            goto L7d
        L98:
            com.google.android.gms.internal.ads.en0 r2 = new com.google.android.gms.internal.ads.en0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.ads.s81 r0 = com.google.android.gms.internal.ads.yo0.e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dn0.b():vd.b");
    }
}
