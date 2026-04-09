package al;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j1 extends bl.d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f546a = new AtomicReference(null);

    @Override // bl.d
    public final boolean a(bl.b bVar) {
        AtomicReference atomicReference = this.f546a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(z0.f662b);
        return true;
    }

    @Override // bl.d
    public final ck.c[] b(bl.b bVar) {
        this.f546a.set(null);
        return bl.c.f2284a;
    }
}
