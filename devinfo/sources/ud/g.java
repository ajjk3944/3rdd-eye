package ud;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g extends ac.h {

    /* renamed from: b, reason: collision with root package name */
    public boolean f35304b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35305c;

    public g(Object obj) {
        super(2);
        this.f35305c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f35304b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f35304b) {
            throw new NoSuchElementException();
        }
        this.f35304b = true;
        return this.f35305c;
    }
}
