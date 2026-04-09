package z8;

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

/* loaded from: classes4.dex */
public abstract class z extends y {

    public static final class a implements kotlin.sequences.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f25414a;

        public a(Iterable iterable) {
            this.f25414a = iterable;
        }

        @Override // kotlin.sequences.g
        public Iterator iterator() {
            return this.f25414a.iterator();
        }
    }

    public static kotlin.sequences.g B(Iterable iterable) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        return new a(iterable);
    }

    public static boolean C(Iterable iterable, Object obj) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : K(iterable, obj) >= 0;
    }

    public static List D(Iterable iterable) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        return e0(h0(iterable));
    }

    public static List E(List list, int i10) {
        kotlin.jvm.internal.p.e(list, "<this>");
        if (i10 >= 0) {
            return Z(list, q9.e.b(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final Object F(Iterable iterable) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        if (iterable instanceof List) {
            return G((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object G(List list) {
        kotlin.jvm.internal.p.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object H(Iterable iterable) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
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

    public static Object I(List list) {
        kotlin.jvm.internal.p.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object J(List list, int i10) {
        kotlin.jvm.internal.p.e(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static final int K(Iterable iterable, Object obj) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                r.r();
            }
            if (kotlin.jvm.internal.p.a(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final Appendable L(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, l9.l lVar) throws IOException {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        kotlin.jvm.internal.p.e(buffer, "buffer");
        kotlin.jvm.internal.p.e(separator, "separator");
        kotlin.jvm.internal.p.e(prefix, "prefix");
        kotlin.jvm.internal.p.e(postfix, "postfix");
        kotlin.jvm.internal.p.e(truncated, "truncated");
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
            s9.h.a(buffer, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String N(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, l9.l lVar) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        kotlin.jvm.internal.p.e(separator, "separator");
        kotlin.jvm.internal.p.e(prefix, "prefix");
        kotlin.jvm.internal.p.e(postfix, "postfix");
        kotlin.jvm.internal.p.e(truncated, "truncated");
        return ((StringBuilder) L(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String O(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l9.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l9.l lVar2 = lVar;
        return N(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static Object P(List list) {
        kotlin.jvm.internal.p.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(r.k(list));
    }

    public static Object Q(List list) {
        kotlin.jvm.internal.p.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable R(Iterable iterable) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
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

    public static List S(Iterable iterable, Object obj) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList(s.s(iterable, 10));
        boolean z10 = false;
        for (Object obj2 : iterable) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.p.a(obj2, obj)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List T(Collection collection, Iterable elements) {
        kotlin.jvm.internal.p.e(collection, "<this>");
        kotlin.jvm.internal.p.e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            w.w(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List U(Collection collection, Object obj) {
        kotlin.jvm.internal.p.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object V(Iterable iterable) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        if (iterable instanceof List) {
            return W((List) iterable);
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

    public static final Object W(List list) {
        kotlin.jvm.internal.p.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object X(List list) {
        kotlin.jvm.internal.p.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List Y(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        kotlin.jvm.internal.p.e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listF0 = f0(iterable);
            v.v(listF0, comparator);
            return listF0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return e0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        m.q(array, comparator);
        return m.c(array);
    }

    public static List Z(Iterable iterable, int i10) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return r.j();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return e0(iterable);
            }
            if (i10 == 1) {
                return q.e(F(iterable));
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
        return r.o(arrayList);
    }

    public static List a0(List list, int i10) {
        kotlin.jvm.internal.p.e(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return r.j();
        }
        int size = list.size();
        if (i10 >= size) {
            return e0(list);
        }
        if (i10 == 1) {
            return q.e(P(list));
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

    public static boolean[] b0(Collection collection) {
        kotlin.jvm.internal.p.e(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = ((Boolean) it.next()).booleanValue();
            i10++;
        }
        return zArr;
    }

    public static final Collection c0(Iterable iterable, Collection destination) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        kotlin.jvm.internal.p.e(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static HashSet d0(Iterable iterable) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        return (HashSet) c0(iterable, new HashSet(h0.e(s.s(iterable, 12))));
    }

    public static List e0(Iterable iterable) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return r.o(f0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return r.j();
        }
        if (size != 1) {
            return g0(collection);
        }
        return q.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final List f0(Iterable iterable) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        return iterable instanceof Collection ? g0((Collection) iterable) : (List) c0(iterable, new ArrayList());
    }

    public static List g0(Collection collection) {
        kotlin.jvm.internal.p.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final Set h0(Iterable iterable) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) c0(iterable, new LinkedHashSet());
    }

    public static Set i0(Iterable iterable) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return j0.e((Set) c0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return j0.d();
        }
        if (size != 1) {
            return (Set) c0(iterable, new LinkedHashSet(h0.e(collection.size())));
        }
        return i0.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static List j0(Iterable iterable, Iterable other) {
        kotlin.jvm.internal.p.e(iterable, "<this>");
        kotlin.jvm.internal.p.e(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(s.s(iterable, 10), s.s(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(y8.i.a(it.next(), it2.next()));
        }
        return arrayList;
    }
}
