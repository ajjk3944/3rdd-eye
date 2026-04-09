package v5;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l implements s, t5.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35900b;

    public /* synthetic */ l(int i4, Object obj) {
        this.f35899a = i4;
        this.f35900b = obj;
    }

    @Override // t5.m
    public final Object a(String str, mk.c cVar, ek.c cVar2) {
        switch (this.f35899a) {
            case 0:
                return ((r) this.f35900b).a(str, cVar, cVar2);
            default:
                return ((w5.d) this.f35900b).a(str, cVar, cVar2);
        }
    }

    @Override // v5.s
    public final d6.a c() {
        switch (this.f35899a) {
            case 0:
                return ((r) this.f35900b).f35926a;
            default:
                return ((w5.d) this.f35900b).f36477a;
        }
    }
}
