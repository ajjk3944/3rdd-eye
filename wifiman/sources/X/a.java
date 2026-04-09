package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private int f23973a;

    /* renamed from: b, reason: collision with root package name */
    private int f23974b;

    public a(int i10, int i11) {
        this.f23973a = i10;
        this.f23974b = i11;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void d() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void e() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int f() {
        return this.f23973a;
    }

    public final int g() {
        return this.f23974b;
    }

    public final void h(int i10) {
        this.f23973a = i10;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f23973a < this.f23974b;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f23973a > 0;
    }

    public final void i(int i10) {
        this.f23974b = i10;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f23973a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f23973a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
