package g1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class y implements x {

    /* renamed from: a, reason: collision with root package name */
    public final c1.a f24298a = new c1.a(0);

    @Override // g1.x
    public /* synthetic */ z c(z zVar, z zVar2, z zVar3) {
        return null;
    }

    public final boolean e(int i4) {
        return (i4 & this.f24298a.get()) != 0;
    }

    public final void f(int i4) {
        c1.a aVar;
        int i10;
        do {
            aVar = this.f24298a;
            i10 = aVar.get();
            if ((i10 & i4) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i10, i10 | i4));
    }
}
