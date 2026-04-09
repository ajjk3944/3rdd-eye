package zp;

/* loaded from: classes.dex */
public final class h extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public i f27507r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f27508x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f27509y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, rq.c cVar) {
        super(cVar);
        this.f27509y = iVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f27508x = obj;
        this.B |= Integer.MIN_VALUE;
        return i.k0(this.f27509y, this);
    }
}
