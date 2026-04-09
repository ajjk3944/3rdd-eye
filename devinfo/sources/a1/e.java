package a1;

import java.util.ConcurrentModificationException;
import nk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: e, reason: collision with root package name */
    public final c f166e;

    /* renamed from: f, reason: collision with root package name */
    public Object f167f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public int f168h;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(c cVar) {
        Object obj = cVar.f159b;
        z0.d dVar = cVar.f161d;
        super(obj, dVar);
        this.f166e = cVar;
        this.f168h = dVar.f37812e;
    }

    @Override // a1.d, java.util.Iterator
    public final Object next() {
        if (this.f166e.f161d.f37812e != this.f168h) {
            throw new ConcurrentModificationException();
        }
        Object next = super.next();
        this.f167f = next;
        this.g = true;
        return next;
    }

    @Override // a1.d, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException();
        }
        Object obj = this.f167f;
        c cVar = this.f166e;
        x.a(cVar).remove(obj);
        this.f167f = null;
        this.g = false;
        this.f168h = cVar.f161d.f37812e;
        this.f164c--;
    }
}
