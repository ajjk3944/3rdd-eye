package Zg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import nh.InterfaceC6944a;

/* renamed from: Zg.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3671c implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private int f25352a;

    /* renamed from: b, reason: collision with root package name */
    private Object f25353b;

    private final boolean g() {
        this.f25352a = 3;
        d();
        return this.f25352a == 1;
    }

    protected abstract void d();

    protected final void e() {
        this.f25352a = 2;
    }

    protected final void f(Object obj) {
        this.f25353b = obj;
        this.f25352a = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f25352a;
        if (i10 == 0) {
            return g();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f25352a;
        if (i10 == 1) {
            this.f25352a = 0;
            return this.f25353b;
        }
        if (i10 == 2 || !g()) {
            throw new NoSuchElementException();
        }
        this.f25352a = 0;
        return this.f25353b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
