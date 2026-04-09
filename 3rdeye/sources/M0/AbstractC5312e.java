package m0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import q9.InterfaceC5499a;

/* compiled from: IndexBasedArrayIterator.kt */
/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5312e<T> implements Iterator<T>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public int f44020b;

    /* renamed from: c, reason: collision with root package name */
    public int f44021c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44022d;

    public AbstractC5312e(int i) {
        this.f44020b = i;
    }

    public abstract T a(int i);

    public abstract void c(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44021c < this.f44020b;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tA = a(this.f44021c);
        this.f44021c++;
        this.f44022d = true;
        return tA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f44022d) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f44021c - 1;
        this.f44021c = i;
        c(i);
        this.f44020b--;
        this.f44022d = false;
    }
}
