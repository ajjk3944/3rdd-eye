package zi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* renamed from: zi.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8795y implements InterfaceC8780j, InterfaceC8775e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8780j f67373a;

    /* renamed from: b, reason: collision with root package name */
    private final int f67374b;

    /* renamed from: c, reason: collision with root package name */
    private final int f67375c;

    /* renamed from: zi.y$a */
    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f67376a;

        /* renamed from: b, reason: collision with root package name */
        private int f67377b;

        a() {
            this.f67376a = C8795y.this.f67373a.iterator();
        }

        private final void d() {
            while (this.f67377b < C8795y.this.f67374b && this.f67376a.hasNext()) {
                this.f67376a.next();
                this.f67377b++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            d();
            return this.f67377b < C8795y.this.f67375c && this.f67376a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            d();
            if (this.f67377b >= C8795y.this.f67375c) {
                throw new NoSuchElementException();
            }
            this.f67377b++;
            return this.f67376a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8795y(InterfaceC8780j sequence, int i10, int i11) {
        AbstractC6492s.i(sequence, "sequence");
        this.f67373a = sequence;
        this.f67374b = i10;
        this.f67375c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    private final int f() {
        return this.f67375c - this.f67374b;
    }

    @Override // zi.InterfaceC8775e
    public InterfaceC8780j a(int i10) {
        if (i10 >= f()) {
            return this;
        }
        InterfaceC8780j interfaceC8780j = this.f67373a;
        int i11 = this.f67374b;
        return new C8795y(interfaceC8780j, i11, i10 + i11);
    }

    @Override // zi.InterfaceC8775e
    public InterfaceC8780j b(int i10) {
        return i10 >= f() ? AbstractC8783m.i() : new C8795y(this.f67373a, this.f67374b + i10, this.f67375c);
    }

    @Override // zi.InterfaceC8780j
    public Iterator iterator() {
        return new a();
    }
}
