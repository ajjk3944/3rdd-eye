package o4;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class q extends f.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f18844a;

    public q(AtomicReference atomicReference) {
        this.f18844a = atomicReference;
    }

    @Override // f.b
    public final void a(Object obj) {
        f.b bVar = (f.b) this.f18844a.get();
        if (bVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        bVar.a(obj);
    }
}
