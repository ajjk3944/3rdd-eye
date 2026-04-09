package zt;

/* loaded from: classes.dex */
public final class j extends rq.c {
    public Object B;
    public g D;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27556r;

    /* renamed from: x, reason: collision with root package name */
    public int f27557x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f27558y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, pq.c cVar) {
        super(cVar);
        this.f27558y = kVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f27556r = obj;
        this.f27557x |= Integer.MIN_VALUE;
        return this.f27558y.l(null, this);
    }
}
