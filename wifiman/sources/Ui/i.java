package ui;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes4.dex */
public final class i extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final i f63092a = new i();

    public static final class a implements Iterator, InterfaceC6944a {
        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private i() {
        super(null);
    }

    @Override // ui.c
    public int b() {
        return 0;
    }

    @Override // ui.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Void get(int i10) {
        return null;
    }

    @Override // ui.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(int i10, Void value) {
        AbstractC6492s.i(value, "value");
        throw new IllegalStateException();
    }

    @Override // ui.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }
}
