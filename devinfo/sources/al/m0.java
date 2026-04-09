package al;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nk.u f567b;

    public /* synthetic */ m0(nk.u uVar, int i4) {
        this.f566a = i4;
        this.f567b = uVar;
    }

    @Override // al.i
    public final Object c(Object obj, ck.c cVar) {
        switch (this.f566a) {
            case 0:
                this.f567b.f29986a = obj;
                throw new bl.a(this);
            default:
                this.f567b.f29986a = obj;
                throw new bl.a(this);
        }
    }
}
