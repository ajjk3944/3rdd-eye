package com.google.android.gms.internal.ads;

import android.os.Build;
import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yv1 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f18891a;

    public final int a(int i4) {
        SparseBooleanArray sparseBooleanArray = this.f18891a;
        mq0.f0(i4, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv1)) {
            return false;
        }
        yv1 yv1Var = (yv1) obj;
        SparseBooleanArray sparseBooleanArray = yv1Var.f18891a;
        int i4 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.f18891a;
        if (i4 >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i10 = 0; i10 < sparseBooleanArray2.size(); i10++) {
            if (a(i10) != yv1Var.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i4 = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.f18891a;
        if (i4 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }
}
