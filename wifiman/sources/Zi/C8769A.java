package zi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import nh.InterfaceC6944a;

/* renamed from: zi.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8769A implements InterfaceC8780j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8780j f67320a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f67321b;

    /* renamed from: zi.A$a */
    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f67322a;

        /* renamed from: b, reason: collision with root package name */
        private int f67323b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f67324c;

        a() {
            this.f67322a = C8769A.this.f67320a.iterator();
        }

        private final void d() {
            if (this.f67322a.hasNext()) {
                Object next = this.f67322a.next();
                if (((Boolean) C8769A.this.f67321b.invoke(next)).booleanValue()) {
                    this.f67323b = 1;
                    this.f67324c = next;
                    return;
                }
            }
            this.f67323b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f67323b == -1) {
                d();
            }
            return this.f67323b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f67323b == -1) {
                d();
            }
            if (this.f67323b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f67324c;
            this.f67324c = null;
            this.f67323b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8769A(InterfaceC8780j sequence, InterfaceC6835l predicate) {
        AbstractC6492s.i(sequence, "sequence");
        AbstractC6492s.i(predicate, "predicate");
        this.f67320a = sequence;
        this.f67321b = predicate;
    }

    @Override // zi.InterfaceC8780j
    public Iterator iterator() {
        return new a();
    }
}
