package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h2 extends g1.z {

    /* renamed from: c, reason: collision with root package name */
    public long f34828c;

    public h2(long j, long j8) {
        super(j);
        this.f34828c = j8;
    }

    @Override // g1.z
    public final void a(g1.z zVar) {
        nk.k.c(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f34828c = ((h2) zVar).f34828c;
    }

    @Override // g1.z
    public final g1.z b(long j) {
        return new h2(j, this.f34828c);
    }
}
