package H5;

import E5.t;
import h5.InterfaceC2375i;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class k extends t {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f1834e;

    public k(long j6, k kVar, int i) {
        super(j6, kVar, i);
        this.f1834e = new AtomicReferenceArray(j.f1833f);
    }

    @Override // E5.t
    public final int f() {
        return j.f1833f;
    }

    @Override // E5.t
    public final void g(int i, InterfaceC2375i interfaceC2375i) {
        this.f1834e.set(i, j.f1832e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1413c + ", hashCode=" + hashCode() + ']';
    }
}
