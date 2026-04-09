package O9;

import Q9.C;
import c9.C2092m;
import c9.C2102w;
import java.util.Iterator;
import q9.InterfaceC5499a;

/* compiled from: SerialDescriptor.kt */
/* loaded from: classes3.dex */
public final class g implements Iterator, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10515b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f10516c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10517d;

    public g(Iterator iterator) {
        kotlin.jvm.internal.l.f(iterator, "iterator");
        this.f10517d = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10515b) {
            case 0:
                return this.f10516c > 0;
            default:
                return ((Iterator) this.f10517d).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10515b) {
            case 0:
                C c10 = (C) this.f10517d;
                int i = this.f10516c;
                this.f10516c = i - 1;
                return c10.f11512e[c10.f11510c - i];
            default:
                int i10 = this.f10516c;
                this.f10516c = i10 + 1;
                if (i10 >= 0) {
                    return new C2102w(i10, ((Iterator) this.f10517d).next());
                }
                C2092m.a0();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10515b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(C c10) {
        this.f10517d = c10;
        this.f10516c = c10.f11510c;
    }
}
