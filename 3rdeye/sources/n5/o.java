package n5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* compiled from: Metadata.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f44364a;

    /* renamed from: b, reason: collision with root package name */
    public String f44365b;

    /* renamed from: c, reason: collision with root package name */
    public String f44366c;

    /* renamed from: d, reason: collision with root package name */
    public int f44367d;

    /* renamed from: e, reason: collision with root package name */
    public int f44368e = 0;

    public o(Context context) {
        this.f44364a = context;
    }

    public static String c(B4.e eVar) {
        eVar.a();
        B4.k kVar = eVar.f489c;
        String str = kVar.f507e;
        if (str != null) {
            return str;
        }
        eVar.a();
        String str2 = kVar.f504b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.f44365b == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f44365b;
    }

    public final synchronized String b() {
        try {
            if (this.f44366c == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f44366c;
    }

    public final PackageInfo d(String str) {
        try {
            return this.f44364a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e4) {
            Log.w("FirebaseMessaging", "Failed to find package " + e4);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[Catch: all -> 0x0025, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001b, B:15:0x0027, B:17:0x002d, B:19:0x003f, B:21:0x0045, B:24:0x004a, B:26:0x005d, B:28:0x0063, B:31:0x0068, B:33:0x0075, B:35:0x007a, B:34:0x0078), top: B:42:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f44368e     // Catch: java.lang.Throwable -> L25
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            goto L7d
        La:
            android.content.Context r0 = r5.f44364a     // Catch: java.lang.Throwable -> L25
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r3 = r0.checkPermission(r3, r4)     // Catch: java.lang.Throwable -> L25
            r4 = -1
            if (r3 != r4) goto L27
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r3 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r2
            goto L7d
        L25:
            r0 = move-exception
            goto L81
        L27:
            boolean r3 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L4a
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L25
            java.util.List r3 = r0.queryIntentServices(r3, r2)     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L4a
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L25
            if (r3 <= 0) goto L4a
            r5.f44368e = r1     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r1
            goto L7d
        L4a:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L25
            java.util.List r0 = r0.queryBroadcastReceivers(r3, r2)     // Catch: java.lang.Throwable -> L25
            r3 = 2
            if (r0 == 0) goto L68
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L25
            if (r0 <= 0) goto L68
            r5.f44368e = r3     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
            r0 = r3
            goto L7d
        L68:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r4 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> L25
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L78
            r5.f44368e = r3     // Catch: java.lang.Throwable -> L25
            goto L7a
        L78:
            r5.f44368e = r1     // Catch: java.lang.Throwable -> L25
        L7a:
            int r0 = r5.f44368e     // Catch: java.lang.Throwable -> L25
            monitor-exit(r5)
        L7d:
            if (r0 == 0) goto L80
            return r1
        L80:
            return r2
        L81:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L25
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.o.e():boolean");
    }

    public final synchronized void f() {
        PackageInfo packageInfoD = d(this.f44364a.getPackageName());
        if (packageInfoD != null) {
            this.f44365b = Integer.toString(packageInfoD.versionCode);
            this.f44366c = packageInfoD.versionName;
        }
    }
}
