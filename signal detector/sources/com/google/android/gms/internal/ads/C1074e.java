package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1074e implements InterfaceC1020d {

    /* renamed from: a, reason: collision with root package name */
    public final C2108x8 f13838a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13839b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f13840c;

    /* renamed from: d, reason: collision with root package name */
    public final TP[] f13841d;

    /* renamed from: e, reason: collision with root package name */
    public int f13842e;

    public C1074e(C2108x8 c2108x8, int[] iArr) {
        int length = iArr.length;
        AbstractC0582Jp.h0(length > 0);
        c2108x8.getClass();
        TP[] tpArr = c2108x8.f17549d;
        this.f13838a = c2108x8;
        this.f13839b = length;
        this.f13841d = new TP[length];
        for (int i = 0; i < iArr.length; i++) {
            this.f13841d[i] = tpArr[iArr[i]];
        }
        Arrays.sort(this.f13841d, C2045w.f17384g);
        this.f13840c = new int[this.f13839b];
        for (int i3 = 0; i3 < this.f13839b; i3++) {
            int[] iArr2 = this.f13840c;
            TP tp = this.f13841d[i3];
            int i6 = 0;
            while (true) {
                if (i6 >= tpArr.length) {
                    i6 = -1;
                    break;
                } else if (tp == tpArr[i6]) {
                    break;
                } else {
                    i6++;
                }
            }
            iArr2[i3] = i6;
        }
    }

    public static void c(ArrayList arrayList, long[] jArr) {
        long j6 = 0;
        for (int i = 0; i < 2; i++) {
            j6 += jArr[i];
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            IB ib = (IB) arrayList.get(i3);
            if (ib != null) {
                ib.a(new UQ(j6, jArr[i3]));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final C2108x8 a() {
        return this.f13838a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final int b() {
        return this.f13840c.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1074e c1074e = (C1074e) obj;
            if (this.f13838a.equals(c1074e.f13838a) && Arrays.equals(this.f13840c, c1074e.f13840c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final TP f() {
        return this.f13841d[0];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final int g() {
        return this.f13840c[0];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final TP h(int i) {
        return this.f13841d[i];
    }

    public final int hashCode() {
        int i = this.f13842e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f13840c) + (System.identityHashCode(this.f13838a) * 31);
        this.f13842e = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final int o0(int i) {
        for (int i3 = 0; i3 < this.f13839b; i3++) {
            if (this.f13840c[i3] == i) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1020d
    public final int t(int i) {
        return this.f13840c[i];
    }
}
