package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i2 extends g1.z {

    /* renamed from: c, reason: collision with root package name */
    public Object f34835c;

    public i2(Object obj, long j) {
        super(j);
        this.f34835c = obj;
    }

    @Override // g1.z
    public final void a(g1.z zVar) {
        nk.k.c(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f34835c = ((i2) zVar).f34835c;
    }

    @Override // g1.z
    public final g1.z b(long j) {
        return new i2(this.f34835c, g1.m.j().g());
    }
}
