package kg;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.sentry.android.core.e0;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f14381a;

    /* renamed from: b, reason: collision with root package name */
    public int f14382b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14383c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f14384d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f14385e;

    public static String c(se.f fVar) {
        fVar.a();
        se.h hVar = fVar.f22009c;
        String str = hVar.f22025e;
        if (str != null) {
            return str;
        }
        fVar.a();
        String str2 = hVar.f22022b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public int a(long j) {
        int i10 = this.f14381a + 1;
        long[] jArr = (long[]) this.f14383c;
        int length = jArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            long[] jArr2 = new long[i11];
            ?? r22 = new int[i11];
            mq.l.d0(jArr, jArr2, 0, 0, jArr.length);
            mq.l.e0(0, 0, 14, (int[]) this.f14384d, r22);
            this.f14383c = jArr2;
            this.f14384d = r22;
        }
        int i12 = this.f14381a;
        this.f14381a = i12 + 1;
        int length2 = ((int[]) this.f14385e).length;
        if (this.f14382b >= length2) {
            int i13 = length2 * 2;
            ?? r23 = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                r23[i14] = i15;
                i14 = i15;
            }
            mq.l.e0(0, 0, 14, (int[]) this.f14385e, r23);
            this.f14385e = r23;
        }
        int i16 = this.f14382b;
        int[] iArr = (int[]) this.f14385e;
        this.f14382b = iArr[i16];
        long[] jArr3 = (long[]) this.f14383c;
        jArr3[i12] = j;
        ((int[]) this.f14384d)[i12] = i16;
        iArr[i16] = i12;
        while (i12 > 0) {
            int i17 = ((i12 + 1) >> 1) - 1;
            if (br.l.h(jArr3[i17], j) <= 0) {
                break;
            }
            g(i17, i12);
            i12 = i17;
        }
        return i16;
    }

    public synchronized String b() {
        try {
            if (((String) this.f14384d) == null) {
                f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (String) this.f14384d;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.f14383c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e4) {
            e0.p("FirebaseMessaging", "Failed to find package " + e4);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f14382b     // Catch: java.lang.Throwable -> L27
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            goto L7f
        La:
            java.lang.Object r0 = r5.f14383c     // Catch: java.lang.Throwable -> L27
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L27
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r3 = r0.checkPermission(r3, r4)     // Catch: java.lang.Throwable -> L27
            r4 = -1
            if (r3 != r4) goto L29
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r3 = "Google Play services missing or without correct permission."
            io.sentry.android.core.e0.d(r0, r3)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            r0 = r2
            goto L7f
        L27:
            r0 = move-exception
            goto L83
        L29:
            boolean r3 = gc.b.e()     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L4c
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L27
            java.util.List r3 = r0.queryIntentServices(r3, r2)     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L4c
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L27
            if (r3 <= 0) goto L4c
            r5.f14382b = r1     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            r0 = r1
            goto L7f
        L4c:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L27
            java.util.List r0 = r0.queryBroadcastReceivers(r3, r2)     // Catch: java.lang.Throwable -> L27
            r3 = 2
            if (r0 == 0) goto L6a
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L27
            if (r0 <= 0) goto L6a
            r5.f14382b = r3     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            r0 = r3
            goto L7f
        L6a:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r4 = "Failed to resolve IID implementation package, falling back"
            io.sentry.android.core.e0.p(r0, r4)     // Catch: java.lang.Throwable -> L27
            boolean r0 = gc.b.e()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L7a
            r5.f14382b = r3     // Catch: java.lang.Throwable -> L27
            goto L7c
        L7a:
            r5.f14382b = r1     // Catch: java.lang.Throwable -> L27
        L7c:
            int r0 = r5.f14382b     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
        L7f:
            if (r0 == 0) goto L82
            return r1
        L82:
            return r2
        L83:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L27
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.n.e():boolean");
    }

    public synchronized void f() {
        PackageInfo packageInfoD = d(((Context) this.f14383c).getPackageName());
        if (packageInfoD != null) {
            this.f14384d = Integer.toString(packageInfoD.versionCode);
            this.f14385e = packageInfoD.versionName;
        }
    }

    public void g(int i10, int i11) {
        long[] jArr = (long[]) this.f14383c;
        int[] iArr = (int[]) this.f14384d;
        int[] iArr2 = (int[]) this.f14385e;
        long j = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }
}
