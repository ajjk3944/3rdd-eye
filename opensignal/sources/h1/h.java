package h1;

import u.t;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final t f9717a;

    static {
        q qVar = d.f9691e;
        int i10 = qVar.f9686c;
        e eVar = new e(qVar, qVar, 1);
        int i11 = qVar.f9686c;
        l lVar = d.f9708x;
        int i12 = (lVar.f9686c << 6) | i11;
        g gVar = new g(qVar, lVar, 0);
        int i13 = (i11 << 6) | lVar.f9686c;
        g gVar2 = new g(lVar, qVar, 0);
        t tVar = u.k.f23086a;
        t tVar2 = new t();
        tVar2.h(i10 | (i10 << 6), eVar);
        tVar2.h(i12, gVar);
        tVar2.h(i13, gVar2);
        f9717a = tVar2;
    }
}
