package com.instagram.common.viewpoint.core;

import android.util.SparseArray;

/* loaded from: assets/audience_network/classes2.dex */
public final class K1 {
    public C0612Jv A00;
    public C0614Jx A01;
    public final int A02;
    public final int A03;
    public final SparseArray<C0616Jz> A08 = new SparseArray<>();
    public final SparseArray<C0611Ju> A06 = new SparseArray<>();
    public final SparseArray<C0613Jw> A07 = new SparseArray<>();
    public final SparseArray<C0611Ju> A04 = new SparseArray<>();
    public final SparseArray<C0613Jw> A05 = new SparseArray<>();

    public K1(int i4, int i10) {
        this.A03 = i4;
        this.A02 = i10;
    }

    public final void A00() {
        this.A08.clear();
        this.A06.clear();
        this.A07.clear();
        this.A04.clear();
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }
}
