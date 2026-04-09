package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class a implements Iterator, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f22024a;

    /* renamed from: b, reason: collision with root package name */
    public int f22025b;

    public a(Object[] array) {
        p.e(array, "array");
        this.f22024a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f22025b < this.f22024a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f22024a;
            int i10 = this.f22025b;
            this.f22025b = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f22025b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
