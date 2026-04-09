package pd;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d implements qd.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31718a;

    /* renamed from: b, reason: collision with root package name */
    public final km.i f31719b;

    public /* synthetic */ d(km.i iVar, int i4) {
        this.f31718a = i4;
        this.f31719b = iVar;
    }

    @Override // qd.c
    public final Object b() {
        switch (this.f31718a) {
            case 0:
                return new c(((d8.h) this.f31719b.f28426b).f22020b);
            default:
                return new j(((d8.h) this.f31719b.f28426b).f22020b);
        }
    }
}
