package com.google.android.gms.internal.ads;

import android.os.Build;
import android.util.SparseBooleanArray;

/* renamed from: com.google.android.gms.internal.ads.hP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1264hP {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f14493a;

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.f14493a;
        AbstractC0582Jp.k0(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1264hP)) {
            return false;
        }
        C1264hP c1264hP = (C1264hP) obj;
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.f14493a;
        if (i >= 24) {
            return sparseBooleanArray.equals(c1264hP.f14493a);
        }
        if (sparseBooleanArray.size() != c1264hP.f14493a.size()) {
            return false;
        }
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            if (a(i3) != c1264hP.a(i3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.f14493a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            size = (size * 31) + a(i3);
        }
        return size;
    }
}
