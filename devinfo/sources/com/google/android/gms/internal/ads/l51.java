package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l51 extends g61 implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractList f13382c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l51(AbstractList abstractList, ListIterator listIterator, int i4) {
        super(listIterator);
        this.f13381b = i4;
        this.f13382c = abstractList;
    }

    @Override // com.google.android.gms.internal.ads.g61
    public final Object a(Object obj) {
        switch (this.f13381b) {
            case 0:
                return ((m51) this.f13382c).f13768b.apply(obj);
            default:
                return ((n51) this.f13382c).f14161b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f11386a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f11386a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f11386a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f11386a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
