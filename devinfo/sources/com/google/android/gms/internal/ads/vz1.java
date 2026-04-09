package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vz1 extends lm {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f17798w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f17799x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f17800y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f17801z;

    public vz1() {
        this.D = new SparseArray();
        this.E = new SparseBooleanArray();
        this.f17798w = true;
        this.f17799x = true;
        this.f17800y = true;
        this.f17801z = true;
        this.A = true;
        this.B = true;
        this.C = true;
    }

    public vz1(wz1 wz1Var) {
        a(wz1Var);
        this.f17798w = wz1Var.f18248w;
        this.f17799x = wz1Var.f18249x;
        this.f17800y = wz1Var.f18250y;
        this.f17801z = wz1Var.f18251z;
        this.A = wz1Var.A;
        this.B = wz1Var.B;
        this.C = wz1Var.C;
        SparseArray sparseArray = new SparseArray();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray2 = wz1Var.D;
            if (i4 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i4), new HashMap((Map) sparseArray2.valueAt(i4)));
                i4++;
            } else {
                this.D = sparseArray;
                this.E = wz1Var.E.clone();
                return;
            }
        }
    }
}
