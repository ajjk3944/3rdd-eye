package ur;

/* loaded from: classes.dex */
public final class p implements ar.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23659a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f23660d;

    public /* synthetic */ p(q qVar, int i10) {
        this.f23659a = i10;
        this.f23660d = qVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f23659a) {
            case 0:
                qs.g gVar = (qs.g) obj;
                if (gVar != null) {
                    q qVar = this.f23660d;
                    return qVar.j(gVar, qVar.i().f(gVar, zr.d.FOR_NON_TRACKED_SCOPE));
                }
                q.h(8);
                throw null;
            default:
                qs.g gVar2 = (qs.g) obj;
                if (gVar2 != null) {
                    q qVar2 = this.f23660d;
                    return qVar2.j(gVar2, qVar2.i().b(gVar2, zr.d.FOR_NON_TRACKED_SCOPE));
                }
                q.h(4);
                throw null;
        }
    }
}
