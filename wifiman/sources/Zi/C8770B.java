package zi;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import nh.InterfaceC6944a;

/* renamed from: zi.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8770B implements InterfaceC8780j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8780j f67326a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f67327b;

    /* renamed from: zi.B$a */
    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f67328a;

        a() {
            this.f67328a = C8770B.this.f67326a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f67328a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return C8770B.this.f67327b.invoke(this.f67328a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8770B(InterfaceC8780j sequence, InterfaceC6835l transformer) {
        AbstractC6492s.i(sequence, "sequence");
        AbstractC6492s.i(transformer, "transformer");
        this.f67326a = sequence;
        this.f67327b = transformer;
    }

    public final InterfaceC8780j e(InterfaceC6835l iterator) {
        AbstractC6492s.i(iterator, "iterator");
        return new C8778h(this.f67326a, this.f67327b, iterator);
    }

    @Override // zi.InterfaceC8780j
    public Iterator iterator() {
        return new a();
    }
}
