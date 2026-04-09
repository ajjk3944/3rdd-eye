package n0;

/* loaded from: classes.dex */
public final class f implements ar.n {

    /* renamed from: d, reason: collision with root package name */
    public static final f f17169d = new f(0);

    /* renamed from: g, reason: collision with root package name */
    public static final f f17170g = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17171a;

    public /* synthetic */ f(int i10) {
        this.f17171a = i10;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f17171a) {
            case 0:
                p pVar = (p) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!pVar.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pVar.N();
                }
                break;
            default:
                p pVar2 = (p) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!pVar2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    pVar2.N();
                }
                break;
        }
        return lq.b0.f15562a;
    }
}
