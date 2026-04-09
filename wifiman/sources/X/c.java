package X;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f23976c;

    public c(Object[] objArr, int i10, int i11) {
        super(i10, i11);
        this.f23976c = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f23976c;
        int iF = f();
        h(iF + 1);
        return objArr[iF];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.f23976c;
        h(f() - 1);
        return objArr[f()];
    }
}
