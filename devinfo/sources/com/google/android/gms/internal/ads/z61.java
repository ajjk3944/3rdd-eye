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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z61 extends AbstractList implements RandomAccess, Serializable, List {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f19028a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19029b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19030c;

    public z61(int[] iArr, int i4, int i10) {
        this.f19028a = iArr;
        this.f19029b = i4;
        this.f19030c = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i4 = this.f19029b;
        while (true) {
            if (i4 >= this.f19030c) {
                i4 = -1;
                break;
            }
            if (this.f19028a[i4] == iIntValue) {
                break;
            }
            i4++;
        }
        return i4 != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z61)) {
            return super.equals(obj);
        }
        z61 z61Var = (z61) obj;
        int i4 = z61Var.f19030c;
        int i10 = z61Var.f19029b;
        int i11 = i4 - i10;
        int i12 = this.f19030c;
        int i13 = this.f19029b;
        int i14 = i12 - i13;
        if (i11 != i14) {
            return false;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.f19028a[i13 + i15] != z61Var.f19028a[i10 + i15]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i4) {
        int i10 = this.f19030c;
        int i11 = this.f19029b;
        mq0.f0(i4, i10 - i11);
        return Integer.valueOf(this.f19028a[i11 + i4]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i10 = this.f19029b; i10 < this.f19030c; i10++) {
            i4 = (i4 * 31) + this.f19028a[i10];
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i4 = this.f19029b;
            int i10 = i4;
            while (true) {
                if (i10 >= this.f19030c) {
                    i10 = -1;
                    break;
                }
                if (this.f19028a[i10] == iIntValue) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                return i10 - i4;
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
        int i4;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f19030c - 1;
            while (true) {
                i4 = this.f19029b;
                if (i10 < i4) {
                    i10 = -1;
                    break;
                }
                if (this.f19028a[i10] == iIntValue) {
                    break;
                }
                i10--;
            }
            if (i10 >= 0) {
                return i10 - i4;
            }
        }
        return -1;
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        int i10 = this.f19030c;
        int i11 = this.f19029b;
        Integer num = (Integer) obj;
        mq0.f0(i4, i10 - i11);
        int i12 = i11 + i4;
        int[] iArr = this.f19028a;
        int i13 = iArr[i12];
        num.getClass();
        iArr[i12] = num.intValue();
        return Integer.valueOf(i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19030c - this.f19029b;
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i4, int i10) {
        int i11 = this.f19030c;
        int i12 = this.f19029b;
        mq0.h0(i4, i10, i11 - i12);
        if (i4 == i10) {
            return Collections.EMPTY_LIST;
        }
        return new z61(this.f19028a, i4 + i12, i12 + i10);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i4 = this.f19030c;
        int i10 = this.f19029b;
        StringBuilder sb2 = new StringBuilder((i4 - i10) * 5);
        sb2.append('[');
        int[] iArr = this.f19028a;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 >= i4) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection
    public final /* bridge */ /* synthetic */ j$.util.Spliterator spliterator() {
        return Spliterators.spliterator(this.f19028a, this.f19029b, this.f19030c, 0);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }
}
