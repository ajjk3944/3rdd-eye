package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class x extends q implements Set {
    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || x().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return x().hashCode();
    }

    public abstract Set x();

    public boolean y(Collection collection) {
        return Sets.e(this, (Collection) com.google.common.base.g.m(collection));
    }
}
