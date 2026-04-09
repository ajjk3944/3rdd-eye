package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes2.dex */
public interface e0 extends Collection {

    public interface a {
        Object d();

        int getCount();

        String toString();
    }

    @Override // java.util.Collection, com.google.common.collect.e0
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection collection);

    Set entrySet();

    @Override // com.google.common.collect.e0
    boolean equals(Object obj);

    @Override // com.google.common.collect.e0
    int hashCode();

    Set k();

    int l(Object obj, int i10);

    int m(Object obj, int i10);

    int n(Object obj, int i10);

    boolean p(Object obj, int i10, int i11);

    int r(Object obj);

    @Override // java.util.Collection, com.google.common.collect.e0
    boolean remove(Object obj);

    @Override // java.util.Collection, com.google.common.collect.e0
    int size();
}
