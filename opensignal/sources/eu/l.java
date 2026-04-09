package eu;

import bu.r;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class l extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f8367e;

    public l(long j, l lVar, int i10) {
        super(j, lVar, i10);
        this.f8367e = new AtomicReferenceArray(k.f8366f);
    }

    @Override // bu.r
    public final int f() {
        return k.f8366f;
    }

    @Override // bu.r
    public final void g(int i10, pq.h hVar) {
        this.f8367e.set(i10, k.f8365e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f2987c + ", hashCode=" + hashCode() + ']';
    }
}
