package oe;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public enum n0 implements Iterator {
    INSTANCE;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        ba.m.n("no calls to next() since the last call to remove()", false);
    }
}
