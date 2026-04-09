package com.google.android.gms.internal.ads;

import j$.util.List;
import j$.util.Objects;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class x41 extends t41 implements List, RandomAccess, j$.util.List {

    /* renamed from: b, reason: collision with root package name */
    public static final v41 f18307b = new v41(u51.f17096e, 0);

    public static u51 l(Object obj) {
        Object[] objArr = {obj};
        yo0.m(objArr, 1);
        return s(objArr, 1);
    }

    public static u51 m(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        yo0.m(objArr, 2);
        return s(objArr, 2);
    }

    public static u51 o(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        yo0.m(objArr, 5);
        return s(objArr, 5);
    }

    public static u51 p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i4 = length + 12;
        Object[] objArr2 = new Object[i4];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        yo0.m(objArr2, i4);
        return s(objArr2, i4);
    }

    public static x41 q(Collection collection) {
        if (!(collection instanceof t41)) {
            Object[] array = collection.toArray();
            int length = array.length;
            yo0.m(array, length);
            return s(array, length);
        }
        x41 x41VarG = ((t41) collection).g();
        if (!x41VarG.i()) {
            return x41VarG;
        }
        Object[] array2 = x41VarG.toArray(t41.f16701a);
        return s(array2, array2.length);
    }

    public static u51 r(Object[] objArr) {
        if (objArr.length == 0) {
            return u51.f17096e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        yo0.m(objArr2, length);
        return s(objArr2, length);
    }

    public static u51 s(Object[] objArr, int i4) {
        return i4 == 0 ? u51.f17096e : new u51(objArr, i4);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final h61 a() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.t41, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i4 = 0; i4 < size; i4++) {
                        if (Objects.equals(get(i4), list.get(i4))) {
                        }
                    }
                    return true;
                }
                v41 v41VarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (v41VarListIterator.hasNext()) {
                        if (!it.hasNext() || !Objects.equals(v41VarListIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i4 = 0; i4 < size; i4++) {
            iHashCode = (iHashCode * 31) + get(i4).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (obj.equals(get(i4))) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public int j(Object[] objArr, int i4) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i4 + i10] = get(i10);
        }
        return i4 + size;
    }

    @Override // java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public x41 subList(int i4, int i10) {
        mq0.h0(i4, i10, size());
        int i11 = i10 - i4;
        return i11 == size() ? this : i11 == 0 ? u51.f17096e : new w41(this, i4, i11);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final v41 listIterator(int i4) {
        mq0.g0(i4, size());
        return isEmpty() ? f18307b : new v41(this, i4);
    }

    @Override // com.google.android.gms.internal.ads.t41
    public final x41 g() {
        return this;
    }
}
