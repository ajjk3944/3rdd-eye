package v1;

/* loaded from: classes.dex */
public final class b0 extends br.n implements ar.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23756d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j[] f23757g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(j[] jVarArr, int i10) {
        super(2);
        this.f23756d = i10;
        this.f23757g = jVarArr;
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.f23756d) {
            case 0:
                return Float.valueOf(i3.g.a((u) obj, true, this.f23757g, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(i3.g.a((u) obj, false, this.f23757g, ((Number) obj2).floatValue()));
        }
    }
}
