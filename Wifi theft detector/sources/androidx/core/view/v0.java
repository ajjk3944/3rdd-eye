package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class v0 implements Iterator, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public final l9.l f2761a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2762b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Iterator f2763c;

    public v0(Iterator it, l9.l lVar) {
        this.f2761a = lVar;
        this.f2763c = it;
    }

    public final void a(Object obj) {
        Iterator it = (Iterator) this.f2761a.invoke(obj);
        if (it != null && it.hasNext()) {
            this.f2762b.add(this.f2763c);
            this.f2763c = it;
        } else {
            while (!this.f2763c.hasNext() && !this.f2762b.isEmpty()) {
                this.f2763c = (Iterator) z8.z.P(this.f2762b);
                z8.w.z(this.f2762b);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2763c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f2763c.next();
        a(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
