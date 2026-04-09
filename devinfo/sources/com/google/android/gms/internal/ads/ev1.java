package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ev1 {

    /* renamed from: c, reason: collision with root package name */
    public static final ev1 f10889c = new ev1(x41.l(dv1.f10555d));

    /* renamed from: d, reason: collision with root package name */
    public static final u51 f10890d;

    /* renamed from: e, reason: collision with root package name */
    public static final z51 f10891e;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f10892a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f10893b;

    static {
        Object[] objArr = {2, 5, 6};
        yo0.m(objArr, 3);
        f10890d = x41.s(objArr, 3);
        oa oaVar = new oa(4);
        oaVar.i(5, 6);
        oaVar.i(17, 6);
        oaVar.i(7, 6);
        oaVar.i(30, 10);
        oaVar.i(18, 6);
        oaVar.i(6, 8);
        oaVar.i(8, 8);
        oaVar.i(14, 8);
        f10891e = oaVar.v(true);
    }

    public ev1(u51 u51Var) {
        for (int i4 = 0; i4 < u51Var.f17098d; i4++) {
            dv1 dv1Var = (dv1) u51Var.get(i4);
            this.f10892a.put(dv1Var.f10556a, dv1Var);
        }
        int iMax = 0;
        for (int i10 = 0; i10 < this.f10892a.size(); i10++) {
            iMax = Math.max(iMax, ((dv1) this.f10892a.valueAt(i10)).f10557b);
        }
        this.f10893b = iMax;
    }

    public static ev1 a(Context context, p50 p50Var, AudioDeviceInfo audioDeviceInfo) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), p50Var, audioDeviceInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.ev1 b(android.content.Context r16, android.content.Intent r17, com.google.android.gms.internal.ads.p50 r18, android.media.AudioDeviceInfo r19) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ev1.b(android.content.Context, android.content.Intent, com.google.android.gms.internal.ads.p50, android.media.AudioDeviceInfo):com.google.android.gms.internal.ads.ev1");
    }

    public static u51 d(int i4, int[] iArr) {
        v41 v41Var = x41.f18307b;
        yr1.u(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        if (iArr == null) {
            iArr = new int[0];
        }
        int i11 = 0;
        while (i10 < iArr.length) {
            dv1 dv1Var = new dv1(iArr[i10], i4);
            int length = objArrCopyOf.length;
            int i12 = i11 + 1;
            int iD = s41.d(length, i12);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i11] = dv1Var;
            i10++;
            i11 = i12;
        }
        return x41.s(objArrCopyOf, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[PHI: r1
  0x0039: PHI (r1v3 int) = (r1v2 int), (r1v6 int) binds: [B:11:0x002d, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair c(com.google.android.gms.internal.ads.p50 r11, com.google.android.gms.internal.ads.mx1 r12) {
        /*
            r10 = this;
            java.lang.String r0 = r12.f14052m
            r0.getClass()
            java.lang.String r1 = r12.j
            int r1 = com.google.android.gms.internal.ads.ia.g(r0, r1)
            com.google.android.gms.internal.ads.z51 r2 = com.google.android.gms.internal.ads.ev1.f10891e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L19
            goto Ld0
        L19:
            r2 = 7
            r3 = 8
            r4 = 6
            android.util.SparseArray r5 = r10.f10892a
            r6 = 18
            if (r1 != r6) goto L2d
            int r1 = r5.indexOfKey(r6)
            if (r1 < 0) goto L2b
            r1 = r6
            goto L2d
        L2b:
            r1 = r4
            goto L43
        L2d:
            if (r1 != r3) goto L39
            int r1 = r5.indexOfKey(r3)
            if (r1 < 0) goto L37
            r1 = r3
            goto L39
        L37:
            r1 = r2
            goto L43
        L39:
            r7 = 30
            if (r1 != r7) goto L43
            int r7 = r5.indexOfKey(r7)
            if (r7 < 0) goto L37
        L43:
            int r7 = r5.indexOfKey(r1)
            if (r7 < 0) goto Ld0
            java.lang.Object r5 = r5.get(r1)
            com.google.android.gms.internal.ads.dv1 r5 = (com.google.android.gms.internal.ads.dv1) r5
            r5.getClass()
            int r7 = r12.E
            r8 = 1
            r9 = -1
            if (r7 == r9) goto L8c
            if (r1 != r6) goto L5b
            goto L8c
        L5b:
            java.lang.String r11 = "audio/vnd.dts.uhd;profile=p2"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L6f
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 33
            if (r11 >= r12) goto L6f
            r11 = 10
            if (r7 <= r11) goto L97
            goto Ld0
        L6f:
            com.google.android.gms.internal.ads.e51 r11 = r5.f10558c
            r12 = 0
            if (r11 != 0) goto L7a
            int r11 = r5.f10557b
            if (r7 > r11) goto L89
            r12 = r8
            goto L89
        L7a:
            int r0 = com.google.android.gms.internal.ads.bq0.b(r7)
            if (r0 != 0) goto L81
            goto L89
        L81:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            boolean r12 = r11.contains(r12)
        L89:
            if (r12 != 0) goto L97
            goto Ld0
        L8c:
            int r12 = r12.F
            if (r12 != r9) goto L93
            r12 = 48000(0xbb80, float:6.7262E-41)
        L93:
            int r7 = r5.a(r12, r11)
        L97:
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            if (r11 > r12) goto Lab
            if (r7 != r2) goto La0
            goto Lac
        La0:
            r12 = 3
            if (r7 == r12) goto La9
            r12 = 4
            if (r7 == r12) goto La9
            r12 = 5
            if (r7 != r12) goto Lab
        La9:
            r3 = r4
            goto Lac
        Lab:
            r3 = r7
        Lac:
            r12 = 26
            if (r11 > r12) goto Lbd
            java.lang.String r11 = "fugu"
            java.lang.String r12 = android.os.Build.DEVICE
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto Lbd
            if (r3 != r8) goto Lbd
            r3 = 2
        Lbd:
            int r11 = com.google.android.gms.internal.ads.bq0.b(r3)
            if (r11 == 0) goto Ld0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            android.util.Pair r11 = android.util.Pair.create(r12, r11)
            return r11
        Ld0:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ev1.c(com.google.android.gms.internal.ads.p50, com.google.android.gms.internal.ads.mx1):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.ev1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.ev1 r9 = (com.google.android.gms.internal.ads.ev1) r9
            android.util.SparseArray r1 = r9.f10892a
            java.lang.String r3 = com.google.android.gms.internal.ads.bq0.f9768a
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            android.util.SparseArray r5 = r8.f10892a
            if (r3 < r4) goto L1f
            boolean r1 = r5.contentEquals(r1)
            if (r1 == 0) goto L48
            goto L41
        L1f:
            int r3 = r5.size()
            int r4 = r1.size()
            if (r3 != r4) goto L48
            r4 = r2
        L2a:
            if (r4 >= r3) goto L41
            int r6 = r5.keyAt(r4)
            java.lang.Object r7 = r5.valueAt(r4)
            java.lang.Object r6 = r1.get(r6)
            boolean r6 = j$.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L48
            int r4 = r4 + 1
            goto L2a
        L41:
            int r1 = r8.f10893b
            int r9 = r9.f10893b
            if (r1 != r9) goto L48
            return r0
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ev1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = bq0.f9768a;
        int i4 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f10892a;
        if (i4 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f10893b;
    }

    public final String toString() {
        String string = this.f10892a.toString();
        int i4 = this.f10893b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 50 + string.length() + 1);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i4);
        sb2.append(", audioProfiles=");
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}
