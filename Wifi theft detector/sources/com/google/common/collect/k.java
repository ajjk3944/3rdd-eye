package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class k {
    public static boolean a(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder b(int i10) {
        j.b(i10, "size");
        return new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
    }

    public static boolean c(Collection collection, Object obj) {
        com.google.common.base.g.m(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean d(Collection collection, Object obj) {
        com.google.common.base.g.m(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static String e(Collection collection) {
        StringBuilder sbB = b(collection.size());
        sbB.append('[');
        boolean z10 = true;
        for (Object obj : collection) {
            if (!z10) {
                sbB.append(", ");
            }
            if (obj == collection) {
                sbB.append("(this Collection)");
            } else {
                sbB.append(obj);
            }
            z10 = false;
        }
        sbB.append(']');
        return sbB.toString();
    }
}
