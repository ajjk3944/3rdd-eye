package c9;

import C6.c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import q9.InterfaceC5499a;

/* compiled from: AbstractIterator.kt */
/* renamed from: c9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2081b<T> implements Iterator<T>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public int f18561b;

    /* renamed from: c, reason: collision with root package name */
    public i7.b f18562c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f18561b;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        this.f18561b = 3;
        c.b bVar = (c.b) this;
        i7.b bVarA = bVar.a();
        if (bVarA != null) {
            bVar.f18562c = bVarA;
            bVar.f18561b = 1;
        } else {
            bVar.f18561b = 2;
        }
        return this.f18561b == 1;
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.f18561b;
        if (i == 1) {
            this.f18561b = 0;
            return (T) this.f18562c;
        }
        if (i != 2) {
            this.f18561b = 3;
            c.b bVar = (c.b) this;
            i7.b bVarA = bVar.a();
            if (bVarA != null) {
                bVar.f18562c = bVarA;
                bVar.f18561b = 1;
            } else {
                bVar.f18561b = 2;
            }
            if (this.f18561b == 1) {
                this.f18561b = 0;
                return (T) this.f18562c;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
