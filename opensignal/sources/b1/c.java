package b1;

/* loaded from: classes.dex */
public final class c extends rq.c {
    public int B;

    /* renamed from: r, reason: collision with root package name */
    public yt.b f2363r;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f2364x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f2365y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, rq.c cVar) {
        super(cVar);
        this.f2365y = eVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f2364x = obj;
        this.B |= Integer.MIN_VALUE;
        return this.f2365y.a(this);
    }
}
