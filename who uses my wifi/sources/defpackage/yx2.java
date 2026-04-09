package defpackage;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yx2 implements ly2 {
    public static final Pattern h = Pattern.compile("Received error HTTP response code: (.*)");
    public final mc2 a;
    public final pq3 b;
    public final l83 c;
    public final ScheduledExecutorService d;
    public final ez2 e;
    public final da3 f;
    public final Context g;

    public yx2(Context context, l83 l83Var, mc2 mc2Var, pq3 pq3Var, ScheduledExecutorService scheduledExecutorService, ez2 ez2Var, da3 da3Var) {
        this.g = context;
        this.c = l83Var;
        this.a = mc2Var;
        this.b = pq3Var;
        this.d = scheduledExecutorService;
        this.e = ez2Var;
        this.f = da3Var;
    }

    @Override // defpackage.ly2
    public final n70 e(fa2 fa2Var) {
        n70 n70VarL;
        mc2 mc2Var = this.a;
        pq3 pq3Var = (pq3) mc2Var.h;
        String str = fa2Var.i;
        lf4 lf4Var = hg4.C.c;
        if (lf4.e(str)) {
            n70VarL = pu1.B(new my2(1));
        } else {
            n70VarL = pu1.L(((ld2) ((pq3) mc2Var.g)).c(new gs1(mc2Var, fa2Var, 7)), ExecutionException.class, fi1.d, pq3Var);
        }
        wo3 wo3VarL = pu1.L(n70VarL, my2.class, new ux2(mc2Var, fa2Var, Binder.getCallingUid(), 0), pq3Var);
        aa3 aa3VarL = aa3.l(this.g, 11);
        qb1.C(wo3VarL, aa3VarL);
        n70 n70VarO = pu1.O(wo3VarL, new u42(6, this), this.b);
        if (((Boolean) tw1.e.c.a(mz1.Y5)).booleanValue()) {
            n70VarO = pu1.L(pu1.N(n70VarO, ((Integer) r2.c.a(mz1.Z5)).intValue(), TimeUnit.SECONDS, this.d), TimeoutException.class, fi1.e, md2.g);
        }
        qb1.P(n70VarO, this.f, aa3VarL, false);
        n70VarO.c(new jq3(n70VarO, new zs1(22, this), 0), md2.g);
        return n70VarO;
    }
}
