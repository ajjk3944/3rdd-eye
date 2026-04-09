package hr;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10866a;

    /* renamed from: d, reason: collision with root package name */
    public final int f10867d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10868g;

    /* renamed from: r, reason: collision with root package name */
    public int f10869r;

    public c(int i10, int i11, int i12) {
        this.f10866a = i12;
        this.f10867d = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f10868g = z10;
        this.f10869r = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10868g;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i10 = this.f10869r;
        if (i10 != this.f10867d) {
            this.f10869r = this.f10866a + i10;
            return i10;
        }
        if (!this.f10868g) {
            throw new NoSuchElementException();
        }
        this.f10868g = false;
        return i10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
