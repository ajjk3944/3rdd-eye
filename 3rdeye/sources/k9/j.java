package K9;

import F9.w;
import f9.InterfaceC4350h;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: Semaphore.kt */
/* loaded from: classes3.dex */
public final class j extends w<j> {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3778f;

    public j(long j4, j jVar, int i) {
        super(j4, jVar, i);
        this.f3778f = new AtomicReferenceArray(i.f3777f);
    }

    @Override // F9.w
    public final int g() {
        return i.f3777f;
    }

    @Override // F9.w
    public final void h(int i, InterfaceC4350h interfaceC4350h) {
        this.f3778f.set(i, i.f3776e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1786d + ", hashCode=" + hashCode() + ']';
    }
}
