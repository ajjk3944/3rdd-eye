package n0;

/* loaded from: classes.dex */
public final class a2 extends x0.v {

    /* renamed from: c, reason: collision with root package name */
    public Object f17133c;

    public a2(Object obj, long j) {
        super(j);
        this.f17133c = obj;
    }

    @Override // x0.v
    public final void a(x0.v vVar) {
        br.l.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f17133c = ((a2) vVar).f17133c;
    }

    @Override // x0.v
    public final x0.v b(long j) {
        return new a2(this.f17133c, x0.l.k().g());
    }
}
