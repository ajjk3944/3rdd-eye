package hj;

import java.util.NoSuchElementException;

/* renamed from: hj.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC6049a {
    protected AbstractC6049a() {
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException("Iterator contains no elements");
    }

    public void remove() {
        throw new IllegalStateException("Iterator contains no elements");
    }
}
