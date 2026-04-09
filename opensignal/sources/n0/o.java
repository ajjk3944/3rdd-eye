package n0;

/* loaded from: classes.dex */
public final class o implements ar.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17228a;

    public o(Object obj) {
        this.f17228a = obj;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        p pVar = (p) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (pVar.K(iIntValue & 1, (iIntValue & 3) != 2)) {
            throw null;
        }
        pVar.N();
        return lq.b0.f15562a;
    }
}
