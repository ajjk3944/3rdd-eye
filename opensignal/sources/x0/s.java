package x0;

/* loaded from: classes.dex */
public final class s extends v {

    /* renamed from: c, reason: collision with root package name */
    public r0.c f24747c;

    /* renamed from: d, reason: collision with root package name */
    public int f24748d;

    /* renamed from: e, reason: collision with root package name */
    public int f24749e;

    public s(long j, r0.c cVar) {
        super(j);
        this.f24747c = cVar;
    }

    @Override // x0.v
    public final void a(v vVar) {
        synchronized (p.f24727a) {
            br.l.c(vVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f24747c = ((s) vVar).f24747c;
            this.f24748d = ((s) vVar).f24748d;
            this.f24749e = ((s) vVar).f24749e;
        }
    }

    @Override // x0.v
    public final v b(long j) {
        return new s(j, this.f24747c);
    }
}
