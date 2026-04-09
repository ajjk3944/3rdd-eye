package com.google.android.gms.internal.ads;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public final class LC extends AbstractList implements RandomAccess, Serializable, List {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f9636a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9637b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9638c;

    public LC(int[] iArr, int i, int i3) {
        this.f9636a = iArr;
        this.f9637b = i;
        this.f9638c = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f9637b;
        while (true) {
            if (i >= this.f9638c) {
                i = -1;
                break;
            }
            if (this.f9636a[i] == iIntValue) {
                break;
            }
            i++;
        }
        return i != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LC)) {
            return super.equals(obj);
        }
        LC lc = (LC) obj;
        int i = lc.f9638c;
        int i3 = lc.f9637b;
        int i6 = i - i3;
        int i7 = this.f9638c;
        int i8 = this.f9637b;
        int i9 = i7 - i8;
        if (i6 != i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (this.f9636a[i8 + i10] != lc.f9636a[i3 + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i3 = this.f9638c;
        int i6 = this.f9637b;
        AbstractC0582Jp.k0(i, i3 - i6);
        return Integer.valueOf(this.f9636a[i6 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i3 = this.f9637b; i3 < this.f9638c; i3++) {
            i = (i * 31) + this.f9636a[i3];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i = this.f9637b;
            int i3 = i;
            while (true) {
                if (i3 >= this.f9638c) {
                    i3 = -1;
                    break;
                }
                if (this.f9636a[i3] == iIntValue) {
                    break;
                }
                i3++;
            }
            if (i3 >= 0) {
                return i3 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i3 = this.f9638c - 1;
            while (true) {
                i = this.f9637b;
                if (i3 < i) {
                    i3 = -1;
                    break;
                }
                if (this.f9636a[i3] == iIntValue) {
                    break;
                }
                i3--;
            }
            if (i3 >= 0) {
                return i3 - i;
            }
        }
        return -1;
    }

    @Override // java.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i3 = this.f9638c;
        int i6 = this.f9637b;
        Integer num = (Integer) obj;
        AbstractC0582Jp.k0(i, i3 - i6);
        int i7 = i6 + i;
        int[] iArr = this.f9636a;
        int i8 = iArr[i7];
        num.getClass();
        iArr[i7] = num.intValue();
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9638c - this.f9637b;
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.CC.$default$stream(this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i3) {
        int i6 = this.f9638c;
        int i7 = this.f9637b;
        AbstractC0582Jp.m0(i, i3, i6 - i7);
        if (i == i3) {
            return Collections.EMPTY_LIST;
        }
        return new LC(this.f9636a, i + i7, i7 + i3);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.f9638c;
        int i3 = this.f9637b;
        StringBuilder sb = new StringBuilder((i - i3) * 5);
        sb.append('[');
        int[] iArr = this.f9636a;
        sb.append(iArr[i3]);
        while (true) {
            i3++;
            if (i3 >= i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i3]);
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection
    public final /* bridge */ /* synthetic */ j$.util.Spliterator spliterator() {
        return Spliterators.spliterator(this.f9636a, this.f9637b, this.f9638c, 0);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }
}
