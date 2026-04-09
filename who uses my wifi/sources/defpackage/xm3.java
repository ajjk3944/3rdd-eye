package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class xm3 extends tm3 implements List, RandomAccess {
    public static final vm3 g = new vm3(sn3.j, 0);

    public static sn3 i(Object obj) {
        Object[] objArr = {obj};
        wl2.G(objArr, 1);
        return o(objArr, 1);
    }

    public static sn3 j(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        wl2.G(objArr, 2);
        return o(objArr, 2);
    }

    public static sn3 k(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        wl2.G(objArr, 5);
        return o(objArr, 5);
    }

    public static sn3 l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
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
        wl2.G(objArr2, i);
        return o(objArr2, i);
    }

    public static xm3 m(Collection collection) {
        if (!(collection instanceof tm3)) {
            Object[] array = collection.toArray();
            int length = array.length;
            wl2.G(array, length);
            return o(array, length);
        }
        xm3 xm3VarE = ((tm3) collection).e();
        if (!xm3VarE.f()) {
            return xm3VarE;
        }
        Object[] array2 = xm3VarE.toArray(tm3.f);
        return o(array2, array2.length);
    }

    public static sn3 n(Object[] objArr) {
        if (objArr.length == 0) {
            return sn3.j;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        wl2.G(objArr2, length);
        return o(objArr2, length);
    }

    public static sn3 o(Object[] objArr, int i) {
        return i == 0 ? sn3.j : new sn3(objArr, i);
    }

    @Override // defpackage.tm3
    public final yq2 a() {
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

    @Override // defpackage.tm3, java.util.AbstractCollection, java.util.Collection
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
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                vm3 vm3VarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (vm3VarListIterator.hasNext()) {
                        if (!it.hasNext() || !Objects.equals(vm3VarListIterator.next(), it.next())) {
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

    @Override // defpackage.tm3
    public int g(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public xm3 subList(int i, int i2) {
        zt0.g0(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? sn3.j : new wm3(this, i, i3);
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
    public final vm3 listIterator(int i) {
        zt0.f0(i, size());
        return isEmpty() ? g : new vm3(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tm3
    public final xm3 e() {
        return this;
    }
}
