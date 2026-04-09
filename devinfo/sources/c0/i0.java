package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 extends nk.i implements mk.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2438i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i4, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i4, obj, cls, str, str2, i10, i11);
        this.f2438i = i12;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        boolean zA;
        boolean zA2;
        switch (this.f2438i) {
            case 0:
                n1.q qVar = (n1.q) obj;
                n1.q qVar2 = (n1.q) obj2;
                j0 j0Var = (j0) this.f29972b;
                if (j0Var.f25565n && (zA = qVar2.a()) != qVar.a()) {
                    a aVar = j0Var.f2449r;
                    if (aVar != null) {
                        aVar.invoke(Boolean.valueOf(zA));
                    }
                    ck.c cVar = null;
                    if (zA) {
                        xk.x.v(j0Var.b0(), null, null, new al.k(j0Var, cVar, 3), 3);
                        nk.u uVar = new nk.u();
                        i2.k.p(j0Var, new p(1, uVar, j0Var));
                        j0.h0 h0Var = (j0.h0) uVar.f29986a;
                        if (h0Var != null) {
                            h0Var.a();
                        } else {
                            h0Var = null;
                        }
                        j0Var.f2451t = h0Var;
                        i2.d1 d1Var = j0Var.f2452u;
                        if (d1Var != null && d1Var.z0().f25565n) {
                            j0Var.t0();
                        }
                    } else {
                        j0.h0 h0Var2 = j0Var.f2451t;
                        if (h0Var2 != null) {
                            h0Var2.b();
                        }
                        j0Var.f2451t = null;
                        j0Var.t0();
                    }
                    i2.k.l(j0Var);
                    e0.i iVar = j0Var.f2448q;
                    if (iVar != null) {
                        if (zA) {
                            e0.d dVar = j0Var.f2450s;
                            if (dVar != null) {
                                j0Var.s0(iVar, new e0.e(dVar));
                                j0Var.f2450s = null;
                            }
                            e0.d dVar2 = new e0.d();
                            j0Var.s0(iVar, dVar2);
                            j0Var.f2450s = dVar2;
                        } else {
                            e0.d dVar3 = j0Var.f2450s;
                            if (dVar3 != null) {
                                j0Var.s0(iVar, new e0.e(dVar3));
                                j0Var.f2450s = null;
                            }
                        }
                    }
                }
                return yj.u.f37649a;
            case 1:
                n1.q qVar3 = (n1.q) obj;
                n1.q qVar4 = (n1.q) obj2;
                g3.u uVar2 = (g3.u) this.f29972b;
                if (uVar2.f25565n && (zA2 = qVar4.a()) != qVar3.a()) {
                    j0.h0 h0Var3 = null;
                    if (zA2) {
                        nk.u uVar3 = new nk.u();
                        i2.k.p(uVar2, new c2.c(1, uVar3, uVar2));
                        j0.h0 h0Var4 = (j0.h0) uVar3.f29986a;
                        if (h0Var4 != null) {
                            h0Var4.a();
                            h0Var3 = h0Var4;
                        }
                        uVar2.f24535r = h0Var3;
                    } else {
                        j0.h0 h0Var5 = uVar2.f24535r;
                        if (h0Var5 != null) {
                            h0Var5.b();
                        }
                        uVar2.f24535r = null;
                    }
                }
                return yj.u.f37649a;
            default:
                kl.d dVar4 = (kl.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                nk.k.e(dVar4, "p0");
                ol.f fVar = (ol.f) this.f29972b;
                fVar.getClass();
                boolean z3 = !dVar4.k(iIntValue) && dVar4.j(iIntValue).c();
                fVar.f30587b = z3;
                return Boolean.valueOf(z3);
        }
    }
}
