package x5;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f24185a;

    public a(g gVar) {
        this.f24185a = new AtomicReference(gVar);
    }

    @Override // x5.g
    public final Iterator iterator() {
        g gVar = (g) this.f24185a.getAndSet(null);
        if (gVar != null) {
            return gVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
