package yp;

/* loaded from: classes.dex */
public final class d extends rq.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f26412r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f26413x;

    /* renamed from: y, reason: collision with root package name */
    public int f26414y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, rq.c cVar) {
        super(cVar);
        this.f26413x = eVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f26412r = obj;
        this.f26414y |= Integer.MIN_VALUE;
        return this.f26413x.k(null, this);
    }
}
