package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.lK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1473lK extends AbstractC1527mK implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15380a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.AbstractC1527mK
    public final String a() {
        ArrayList arrayList = this.f15380a;
        int size = arrayList.size();
        if (size == 1) {
            return ((AbstractC1527mK) arrayList.get(0)).a();
        }
        throw new IllegalStateException(A.f.i(size, "Array must have size 1, but has size ", new StringBuilder(String.valueOf(size).length() + 37)));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C1473lK) && ((C1473lK) obj).f15380a.equals(this.f15380a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f15380a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f15380a.iterator();
    }
}
