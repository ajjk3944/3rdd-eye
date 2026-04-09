package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class PB extends HB {

    /* renamed from: b, reason: collision with root package name */
    public final transient TB f10331b;

    public PB(TB tb) {
        this.f10331b = tb;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final AbstractC1896tC a() {
        return new OB(this.f10331b);
    }

    @Override // com.google.android.gms.internal.ads.HB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f10331b.c(obj);
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final int g(Object[] objArr, int i) {
        JB jbListIterator = ((LB) this.f10331b.f11356d.values()).listIterator(0);
        while (jbListIterator.hasNext()) {
            i = ((HB) jbListIterator.next()).g(objArr, i);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new OB(this.f10331b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f10331b.f11357e;
    }
}
