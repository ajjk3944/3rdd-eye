package zi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import nh.InterfaceC6944a;

/* renamed from: zi.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8778h implements InterfaceC8780j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8780j f67348a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f67349b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6835l f67350c;

    /* renamed from: zi.h$a */
    public static final class a implements Iterator, InterfaceC6944a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f67351a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator f67352b;

        /* renamed from: c, reason: collision with root package name */
        private int f67353c;

        a() {
            this.f67351a = C8778h.this.f67348a.iterator();
        }

        private final boolean d() {
            Iterator it = this.f67352b;
            if (it != null && it.hasNext()) {
                this.f67353c = 1;
                return true;
            }
            while (this.f67351a.hasNext()) {
                Iterator it2 = (Iterator) C8778h.this.f67350c.invoke(C8778h.this.f67349b.invoke(this.f67351a.next()));
                if (it2.hasNext()) {
                    this.f67352b = it2;
                    this.f67353c = 1;
                    return true;
                }
            }
            this.f67353c = 2;
            this.f67352b = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f67353c;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return d();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f67353c;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !d()) {
                throw new NoSuchElementException();
            }
            this.f67353c = 0;
            Iterator it = this.f67352b;
            AbstractC6492s.f(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8778h(InterfaceC8780j sequence, InterfaceC6835l transformer, InterfaceC6835l iterator) {
        AbstractC6492s.i(sequence, "sequence");
        AbstractC6492s.i(transformer, "transformer");
        AbstractC6492s.i(iterator, "iterator");
        this.f67348a = sequence;
        this.f67349b = transformer;
        this.f67350c = iterator;
    }

    @Override // zi.InterfaceC8780j
    public Iterator iterator() {
        return new a();
    }
}
