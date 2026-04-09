package wg;

/* loaded from: classes.dex */
public final class n extends rq.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f24519r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f24520x;

    /* renamed from: y, reason: collision with root package name */
    public int f24521y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, rq.c cVar) {
        super(cVar);
        this.f24520x = oVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f24519r = obj;
        this.f24521y |= Integer.MIN_VALUE;
        return this.f24520x.c(null, this);
    }
}
