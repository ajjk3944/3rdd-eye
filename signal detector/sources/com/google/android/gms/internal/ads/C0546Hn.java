package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Hn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546Hn {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8999a = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(java.lang.String r6, com.google.android.gms.internal.ads.C1392ju r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.HashMap r0 = r5.f8999a     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            com.google.android.gms.internal.ads.Gn r0 = new com.google.android.gms.internal.ads.Gn     // Catch: java.lang.Throwable -> L4e
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L20
        L12:
            com.google.android.gms.internal.ads.Nc r2 = r7.f15016a     // Catch: java.lang.Throwable -> L19
            com.google.android.gms.internal.ads.yd r2 = r2.K()     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r2 = move-exception
            com.google.android.gms.internal.ads.eu r3 = new com.google.android.gms.internal.ads.eu     // Catch: com.google.android.gms.internal.ads.C1123eu -> L10 java.lang.Throwable -> L4e
            r3.<init>(r2)     // Catch: com.google.android.gms.internal.ads.C1123eu -> L10 java.lang.Throwable -> L4e
            throw r3     // Catch: com.google.android.gms.internal.ads.C1123eu -> L10 java.lang.Throwable -> L4e
        L20:
            if (r7 != 0) goto L23
            goto L31
        L23:
            com.google.android.gms.internal.ads.Nc r3 = r7.f15016a     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.internal.ads.yd r1 = r3.s3()     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r3 = move-exception
            com.google.android.gms.internal.ads.eu r4 = new com.google.android.gms.internal.ads.eu     // Catch: com.google.android.gms.internal.ads.C1123eu -> L31 java.lang.Throwable -> L4e
            r4.<init>(r3)     // Catch: com.google.android.gms.internal.ads.C1123eu -> L31 java.lang.Throwable -> L4e
            throw r4     // Catch: com.google.android.gms.internal.ads.C1123eu -> L31 java.lang.Throwable -> L4e
        L31:
            com.google.android.gms.internal.ads.E9 r3 = com.google.android.gms.internal.ads.H9.Ca     // Catch: java.lang.Throwable -> L4e
            q2.s r4 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.ads.G9 r4 = r4.f23270c     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L4e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L4e
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L4e
            r4 = 1
            if (r3 != 0) goto L45
            goto L50
        L45:
            r3 = 0
            if (r7 != 0) goto L4a
        L48:
            r4 = r3
            goto L50
        L4a:
            r7.a()     // Catch: com.google.android.gms.internal.ads.C1123eu -> L48 java.lang.Throwable -> L4e
            goto L50
        L4e:
            r6 = move-exception
            goto L5a
        L50:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L4e
            java.util.HashMap r7 = r5.f8999a     // Catch: java.lang.Throwable -> L4e
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r5)
            return
        L5a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0546Hn.a(java.lang.String, com.google.android.gms.internal.ads.ju):void");
    }

    public final synchronized C0529Gn b(String str) {
        return (C0529Gn) this.f8999a.get(str);
    }
}
