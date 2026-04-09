package d4;

/* loaded from: classes.dex */
public final class t extends rq.c {
    public final /* synthetic */ c0 B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public c0 f6877r;

    /* renamed from: x, reason: collision with root package name */
    public eu.d f6878x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f6879y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(c0 c0Var, rq.c cVar) {
        super(cVar);
        this.B = c0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f6879y = obj;
        this.D |= Integer.MIN_VALUE;
        return c0.e(this.B, this);
    }
}
