package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class D1 {

    /* renamed from: a, reason: collision with root package name */
    private final V.b f29137a = new V.b(new Reference[16], 0);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue f29138b = new ReferenceQueue();

    private final void a() {
        Reference referencePoll;
        do {
            referencePoll = this.f29138b.poll();
            if (referencePoll != null) {
                this.f29137a.x(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final Object b() {
        a();
        while (this.f29137a.u()) {
            Object obj = ((Reference) this.f29137a.z(r0.o() - 1)).get();
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public final void c(Object obj) {
        a();
        this.f29137a.b(new WeakReference(obj, this.f29138b));
    }
}
