package rt;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ot.p;

/* loaded from: classes.dex */
public final class g implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21792a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21793d = true;

    /* renamed from: g, reason: collision with root package name */
    public final Object f21794g;

    public /* synthetic */ g(int i10, Object obj) {
        this.f21792a = i10;
        this.f21794g = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f21792a) {
        }
        return this.f21793d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f21792a) {
            case 0:
                if (!this.f21793d) {
                    throw new NoSuchElementException();
                }
                this.f21793d = false;
                return this.f21794g;
            case 1:
                if (!this.f21793d) {
                    throw new NoSuchElementException();
                }
                this.f21793d = false;
                return this.f21794g;
            default:
                if (!this.f21793d) {
                    throw new NoSuchElementException();
                }
                this.f21793d = false;
                return ((p) this.f21794g).f19820a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f21792a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
