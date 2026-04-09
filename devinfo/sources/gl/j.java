package gl;

import cl.s;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends s {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f24774e;

    public j(long j, j jVar, int i4) {
        super(j, jVar, i4);
        this.f24774e = new AtomicReferenceArray(i.f24773f);
    }

    @Override // cl.s
    public final int g() {
        return i.f24773f;
    }

    @Override // cl.s
    public final void h(int i4, ck.h hVar) {
        this.f24774e.set(i4, i.f24772e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f2939c + ", hashCode=" + hashCode() + ']';
    }
}
