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

/* loaded from: classes.dex */
public abstract class LB extends HB implements List, RandomAccess, j$.util.List {

    /* renamed from: b, reason: collision with root package name */
    public static final JB f9635b = new JB(C1197gC.f14227e, 0);

    public static C1197gC i(Object obj) {
        Object[] objArr = {obj};
        AbstractC1984ut.k(1, objArr);
        return o(1, objArr);
    }

    public static C1197gC j(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC1984ut.k(2, objArr);
        return o(2, objArr);
    }

    public static C1197gC k(Long l2, Long l6, Long l7, Long l8, Long l9) {
        Object[] objArr = {l2, l6, l7, l8, l9};
        AbstractC1984ut.k(5, objArr);
        return o(5, objArr);
    }

    public static C1197gC l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
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
        AbstractC1984ut.k(i, objArr2);
        return o(i, objArr2);
    }

    public static LB m(Collection collection) {
        if (!(collection instanceof HB)) {
            Object[] array = collection.toArray();
            int length = array.length;
            AbstractC1984ut.k(length, array);
            return o(length, array);
        }
        LB lbE = ((HB) collection).e();
        if (!lbE.f()) {
            return lbE;
        }
        Object[] array2 = lbE.toArray(HB.f8873a);
        return o(array2.length, array2);
    }

    public static C1197gC n(Object[] objArr) {
        if (objArr.length == 0) {
            return C1197gC.f14227e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        AbstractC1984ut.k(length, objArr2);
        return o(length, objArr2);
    }

    public static C1197gC o(int i, Object[] objArr) {
        return i == 0 ? C1197gC.f14227e : new C1197gC(i, objArr);
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final AbstractC1896tC a() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.HB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.ads.HB
    public final LB e() {
        return this;
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
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                JB jbListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (jbListIterator.hasNext()) {
                        if (!it.hasNext() || !Objects.equals(jbListIterator.next(), it.next())) {
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

    @Override // com.google.android.gms.internal.ads.HB
    public int g(Object[] objArr, int i) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i + i3] = get(i3);
        }
        return i + size;
    }

    @Override // java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public LB subList(int i, int i3) {
        AbstractC0582Jp.m0(i, i3, size());
        int i6 = i3 - i;
        return i6 == size() ? this : i6 == 0 ? C1197gC.f14227e : new KB(this, i, i6);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
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
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final JB listIterator(int i) {
        AbstractC0582Jp.l0(i, size());
        return isEmpty() ? f9635b : new JB(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }
}
