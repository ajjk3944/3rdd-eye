package dt;

import ls.y0;

/* loaded from: classes.dex */
public final class s extends br.n implements ar.a {
    public final /* synthetic */ y0 B;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f7533d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f7534g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ rs.b f7535r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a f7536x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f7537y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, w wVar, rs.b bVar, a aVar, int i10, y0 y0Var) {
        super(0);
        this.f7533d = tVar;
        this.f7534g = wVar;
        this.f7535r = bVar;
        this.f7536x = aVar;
        this.f7537y = i10;
        this.B = y0Var;
    }

    @Override // ar.a
    public final Object c() {
        return mq.o.Q0(((k) this.f7533d.f7538a.f810b).f7497e.q(this.f7534g, this.f7535r, this.f7536x, this.f7537y, this.B));
    }
}
