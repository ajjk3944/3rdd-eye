package n0;

/* loaded from: classes.dex */
public final class y1 extends x0.v {

    /* renamed from: c, reason: collision with root package name */
    public int f17366c;

    public y1(int i10, long j) {
        super(j);
        this.f17366c = i10;
    }

    @Override // x0.v
    public final void a(x0.v vVar) {
        br.l.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f17366c = ((y1) vVar).f17366c;
    }

    @Override // x0.v
    public final x0.v b(long j) {
        return new y1(this.f17366c, j);
    }
}
