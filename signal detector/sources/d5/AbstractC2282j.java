package d5;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: d5.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2282j extends p {
    public static double S(ArrayList arrayList) {
        q5.i.e(arrayList, "<this>");
        int size = arrayList.size();
        double dFloatValue = 0.0d;
        int i = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            dFloatValue += ((Number) obj).floatValue();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / i;
    }

    public static Object T(List list) {
        q5.i.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object U(List list) {
        q5.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object V(int i, List list) {
        q5.i.e(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void W(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, p5.l lVar) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : collection) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            com.bumptech.glide.c.a(sb, obj, lVar);
        }
        sb.append(charSequence3);
    }

    public static String X(Collection collection, String str, Q4.e eVar, int i) {
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        if ((i & 32) != 0) {
            eVar = null;
        }
        StringBuilder sb = new StringBuilder();
        W(collection, sb, str, str2, str3, "...", eVar);
        return sb.toString();
    }

    public static Object Y(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC2283k.L(list));
    }

    public static Object Z(List list) {
        q5.i.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable a0(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float b0(Iterable iterable) {
        q5.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Comparable c0(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float d0(ArrayList arrayList) {
        q5.i.e(arrayList, "<this>");
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static ArrayList e0(Collection collection, Iterable iterable) {
        q5.i.e(collection, "<this>");
        q5.i.e(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            p.R(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List f0(Iterable iterable) {
        ArrayList arrayListK0;
        q5.i.e(iterable, "<this>");
        boolean z6 = iterable instanceof Collection;
        if (z6 && ((Collection) iterable).size() <= 1) {
            return j0(iterable);
        }
        if (z6) {
            arrayListK0 = k0((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            h0(iterable, arrayList);
            arrayListK0 = arrayList;
        }
        Collections.reverse(arrayListK0);
        return arrayListK0;
    }

    public static List g0(int i, List list) {
        q5.i.e(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(A.f.h(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return s.f19824a;
        }
        if (i >= list.size()) {
            return j0(list);
        }
        if (i == 1) {
            return a4.p.l(T(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i) {
                break;
            }
        }
        return AbstractC2283k.N(arrayList);
    }

    public static final void h0(Iterable iterable, AbstractCollection abstractCollection) {
        q5.i.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] i0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            iArr[i] = ((Number) obj).intValue();
            i++;
        }
        return iArr;
    }

    public static List j0(Iterable iterable) {
        ArrayList arrayListK0;
        q5.i.e(iterable, "<this>");
        boolean z6 = iterable instanceof Collection;
        if (!z6) {
            if (z6) {
                arrayListK0 = k0((Collection) iterable);
            } else {
                ArrayList arrayList = new ArrayList();
                h0(iterable, arrayList);
                arrayListK0 = arrayList;
            }
            return AbstractC2283k.N(arrayListK0);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return s.f19824a;
        }
        if (size != 1) {
            return k0(collection);
        }
        return a4.p.l(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList k0(Collection collection) {
        q5.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set l0(Iterable iterable) {
        q5.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(v.J(collection.size()));
                    h0(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                q5.i.d(setSingleton, "singleton(...)");
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            h0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                q5.i.d(setSingleton2, "singleton(...)");
                return setSingleton2;
            }
        }
        return u.f19826a;
    }
}
