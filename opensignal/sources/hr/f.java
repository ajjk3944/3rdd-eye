package hr;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f10874a;

    /* renamed from: d, reason: collision with root package name */
    public final long f10875d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10876g;

    /* renamed from: r, reason: collision with root package name */
    public long f10877r;

    public f(long j, long j7, long j10) {
        this.f10874a = j10;
        this.f10875d = j7;
        boolean z10 = false;
        if (j10 <= 0 ? j >= j7 : j <= j7) {
            z10 = true;
        }
        this.f10876g = z10;
        this.f10877r = z10 ? j : j7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10876g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f10877r;
        if (j != this.f10875d) {
            this.f10877r = this.f10874a + j;
        } else {
            if (!this.f10876g) {
                throw new NoSuchElementException();
            }
            this.f10876g = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
