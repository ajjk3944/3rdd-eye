package i9;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class j implements kotlin.sequences.g {

    /* renamed from: a, reason: collision with root package name */
    public final BufferedReader f21670a;

    public static final class a implements Iterator, m9.a {

        /* renamed from: a, reason: collision with root package name */
        public String f21671a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f21672b;

        public a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f21671a;
            this.f21671a = null;
            p.b(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f21671a == null && !this.f21672b) {
                String line = j.this.f21670a.readLine();
                this.f21671a = line;
                if (line == null) {
                    this.f21672b = true;
                }
            }
            return this.f21671a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public j(BufferedReader reader) {
        p.e(reader, "reader");
        this.f21670a = reader;
    }

    @Override // kotlin.sequences.g
    public Iterator iterator() {
        return new a();
    }
}
