package zt;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class p0 extends au.d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f27584a = new AtomicReference(null);

    @Override // au.d
    public final boolean a(au.b bVar) {
        AtomicReference atomicReference = this.f27584a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(f0.f27544b);
        return true;
    }

    @Override // au.d
    public final pq.c[] b(au.b bVar) {
        this.f27584a.set(null);
        return au.c.f2320a;
    }
}
