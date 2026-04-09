package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class m implements Iterator, z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26425a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f26426b;

    public m(n nVar) {
        this.f26426b = nVar.f26429a.iterator();
    }

    public m(t tVar) {
        this.f26426b = tVar.f26429a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f26425a) {
        }
        return this.f26426b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f26425a) {
            case 0:
                return this.f26426b.next();
            default:
                return new r((Map.Entry) this.f26426b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f26425a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Iterator, j$.util.z
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f26425a) {
            case 0:
                c.r(this.f26426b, consumer);
                break;
            default:
                c.r(this.f26426b, new q(0, consumer));
                break;
        }
    }
}
