package zj;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class n extends q {
    public static void W(Collection collection, Iterable iterable) {
        nk.k.e(collection, "<this>");
        nk.k.e(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void X(List list, Object[] objArr) {
        nk.k.e(list, "<this>");
        nk.k.e(objArr, "elements");
        list.addAll(m.I(objArr));
    }

    public static double Y(ArrayList arrayList) {
        int size = arrayList.size();
        double dFloatValue = 0.0d;
        int i4 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            dFloatValue += ((Number) obj).floatValue();
            i4++;
            if (i4 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        if (i4 == 0) {
            return Double.NaN;
        }
        return dFloatValue / i4;
    }

    public static boolean Z(Iterable iterable, Object obj) {
        int iIndexOf;
        nk.k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i4 < 0) {
                    cm.g.N();
                    throw null;
                }
                if (nk.k.a(obj, next)) {
                    iIndexOf = i4;
                    break;
                }
                i4++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    public static List a0(List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return s.f38317a;
        }
        if (size == 1) {
            return cm.g.s(h0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i4 = 1; i4 < size2; i4++) {
                arrayList.add(list.get(i4));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List b0(List list) {
        int size = list.size() - 1;
        int i4 = 0;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(r5.c.h(size, "Requested element count ", " is less than zero.").toString());
        }
        if (size == 0) {
            return s.f38317a;
        }
        if (size >= list.size()) {
            return r0(list);
        }
        if (size == 1) {
            return cm.g.s(c0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i4++;
            if (i4 == size) {
                break;
            }
        }
        return cm.g.F(arrayList);
    }

    public static Object c0(List list) {
        nk.k.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object d0(List list) {
        nk.k.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final void e0(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, mk.c cVar) {
        nk.k.e(iterable, "<this>");
        sb2.append(charSequence2);
        int i4 = 0;
        for (Object obj : iterable) {
            i4++;
            if (i4 > 1) {
                sb2.append(charSequence);
            }
            com.bumptech.glide.e.l(sb2, obj, cVar);
        }
        sb2.append(charSequence3);
    }

    public static String g0(Iterable iterable, String str, String str2, String str3, mk.c cVar, int i4) {
        if ((i4 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i4 & 2) != 0 ? "" : str2;
        String str6 = (i4 & 4) != 0 ? "" : str3;
        if ((i4 & 32) != 0) {
            cVar = null;
        }
        nk.k.e(iterable, "<this>");
        nk.k.e(str5, "prefix");
        StringBuilder sb2 = new StringBuilder();
        e0(iterable, sb2, str4, str5, str6, "...", cVar);
        return sb2.toString();
    }

    public static Object h0(List list) {
        nk.k.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(cm.g.r(list));
    }

    public static Object i0(List list) {
        nk.k.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList j0(Collection collection, Iterable iterable) {
        nk.k.e(collection, "<this>");
        nk.k.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            W(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList k0(Collection collection, Object obj) {
        nk.k.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object l0(AbstractList abstractList) {
        nk.k.e(abstractList, "<this>");
        if (abstractList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return abstractList.remove(cm.g.r(abstractList));
    }

    public static Object m0(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(cm.g.r(abstractList));
    }

    public static List n0(Iterable iterable) {
        nk.k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listT0 = t0(iterable);
            q.U(listT0);
            return listT0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return r0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        nk.k.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return m.I(array);
    }

    public static List o0(Iterable iterable, Comparator comparator) {
        nk.k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listT0 = t0(iterable);
            q.V(listT0, comparator);
            return listT0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return r0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        nk.k.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return m.I(array);
    }

    public static final void p0(Iterable iterable, AbstractCollection abstractCollection) {
        nk.k.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] q0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i4 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            iArr[i4] = ((Number) obj).intValue();
            i4++;
        }
        return iArr;
    }

    public static List r0(Iterable iterable) {
        nk.k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return cm.g.F(t0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return s.f38317a;
        }
        if (size != 1) {
            return s0(collection);
        }
        return cm.g.s(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList s0(Collection collection) {
        nk.k.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List t0(Iterable iterable) {
        nk.k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return s0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        p0(iterable, arrayList);
        return arrayList;
    }

    public static Set u0(Iterable iterable) {
        nk.k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        p0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set v0(Iterable iterable) {
        nk.k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(w.H(collection.size()));
                    p0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                nk.k.d(setSingleton, "singleton(...)");
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            p0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                nk.k.d(setSingleton2, "singleton(...)");
                return setSingleton2;
            }
        }
        return u.f38319a;
    }
}
