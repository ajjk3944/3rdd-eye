package c8;

/* loaded from: classes.dex */
public final class b0 extends rq.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3318r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c0 f3319x;

    /* renamed from: y, reason: collision with root package name */
    public int f3320y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, rq.c cVar) {
        super(cVar);
        this.f3319x = c0Var;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f3318r = obj;
        this.f3320y |= Integer.MIN_VALUE;
        return this.f3319x.c(null, this);
    }
}
