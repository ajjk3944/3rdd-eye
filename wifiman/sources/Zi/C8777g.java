package zi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import nh.InterfaceC6944a;

/* renamed from: zi.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8777g implements InterfaceC8780j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8780j f67341a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f67342b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6835l f67343c;

    /* renamed from: zi.g$a */
    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f67344a;

        /* renamed from: b, reason: collision with root package name */
        private int f67345b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f67346c;

        a() {
            this.f67344a = C8777g.this.f67341a.iterator();
        }

        private final void d() {
            while (this.f67344a.hasNext()) {
                Object next = this.f67344a.next();
                if (((Boolean) C8777g.this.f67343c.invoke(next)).booleanValue() == C8777g.this.f67342b) {
                    this.f67346c = next;
                    this.f67345b = 1;
                    return;
                }
            }
            this.f67345b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f67345b == -1) {
                d();
            }
            return this.f67345b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f67345b == -1) {
                d();
            }
            if (this.f67345b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f67346c;
            this.f67346c = null;
            this.f67345b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8777g(InterfaceC8780j sequence, boolean z10, InterfaceC6835l predicate) {
        AbstractC6492s.i(sequence, "sequence");
        AbstractC6492s.i(predicate, "predicate");
        this.f67341a = sequence;
        this.f67342b = z10;
        this.f67343c = predicate;
    }

    @Override // zi.InterfaceC8780j
    public Iterator iterator() {
        return new a();
    }
}
