package r;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class g implements Iterator, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public int f24115a;

    /* renamed from: b, reason: collision with root package name */
    public int f24116b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24117c;

    public g(int i10) {
        this.f24115a = i10;
    }

    public abstract Object a(int i10);

    public abstract void c(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f24116b < this.f24115a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.f24116b);
        this.f24116b++;
        this.f24117c = true;
        return objA;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f24117c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f24116b - 1;
        this.f24116b = i10;
        c(i10);
        this.f24115a--;
        this.f24117c = false;
    }
}
