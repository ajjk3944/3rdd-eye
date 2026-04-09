package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yl1 extends zl1 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18797a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.zl1
    public final String a() {
        ArrayList arrayList = this.f18797a;
        int size = arrayList.size();
        if (size == 1) {
            return ((zl1) arrayList.get(0)).a();
        }
        throw new IllegalStateException(d.h.q(size, "Array must have size 1, but has size ", new StringBuilder(String.valueOf(size).length() + 37)));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof yl1) && ((yl1) obj).f18797a.equals(this.f18797a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f18797a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f18797a.iterator();
    }
}
