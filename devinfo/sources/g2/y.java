package g2;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24438b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f24439c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mk.c f24440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f24441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0 f24442f;
    public final /* synthetic */ mk.c g;

    public y(int i4, int i10, Map map, mk.c cVar, z zVar, f0 f0Var, mk.c cVar2) {
        this.f24437a = i4;
        this.f24438b = i10;
        this.f24439c = map;
        this.f24440d = cVar;
        this.f24441e = zVar;
        this.f24442f = f0Var;
        this.g = cVar2;
    }

    @Override // g2.k0
    public final Map b() {
        return this.f24439c;
    }

    @Override // g2.k0
    public final void c() {
        i2.p pVar;
        i2.e0 e0Var = this.f24442f.f24329a;
        boolean zH = this.f24441e.H();
        mk.c cVar = this.g;
        if (!zH || (pVar = ((i2.q) e0Var.G.f19257d).S) == null) {
            cVar.invoke(((i2.q) e0Var.G.f19257d).f25713l);
        } else {
            cVar.invoke(pVar.f25713l);
        }
    }

    @Override // g2.k0
    public final mk.c d() {
        return this.f24440d;
    }

    @Override // g2.k0
    public final int getHeight() {
        return this.f24438b;
    }

    @Override // g2.k0
    public final int getWidth() {
        return this.f24437a;
    }
}
