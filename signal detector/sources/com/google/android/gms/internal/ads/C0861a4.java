package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.a4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0861a4 implements InterfaceC1992v0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f13027e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13028f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13029g;

    /* renamed from: h, reason: collision with root package name */
    public long f13030h;
    public C1240h1 i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC2100x0 f13031j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13032k;

    /* renamed from: a, reason: collision with root package name */
    public final C2038vt f13023a = new C2038vt();

    /* renamed from: c, reason: collision with root package name */
    public final C2036vr f13025c = new C2036vr(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f13024b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final Y3 f13026d = new Y3(0);

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final boolean b(InterfaceC2046w0 interfaceC2046w0) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C1776r0 c1776r0 = (C1776r0) interfaceC2046w0;
        c1776r0.y(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c1776r0.e(bArr[13] & 7, false);
            c1776r0.y(bArr, 0, 3, false);
            if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final List c() {
        JB jb = LB.f9635b;
        return C1197gC.f14227e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    public final void e(InterfaceC2100x0 interfaceC2100x0) {
        this.f13031j = interfaceC2100x0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.vt r5 = r4.f13023a
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
            com.google.android.gms.internal.ads.h1 r5 = r4.i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.a(r7)
        L2c:
            r5 = r6
        L2d:
            android.util.SparseArray r7 = r4.f13024b
            int r8 = r7.size()
            if (r5 >= r8) goto L45
            java.lang.Object r7 = r7.valueAt(r5)
            com.google.android.gms.internal.ads.Z3 r7 = (com.google.android.gms.internal.ads.Z3) r7
            r7.f12789f = r6
            com.google.android.gms.internal.ads.I3 r7 = r7.f12784a
            r7.a()
            int r5 = r5 + 1
            goto L2d
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0861a4.f(long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x022e  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1992v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(com.google.android.gms.internal.ads.InterfaceC2046w0 r26, com.google.android.gms.internal.ads.A0 r27) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0861a4.g(com.google.android.gms.internal.ads.w0, com.google.android.gms.internal.ads.A0):int");
    }
}
