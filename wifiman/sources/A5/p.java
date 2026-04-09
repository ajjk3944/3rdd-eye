package A5;

import A5.a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes3.dex */
final class p extends PhantomReference implements a.InterfaceC0006a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f344a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f345b;

    /* synthetic */ p(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, o oVar) {
        super(obj, referenceQueue);
        this.f344a = set;
        this.f345b = runnable;
    }

    @Override // A5.a.InterfaceC0006a
    public final void a() {
        if (this.f344a.remove(this)) {
            clear();
            this.f345b.run();
        }
    }
}
