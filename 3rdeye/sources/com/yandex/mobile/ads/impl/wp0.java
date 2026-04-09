package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class wp0 {
    public static void a(Collection collection, qj1 qj1Var) {
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            qj1Var.getClass();
            while (it.hasNext()) {
                if (qj1Var.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        qj1Var.getClass();
        int i = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            if (!qj1Var.apply(obj)) {
                if (i10 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        for (int size = list.size() - 1; size > i10; size--) {
                            if (qj1Var.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        for (int i11 = i10 - 1; i11 >= i; i11--) {
                            list.remove(i11);
                        }
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        for (int size2 = list.size() - 1; size2 > i10; size2--) {
                            if (qj1Var.apply(list.get(size2))) {
                                list.remove(size2);
                            }
                        }
                        for (int i12 = i10 - 1; i12 >= i; i12--) {
                            list.remove(i12);
                        }
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }
}
