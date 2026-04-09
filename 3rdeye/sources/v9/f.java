package v9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import q9.InterfaceC5499a;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes3.dex */
public final class f implements Iterator, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final int f47099b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47100c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f47101d;

    /* renamed from: e, reason: collision with root package name */
    public int f47102e;

    public f(int i, int i10, int i11) {
        this.f47099b = i11;
        this.f47100c = i10;
        boolean z10 = false;
        if (i11 <= 0 ? i >= i10 : i <= i10) {
            z10 = true;
        }
        this.f47101d = z10;
        this.f47102e = z10 ? i : i10;
    }

    public final int a() {
        int i = this.f47102e;
        if (i != this.f47100c) {
            this.f47102e = this.f47099b + i;
            return i;
        }
        if (!this.f47101d) {
            throw new NoSuchElementException();
        }
        this.f47101d = false;
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47101d;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
