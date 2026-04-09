package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.z;

/* loaded from: classes4.dex */
public final class d extends z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f22690e;

    public d(long j10, d dVar, int i10) {
        super(j10, dVar, i10);
        this.f22690e = new AtomicReferenceArray(c.f22689f);
    }

    @Override // kotlinx.coroutines.internal.z
    public int q() {
        return c.f22689f;
    }

    @Override // kotlinx.coroutines.internal.z
    public void r(int i10, Throwable th, kotlin.coroutines.d dVar) {
        u().set(i10, c.f22688e);
        s();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f22569c + ", hashCode=" + hashCode() + ']';
    }

    public final /* synthetic */ AtomicReferenceArray u() {
        return this.f22690e;
    }
}
