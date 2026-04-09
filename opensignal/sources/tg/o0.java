package tg;

/* loaded from: classes.dex */
public final class o0 extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public p0 f22824r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f22825x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p0 f22826y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, rq.c cVar) {
        super(cVar);
        this.f22826y = p0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f22825x = obj;
        this.B |= Integer.MIN_VALUE;
        return p0.a(this.f22826y, this);
    }
}
