package g1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w extends z {

    /* renamed from: c, reason: collision with root package name */
    public y0.b f24295c;

    /* renamed from: d, reason: collision with root package name */
    public int f24296d;

    /* renamed from: e, reason: collision with root package name */
    public int f24297e;

    public w(long j, y0.b bVar) {
        super(j);
        this.f24295c = bVar;
    }

    @Override // g1.z
    public final void a(z zVar) {
        synchronized (r.f24271a) {
            nk.k.c(zVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f24295c = ((w) zVar).f24295c;
            this.f24296d = ((w) zVar).f24296d;
            this.f24297e = ((w) zVar).f24297e;
        }
    }

    @Override // g1.z
    public final z b(long j) {
        return new w(j, this.f24295c);
    }
}
