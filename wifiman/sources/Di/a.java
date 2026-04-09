package Di;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public abstract class a implements ListIterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private int f3566a;

    /* renamed from: b, reason: collision with root package name */
    private int f3567b;

    public a(int i10, int i11) {
        this.f3566a = i10;
        this.f3567b = i11;
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
        return this.f3566a;
    }

    public final int g() {
        return this.f3567b;
    }

    public final void h(int i10) {
        this.f3566a = i10;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f3566a < this.f3567b;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f3566a > 0;
    }

    public final void i(int i10) {
        this.f3567b = i10;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f3566a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f3566a - 1;
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
