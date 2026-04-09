package c9;

import g0.C4356c;
import java.util.AbstractCollection;
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

/* compiled from: _Collections.kt */
/* renamed from: c9.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2097r extends C2095p {
    public static <T> List<T> A0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return G0(iterable);
        }
        List<T> listJ0 = J0(iterable);
        Collections.reverse(listJ0);
        return listJ0;
    }

    public static <T extends Comparable<? super T>> List<T> B0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listJ0 = J0(iterable);
            C2095p.h0(listJ0);
            return listJ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return G0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.l.f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return C2088i.a(array);
    }

    public static List C0(Comparator comparator, Iterable iterable) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listJ0 = J0(iterable);
            C2095p.i0(listJ0, comparator);
            return listJ0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return G0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        kotlin.jvm.internal.l.f(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return C2088i.a(array);
    }

    public static List D0(int i, List list) {
        kotlin.jvm.internal.l.f(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(C4356c.i(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return C2099t.f18581b;
        }
        if (list instanceof Collection) {
            if (i >= list.size()) {
                return G0(list);
            }
            if (i == 1) {
                return E.u.G(o0(list));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i10++;
            if (i10 == i) {
                break;
            }
        }
        return C2092m.Y(arrayList);
    }

    public static final void E0(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] F0(Collection<Integer> collection) {
        kotlin.jvm.internal.l.f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static <T> List<T> G0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C2092m.Y(J0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C2099t.f18581b;
        }
        if (size != 1) {
            return I0(collection);
        }
        return E.u.G(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] H0(Collection<Long> collection) {
        kotlin.jvm.internal.l.f(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList I0(Collection collection) {
        kotlin.jvm.internal.l.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> List<T> J0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return I0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        E0(iterable, arrayList);
        return arrayList;
    }

    public static <T> Set<T> K0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        E0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Set<T> L0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        C2101v c2101v = C2101v.f18583b;
        if (z10) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return C2079C.d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(C2077A.l(collection.size()));
                E0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            E0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : C2079C.d(linkedHashSet2.iterator().next());
            }
        }
        return c2101v;
    }

    public static ArrayList M0(Iterable iterable, List list) {
        Iterator it = list.iterator();
        Iterator it2 = iterable.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C2092m.T(list, 10), C2092m.T(iterable, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new b9.l(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static C2096q j0(Iterable iterable) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        return new C2096q(iterable);
    }

    public static <T> boolean k0(Iterable<? extends T> iterable, T t10) {
        int iIndexOf;
        kotlin.jvm.internal.l.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t10);
        }
        if (!(iterable instanceof List)) {
            Iterator<? extends T> it = iterable.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                T next = it.next();
                if (i < 0) {
                    C2092m.a0();
                    throw null;
                }
                if (kotlin.jvm.internal.l.b(t10, next)) {
                    iIndexOf = i;
                    break;
                }
                i++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(t10);
        }
        return iIndexOf >= 0;
    }

    public static List l0(Iterable iterable) {
        ArrayList arrayList;
        Object objV0;
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - 1;
            if (size <= 0) {
                return C2099t.f18581b;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    objV0 = v0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objV0 = next;
                }
                return E.u.G(objV0);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    for (int i = 1; i < size2; i++) {
                        arrayList.add(list.get(i));
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i10 = 0;
        for (Object obj : iterable) {
            if (i10 >= 1) {
                arrayList.add(obj);
            } else {
                i10++;
            }
        }
        return C2092m.Y(arrayList);
    }

    public static List m0(List list) {
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return D0(size, list2);
    }

    public static ArrayList n0(Iterable iterable) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static <T> T o0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) p0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T p0(List<? extends T> list) {
        kotlin.jvm.internal.l.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> T q0(List<? extends T> list) {
        kotlin.jvm.internal.l.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object r0(int i, List list) {
        kotlin.jvm.internal.l.f(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void s0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, p9.l lVar) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            com.google.gson.internal.c.d(sb, obj, lVar);
        }
        sb.append(charSequence3);
    }

    public static String u0(Iterable iterable, String str, String str2, String str3, p9.l lVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.l.f(iterable, "<this>");
        kotlin.jvm.internal.l.f(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        s0(iterable, sb, str4, prefix, str5, "...", lVar);
        return sb.toString();
    }

    public static <T> T v0(List<? extends T> list) {
        kotlin.jvm.internal.l.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(C2092m.V(list));
    }

    public static <T> T w0(List<? extends T> list) {
        kotlin.jvm.internal.l.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T extends Comparable<? super T>> T x0(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static ArrayList y0(Iterable elements, Collection collection) {
        kotlin.jvm.internal.l.f(collection, "<this>");
        kotlin.jvm.internal.l.f(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            C2095p.b0(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList z0(Collection collection, Object obj) {
        kotlin.jvm.internal.l.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }
}
