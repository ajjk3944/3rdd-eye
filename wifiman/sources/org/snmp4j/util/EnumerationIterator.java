package org.snmp4j.util;

import java.util.Enumeration;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class EnumerationIterator<E> implements Iterator<E> {

    /* renamed from: e, reason: collision with root package name */
    private Enumeration<E> f57148e;

    public EnumerationIterator(Enumeration<E> enumeration) {
        this.f57148e = enumeration;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f57148e.hasMoreElements();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.f57148e.nextElement();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
