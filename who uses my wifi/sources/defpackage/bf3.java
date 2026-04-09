package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bf3 extends mz0 implements hy {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf3(Object obj, oj ojVar, int i) {
        super(2, ojVar);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.hy
    public final Object f(Object obj, Object obj2) {
        qk qkVar = (qk) obj;
        oj ojVar = (oj) obj2;
        switch (this.j) {
        }
        return ((bf3) h(ojVar, qkVar)).m(z31.a);
    }

    @Override // defpackage.s9
    public final oj h(oj ojVar, Object obj) {
        switch (this.j) {
            case 0:
                return new bf3((mu2) this.l, ojVar, 0);
            case 1:
                return new bf3((mu2) this.l, ojVar, 1);
            case 2:
                return new bf3((mu2) this.l, ojVar, 2);
            case 3:
                return new bf3((mu2) this.l, ojVar, 3);
            case 4:
                return new bf3((mu2) this.l, ojVar, 4);
            case 5:
                return new bf3((mu2) this.l, ojVar, 5);
            default:
                return new bf3((wc0) this.l, ojVar, 6);
        }
    }

    @Override // defpackage.s9
    public final Object m(Object obj) {
        switch (this.j) {
            case 0:
                int i = this.k;
                bd2.x(obj);
                if (i == 0) {
                    mu2 mu2Var = (mu2) this.l;
                    this.k = 1;
                    Object objI = mu2Var.i(this);
                    rk rkVar = rk.f;
                    if (objI == rkVar) {
                        return rkVar;
                    }
                }
                return z31.a;
            case 1:
                int i2 = this.k;
                bd2.x(obj);
                if (i2 == 0) {
                    mu2 mu2Var2 = (mu2) this.l;
                    this.k = 1;
                    Object objM = mu2Var2.m(this);
                    rk rkVar2 = rk.f;
                    if (objM == rkVar2) {
                        return rkVar2;
                    }
                }
                return z31.a;
            case 2:
                int i3 = this.k;
                bd2.x(obj);
                if (i3 == 0) {
                    mu2 mu2Var3 = (mu2) this.l;
                    this.k = 1;
                    Object objK = mu2Var3.k(this);
                    rk rkVar3 = rk.f;
                    if (objK == rkVar3) {
                        return rkVar3;
                    }
                }
                return z31.a;
            case 3:
                int i4 = this.k;
                bd2.x(obj);
                if (i4 == 0) {
                    mu2 mu2Var4 = (mu2) this.l;
                    this.k = 1;
                    Object objF = mu2Var4.f(this);
                    rk rkVar4 = rk.f;
                    if (objF == rkVar4) {
                        return rkVar4;
                    }
                }
                return z31.a;
            case 4:
                int i5 = this.k;
                bd2.x(obj);
                if (i5 == 0) {
                    mu2 mu2Var5 = (mu2) this.l;
                    this.k = 1;
                    Object objL = mu2Var5.l(this);
                    rk rkVar5 = rk.f;
                    if (objL == rkVar5) {
                        return rkVar5;
                    }
                }
                return z31.a;
            case 5:
                int i6 = this.k;
                bd2.x(obj);
                if (i6 == 0) {
                    mu2 mu2Var6 = (mu2) this.l;
                    this.k = 1;
                    Object objJ = mu2Var6.j(this);
                    rk rkVar6 = rk.f;
                    if (objJ == rkVar6) {
                        return rkVar6;
                    }
                }
                return z31.a;
            default:
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bd2.x(obj);
                    return obj;
                }
                bd2.x(obj);
                uc0 uc0Var = ((wc0) this.l).a;
                this.k = 1;
                Object objB = uc0Var.b(this);
                rk rkVar7 = rk.f;
                return objB == rkVar7 ? rkVar7 : objB;
        }
    }
}
