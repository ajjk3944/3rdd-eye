package i2;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l0 implements g2.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f25705c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mk.c f25706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mk.c f25707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f25708f;

    public l0(int i4, int i10, Map map, mk.c cVar, mk.c cVar2, m0 m0Var) {
        this.f25703a = i4;
        this.f25704b = i10;
        this.f25705c = map;
        this.f25706d = cVar;
        this.f25707e = cVar2;
        this.f25708f = m0Var;
    }

    @Override // g2.k0
    public final Map b() {
        return this.f25705c;
    }

    @Override // g2.k0
    public final void c() {
        this.f25707e.invoke(this.f25708f.f25713l);
    }

    @Override // g2.k0
    public final mk.c d() {
        return this.f25706d;
    }

    @Override // g2.k0
    public final int getHeight() {
        return this.f25704b;
    }

    @Override // g2.k0
    public final int getWidth() {
        return this.f25703a;
    }
}
