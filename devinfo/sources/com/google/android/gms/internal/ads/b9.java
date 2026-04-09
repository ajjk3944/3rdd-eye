package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.applovin.shadow.okio.internal.Buffer;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b9 implements x1 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f9620e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9621f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public long f9622h;

    /* renamed from: i, reason: collision with root package name */
    public i3 f9623i;
    public z1 j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9624k;

    /* renamed from: a, reason: collision with root package name */
    public final zo0 f9616a = new zo0();

    /* renamed from: c, reason: collision with root package name */
    public final sk0 f9618c = new sk0(Buffer.SEGMENTING_THRESHOLD);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f9617b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final z8 f9619d = new z8(0);

    @Override // com.google.android.gms.internal.ads.x1
    public final List a() {
        v41 v41Var = x41.f18307b;
        return u51.f17096e;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final boolean c(y1 y1Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        t1 t1Var = (t1) y1Var;
        t1Var.O1(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            t1Var.e(bArr[13] & 7, false);
            t1Var.O1(bArr, 0, 3, false);
            if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void e(z1 z1Var) {
        this.j = z1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zo0 r5 = r4.f9616a
            long r0 = r5.b()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.a()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.c(r7)
        L24:
            com.google.android.gms.internal.ads.i3 r5 = r4.f9623i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.a(r7)
        L2c:
            r5 = r6
        L2d:
            android.util.SparseArray r7 = r4.f9617b
            int r8 = r7.size()
            if (r5 >= r8) goto L45
            java.lang.Object r7 = r7.valueAt(r5)
            com.google.android.gms.internal.ads.a9 r7 = (com.google.android.gms.internal.ads.a9) r7
            r7.f9282f = r6
            com.google.android.gms.internal.ads.j8 r7 = r7.f9277a
            r7.b()
            int r5 = r5 + 1
            goto L2d
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b9.f(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x022e  */
    @Override // com.google.android.gms.internal.ads.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.y1 r26, com.google.android.gms.internal.ads.c2 r27) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b9.g(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.c2):int");
    }

    @Override // com.google.android.gms.internal.ads.x1
    public final void d() {
    }
}
