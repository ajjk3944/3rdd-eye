package g1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a0 implements Iterator, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final v f24200a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f24201b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24202c;

    /* renamed from: d, reason: collision with root package name */
    public Object f24203d;

    /* renamed from: e, reason: collision with root package name */
    public int f24204e;

    public a0(v vVar, Iterator it) {
        this.f24200a = vVar;
        this.f24201b = it;
        this.f24204e = r.g(vVar);
        this.f24202c = this.f24203d;
        this.f24203d = it.hasNext() ? it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24203d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (r.g(this.f24200a) != this.f24204e) {
            throw new ConcurrentModificationException();
        }
        this.f24202c = this.f24203d;
        Iterator it = this.f24201b;
        this.f24203d = it.hasNext() ? it.next() : null;
        Object obj = this.f24202c;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        v vVar = this.f24200a;
        if (r.g(vVar) != this.f24204e) {
            throw new ConcurrentModificationException();
        }
        Object obj = this.f24202c;
        if (obj == null) {
            throw new IllegalStateException();
        }
        vVar.remove(obj);
        this.f24202c = null;
        this.f24204e = r.g(vVar);
    }
}
