package v5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class b implements Iterator, r5.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f23897a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23898b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23899c;

    /* renamed from: d, reason: collision with root package name */
    public int f23900d;

    public b(int i, int i3, int i6) {
        this.f23897a = i6;
        this.f23898b = i3;
        boolean z6 = false;
        if (i6 <= 0 ? i >= i3 : i <= i3) {
            z6 = true;
        }
        this.f23899c = z6;
        this.f23900d = z6 ? i : i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23899c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f23900d;
        if (i != this.f23898b) {
            this.f23900d = this.f23897a + i;
        } else {
            if (!this.f23899c) {
                throw new NoSuchElementException();
            }
            this.f23899c = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
