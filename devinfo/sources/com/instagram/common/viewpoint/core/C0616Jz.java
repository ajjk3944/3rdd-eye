package com.instagram.common.viewpoint.core;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.Jz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0616Jz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final SparseArray<K0> A09;
    public final boolean A0A;

    public C0616Jz(int i4, boolean z3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, SparseArray<K0> sparseArray) {
        this.A03 = i4;
        this.A0A = z3;
        this.A08 = i10;
        this.A02 = i11;
        this.A04 = i12;
        this.A01 = i13;
        this.A00 = i14;
        this.A07 = i15;
        this.A06 = i16;
        this.A05 = i17;
        this.A09 = sparseArray;
    }

    public final void A00(C0616Jz c0616Jz) {
        SparseArray<K0> sparseArray = c0616Jz.A09;
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            SparseArray<K0> sparseArray2 = this.A09;
            int i10 = sparseArray.keyAt(i4);
            sparseArray2.put(i10, sparseArray.valueAt(i4));
        }
    }
}
