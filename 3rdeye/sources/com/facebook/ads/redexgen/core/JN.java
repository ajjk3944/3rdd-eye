package com.facebook.ads.redexgen.core;

import android.util.SparseArray;

/* loaded from: assets/audience_network.dex */
public final class JN {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final SparseArray<JO> A09;
    public final boolean A0A;

    public JN(int i, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, SparseArray<JO> sparseArray) {
        this.A03 = i;
        this.A0A = z10;
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

    public final void A00(JN jn) {
        SparseArray<JO> sparseArray = jn.A09;
        for (int i = 0; i < sparseArray.size(); i++) {
            SparseArray<JO> sparseArray2 = this.A09;
            int i10 = sparseArray.keyAt(i);
            sparseArray2.put(i10, sparseArray.valueAt(i));
        }
    }
}
