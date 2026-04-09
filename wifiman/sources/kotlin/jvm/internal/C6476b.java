package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import nh.InterfaceC6944a;

/* renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6476b implements Iterator, InterfaceC6944a {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f51711a;

    /* renamed from: b, reason: collision with root package name */
    private int f51712b;

    public C6476b(Object[] array) {
        AbstractC6492s.i(array, "array");
        this.f51711a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f51712b < this.f51711a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f51711a;
            int i10 = this.f51712b;
            this.f51712b = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f51712b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
