package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import java.util.Collection;
import java.util.Queue;

@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class EvictingQueue<E> extends w implements Serializable {
    private static final long serialVersionUID = 0;
    private final Queue<E> delegate;

    @VisibleForTesting
    final int maxSize;

    @Override // com.google.common.collect.q, java.util.Collection, java.util.Queue
    public boolean add(Object obj) {
        com.google.common.base.g.m(obj);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(obj);
        return true;
    }

    @Override // com.google.common.collect.q, java.util.Collection
    public boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return i(collection);
        }
        clear();
        return a0.a(this, a0.e(collection, size - this.maxSize));
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        return add(obj);
    }

    @Override // com.google.common.collect.q, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return super.toArray();
    }

    @Override // com.google.common.collect.q
    public Queue x() {
        return this.delegate;
    }
}
