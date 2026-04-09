package C5;

import h5.InterfaceC2370d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class p extends D5.d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1198a = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    @Override // D5.d
    public final boolean a(D5.b bVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1198a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, l.f1185b);
        return true;
    }

    @Override // D5.d
    public final InterfaceC2370d[] b(D5.b bVar) {
        f1198a.set(this, null);
        return D5.c.f1297a;
    }
}
