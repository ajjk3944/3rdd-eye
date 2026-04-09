package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oh3 implements ng3 {
    public final vf3 a;
    public final nh3 b;
    public final lh3 c;
    public final ExecutorService d;
    public final gk3 e;
    public final AtomicReference f = new AtomicReference();

    public oh3(vf3 vf3Var, nh3 nh3Var, lh3 lh3Var, ExecutorService executorService, gk3 gk3Var) {
        this.a = vf3Var;
        this.b = nh3Var;
        this.c = lh3Var;
        this.d = executorService;
        this.e = gk3Var;
    }

    @Override // defpackage.ng3
    public final n70 a() {
        vf3 vf3Var = this.a;
        int iB = vf3Var.B();
        boolean zD = vf3Var.D();
        nh3 nh3Var = this.b;
        nh3Var.getClass();
        gq3 gq3VarR = gq3.r(pu1.D(new mh3(nh3Var, iB), nh3Var.d));
        fi1 fi1Var = fi1.o;
        dq3 dq3Var = dq3.f;
        qp3 qp3VarO = pu1.O(gq3VarR, fi1Var, dq3Var);
        if (zD && iB != 2) {
            qp3VarO = pu1.O(pu1.J(gq3.r(qp3VarO), Throwable.class, gj1.w, dq3Var), new u42(nh3Var), dq3Var);
        }
        rp3 rp3VarP = pu1.P(gq3.r(qp3VarO), new vn1(10, this), dq3Var);
        rp3VarP.c(new jq3(rp3VarP, new kf3(28, this), 0), this.d);
        return rp3VarP;
    }
}
