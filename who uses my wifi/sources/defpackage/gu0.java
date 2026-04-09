package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gu0 extends yt0 {
    public final /* synthetic */ AtomicReferenceArray e;

    public gu0(long j, gu0 gu0Var, int i) {
        super(j, gu0Var, i);
        this.e = new AtomicReferenceArray(fu0.f);
    }

    @Override // defpackage.yt0
    public final int f() {
        return fu0.f;
    }

    @Override // defpackage.yt0
    public final void g(int i, hk hkVar) {
        this.e.set(i, fu0.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
