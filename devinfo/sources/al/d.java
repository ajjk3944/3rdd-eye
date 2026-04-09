package al;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class d extends bl.e {

    /* renamed from: d, reason: collision with root package name */
    public final ek.j f494d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(mk.e eVar, ck.h hVar, int i4, zk.a aVar) {
        super(hVar, i4, aVar);
        this.f494d = (ek.j) eVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ek.j, mk.e] */
    @Override // bl.e
    public Object c(zk.u uVar, ck.c cVar) {
        Object objInvoke = this.f494d.invoke(uVar, cVar);
        return objInvoke == dk.a.f22275a ? objInvoke : yj.u.f37649a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ek.j, mk.e] */
    @Override // bl.e
    public bl.e d(ck.h hVar, int i4, zk.a aVar) {
        return new d(this.f494d, hVar, i4, aVar);
    }

    @Override // bl.e
    public final String toString() {
        return "block[" + this.f494d + "] -> " + super.toString();
    }
}
