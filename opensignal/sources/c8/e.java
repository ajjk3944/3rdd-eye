package c8;

/* loaded from: classes.dex */
public final class e extends rq.c {
    public final /* synthetic */ f B;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public Object f3327r;

    /* renamed from: x, reason: collision with root package name */
    public eu.f f3328x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3329y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, rq.c cVar) {
        super(cVar);
        this.B = fVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f3329y = obj;
        this.D |= Integer.MIN_VALUE;
        return this.B.a(this);
    }
}
