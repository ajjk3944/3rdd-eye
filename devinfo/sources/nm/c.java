package nm;

import d0.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final c f30005b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f30006c = new c(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30007a;

    public /* synthetic */ c(int i4) {
        this.f30007a = i4;
    }

    @Override // nm.d
    public final Object a(c2.u uVar, g gVar, h hVar, h hVar2, mk.e eVar, i iVar) {
        int i4 = this.f30007a;
        dk.a aVar = dk.a.f22275a;
        yj.u uVar2 = yj.u.f37649a;
        switch (i4) {
            case 0:
                float f10 = d0.d0.f21693a;
                Object objF = m1.f(uVar, new d0.b0(gVar, hVar, hVar2, eVar, null), iVar);
                if (objF != aVar) {
                    objF = uVar2;
                }
                return objF == aVar ? objF : uVar2;
            default:
                d0.w wVar = new d0.w(0, gVar);
                b7.u uVar3 = new b7.u(4, hVar);
                b6.a aVar2 = new b6.a(4);
                float f11 = d0.d0.f21693a;
                Object objF2 = m1.f(uVar, new d0.a0(aVar2, new nk.t(), null, wVar, eVar, hVar2, uVar3, null), iVar);
                if (objF2 != aVar) {
                    objF2 = uVar2;
                }
                if (objF2 != aVar) {
                    objF2 = uVar2;
                }
                return objF2 == aVar ? objF2 : uVar2;
        }
    }
}
