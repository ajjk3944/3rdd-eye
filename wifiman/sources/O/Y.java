package o;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import nh.InterfaceC6944a;

/* loaded from: classes.dex */
public abstract class Y {

    public static final class a extends Zg.Q {

        /* renamed from: a, reason: collision with root package name */
        private int f54943a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W f54944b;

        a(W w10) {
            this.f54944b = w10;
        }

        @Override // Zg.Q
        public int d() {
            W w10 = this.f54944b;
            int i10 = this.f54943a;
            this.f54943a = i10 + 1;
            return w10.k(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f54943a < this.f54944b.p();
        }
    }

    public static final class b implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private int f54945a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ W f54946b;

        b(W w10) {
            this.f54946b = w10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f54945a < this.f54946b.p();
        }

        @Override // java.util.Iterator
        public Object next() {
            W w10 = this.f54946b;
            int i10 = this.f54945a;
            this.f54945a = i10 + 1;
            return w10.q(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final Zg.Q a(W w10) {
        AbstractC6492s.i(w10, "<this>");
        return new a(w10);
    }

    public static final Iterator b(W w10) {
        AbstractC6492s.i(w10, "<this>");
        return new b(w10);
    }
}
