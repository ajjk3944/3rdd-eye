package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class z implements Iterator, p40 {
    public final /* synthetic */ int f = 0;
    public int g;
    public final Object h;

    public z(Object[] objArr) {
        i30.m(objArr, "array");
        this.h = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f) {
            case 0:
                if (this.g < ((c0) this.h).a()) {
                }
                break;
            default:
                if (this.g < ((Object[]) this.h).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                c0 c0Var = (c0) this.h;
                int i = this.g;
                this.g = i + 1;
                return c0Var.get(i);
            default:
                try {
                    Object[] objArr = (Object[]) this.h;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.g--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(c0 c0Var) {
        this.h = c0Var;
    }
}
