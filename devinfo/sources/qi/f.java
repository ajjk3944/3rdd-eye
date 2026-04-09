package qi;

import nk.k;
import pa.u;
import pi.g;
import pi.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f extends u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f32437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi.a f32438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f32439f;

    public f(i iVar, pi.a aVar, g gVar) {
        this.f32437d = iVar;
        this.f32438e = aVar;
        this.f32439f = gVar;
    }

    @Override // pa.u
    public final void a() {
        if (ci.b.j != null) {
            j6.i.o(this.f32438e);
        }
        this.f32439f.w();
    }

    @Override // pa.u
    public final void b() {
        this.f32437d.a();
    }

    @Override // pa.u
    public final void d(pa.a aVar) {
        String str = aVar.f31512b;
        k.d(str, "getMessage(...)");
        this.f32437d.t(str);
    }

    @Override // pa.u
    public final void g() {
        if (ci.b.j != null) {
            j6.i.q(this.f32438e);
        }
        this.f32437d.r();
    }

    @Override // pa.u
    public final void e() {
    }
}
