package sk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements Iterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f33820a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33821b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33822c;

    /* renamed from: d, reason: collision with root package name */
    public int f33823d;

    public c(int i4, int i10, int i11) {
        this.f33820a = i11;
        this.f33821b = i10;
        boolean z3 = false;
        if (i11 <= 0 ? i4 >= i10 : i4 <= i10) {
            z3 = true;
        }
        this.f33822c = z3;
        this.f33823d = z3 ? i4 : i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33822c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i4 = this.f33823d;
        if (i4 != this.f33821b) {
            this.f33823d = this.f33820a + i4;
            return i4;
        }
        if (!this.f33822c) {
            throw new NoSuchElementException();
        }
        this.f33822c = false;
        return i4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
