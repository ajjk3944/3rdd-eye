package n0;

/* loaded from: classes.dex */
public final class z1 extends x0.v {

    /* renamed from: c, reason: collision with root package name */
    public long f17369c;

    public z1(long j, long j7) {
        super(j);
        this.f17369c = j7;
    }

    @Override // x0.v
    public final void a(x0.v vVar) {
        br.l.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f17369c = ((z1) vVar).f17369c;
    }

    @Override // x0.v
    public final x0.v b(long j) {
        return new z1(j, this.f17369c);
    }
}
