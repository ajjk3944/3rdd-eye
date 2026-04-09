package zi;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* renamed from: zi.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8774d implements InterfaceC8780j, InterfaceC8775e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8780j f67336a;

    /* renamed from: b, reason: collision with root package name */
    private final int f67337b;

    /* renamed from: zi.d$a */
    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f67338a;

        /* renamed from: b, reason: collision with root package name */
        private int f67339b;

        a(C8774d c8774d) {
            this.f67338a = c8774d.f67336a.iterator();
            this.f67339b = c8774d.f67337b;
        }

        private final void d() {
            while (this.f67339b > 0 && this.f67338a.hasNext()) {
                this.f67338a.next();
                this.f67339b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            d();
            return this.f67338a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            d();
            return this.f67338a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8774d(InterfaceC8780j sequence, int i10) {
        AbstractC6492s.i(sequence, "sequence");
        this.f67336a = sequence;
        this.f67337b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // zi.InterfaceC8775e
    public InterfaceC8780j a(int i10) {
        int i11 = this.f67337b;
        int i12 = i11 + i10;
        return i12 < 0 ? new C8796z(this, i10) : new C8795y(this.f67336a, i11, i12);
    }

    @Override // zi.InterfaceC8775e
    public InterfaceC8780j b(int i10) {
        int i11 = this.f67337b + i10;
        return i11 < 0 ? new C8774d(this, i10) : new C8774d(this.f67336a, i11);
    }

    @Override // zi.InterfaceC8780j
    public Iterator iterator() {
        return new a(this);
    }
}
