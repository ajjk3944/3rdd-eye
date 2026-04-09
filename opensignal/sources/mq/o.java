package mq;

import androidx.lifecycle.p0;
import com.google.android.gms.internal.measurement.e5;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class o extends t {
    public static Object A0(List list) {
        br.l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList B0(List list, Object obj) {
        br.l.e(list, "<this>");
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        boolean z10 = false;
        for (Object obj2 : list) {
            boolean z11 = true;
            if (!z10 && br.l.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList C0(Iterable iterable, Iterable iterable2) {
        br.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return E0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        t.d0(arrayList, iterable);
        t.d0(arrayList, iterable2);
        return arrayList;
    }

    public static ArrayList D0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return F0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        t.d0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList E0(Collection collection, Iterable iterable) {
        br.l.e(collection, "<this>");
        br.l.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            t.d0(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList F0(Collection collection, Object obj) {
        br.l.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object G0(Collection collection) {
        fr.a aVar = fr.d.f9050a;
        br.l.e(collection, "<this>");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Collection collection2 = collection;
        final int iE = fr.d.f9050a.e(collection.size());
        boolean z10 = collection2 instanceof List;
        if (z10) {
            return ((List) collection2).get(iE);
        }
        ar.k kVar = new ar.k() { // from class: mq.u
            @Override // ar.k
            public final Object a(Object obj) {
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + iE + '.');
            }
        };
        if (z10) {
            List list = (List) collection2;
            if (iE >= 0 && iE < list.size()) {
                return list.get(iE);
            }
            kVar.a(Integer.valueOf(iE));
            throw null;
        }
        if (iE < 0) {
            kVar.a(Integer.valueOf(iE));
            throw null;
        }
        int i10 = 0;
        for (Object obj : collection2) {
            int i11 = i10 + 1;
            if (iE == i10) {
                return obj;
            }
            i10 = i11;
        }
        kVar.a(Integer.valueOf(iE));
        throw null;
    }

    public static Object H0(Iterable iterable) {
        br.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return I0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object I0(List list) {
        br.l.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object J0(Iterable iterable) {
        br.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object K0(List list) {
        br.l.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List L0(Iterable iterable) {
        br.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listS0 = S0(iterable);
            s.b0(listS0);
            return listS0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Q0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        br.l.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return l.X(array);
    }

    public static List M0(Iterable iterable, Comparator comparator) {
        br.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listS0 = S0(iterable);
            s.c0(listS0, comparator);
            return listS0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return Q0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        l.y0(array, comparator);
        return l.X(array);
    }

    public static List N0(int i10, List list) {
        br.l.e(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(h0.b.m("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return w.f16945a;
        }
        if (i10 >= list.size()) {
            return Q0(list);
        }
        if (i10 == 1) {
            return e5.H(q0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return e5.L(arrayList);
    }

    public static final void O0(Iterable iterable, AbstractCollection abstractCollection) {
        br.l.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] P0(ArrayList arrayList) {
        br.l.e(arrayList, "<this>");
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List Q0(Iterable iterable) {
        br.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return e5.L(S0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return w.f16945a;
        }
        if (size != 1) {
            return R0(collection);
        }
        return e5.H(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList R0(Collection collection) {
        br.l.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List S0(Iterable iterable) {
        br.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return R0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        O0(iterable, arrayList);
        return arrayList;
    }

    public static Set T0(Iterable iterable) {
        br.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        O0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set U0(Iterable iterable) {
        br.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return i3.g.H(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(b0.P(collection.size()));
                O0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            O0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : i3.g.H(linkedHashSet2.iterator().next());
            }
        }
        return y.f16947a;
    }

    public static iu.g V0(List list) {
        br.l.e(list, "<this>");
        return new iu.g(2, new p0(12, list));
    }

    public static ArrayList W0(List list, List list2) {
        br.l.e(list, "<this>");
        br.l.e(list2, "other");
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(p.a0(list, 10), p.a0(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new lq.l(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int h0(int i10, List list) {
        if (i10 >= 0 && i10 <= e5.z(list)) {
            return e5.z(list) - i10;
        }
        StringBuilder sbU = h0.b.u("Element index ", i10, " must be in range [");
        sbU.append(new hr.d(0, e5.z(list), 1));
        sbU.append("].");
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public static final int i0(int i10, List list) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        StringBuilder sbU = h0.b.u("Position index ", i10, " must be in range [");
        sbU.append(new hr.d(0, list.size(), 1));
        sbU.append("].");
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public static n j0(Iterable iterable) {
        br.l.e(iterable, "<this>");
        return new n(1, iterable);
    }

    public static boolean k0(Iterable iterable, Object obj) {
        int iIndexOf;
        br.l.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i10 < 0) {
                    e5.Q();
                    throw null;
                }
                if (br.l.a(obj, next)) {
                    iIndexOf = i10;
                    break;
                }
                i10++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    public static List l0(Iterable iterable) {
        br.l.e(iterable, "<this>");
        return Q0(T0(iterable));
    }

    public static List m0(int i10, List list) {
        br.l.e(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(h0.b.m("Requested element count ", i10, " is less than zero.").toString());
        }
        if (i10 == 0) {
            return Q0(list);
        }
        int size = list.size() - i10;
        if (size <= 0) {
            return w.f16945a;
        }
        if (size == 1) {
            return e5.H(y0(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            while (i10 < size2) {
                arrayList.add(list.get(i10));
                i10++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List n0(List list) {
        br.l.e(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return N0(size, list);
    }

    public static ArrayList o0(ArrayList arrayList, Class cls) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (cls.isInstance(next)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static ArrayList p0(Iterable iterable) {
        br.l.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object q0(Iterable iterable) {
        br.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return r0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object r0(List list) {
        br.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object s0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object t0(List list) {
        br.l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object u0(int i10, List list) {
        br.l.e(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static final void v0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ar.k kVar) throws IOException {
        br.l.e(iterable, "<this>");
        br.l.e(appendable, "buffer");
        br.l.e(charSequence2, "prefix");
        br.l.e(charSequence3, "postfix");
        appendable.append(charSequence2);
        int i10 = 0;
        for (Object obj : iterable) {
            i10++;
            if (i10 > 1) {
                appendable.append(charSequence);
            }
            e5.c(appendable, obj, kVar);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void w0(Iterable iterable, StringBuilder sb2, String str, String str2, String str3, ar.k kVar, int i10) throws IOException {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        if ((i10 & 8) != 0) {
            str3 = "";
        }
        if ((i10 & 64) != 0) {
            kVar = null;
        }
        v0(iterable, sb2, str, str2, str3, "...", kVar);
    }

    public static String x0(Iterable iterable, String str, String str2, String str3, ar.k kVar, int i10) throws IOException {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i10 & 2) != 0 ? "" : str2;
        String str6 = (i10 & 4) != 0 ? "" : str3;
        if ((i10 & 32) != 0) {
            kVar = null;
        }
        br.l.e(iterable, "<this>");
        br.l.e(str5, "prefix");
        StringBuilder sb2 = new StringBuilder();
        v0(iterable, sb2, str4, str5, str6, "...", kVar);
        return sb2.toString();
    }

    public static Object y0(Iterable iterable) {
        br.l.e(iterable, "<this>");
        if (iterable instanceof List) {
            return z0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object z0(List list) {
        br.l.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(e5.z(list));
    }
}
