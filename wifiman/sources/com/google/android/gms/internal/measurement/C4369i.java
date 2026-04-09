package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4369i implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f35243a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4351g f35244b;

    C4369i(C4351g c4351g) {
        this.f35244b = c4351g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35243a < this.f35244b.m();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.f35243a < this.f35244b.m()) {
            C4351g c4351g = this.f35244b;
            int i10 = this.f35243a;
            this.f35243a = i10 + 1;
            return c4351g.i(i10);
        }
        throw new NoSuchElementException("Out of bounds index: " + this.f35243a);
    }
}
