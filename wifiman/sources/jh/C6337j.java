package jh;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;
import zi.InterfaceC8780j;

/* renamed from: jh.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6337j implements InterfaceC8780j {

    /* renamed from: a, reason: collision with root package name */
    private final BufferedReader f50865a;

    /* renamed from: jh.j$a */
    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private String f50866a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f50867b;

        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f50866a;
            this.f50866a = null;
            AbstractC6492s.f(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f50866a == null && !this.f50867b) {
                String line = C6337j.this.f50865a.readLine();
                this.f50866a = line;
                if (line == null) {
                    this.f50867b = true;
                }
            }
            return this.f50866a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C6337j(BufferedReader reader) {
        AbstractC6492s.i(reader, "reader");
        this.f50865a = reader;
    }

    @Override // zi.InterfaceC8780j
    public Iterator iterator() {
        return new a();
    }
}
