package zi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* renamed from: zi.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8796z implements InterfaceC8780j, InterfaceC8775e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8780j f67379a;

    /* renamed from: b, reason: collision with root package name */
    private final int f67380b;

    /* renamed from: zi.z$a */
    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private int f67381a;

        /* renamed from: b, reason: collision with root package name */
        private final Iterator f67382b;

        a(C8796z c8796z) {
            this.f67381a = c8796z.f67380b;
            this.f67382b = c8796z.f67379a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67381a > 0 && this.f67382b.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f67381a;
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            this.f67381a = i10 - 1;
            return this.f67382b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8796z(InterfaceC8780j sequence, int i10) {
        AbstractC6492s.i(sequence, "sequence");
        this.f67379a = sequence;
        this.f67380b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // zi.InterfaceC8775e
    public InterfaceC8780j a(int i10) {
        return i10 >= this.f67380b ? this : new C8796z(this.f67379a, i10);
    }

    @Override // zi.InterfaceC8775e
    public InterfaceC8780j b(int i10) {
        int i11 = this.f67380b;
        return i10 >= i11 ? AbstractC8783m.i() : new C8795y(this.f67379a, i10, i11);
    }

    @Override // zi.InterfaceC8780j
    public Iterator iterator() {
        return new a(this);
    }
}
