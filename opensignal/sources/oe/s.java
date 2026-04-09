package oe;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import lf.t1;

/* loaded from: classes.dex */
public abstract class s {
    public static void a(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(w.g.e("at index ", 20, i11));
            }
        }
    }

    public static void b(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String strValueOf = String.valueOf(obj);
            throw new NullPointerException(c7.a.k(strValueOf.length() + 26, "null value in entry: ", strValueOf, "=null"));
        }
        String strValueOf2 = String.valueOf(obj2);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
        sb2.append("null key in entry: null=");
        sb2.append(strValueOf2);
        throw new NullPointerException(sb2.toString());
    }

    public static void c(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Object d(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(w.g.e("must be power of 2 between 2^1 and 2^30: ", 52, i10));
        }
        return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static boolean e(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean f(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static d1 g(Set set, ne.j jVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof d1)) {
                return new e1(set2, jVar);
            }
            d1 d1Var = (d1) set2;
            ne.j jVar2 = d1Var.f19315d;
            jVar2.getClass();
            return new e1((SortedSet) d1Var.f19314a, new ne.k(Arrays.asList(jVar2, jVar)));
        }
        if (!(set instanceof d1)) {
            set.getClass();
            return new d1(set, jVar);
        }
        d1 d1Var2 = (d1) set;
        ne.j jVar3 = d1Var2.f19315d;
        jVar3.getClass();
        return new d1(d1Var2.f19314a, new ne.k(Arrays.asList(jVar3, jVar)));
    }

    public static Object h(String str, AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object i(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object j(ArrayList arrayList) {
        Object next;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList != null) {
                return arrayList.get(arrayList.size() - 1);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int k(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static c1 l(Set set, k0 k0Var) {
        ba.m.k(set, "set1");
        ba.m.k(k0Var, "set2");
        return new c1(set, k0Var);
    }

    public static int m(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static ArrayList n(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList o(Object... objArr) {
        int length = objArr.length;
        c(length, "arraySize");
        ArrayList arrayList = new ArrayList(t1.D(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int p(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int iS = s(obj);
        int i13 = iS & i10;
        int iT = t(i13, obj3);
        if (iT != 0) {
            int i14 = ~i10;
            int i15 = iS & i14;
            int i16 = -1;
            while (true) {
                i11 = iT - 1;
                i12 = iArr[i11];
                if ((i12 & i14) == i15 && a.a.k(obj, objArr[i11]) && (objArr2 == null || a.a.k(obj2, objArr2[i11]))) {
                    break;
                }
                int i17 = i12 & i10;
                if (i17 == 0) {
                    break;
                }
                i16 = i11;
                iT = i17;
            }
            int i18 = i12 & i10;
            if (i16 == -1) {
                u(i13, i18, obj3);
                return i11;
            }
            iArr[i16] = m(iArr[i16], i18, i10);
            return i11;
        }
        return -1;
    }

    public static void q(List list, ne.j jVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (jVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static int r(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    public static int s(Object obj) {
        return r(obj == null ? 0 : obj.hashCode());
    }

    public static int t(int i10, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    public static void u(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
