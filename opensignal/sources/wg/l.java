package wg;

import java.util.concurrent.atomic.AtomicReference;
import lq.b0;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements zt.g, br.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f24516a;

    public l(AtomicReference atomicReference) {
        this.f24516a = atomicReference;
    }

    @Override // br.h
    public final lq.e a() {
        return new br.a(2, this.f24516a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zt.g) && (obj instanceof br.h)) {
            return a().equals(((br.h) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // zt.g
    public final Object i(Object obj, pq.c cVar) {
        this.f24516a.set((h) obj);
        qq.a aVar = qq.a.COROUTINE_SUSPENDED;
        return b0.f15562a;
    }
}
