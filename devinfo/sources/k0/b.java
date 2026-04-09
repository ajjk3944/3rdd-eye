package k0;

import al.p;
import bh.t;
import ek.j;
import i2.d1;
import mk.e;
import xk.v;
import xk.x;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends j implements e {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f27775c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f27776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2.c f27777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c1.b f27778f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d1 d1Var, c2.c cVar2, c1.b bVar, ck.c cVar3) {
        super(2, cVar3);
        this.f27775c = cVar;
        this.f27776d = d1Var;
        this.f27777e = cVar2;
        this.f27778f = bVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        b bVar = new b(this.f27775c, this.f27776d, this.f27777e, this.f27778f, cVar);
        bVar.f27774b = obj;
        return bVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((v) obj, (ck.c) obj2)).invokeSuspend(u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        ci.b.D(obj);
        v vVar = (v) this.f27774b;
        c2.c cVar = this.f27777e;
        c cVar2 = this.f27775c;
        x.v(vVar, null, null, new t(cVar2, this.f27776d, cVar, null, 16), 3);
        return x.v(vVar, null, null, new p(cVar2, this.f27778f, null, 22), 3);
    }
}
