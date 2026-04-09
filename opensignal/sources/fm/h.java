package fm;

/* loaded from: classes.dex */
public final class h extends rq.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9009r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a8.f f9010x;

    /* renamed from: y, reason: collision with root package name */
    public int f9011y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a8.f fVar, rq.c cVar) {
        super(cVar);
        this.f9010x = fVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f9009r = obj;
        this.f9011y |= Integer.MIN_VALUE;
        return a8.f.b(this.f9010x, this);
    }
}
