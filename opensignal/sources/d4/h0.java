package d4;

/* loaded from: classes.dex */
public final class h0 extends rq.c {
    public /* synthetic */ Object B;
    public final /* synthetic */ j0 D;
    public int E;

    /* renamed from: r, reason: collision with root package name */
    public j0 f6815r;

    /* renamed from: x, reason: collision with root package name */
    public e0 f6816x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6817y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, rq.c cVar) {
        super(cVar);
        this.D = j0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.B = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(null, this);
    }
}
