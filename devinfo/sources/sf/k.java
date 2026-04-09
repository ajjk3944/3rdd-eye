package sf;

import java.util.concurrent.atomic.AtomicReference;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements al.i, nk.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f33589a;

    public k(AtomicReference atomicReference) {
        this.f33589a = atomicReference;
    }

    @Override // nk.g
    public final yj.c a() {
        return new nk.a(2, 4, AtomicReference.class, this.f33589a, "set", "set(Ljava/lang/Object;)V");
    }

    @Override // al.i
    public final Object c(Object obj, ck.c cVar) {
        this.f33589a.set((g) obj);
        return u.f37649a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof al.i) && (obj instanceof nk.g)) {
            return a().equals(((nk.g) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
