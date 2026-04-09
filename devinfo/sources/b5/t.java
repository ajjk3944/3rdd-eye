package b5;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t extends f.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1874a;

    public t(AtomicReference atomicReference) {
        this.f1874a = atomicReference;
    }

    @Override // f.d
    public final void a(Object obj) {
        f.d dVar = (f.d) this.f1874a.get();
        if (dVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        dVar.a(obj);
    }
}
