package com.google.android.gms.internal.ads;

import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xv0 {

    /* renamed from: a, reason: collision with root package name */
    public final kg f18515a;

    /* renamed from: b, reason: collision with root package name */
    public final File f18516b;

    /* renamed from: c, reason: collision with root package name */
    public final File f18517c;

    /* renamed from: d, reason: collision with root package name */
    public final File f18518d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f18519e;

    public xv0(kg kgVar, File file, File file2, File file3) {
        this.f18515a = kgVar;
        this.f18516b = file;
        this.f18517c = file3;
        this.f18518d = file2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] a() throws java.lang.Throwable {
        /*
            r9 = this;
            byte[] r0 = r9.f18519e
            r1 = 0
            if (r0 != 0) goto L58
            java.io.File r0 = r9.f18518d
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L51
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L51
            com.google.android.gms.internal.ads.zm1 r0 = com.google.android.gms.internal.ads.bn1.f9729b     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L52
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L52
            r0.<init>()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L52
            r3 = 256(0x100, float:3.59E-43)
        L15:
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L52
            r5 = 0
            r6 = r5
        L19:
            if (r6 >= r3) goto L29
            int r7 = r3 - r6
            int r7 = r2.read(r4, r6, r7)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L52
            r8 = -1
            if (r7 != r8) goto L25
            goto L29
        L25:
            int r6 = r6 + r7
            goto L19
        L27:
            r0 = move-exception
            goto L4a
        L29:
            if (r6 != 0) goto L2d
            r4 = r1
            goto L31
        L2d:
            com.google.android.gms.internal.ads.zm1 r4 = com.google.android.gms.internal.ads.bn1.v(r5, r6, r4)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L52
        L31:
            if (r4 != 0) goto L3f
            com.google.android.gms.internal.ads.bn1 r0 = com.google.android.gms.internal.ads.bn1.x(r0)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L52
            byte[] r0 = r0.y()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L52
            tb.b.d(r2)
            goto L56
        L3f:
            r0.add(r4)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L52
            int r3 = r3 + r3
            r4 = 8192(0x2000, float:1.148E-41)
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L52
            goto L15
        L4a:
            r1 = r2
            goto L4d
        L4c:
            r0 = move-exception
        L4d:
            tb.b.d(r1)
            throw r0
        L51:
            r2 = r1
        L52:
            tb.b.d(r2)
            r0 = r1
        L56:
            r9.f18519e = r0
        L58:
            byte[] r0 = r9.f18519e
            if (r0 != 0) goto L5d
            return r1
        L5d:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xv0.a():byte[]");
    }
}
