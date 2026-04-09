package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ii f10623a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10624b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f10625c;

    /* renamed from: d, reason: collision with root package name */
    public final mx1[] f10626d;

    /* renamed from: e, reason: collision with root package name */
    public int f10627e;

    public e(ii iiVar, int[] iArr) {
        int length = iArr.length;
        mq0.c0(length > 0);
        iiVar.getClass();
        mx1[] mx1VarArr = iiVar.f12340d;
        this.f10623a = iiVar;
        this.f10624b = length;
        this.f10626d = new mx1[length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.f10626d[i4] = mx1VarArr[iArr[i4]];
        }
        Arrays.sort(this.f10626d, v.g);
        this.f10625c = new int[this.f10624b];
        for (int i10 = 0; i10 < this.f10624b; i10++) {
            int[] iArr2 = this.f10625c;
            mx1 mx1Var = this.f10626d[i10];
            int i11 = 0;
            while (true) {
                if (i11 >= mx1VarArr.length) {
                    i11 = -1;
                    break;
                } else if (mx1Var == mx1VarArr[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
            iArr2[i10] = i11;
        }
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            j += jArr[i4];
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            u41 u41Var = (u41) arrayList.get(i10);
            if (u41Var != null) {
                u41Var.a(new qz1(j, jArr[i10]));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int K1(int i4) {
        return this.f10625c[i4];
    }

    @Override // com.google.android.gms.internal.ads.d
    public final mx1 L1(int i4) {
        return this.f10626d[i4];
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int P1(int i4) {
        for (int i10 = 0; i10 < this.f10624b; i10++) {
            if (this.f10625c[i10] == i4) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.d
    public final ii b() {
        return this.f10623a;
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int c() {
        return this.f10625c.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f10623a.equals(eVar.f10623a) && Arrays.equals(this.f10625c, eVar.f10625c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f10627e;
        if (i4 != 0) {
            return i4;
        }
        int iHashCode = Arrays.hashCode(this.f10625c) + (System.identityHashCode(this.f10623a) * 31);
        this.f10627e = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.d
    public final int z1() {
        return this.f10625c[0];
    }

    @Override // com.google.android.gms.internal.ads.d
    public final mx1 zzc() {
        return this.f10626d[0];
    }
}
