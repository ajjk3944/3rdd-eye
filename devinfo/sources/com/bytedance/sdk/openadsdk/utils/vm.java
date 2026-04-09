package com.bytedance.sdk.openadsdk.utils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vm {
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #2 {all -> 0x00bd, blocks: (B:34:0x0098, B:36:0x009e), top: B:47:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ouw() {
        /*
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.zih.ouw()
            if (r0 != 0) goto L7
            goto Ld
        L7:
            boolean r1 = com.bytedance.sdk.component.utils.ko.yu()
            if (r1 != 0) goto Le
        Ld:
            return
        Le:
            java.lang.String r1 = "The pangolin sdk access, the environment is debug, the initial configuration detection starts"
            java.lang.String r2 = "TTAdSdk-InitChecker"
            com.bytedance.sdk.component.utils.ko.fkw(r2, r1)
            java.lang.String r1 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r4 = 4096(0x1000, float:5.74E-42)
            r5 = 1
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String[] r0 = r0.requestedPermissions     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L8d
            int r1 = r0.length     // Catch: java.lang.Throwable -> L52
            if (r1 <= 0) goto L8d
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L52
            r1.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "android.permission.INTERNET"
            r1.add(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "android.permission.ACCESS_NETWORK_STATE"
            r1.add(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "android.permission.WAKE_LOCK"
            r1.add(r4)     // Catch: java.lang.Throwable -> L52
            int r4 = r0.length     // Catch: java.lang.Throwable -> L52
            r6 = 0
            r7 = r6
        L48:
            if (r7 >= r4) goto L57
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L52
            if (r8 == 0) goto L54
            r1.remove(r8)     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r0 = move-exception
            goto L93
        L54:
            int r7 = r7 + 1
            goto L48
        L57:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L63
            java.lang.String r0 = "AndroidManifest.xml permissions configuration is normal"
            com.bytedance.sdk.component.utils.ko.fkw(r2, r0)     // Catch: java.lang.Throwable -> L52
            goto L98
        L63:
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L52
            r4 = r6
        L68:
            if (r4 >= r0) goto L98
            java.lang.Object r7 = r1.get(r4)     // Catch: java.lang.Throwable -> L52
            int r4 = r4 + 1
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8a
            java.lang.String r8 = "    May be missing permissions："
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L8a
            r5.append(r7)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r7 = "，Please refer to the access documentation"
            r5.append(r7)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L8a
            com.bytedance.sdk.component.utils.ko.fkw(r2, r5)     // Catch: java.lang.Throwable -> L8a
            r5 = r6
            goto L68
        L8a:
            r0 = move-exception
            r5 = r6
            goto L93
        L8d:
            java.lang.String r0 = "The uses-permission configuration in AndroidManifest.xml is missing, please refer to the access documentation"
            com.bytedance.sdk.component.utils.ko.fkw(r2, r0)     // Catch: java.lang.Throwable -> L52
            goto L98
        L93:
            java.lang.String r1 = "The usage-permission configuration error in AndroidManifest.xml, please refer to the access documentation"
            com.bytedance.sdk.component.utils.ko.lh(r2, r1, r0)
        L98:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lbd
            r1 = 23
            if (r3 >= r1) goto Lc3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r4 = "No adaptation required for dynamic permissions：target="
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lbd
            r1.append(r3)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = "&phone="
            r1.append(r3)     // Catch: java.lang.Throwable -> Lbd
            r1.append(r0)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r0 = ", require=23"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lbd
            com.bytedance.sdk.component.utils.ko.fkw(r2, r0)     // Catch: java.lang.Throwable -> Lbd
            goto Lc3
        Lbd:
            r0 = move-exception
            java.lang.String r1 = "The dynamic permission is abnormal. Please check and read the access document in detail： "
            com.bytedance.sdk.component.utils.ko.lh(r2, r1, r0)
        Lc3:
            if (r5 != 0) goto Lca
            java.lang.String r0 = "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion"
            com.bytedance.sdk.component.utils.ko.fkw(r2, r0)
        Lca:
            java.lang.String r0 = "End of pangolin sdk initial configuration test"
            com.bytedance.sdk.component.utils.ko.fkw(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.vm.ouw():void");
    }
}
