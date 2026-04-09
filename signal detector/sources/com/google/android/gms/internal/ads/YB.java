package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class YB extends AbstractC1842sC implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractList f12601c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ YB(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f12600b = i;
        this.f12601c = abstractList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1842sC
    public final Object a(Object obj) {
        switch (this.f12600b) {
            case 0:
                return ((ZB) this.f12601c).f12797b.apply(obj);
            default:
                return ((C0869aC) this.f12601c).f13084b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f16691a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f16691a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f16691a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f16691a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
