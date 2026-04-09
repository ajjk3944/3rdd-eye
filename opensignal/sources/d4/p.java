package d4;

/* loaded from: classes.dex */
public final class p extends rq.c {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6856r;

    /* renamed from: x, reason: collision with root package name */
    public int f6857x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f6858y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, pq.c cVar) {
        super(cVar);
        this.f6858y = qVar;
    }

    @Override // rq.a
    public final Object q(Object obj) {
        this.f6856r = obj;
        this.f6857x |= Integer.MIN_VALUE;
        return this.f6858y.i(null, this);
    }
}
