package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class y extends x implements SortedSet {
    @Override // java.util.SortedSet
    public Comparator comparator() {
        return d().comparator();
    }

    @Override // java.util.SortedSet
    public Object first() {
        return d().first();
    }

    @Override // java.util.SortedSet
    public SortedSet headSet(Object obj) {
        return d().headSet(obj);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return d().last();
    }

    @Override // java.util.SortedSet
    public SortedSet subSet(Object obj, Object obj2) {
        return d().subSet(obj, obj2);
    }

    @Override // java.util.SortedSet
    public SortedSet tailSet(Object obj) {
        return d().tailSet(obj);
    }

    /* renamed from: z */
    public abstract SortedSet d();
}
