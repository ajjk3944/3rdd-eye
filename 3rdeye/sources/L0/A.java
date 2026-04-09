package L0;

import c9.C2095p;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import q9.InterfaceC5499a;

/* compiled from: ViewGroup.kt */
/* loaded from: classes.dex */
public final class A<T> implements Iterator<T>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final M f3783b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3784c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public Iterator<? extends T> f3785d;

    public A(C6.o oVar, M m10) {
        this.f3783b = m10;
        this.f3785d = oVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3785d.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        T next = this.f3785d.next();
        Iterator<? extends T> it = (Iterator) this.f3783b.invoke(next);
        ArrayList arrayList = this.f3784c;
        if (it != null && it.hasNext()) {
            arrayList.add(this.f3785d);
            this.f3785d = it;
            return next;
        }
        while (!this.f3785d.hasNext() && !arrayList.isEmpty()) {
            this.f3785d = (Iterator) C2097r.v0(arrayList);
            C2095p.g0(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
