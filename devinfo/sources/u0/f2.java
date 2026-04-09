package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f2 extends g1.z {

    /* renamed from: c, reason: collision with root package name */
    public float f34811c;

    public f2(long j, float f10) {
        super(j);
        this.f34811c = f10;
    }

    @Override // g1.z
    public final void a(g1.z zVar) {
        nk.k.c(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f34811c = ((f2) zVar).f34811c;
    }

    @Override // g1.z
    public final g1.z b(long j) {
        return new f2(j, this.f34811c);
    }
}
