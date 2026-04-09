package g2;

import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 extends i2.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f24308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mk.e f24309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f0 f0Var, mk.e eVar, String str) {
        super(str);
        this.f24308b = f0Var;
        this.f24309c = eVar;
    }

    @Override // g2.j0
    public final k0 f(l0 l0Var, List list, long j) {
        f0 f0Var = this.f24308b;
        z zVar = f0Var.f24335h;
        zVar.f24447a = l0Var.getLayoutDirection();
        zVar.f24448b = l0Var.a();
        zVar.f24449c = l0Var.F();
        boolean zH = l0Var.H();
        mk.e eVar = this.f24309c;
        if (zH || f0Var.f24329a.f25634i == null) {
            f0Var.f24332d = 0;
            k0 k0Var = (k0) eVar.invoke(zVar, new d3.a(j));
            return new a0(k0Var, f0Var, f0Var.f24332d, k0Var, 1);
        }
        f0Var.f24333e = 0;
        k0 k0Var2 = (k0) eVar.invoke(f0Var.f24336i, new d3.a(j));
        return new a0(k0Var2, f0Var, f0Var.f24333e, k0Var2, 0);
    }
}
