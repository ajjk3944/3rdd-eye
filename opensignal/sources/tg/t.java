package tg;

/* loaded from: classes.dex */
public final class t extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public Object f22850r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f22851x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f22852y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(o oVar, rq.c cVar) {
        super(cVar);
        this.f22852y = oVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f22851x = obj;
        this.B |= Integer.MIN_VALUE;
        return this.f22852y.a(null, this);
    }
}
