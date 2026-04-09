package Y2;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class H extends L {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4263a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4264b;

    public H(Object obj) {
        this.f4263a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f4264b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4264b) {
            throw new NoSuchElementException();
        }
        this.f4264b = true;
        return this.f4263a;
    }
}
