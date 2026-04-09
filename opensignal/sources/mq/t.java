package mq;

import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class t extends s {
    public static void d0(Collection collection, Iterable iterable) {
        br.l.e(collection, "<this>");
        br.l.e(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static boolean e0(List list, ar.k kVar) {
        int i10;
        br.l.e(list, "<this>");
        boolean z10 = false;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof cr.a) && !(list instanceof cr.b)) {
                br.b0.f(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Boolean) kVar.a(it.next())).booleanValue()) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        int iZ = e5.z(list);
        if (iZ >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                Object obj = list.get(i11);
                if (!((Boolean) kVar.a(obj)).booleanValue()) {
                    if (i10 != i11) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i11 == iZ) {
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
        int iZ2 = e5.z(list);
        if (i10 <= iZ2) {
            while (true) {
                list.remove(iZ2);
                if (iZ2 == i10) {
                    break;
                }
                iZ2--;
            }
        }
        return true;
    }

    public static Object f0(List list) {
        br.l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static void g0(ArrayList arrayList) {
        br.l.e(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        arrayList.remove(e5.z(arrayList));
    }
}
