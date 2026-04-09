package Zg;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import zi.InterfaceC8780j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class C extends B {
    public static boolean C(Collection collection, Iterable elements) {
        AbstractC6492s.i(collection, "<this>");
        AbstractC6492s.i(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean D(Collection collection, InterfaceC8780j elements) {
        AbstractC6492s.i(collection, "<this>");
        AbstractC6492s.i(elements, "elements");
        Iterator it = elements.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean E(Collection collection, Object[] elements) {
        AbstractC6492s.i(collection, "<this>");
        AbstractC6492s.i(elements, "elements");
        return collection.addAll(AbstractC3682n.e(elements));
    }

    public static final Collection F(Iterable iterable) {
        AbstractC6492s.i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = AbstractC3689v.i1(iterable);
        }
        return (Collection) iterable;
    }

    private static final boolean G(Iterable iterable, InterfaceC6835l interfaceC6835l, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC6835l.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    private static final boolean H(List list, InterfaceC6835l interfaceC6835l, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            AbstractC6492s.g(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return G(kotlin.jvm.internal.V.b(list), interfaceC6835l, z10);
        }
        int iN = AbstractC3689v.n(list);
        if (iN >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (((Boolean) interfaceC6835l.invoke(obj)).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i11 == iN) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int iN2 = AbstractC3689v.n(list);
        if (i10 > iN2) {
            return true;
        }
        while (true) {
            list.remove(iN2);
            if (iN2 == i10) {
                return true;
            }
            iN2--;
        }
    }

    public static boolean I(Iterable iterable, InterfaceC6835l predicate) {
        AbstractC6492s.i(iterable, "<this>");
        AbstractC6492s.i(predicate, "predicate");
        return G(iterable, predicate, true);
    }

    public static final boolean J(Collection collection, Iterable elements) {
        AbstractC6492s.i(collection, "<this>");
        AbstractC6492s.i(elements, "elements");
        return collection.removeAll(F(elements));
    }

    public static boolean K(List list, InterfaceC6835l predicate) {
        AbstractC6492s.i(list, "<this>");
        AbstractC6492s.i(predicate, "predicate");
        return H(list, predicate, true);
    }

    public static Object L(List list) {
        AbstractC6492s.i(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object M(List list) {
        AbstractC6492s.i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object N(List list) {
        AbstractC6492s.i(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC3689v.n(list));
    }

    public static final boolean O(Collection collection, Iterable elements) {
        AbstractC6492s.i(collection, "<this>");
        AbstractC6492s.i(elements, "elements");
        return collection.retainAll(F(elements));
    }
}
