package q1;

import x.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final u f32105a;

    static {
        q qVar = d.f32080e;
        int i4 = qVar.f32075c;
        e eVar = new e(qVar, qVar, 1);
        int i10 = qVar.f32075c;
        l lVar = d.f32097x;
        int i11 = (lVar.f32075c << 6) | i10;
        g gVar = new g(qVar, lVar, 0);
        int i12 = (i10 << 6) | lVar.f32075c;
        g gVar2 = new g(lVar, qVar, 0);
        u uVar = x.k.f36911a;
        u uVar2 = new u();
        uVar2.h(i4 | (i4 << 6), eVar);
        uVar2.h(i11, gVar);
        uVar2.h(i12, gVar2);
        f32105a = uVar2;
    }
}
