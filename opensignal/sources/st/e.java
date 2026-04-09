package st;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22280a;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f22281d;

    /* renamed from: g, reason: collision with root package name */
    public int f22282g;

    /* renamed from: r, reason: collision with root package name */
    public Object f22283r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f22284x;

    public e(f fVar) {
        this.f22280a = 0;
        this.f22284x = fVar;
        this.f22281d = fVar.f22285a.iterator();
        this.f22282g = -1;
    }

    public void a() {
        Object next;
        f fVar = (f) this.f22284x;
        do {
            Iterator it = this.f22281d;
            if (!it.hasNext()) {
                this.f22282g = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) fVar.f22287c.a(next)).booleanValue() != fVar.f22286b);
        this.f22283r = next;
        this.f22282g = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.f22283r;
        if (it2 != null && it2.hasNext()) {
            this.f22282g = 1;
            return true;
        }
        do {
            Iterator it3 = this.f22281d;
            if (!it3.hasNext()) {
                this.f22282g = 2;
                this.f22283r = null;
                return false;
            }
            Object next = it3.next();
            g gVar = (g) this.f22284x;
            it = (Iterator) gVar.f22290c.a(gVar.f22289b.a(next));
        } while (!it.hasNext());
        this.f22283r = it;
        this.f22282g = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f22280a) {
            case 0:
                if (this.f22282g == -1) {
                    a();
                }
                return this.f22282g == 1;
            default:
                int i10 = this.f22282g;
                if (i10 == 1) {
                    return true;
                }
                if (i10 == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f22280a) {
            case 0:
                if (this.f22282g == -1) {
                    a();
                }
                if (this.f22282g == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f22283r;
                this.f22283r = null;
                this.f22282g = -1;
                return obj;
            default:
                int i10 = this.f22282g;
                if (i10 == 2) {
                    throw new NoSuchElementException();
                }
                if (i10 == 0 && !b()) {
                    throw new NoSuchElementException();
                }
                this.f22282g = 0;
                Iterator it = (Iterator) this.f22283r;
                br.l.b(it);
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f22280a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(g gVar) {
        this.f22280a = 1;
        this.f22284x = gVar;
        this.f22281d = gVar.f22288a.iterator();
    }
}
