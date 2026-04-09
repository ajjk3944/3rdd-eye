package j2;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final p2.l f27311a;

    /* renamed from: b, reason: collision with root package name */
    public final x.v f27312b;

    public s1(p2.p pVar, x.j jVar) {
        this.f27311a = pVar.f31104d;
        this.f27312b = new x.v(p2.p.j(4, pVar).size());
        List listJ = p2.p.j(4, pVar);
        int size = listJ.size();
        for (int i4 = 0; i4 < size; i4++) {
            p2.p pVar2 = (p2.p) listJ.get(i4);
            if (jVar.a(pVar2.g)) {
                this.f27312b.a(pVar2.g);
            }
        }
    }
}
