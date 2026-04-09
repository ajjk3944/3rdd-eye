package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class CB extends EB {
    public static final EB f(int i) {
        return i < 0 ? EB.f7924b : i > 0 ? EB.f7925c : EB.f7923a;
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final EB a(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final EB b(int i, int i3) {
        return f(Integer.compare(i, i3));
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final EB c(boolean z6, boolean z7) {
        return f(Boolean.compare(z7, z6));
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final EB d(boolean z6, boolean z7) {
        return f(Boolean.compare(z6, z7));
    }

    @Override // com.google.android.gms.internal.ads.EB
    public final int e() {
        return 0;
    }
}
