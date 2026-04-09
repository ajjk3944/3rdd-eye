package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class r extends v implements Iterator {
    public abstract Iterator h();

    @Override // java.util.Iterator
    public boolean hasNext() {
        return h().hasNext();
    }

    public Object next() {
        return h().next();
    }
}
