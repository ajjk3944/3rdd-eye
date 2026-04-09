package v9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import q9.InterfaceC5499a;

/* compiled from: ProgressionIterators.kt */
/* renamed from: v9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5686b implements Iterator, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final int f47091b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47092c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f47093d;

    /* renamed from: e, reason: collision with root package name */
    public int f47094e;

    public C5686b(char c10, char c11, int i) {
        this.f47091b = i;
        this.f47092c = c11;
        boolean z10 = false;
        if (i <= 0 ? l.h(c10, c11) >= 0 : l.h(c10, c11) <= 0) {
            z10 = true;
        }
        this.f47093d = z10;
        this.f47094e = z10 ? c10 : c11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47093d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f47094e;
        if (i != this.f47092c) {
            this.f47094e = this.f47091b + i;
        } else {
            if (!this.f47093d) {
                throw new NoSuchElementException();
            }
            this.f47093d = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
