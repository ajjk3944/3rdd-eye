package cb;

import java.util.List;

/* loaded from: classes.dex */
public final class n extends m {
    public final List j;

    public n(i iVar, long j, long j7, long j10, long j11, List list, long j12, List list2, long j13, long j14) {
        super(iVar, j, j7, j10, j11, list, j12, j13, j14);
        this.j = list2;
    }

    @Override // cb.m
    public final long d(long j) {
        return this.j.size();
    }

    @Override // cb.m
    public final i h(k kVar, long j) {
        return (i) this.j.get((int) (j - this.f3576d));
    }

    @Override // cb.m
    public final boolean i() {
        return true;
    }
}
