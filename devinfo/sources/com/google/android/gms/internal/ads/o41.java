package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o41 extends q41 {
    public static final q41 f(int i4) {
        return i4 < 0 ? q41.f15204b : i4 > 0 ? q41.f15205c : q41.f15203a;
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final q41 a(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final q41 b(int i4, int i10) {
        return f(Integer.compare(i4, i10));
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final q41 c(boolean z3, boolean z10) {
        return f(Boolean.compare(z10, z3));
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final q41 d(boolean z3, boolean z10) {
        return f(Boolean.compare(z3, z10));
    }

    @Override // com.google.android.gms.internal.ads.q41
    public final int e() {
        return 0;
    }
}
