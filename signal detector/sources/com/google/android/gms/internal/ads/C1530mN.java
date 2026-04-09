package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1530mN implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f15613a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1584nN f15614b;

    public C1530mN(C1584nN c1584nN) {
        this.f15614b = c1584nN;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f15613a;
        C1584nN c1584nN = this.f15614b;
        return i < c1584nN.f15769a.size() || c1584nN.f15770b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f15613a;
        C1584nN c1584nN = this.f15614b;
        List list = c1584nN.f15769a;
        if (i >= list.size()) {
            list.add(c1584nN.f15770b.next());
            return next();
        }
        int i3 = this.f15613a;
        this.f15613a = i3 + 1;
        return list.get(i3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
