package c9;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import q9.InterfaceC5499a;
import q9.InterfaceC5500b;

/* compiled from: _CollectionsJvm.kt */
/* renamed from: c9.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2095p extends C2094o {
    public static void b0(Iterable elements, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.l.f(abstractCollection, "<this>");
        kotlin.jvm.internal.l.f(elements, "elements");
        if (elements instanceof Collection) {
            abstractCollection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static void c0(Collection collection, Object[] elements) {
        kotlin.jvm.internal.l.f(collection, "<this>");
        kotlin.jvm.internal.l.f(elements, "elements");
        collection.addAll(C2088i.a(elements));
    }

    public static final Collection d0(Iterable iterable) {
        kotlin.jvm.internal.l.f(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : C2097r.G0(iterable);
    }

    public static final boolean e0(Iterable iterable, p9.l lVar, boolean z10) {
        Iterator it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    public static void f0(List list, p9.l predicate) {
        int iV;
        kotlin.jvm.internal.l.f(list, "<this>");
        kotlin.jvm.internal.l.f(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC5499a) && !(list instanceof InterfaceC5500b)) {
                kotlin.jvm.internal.z.d(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                e0(list, predicate, true);
                return;
            } catch (ClassCastException e4) {
                kotlin.jvm.internal.l.j(e4, kotlin.jvm.internal.z.class.getName());
                throw e4;
            }
        }
        int iV2 = C2092m.V(list);
        int i = 0;
        if (iV2 >= 0) {
            int i10 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i10 != i) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i == iV2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i10;
        }
        if (i >= list.size() || i > (iV = C2092m.V(list))) {
            return;
        }
        while (true) {
            list.remove(iV);
            if (iV == i) {
                return;
            } else {
                iV--;
            }
        }
    }

    public static Object g0(AbstractList abstractList) {
        kotlin.jvm.internal.l.f(abstractList, "<this>");
        if (abstractList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return abstractList.remove(C2092m.V(abstractList));
    }

    public static void h0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void i0(List list, Comparator comparator) {
        kotlin.jvm.internal.l.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
