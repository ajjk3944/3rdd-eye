package f8;

/* loaded from: classes.dex */
public final class k extends rq.c {
    public /* synthetic */ Object B;
    public final /* synthetic */ l D;
    public int E;

    /* renamed from: r, reason: collision with root package name */
    public l f8691r;

    /* renamed from: x, reason: collision with root package name */
    public b9.a f8692x;

    /* renamed from: y, reason: collision with root package name */
    public Object f8693y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, rq.c cVar) {
        super(cVar);
        this.D = lVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.B = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.a(this);
    }
}
