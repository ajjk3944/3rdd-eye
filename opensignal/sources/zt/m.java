package zt;

/* loaded from: classes.dex */
public final class m extends rq.c {
    public zj.c B;
    public g D;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f27567r;

    /* renamed from: x, reason: collision with root package name */
    public int f27568x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ zj.c f27569y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zj.c cVar, pq.c cVar2) {
        super(cVar2);
        this.f27569y = cVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f27567r = obj;
        this.f27568x |= Integer.MIN_VALUE;
        return this.f27569y.l(null, this);
    }
}
