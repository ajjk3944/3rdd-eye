package z8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class c implements Iterator, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public int f25395a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25396b;

    public abstract void a();

    public final void c() {
        this.f25395a = 2;
    }

    public final void d(Object obj) {
        this.f25396b = obj;
        this.f25395a = 1;
    }

    public final boolean e() {
        this.f25395a = 3;
        a();
        return this.f25395a == 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f25395a;
        if (i10 == 0) {
            return e();
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
        int i10 = this.f25395a;
        if (i10 == 1) {
            this.f25395a = 0;
            return this.f25396b;
        }
        if (i10 == 2 || !e()) {
            throw new NoSuchElementException();
        }
        this.f25395a = 0;
        return this.f25396b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
