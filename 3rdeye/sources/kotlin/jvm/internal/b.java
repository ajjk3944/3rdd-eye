package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import q9.InterfaceC5499a;

/* compiled from: ArrayIterator.kt */
/* loaded from: classes3.dex */
public final class b<T> implements Iterator<T>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final T[] f43647b;

    /* renamed from: c, reason: collision with root package name */
    public int f43648c;

    public b(T[] array) {
        l.f(array, "array");
        this.f43647b = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43648c < this.f43647b.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f43647b;
            int i = this.f43648c;
            this.f43648c = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f43648c--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
