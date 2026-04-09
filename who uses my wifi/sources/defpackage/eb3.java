package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class eb3 {
    public final Context a;
    public final Executor b;
    public final qq3 c;
    public final ug4 d;
    public final bb3 e;
    public final ea3 f;
    public final ch2 g;

    public eb3(Context context, ld2 ld2Var, qq3 qq3Var, ug4 ug4Var, bb3 bb3Var, ea3 ea3Var, ch2 ch2Var) {
        this.a = context;
        this.b = ld2Var;
        this.c = qq3Var;
        this.d = ug4Var;
        this.e = bb3Var;
        this.f = ea3Var;
        this.g = ch2Var;
    }

    public final void a(List list, x34 x34Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), x34Var, null, null);
        }
    }

    public final void b(String str, x34 x34Var, da3 da3Var, ao2 ao2Var) {
        n70 n70VarC;
        aa3 aa3VarL = null;
        if (ea3.a() && ((Boolean) n02.d.w()).booleanValue()) {
            aa3VarL = aa3.l(this.a, 14);
            aa3VarL.a();
        }
        aa3 aa3Var = aa3VarL;
        if (x34Var != null) {
            n70VarC = new g4((cd4) x34Var.f, this.d, this.c, this.e, this.g, 16).g(str);
        } else {
            n70VarC = ((ld2) this.c).c(new gs1(this, str, 11));
        }
        n70VarC.c(new jq3(n70VarC, new mc2(this, aa3Var, da3Var, ao2Var, 21), 0), this.b);
    }
}
