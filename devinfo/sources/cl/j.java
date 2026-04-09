package cl;

import u0.n2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j extends nk.p implements tk.c, mk.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2923h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i4, int i10, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i4);
        this.f2923h = i10;
    }

    @Override // nk.c
    public final tk.a c() {
        nk.v.f29987a.getClass();
        return this;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f2923h) {
            case 0:
                return this.f29972b.getClass().getSimpleName();
            default:
                return ((n2) this.f29972b).getValue();
        }
    }
}
