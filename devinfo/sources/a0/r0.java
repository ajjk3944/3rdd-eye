package a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk.e f113b;

    public /* synthetic */ r0(int i4, mk.e eVar) {
        this.f112a = i4;
        this.f113b = eVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f112a) {
            case 0:
                y4.a aVar = f.j;
                k kVar = (k) obj;
                this.f113b.invoke(kVar.f70e.getValue(), ((mk.c) aVar.f37324b).invoke(kVar.f71f));
                break;
            default:
                c2.p pVar = (c2.p) obj;
                this.f113b.invoke(pVar, new o1.b(c2.h0.f(pVar, false)));
                pVar.a();
                break;
        }
        return yj.u.f37649a;
    }
}
