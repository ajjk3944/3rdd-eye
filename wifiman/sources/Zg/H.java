package Zg;

import ch.AbstractC4260a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import qh.AbstractC7510c;
import sh.AbstractC7978m;
import sh.C7974i;
import zi.InterfaceC8780j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class H extends E {

    public static final class a implements InterfaceC8780j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f25335a;

        public a(Iterable iterable) {
            this.f25335a = iterable;
        }

        @Override // zi.InterfaceC8780j
        public Iterator iterator() {
            return this.f25335a.iterator();
        }
    }

    public static Object A0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        if (iterable instanceof List) {
            return AbstractC3689v.B0((List) iterable);
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

    public static Object B0(List list) {
        AbstractC6492s.i(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC3689v.n(list));
    }

    public static Object C0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object D0(List list) {
        AbstractC6492s.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List E0(Iterable iterable, InterfaceC6835l transform) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(transform, "transform");
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static Comparable F0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        Iterator it = iterable.iterator();
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

    public static Float G0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
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

    public static Comparable H0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        Iterator it = iterable.iterator();
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

    public static Float I0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static List J0(Iterable iterable, Object obj) {
        AbstractC6492s.i(iterable, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && AbstractC6492s.d(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List K0(Iterable iterable, Iterable elements) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(elements, "elements");
        if (iterable instanceof Collection) {
            return AbstractC3689v.M0((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC3689v.C(arrayList, iterable);
        AbstractC3689v.C(arrayList, elements);
        return arrayList;
    }

    public static List L0(Iterable iterable, Object obj) {
        AbstractC6492s.i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return AbstractC3689v.N0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        AbstractC3689v.C(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static List M0(Collection collection, Iterable elements) {
        AbstractC6492s.i(collection, "<this>");
        AbstractC6492s.i(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC3689v.C(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List N0(Collection collection, Object obj) {
        AbstractC6492s.i(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object O0(Collection collection, AbstractC7510c random) {
        AbstractC6492s.i(collection, "<this>");
        AbstractC6492s.i(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return j0(collection, random.g(collection.size()));
    }

    public static List P0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return AbstractC3689v.i1(iterable);
        }
        List listK1 = k1(iterable);
        AbstractC3689v.X(listK1);
        return listK1;
    }

    public static Object Q0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        if (iterable instanceof List) {
            return AbstractC3689v.R0((List) iterable);
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

    public static Object R0(List list) {
        AbstractC6492s.i(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object S0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
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

    public static Object T0(List list) {
        AbstractC6492s.i(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List U0(List list, C7974i indices) {
        AbstractC6492s.i(list, "<this>");
        AbstractC6492s.i(indices, "indices");
        return indices.isEmpty() ? AbstractC3689v.l() : AbstractC3689v.i1(list.subList(indices.e().intValue(), indices.g().intValue() + 1));
    }

    public static List V0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listK1 = k1(iterable);
            AbstractC3689v.A(listK1);
            return listK1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return AbstractC3689v.i1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        AbstractC3682n.H((Comparable[]) array);
        return AbstractC3682n.e(array);
    }

    public static List W0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        return AbstractC3689v.X0(iterable, AbstractC4260a.h());
    }

    public static List X0(Iterable iterable, Comparator comparator) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listK1 = k1(iterable);
            AbstractC3689v.B(listK1, comparator);
            return listK1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return AbstractC3689v.i1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC3685q.I(array, comparator);
        return AbstractC3682n.e(array);
    }

    public static Set Y0(Iterable iterable, Iterable other) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(other, "other");
        Set setM1 = AbstractC3689v.m1(iterable);
        C.J(setM1, other);
        return setM1;
    }

    public static int Z0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        Iterator it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    public static List a1(Iterable iterable, int i10) {
        AbstractC6492s.i(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC3689v.l();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return AbstractC3689v.i1(iterable);
            }
            if (i10 == 1) {
                return AbstractC3689v.e(AbstractC3689v.p0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return AbstractC3691x.s(arrayList);
    }

    public static List b1(List list, int i10) {
        AbstractC6492s.i(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC3689v.l();
        }
        int size = list.size();
        if (i10 >= size) {
            return AbstractC3689v.i1(list);
        }
        if (i10 == 1) {
            return AbstractC3689v.e(AbstractC3689v.B0(list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean c0(Iterable iterable, InterfaceC6835l predicate) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean[] c1(Collection collection) {
        AbstractC6492s.i(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        return zArr;
    }

    public static InterfaceC8780j d0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        return new a(iterable);
    }

    public static byte[] d1(Collection collection) {
        AbstractC6492s.i(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = ((Number) it.next()).byteValue();
            i10++;
        }
        return bArr;
    }

    public static double e0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        Iterator it = iterable.iterator();
        double dIntValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dIntValue += ((Number) it.next()).intValue();
            i10++;
            if (i10 < 0) {
                AbstractC3689v.u();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dIntValue / i10;
    }

    public static final Collection e1(Iterable iterable, Collection destination) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static boolean f0(Iterable iterable, Object obj) {
        AbstractC6492s.i(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : AbstractC3689v.u0(iterable, obj) >= 0;
    }

    public static float[] f1(Collection collection) {
        AbstractC6492s.i(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = ((Number) it.next()).floatValue();
            i10++;
        }
        return fArr;
    }

    public static List g0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        return AbstractC3689v.i1(AbstractC3689v.m1(iterable));
    }

    public static HashSet g1(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        return (HashSet) e1(iterable, new HashSet(U.d(AbstractC3689v.w(iterable, 12))));
    }

    public static List h0(Iterable iterable, int i10) {
        ArrayList arrayList;
        AbstractC6492s.i(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC3689v.i1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return AbstractC3689v.l();
            }
            if (size == 1) {
                return AbstractC3689v.e(AbstractC3689v.A0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= i10) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return AbstractC3691x.s(arrayList);
    }

    public static int[] h1(Collection collection) {
        AbstractC6492s.i(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List i0(List list, int i10) {
        AbstractC6492s.i(list, "<this>");
        if (i10 >= 0) {
            return AbstractC3689v.a1(list, AbstractC7978m.d(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static List i1(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC3691x.s(k1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC3689v.l();
        }
        if (size != 1) {
            return AbstractC3689v.l1(collection);
        }
        return AbstractC3689v.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final Object j0(Iterable iterable, final int i10) {
        AbstractC6492s.i(iterable, "<this>");
        return iterable instanceof List ? ((List) iterable).get(i10) : l0(iterable, i10, new InterfaceC6835l() { // from class: Zg.G
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return H.k0(i10, ((Integer) obj).intValue());
            }
        });
    }

    public static long[] j1(Collection collection) {
        AbstractC6492s.i(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k0(int i10, int i11) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i10 + '.');
    }

    public static final List k1(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        return iterable instanceof Collection ? AbstractC3689v.l1((Collection) iterable) : (List) e1(iterable, new ArrayList());
    }

    public static final Object l0(Iterable iterable, int i10, InterfaceC6835l defaultValue) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i10 < 0 || i10 >= list.size()) ? defaultValue.invoke(Integer.valueOf(i10)) : list.get(i10);
        }
        if (i10 < 0) {
            return defaultValue.invoke(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (Object obj : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return obj;
            }
            i11 = i12;
        }
        return defaultValue.invoke(Integer.valueOf(i10));
    }

    public static List l1(Collection collection) {
        AbstractC6492s.i(collection, "<this>");
        return new ArrayList(collection);
    }

    public static List m0(Iterable iterable, InterfaceC6835l predicate) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Set m1(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) e1(iterable, new LinkedHashSet());
    }

    public static List n0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        return (List) o0(iterable, new ArrayList());
    }

    public static Set n1(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return f0.h((Set) e1(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d0.e();
        }
        if (size != 1) {
            return (Set) e1(iterable, new LinkedHashSet(U.d(collection.size())));
        }
        return d0.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final Collection o0(Iterable iterable, Collection destination) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Set o1(Iterable iterable, Iterable other) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(other, "other");
        Set setM1 = AbstractC3689v.m1(iterable);
        AbstractC3689v.C(setM1, other);
        return setM1;
    }

    public static Object p0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        if (iterable instanceof List) {
            return AbstractC3689v.q0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static List p1(Iterable iterable, int i10, int i11, boolean z10) {
        AbstractC6492s.i(iterable, "<this>");
        h0.a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = h0.b(iterable.iterator(), i10, i11, z10, false);
            while (itB.hasNext()) {
                arrayList.add((List) itB.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (i12 >= 0 && i12 < size) {
            int iG = AbstractC7978m.g(i10, size - i12);
            if (iG < i10 && !z10) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iG);
            for (int i13 = 0; i13 < iG; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    public static Object q0(List list) {
        AbstractC6492s.i(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Iterable q1(final Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        return new O(new InterfaceC6824a() { // from class: Zg.F
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return H.r1(iterable);
            }
        });
    }

    public static Object r0(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator r1(Iterable iterable) {
        return iterable.iterator();
    }

    public static Object s0(List list) {
        AbstractC6492s.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static List s1(Iterable iterable, Iterable other) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC3689v.w(iterable, 10), AbstractC3689v.w(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(Yg.z.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Object t0(List list, int i10) {
        AbstractC6492s.i(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static int u0(Iterable iterable, Object obj) {
        AbstractC6492s.i(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                AbstractC3689v.v();
            }
            if (AbstractC6492s.d(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static Set v0(Iterable iterable, Iterable other) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(other, "other");
        Set setM1 = AbstractC3689v.m1(iterable);
        C.O(setM1, other);
        return setM1;
    }

    public static final Appendable w0(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) throws IOException {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(buffer, "buffer");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            kotlin.text.t.a(buffer, obj, interfaceC6835l);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String y0(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC6835l interfaceC6835l) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(separator, "separator");
        AbstractC6492s.i(prefix, "prefix");
        AbstractC6492s.i(postfix, "postfix");
        AbstractC6492s.i(truncated, "truncated");
        return ((StringBuilder) w0(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, interfaceC6835l)).toString();
    }

    public static /* synthetic */ String z0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC6835l interfaceC6835l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC6835l = null;
        }
        return y0(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC6835l);
    }
}
