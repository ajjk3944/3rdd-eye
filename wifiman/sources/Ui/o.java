package ui;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public final class o extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f63101a;

    /* renamed from: b, reason: collision with root package name */
    private final int f63102b;

    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f63103a = true;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f63103a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f63103a) {
                throw new NoSuchElementException();
            }
            this.f63103a = false;
            return o.this.g();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object value, int i10) {
        super(null);
        AbstractC6492s.i(value, "value");
        this.f63101a = value;
        this.f63102b = i10;
    }

    @Override // ui.c
    public int b() {
        return 1;
    }

    @Override // ui.c
    public void e(int i10, Object value) {
        AbstractC6492s.i(value, "value");
        throw new IllegalStateException();
    }

    public final int f() {
        return this.f63102b;
    }

    public final Object g() {
        return this.f63101a;
    }

    @Override // ui.c
    public Object get(int i10) {
        if (i10 == this.f63102b) {
            return this.f63101a;
        }
        return null;
    }

    @Override // ui.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }
}
