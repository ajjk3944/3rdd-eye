package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ew1 extends z10 {

    /* renamed from: i, reason: collision with root package name */
    public int[] f10897i;
    public int[] j;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    @Override // com.google.android.gms.internal.ads.q10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ew1.a(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.z10
    public final j00 h(j00 j00Var) throws f10 {
        int[] iArr = this.f10897i;
        if (iArr == null) {
            return j00.f12557e;
        }
        int i4 = j00Var.f12560c;
        if (!bq0.a(i4)) {
            throw new f10("Unhandled input format:", j00Var);
        }
        int i10 = j00Var.f12559b;
        boolean z3 = i10 != iArr.length;
        int i11 = 0;
        while (true) {
            int length = iArr.length;
            if (i11 >= length) {
                return z3 ? new j00(j00Var.f12558a, length, i4) : j00.f12557e;
            }
            int i12 = iArr[i11];
            if (i12 >= i10) {
                String string = Arrays.toString(iArr);
                throw new f10(r5.c.m(new StringBuilder(String.valueOf(string).length() + 59), "Channel map (", string, ") trying to access non-existent input channel."), j00Var);
            }
            z3 |= i12 != i11;
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.z10
    public final void j() {
        this.j = this.f10897i;
    }

    @Override // com.google.android.gms.internal.ads.z10
    public final void k() {
        this.j = null;
        this.f10897i = null;
    }
}
