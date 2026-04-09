package x5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class c implements Iterator, r5.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f24188b;

    /* renamed from: d, reason: collision with root package name */
    public Object f24190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f24191e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24187a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f24189c = -1;

    public c(d dVar) {
        this.f24191e = dVar;
        this.f24188b = new k(dVar.f24192a);
    }

    public void a() {
        Object next;
        d dVar = (d) this.f24191e;
        do {
            Iterator it = this.f24188b;
            if (!it.hasNext()) {
                this.f24189c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) dVar.f24194c.f(next)).booleanValue() != dVar.f24193b);
        this.f24190d = next;
        this.f24189c = 1;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [p5.l, q5.j] */
    public void b() {
        Iterator it = this.f24188b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((q5.j) ((f) this.f24191e).f24200c).f(next)).booleanValue()) {
                this.f24189c = 1;
                this.f24190d = next;
                return;
            }
        }
        this.f24189c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24187a) {
            case 0:
                if (this.f24189c == -1) {
                    a();
                }
                if (this.f24189c == 1) {
                }
                break;
            default:
                if (this.f24189c == -1) {
                    b();
                }
                if (this.f24189c == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f24187a) {
            case 0:
                if (this.f24189c == -1) {
                    a();
                }
                if (this.f24189c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f24190d;
                this.f24190d = null;
                this.f24189c = -1;
                return obj;
            default:
                if (this.f24189c == -1) {
                    b();
                }
                if (this.f24189c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f24190d;
                this.f24190d = null;
                this.f24189c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f24187a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(f fVar) {
        this.f24191e = fVar;
        this.f24188b = ((g) fVar.f24199b).iterator();
    }
}
