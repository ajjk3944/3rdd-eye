package wg;

/* loaded from: classes.dex */
public final class b extends rq.c {
    public final /* synthetic */ c B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public Object f24488r;

    /* renamed from: x, reason: collision with root package name */
    public eu.a f24489x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f24490y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, rq.c cVar2) {
        super(cVar2);
        this.B = cVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f24490y = obj;
        this.D |= Integer.MIN_VALUE;
        return this.B.c(this);
    }
}
