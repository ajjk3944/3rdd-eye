package zi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import nh.InterfaceC6944a;

/* renamed from: zi.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C8779i implements InterfaceC8780j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6824a f67355a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f67356b;

    /* renamed from: zi.i$a */
    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private Object f67357a;

        /* renamed from: b, reason: collision with root package name */
        private int f67358b = -2;

        a() {
        }

        private final void d() {
            Object objInvoke;
            if (this.f67358b == -2) {
                objInvoke = C8779i.this.f67355a.invoke();
            } else {
                InterfaceC6835l interfaceC6835l = C8779i.this.f67356b;
                Object obj = this.f67357a;
                AbstractC6492s.f(obj);
                objInvoke = interfaceC6835l.invoke(obj);
            }
            this.f67357a = objInvoke;
            this.f67358b = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f67358b < 0) {
                d();
            }
            return this.f67358b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f67358b < 0) {
                d();
            }
            if (this.f67358b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f67357a;
            AbstractC6492s.g(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f67358b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8779i(InterfaceC6824a getInitialValue, InterfaceC6835l getNextValue) {
        AbstractC6492s.i(getInitialValue, "getInitialValue");
        AbstractC6492s.i(getNextValue, "getNextValue");
        this.f67355a = getInitialValue;
        this.f67356b = getNextValue;
    }

    @Override // zi.InterfaceC8780j
    public Iterator iterator() {
        return new a();
    }
}
