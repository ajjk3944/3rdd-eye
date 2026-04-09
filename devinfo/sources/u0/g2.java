package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g2 extends g1.z {

    /* renamed from: c, reason: collision with root package name */
    public int f34820c;

    public g2(int i4, long j) {
        super(j);
        this.f34820c = i4;
    }

    @Override // g1.z
    public final void a(g1.z zVar) {
        nk.k.c(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f34820c = ((g2) zVar).f34820c;
    }

    @Override // g1.z
    public final g1.z b(long j) {
        return new g2(this.f34820c, j);
    }
}
