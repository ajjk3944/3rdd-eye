package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mp2 extends yq2 {
    public final Object g;
    public boolean h;

    public mp2(Object obj) {
        super(0);
        this.g = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.h;
    }

    @Override // defpackage.yq2, java.util.Iterator
    public final Object next() {
        if (this.h) {
            throw new NoSuchElementException();
        }
        this.h = true;
        return this.g;
    }
}
