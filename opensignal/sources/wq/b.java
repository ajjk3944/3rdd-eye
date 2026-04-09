package wq;

import br.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import mq.n;

/* loaded from: classes.dex */
public final class b implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public String f24584a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24585d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f24586g;

    public b(n nVar) {
        this.f24586g = nVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f24584a == null && !this.f24585d) {
            String line = ((BufferedReader) this.f24586g.f16942b).readLine();
            this.f24584a = line;
            if (line == null) {
                this.f24585d = true;
            }
        }
        return this.f24584a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f24584a;
        this.f24584a = null;
        l.b(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
