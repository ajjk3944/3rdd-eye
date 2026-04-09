package G2;

import G2.h;

/* loaded from: classes.dex */
public class g extends W2.h implements h {

    /* renamed from: e, reason: collision with root package name */
    private h.a f6837e;

    public g(long j10) {
        super(j10);
    }

    @Override // G2.h
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // G2.h
    public /* bridge */ /* synthetic */ E2.c c(C2.e eVar, E2.c cVar) {
        return (E2.c) super.k(eVar, cVar);
    }

    @Override // G2.h
    public void d(h.a aVar) {
        this.f6837e = aVar;
    }

    @Override // G2.h
    public /* bridge */ /* synthetic */ E2.c e(C2.e eVar) {
        return (E2.c) super.l(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // W2.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(E2.c cVar) {
        return cVar == null ? super.i(null) : cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // W2.h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(C2.e eVar, E2.c cVar) {
        h.a aVar = this.f6837e;
        if (aVar == null || cVar == null) {
            return;
        }
        aVar.d(cVar);
    }
}
