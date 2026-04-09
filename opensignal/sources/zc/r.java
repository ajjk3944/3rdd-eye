package zc;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: g, reason: collision with root package name */
    public final u.e f27118g;

    /* renamed from: r, reason: collision with root package name */
    public final u.e f27119r;

    /* renamed from: x, reason: collision with root package name */
    public long f27120x;

    public r(c1 c1Var) {
        super(c1Var);
        this.f27119r = new u.e(0);
        this.f27118g = new u.e(0);
    }

    public final void t1(long j, String str) {
        c1 c1Var = (c1) this.f1504d;
        if (str == null || str.length() == 0) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.b("Ad unit id must be a non-empty string");
        } else {
            a1 a1Var = c1Var.B;
            c1.g(a1Var);
            a1Var.B1(new a(this, str, j, 0));
        }
    }

    public final void u1(long j, String str) {
        c1 c1Var = (c1) this.f1504d;
        if (str == null || str.length() == 0) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.b("Ad unit id must be a non-empty string");
        } else {
            a1 a1Var = c1Var.B;
            c1.g(a1Var);
            a1Var.B1(new a(this, str, j, 1));
        }
    }

    public final void v1(long j) {
        o2 o2Var = ((c1) this.f1504d).H;
        c1.f(o2Var);
        l2 l2VarY1 = o2Var.y1(false);
        u.e eVar = this.f27118g;
        Iterator it = ((u.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            x1(str, j - ((Long) eVar.get(str)).longValue(), l2VarY1);
        }
        if (!eVar.isEmpty()) {
            w1(j - this.f27120x, l2VarY1);
        }
        y1(j);
    }

    public final void w1(long j, l2 l2Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c1 c1Var = (c1) this.f1504d;
        if (l2Var == null) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.K.b("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.K.c(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            s3.j2(l2Var, bundle, true);
            d2 d2Var = c1Var.I;
            c1.f(d2Var);
            d2Var.z1("am", "_xa", bundle);
        }
    }

    public final void x1(String str, long j, l2 l2Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c1 c1Var = (c1) this.f1504d;
        if (l2Var == null) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.K.b("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                j0 j0Var2 = c1Var.f26889y;
                c1.g(j0Var2);
                j0Var2.K.c(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            s3.j2(l2Var, bundle, true);
            d2 d2Var = c1Var.I;
            c1.f(d2Var);
            d2Var.z1("am", "_xu", bundle);
        }
    }

    public final void y1(long j) {
        u.e eVar = this.f27118g;
        Iterator it = ((u.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.f27120x = j;
    }
}
