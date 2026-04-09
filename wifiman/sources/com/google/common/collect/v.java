package com.google.common.collect;

import java.util.Collection;

/* loaded from: classes3.dex */
public abstract class v {
    private static Collection a(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : x.g(iterable.iterator());
    }

    static Object[] b(Iterable iterable) {
        return a(iterable).toArray();
    }
}
