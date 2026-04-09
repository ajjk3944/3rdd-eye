package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z60 implements Iterator, p40 {
    public String f;
    public boolean g;
    public final /* synthetic */ a70 h;

    public z60(a70 a70Var) {
        this.h = a70Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f == null && !this.g) {
            String line = ((BufferedReader) this.h.b).readLine();
            this.f = line;
            if (line == null) {
                this.g = true;
            }
        }
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f;
        this.f = null;
        i30.j(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
