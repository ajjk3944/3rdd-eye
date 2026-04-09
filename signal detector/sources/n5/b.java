package n5;

import d5.q;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import q5.i;

/* loaded from: classes3.dex */
public final class b implements Iterator, r5.a {

    /* renamed from: a, reason: collision with root package name */
    public String f22330a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22331b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f22332c;

    public b(q qVar) {
        this.f22332c = qVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f22330a == null && !this.f22331b) {
            String line = ((BufferedReader) this.f22332c.f19822b).readLine();
            this.f22330a = line;
            if (line == null) {
                this.f22331b = true;
            }
        }
        return this.f22330a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f22330a;
        this.f22330a = null;
        i.b(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
