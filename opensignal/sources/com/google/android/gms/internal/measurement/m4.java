package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class m4 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f5114g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static volatile c4 f5115h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f5116i;

    /* renamed from: a, reason: collision with root package name */
    public final ab.g f5117a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5118b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5119c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f5120d = -1;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f5121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5122f;

    static {
        new AtomicReference();
        f5116i = new AtomicInteger();
    }

    public /* synthetic */ m4(ab.g gVar, String str, Object obj, int i10) {
        this.f5122f = i10;
        if (((Uri) gVar.f309g) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f5117a = gVar;
        this.f5118b = str;
        this.f5119c = obj;
    }

    public final Object a(Object obj) {
        switch (this.f5122f) {
            case 0:
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    String string = obj.toString();
                    String str = this.f5118b;
                    StringBuilder sb2 = new StringBuilder(str.length() + 25 + string.length());
                    sb2.append("Invalid long value for ");
                    sb2.append(str);
                    sb2.append(": ");
                    sb2.append(string);
                    io.sentry.android.core.e0.d("PhenotypeFlag", sb2.toString());
                    break;
                } else {
                    break;
                }
            case 1:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!x3.f5256b.matcher(str2).matches()) {
                            if (x3.f5257c.matcher(str2).matches()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    String string2 = obj.toString();
                    String str3 = this.f5118b;
                    StringBuilder sb3 = new StringBuilder(str3.length() + 28 + string2.length());
                    sb3.append("Invalid boolean value for ");
                    sb3.append(str3);
                    sb3.append(": ");
                    sb3.append(string2);
                    io.sentry.android.core.e0.d("PhenotypeFlag", sb3.toString());
                    break;
                } else {
                    break;
                }
            case 2:
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof String) {
                            try {
                                break;
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        String string3 = obj.toString();
                        String str4 = this.f5118b;
                        StringBuilder sb4 = new StringBuilder(str4.length() + 27 + string3.length());
                        sb4.append("Invalid double value for ");
                        sb4.append(str4);
                        sb4.append(": ");
                        sb4.append(string3);
                        io.sentry.android.core.e0.d("PhenotypeFlag", sb4.toString());
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                if (obj instanceof String) {
                    break;
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[PHI: r2
  0x0058: PHI (r2v1 ne.i) = (r2v0 ne.i), (r2v5 ne.i), (r2v5 ne.i) binds: [B:8:0x0014, B:10:0x0022, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:17:0x0048, B:24:0x005e, B:26:0x006b, B:28:0x0073, B:31:0x0083, B:33:0x0091, B:45:0x00b6, B:48:0x00be, B:49:0x00c1, B:50:0x00c5, B:37:0x009a, B:39:0x009e, B:41:0x00ac, B:43:0x00b2, B:51:0x00ca, B:52:0x00cc, B:14:0x0041, B:53:0x00cd), top: B:59:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:17:0x0048, B:24:0x005e, B:26:0x006b, B:28:0x0073, B:31:0x0083, B:33:0x0091, B:45:0x00b6, B:48:0x00be, B:49:0x00c1, B:50:0x00c5, B:37:0x009a, B:39:0x009e, B:41:0x00ac, B:43:0x00b2, B:51:0x00ca, B:52:0x00cc, B:14:0x0041, B:53:0x00cd), top: B:59:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.m4.f5116i
            int r0 = r0.get()
            int r1 = r9.f5120d
            if (r1 >= r0) goto Ld1
            monitor-enter(r9)
            int r1 = r9.f5120d     // Catch: java.lang.Throwable -> L55
            if (r1 >= r0) goto Lcd
            com.google.android.gms.internal.measurement.c4 r1 = com.google.android.gms.internal.measurement.m4.f5115h     // Catch: java.lang.Throwable -> L55
            ne.a r2 = ne.a.f17518a     // Catch: java.lang.Throwable -> L55
            r3 = 0
            if (r1 == 0) goto L58
            ne.n r2 = r1.f4929b     // Catch: java.lang.Throwable -> L55
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L55
            ne.i r2 = (ne.i) r2     // Catch: java.lang.Throwable -> L55
            boolean r4 = r2.b()     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L58
            java.lang.Object r4 = r2.a()     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.measurement.f4 r4 = (com.google.android.gms.internal.measurement.f4) r4     // Catch: java.lang.Throwable -> L55
            ab.g r5 = r9.f5117a     // Catch: java.lang.Throwable -> L55
            java.lang.Object r5 = r5.f309g     // Catch: java.lang.Throwable -> L55
            android.net.Uri r5 = (android.net.Uri) r5     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = r9.f5118b     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L41
            u.i0 r4 = r4.f4984a     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L55
            u.i0 r4 = (u.i0) r4     // Catch: java.lang.Throwable -> L55
            goto L45
        L41:
            r4.getClass()     // Catch: java.lang.Throwable -> L55
            r4 = r3
        L45:
            if (r4 != 0) goto L48
            goto L58
        L48:
            java.lang.String r5 = ""
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L55
            goto L59
        L55:
            r0 = move-exception
            goto Lcf
        L58:
            r4 = r3
        L59:
            if (r1 == 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = 0
        L5e:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            ba.m.n(r6, r5)     // Catch: java.lang.Throwable -> L55
            ab.g r5 = r9.f5117a     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.f309g     // Catch: java.lang.Throwable -> L55
            android.net.Uri r6 = (android.net.Uri) r6     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto Lca
            android.content.Context r7 = r1.f4928a     // Catch: java.lang.Throwable -> L55
            boolean r7 = com.google.android.gms.internal.measurement.k4.a(r7, r6)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L80
            android.content.Context r7 = r1.f4928a     // Catch: java.lang.Throwable -> L55
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.measurement.n4 r8 = com.google.android.gms.internal.measurement.n4.f5135a     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.measurement.e4 r6 = com.google.android.gms.internal.measurement.e4.a(r7, r6, r8)     // Catch: java.lang.Throwable -> L55
            goto L81
        L80:
            r6 = r3
        L81:
            if (r6 == 0) goto L96
            java.lang.String r7 = r9.f5118b     // Catch: java.lang.Throwable -> L55
            java.util.Map r6 = r6.b()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L96
            java.lang.Object r6 = r9.a(r6)     // Catch: java.lang.Throwable -> L55
            goto L97
        L96:
            r6 = r3
        L97:
            if (r6 == 0) goto L9a
            goto Lb6
        L9a:
            boolean r5 = r5.f308d     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto Lb0
            android.content.Context r1 = r1.f4928a     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.internal.measurement.h4 r1 = com.google.android.gms.internal.measurement.h4.m(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r9.f5118b     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r1.p(r5)     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto Lb0
            java.lang.Object r3 = r9.a(r1)     // Catch: java.lang.Throwable -> L55
        Lb0:
            if (r3 != 0) goto Lb5
            java.lang.Object r6 = r9.f5119c     // Catch: java.lang.Throwable -> L55
            goto Lb6
        Lb5:
            r6 = r3
        Lb6:
            boolean r1 = r2.b()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto Lc5
            if (r4 != 0) goto Lc1
            java.lang.Object r6 = r9.f5119c     // Catch: java.lang.Throwable -> L55
            goto Lc5
        Lc1:
            java.lang.Object r6 = r9.a(r4)     // Catch: java.lang.Throwable -> L55
        Lc5:
            r9.f5121e = r6     // Catch: java.lang.Throwable -> L55
            r9.f5120d = r0     // Catch: java.lang.Throwable -> L55
            goto Lcd
        Lca:
            android.content.Context r0 = r1.f4928a     // Catch: java.lang.Throwable -> L55
            throw r3     // Catch: java.lang.Throwable -> L55
        Lcd:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L55
            goto Ld1
        Lcf:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L55
            throw r0
        Ld1:
            java.lang.Object r0 = r9.f5121e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.m4.b():java.lang.Object");
    }
}
