package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements mk.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21865b;

    public /* synthetic */ w(int i4, Object obj) {
        this.f21864a = i4;
        this.f21865b = obj;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) throws Exception {
        switch (this.f21864a) {
            case 0:
                nm.g gVar = (nm.g) this.f21865b;
                long j = ((c2.p) obj2).f2660c;
                gVar.f30040b.setValue(true);
                u0.u0 u0Var = gVar.f30042d;
                e0.b bVar = new e0.b();
                xk.x.v(gVar.f30041c, null, null, new nm.e(bVar, null, 1), 3);
                u0Var.setValue(bVar);
                ((mk.c) gVar.f30043e).invoke(new o1.b(j));
                break;
            case 1:
                gl.c cVar = (gl.c) this.f21865b;
                gl.c.f24758h.set(cVar, null);
                cVar.e(null);
                break;
            case 2:
                ((gl.g) this.f21865b).b();
                break;
            default:
                ((b7.u) this.f21865b).invoke((Throwable) obj);
                break;
        }
        return yj.u.f37649a;
    }

    public /* synthetic */ w(gl.c cVar, gl.b bVar) {
        this.f21864a = 1;
        this.f21865b = cVar;
    }
}
