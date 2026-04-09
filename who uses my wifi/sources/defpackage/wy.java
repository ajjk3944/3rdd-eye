package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wy implements Iterator, p40 {
    public Object f;
    public int g = -2;
    public final /* synthetic */ fo h;

    public wy(fo foVar) {
        this.h = foVar;
    }

    public final void a() {
        Object objG;
        int i = this.g;
        fo foVar = this.h;
        if (i == -2) {
            objG = ((o2) foVar.b).a();
        } else {
            m mVar = (m) foVar.c;
            Object obj = this.f;
            i30.j(obj);
            objG = mVar.g(obj);
        }
        this.f = objG;
        this.g = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g < 0) {
            a();
        }
        return this.g == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g < 0) {
            a();
        }
        if (this.g == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f;
        i30.k(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.g = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
