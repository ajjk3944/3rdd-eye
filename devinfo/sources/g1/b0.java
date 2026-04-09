package g1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 extends z {

    /* renamed from: c, reason: collision with root package name */
    public x0.b f24205c;

    /* renamed from: d, reason: collision with root package name */
    public int f24206d;

    public b0(long j, x0.b bVar) {
        super(j);
        this.f24205c = bVar;
    }

    @Override // g1.z
    public final void a(z zVar) {
        synchronized (r.f24272b) {
            nk.k.c(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.StateSetStateRecord>");
            this.f24205c = ((b0) zVar).f24205c;
            this.f24206d = ((b0) zVar).f24206d;
        }
    }

    @Override // g1.z
    public final z b(long j) {
        return new b0(j, this.f24205c);
    }
}
