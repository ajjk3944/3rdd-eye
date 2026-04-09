package d4;

/* loaded from: classes.dex */
public final class x extends rq.j implements ar.n {
    public /* synthetic */ boolean B;
    public final /* synthetic */ c0 D;
    public final /* synthetic */ int E;
    public Object F;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6905x;

    /* renamed from: y, reason: collision with root package name */
    public int f6906y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(c0 c0Var, int i10, pq.c cVar, int i11) {
        super(2, cVar);
        this.f6905x = i11;
        this.D = c0Var;
        this.E = i10;
    }

    @Override // rq.a
    public final pq.c o(Object obj, pq.c cVar) {
        switch (this.f6905x) {
            case 0:
                x xVar = new x(this.D, this.E, cVar, 0);
                xVar.B = ((Boolean) obj).booleanValue();
                return xVar;
            default:
                x xVar2 = new x(this.D, this.E, cVar, 1);
                xVar2.B = ((Boolean) obj).booleanValue();
                return xVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // rq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.x.q(java.lang.Object):java.lang.Object");
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        int i10 = this.f6905x;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        pq.c cVar = (pq.c) obj2;
        switch (i10) {
        }
        return ((x) o(bool, cVar)).q(lq.b0.f15562a);
    }
}
