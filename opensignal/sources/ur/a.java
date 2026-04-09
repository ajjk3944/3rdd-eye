package ur;

import ht.a1;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements ar.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23620a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f23621d;

    public /* synthetic */ a(b bVar, int i10) {
        this.f23620a = i10;
        this.f23621d = bVar;
    }

    @Override // ar.a
    public final Object c() {
        int i10 = this.f23620a;
        b bVar = this.f23621d;
        switch (i10) {
            case 0:
                at.n nVarH0 = bVar.H0();
                bs.a aVar = new bs.a(2, this);
                kt.h hVar = a1.f10882a;
                if (kt.k.f(bVar)) {
                    return kt.k.c(kt.j.UNABLE_TO_SUBSTITUTE_TYPE, bVar.toString());
                }
                ht.m0 m0VarV = bVar.v();
                if (m0VarV == null) {
                    a1.a(12);
                    throw null;
                }
                if (nVarH0 == null) {
                    a1.a(13);
                    throw null;
                }
                List listD = a1.d(m0VarV.o());
                ht.i0.f10910d.getClass();
                return ht.e.t(ht.i0.f10911g, m0VarV, listD, false, nVarH0, aVar);
            case 1:
                return new at.i(bVar.H0());
            default:
                return new v(bVar);
        }
    }
}
