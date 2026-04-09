package Ti;

import Ni.z;
import dh.InterfaceC5384i;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes4.dex */
final class k extends z {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f22049e;

    public k(long j10, k kVar, int i10) {
        super(j10, kVar, i10);
        this.f22049e = new AtomicReferenceArray(j.f22048f);
    }

    @Override // Ni.z
    public int r() {
        return j.f22048f;
    }

    @Override // Ni.z
    public void s(int i10, Throwable th2, InterfaceC5384i interfaceC5384i) {
        v().set(i10, j.f22047e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f16629c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray v() {
        return this.f22049e;
    }
}
