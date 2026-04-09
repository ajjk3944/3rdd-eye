package fl;

import cl.s;
import cl.u;
import ek.j;
import xk.i0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24062a;

    /* renamed from: b, reason: collision with root package name */
    public final mk.f f24063b;

    /* renamed from: c, reason: collision with root package name */
    public final mk.f f24064c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f24065d;

    /* renamed from: e, reason: collision with root package name */
    public final j f24066e;

    /* renamed from: f, reason: collision with root package name */
    public final mk.f f24067f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public int f24068h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f24069i;

    public c(e eVar, Object obj, mk.f fVar, mk.f fVar2, u uVar, j jVar, mk.f fVar3) {
        this.f24069i = eVar;
        this.f24062a = obj;
        this.f24063b = fVar;
        this.f24064c = fVar2;
        this.f24065d = uVar;
        this.f24066e = jVar;
        this.f24067f = fVar3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof s) {
            ((s) obj).h(this.f24068h, this.f24069i.f24075a);
            return;
        }
        i0 i0Var = obj instanceof i0 ? (i0) obj : null;
        if (i0Var != null) {
            i0Var.a();
        }
    }
}
