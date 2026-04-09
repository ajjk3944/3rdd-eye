package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Optional;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mj3 implements kj3 {
    public final uj3 a;
    public final rj3 b;
    public final ExecutorService c;
    public final xj3 d;
    public final gk3 e;
    public final Object f = new Object();
    public final String g;
    public final long h;
    public final long i;
    public cj1 j;

    public mj3(uj3 uj3Var, rj3 rj3Var, xj3 xj3Var, gk3 gk3Var, vf3 vf3Var, ExecutorService executorService) {
        this.a = uj3Var;
        this.b = rj3Var;
        this.c = executorService;
        this.d = xj3Var;
        this.e = gk3Var;
        this.g = vf3Var.E();
        this.h = vf3Var.M();
        this.i = vf3Var.L();
    }

    @Override // defpackage.kj3
    public final String a() {
        synchronized (this.f) {
            try {
                cj1 cj1Var = this.j;
                if (cj1Var == null) {
                    return "3.-1";
                }
                return (String) cj1Var.h;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kj3
    public final ar3 b(Context context, View view, Activity activity) {
        return pu1.D(new bt2(this, context, view, activity, 4), this.c);
    }

    @Override // defpackage.kj3
    public final void c(InputEvent inputEvent) {
        try {
            synchronized (this.f) {
                try {
                    cj1 cj1Var = this.j;
                    if (cj1Var != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        ((nb) cj1Var.i).j(cj1Var.g, Optional.of(map));
                    } else {
                        this.e.b(20105);
                    }
                } finally {
                }
            }
        } catch (hp1 | kp1 e) {
            this.e.c(20104, e);
        }
    }

    @Override // defpackage.kj3
    public final gq3 d() {
        gq3 gq3VarR = gq3.r(this.b.a());
        dj3 dj3Var = dj3.d;
        ExecutorService executorService = this.c;
        return pu1.O(pu1.J(gq3VarR, Throwable.class, dj3Var, executorService), new u42(17, this), executorService);
    }

    @Override // defpackage.kj3
    public final int e() {
        return 4;
    }

    @Override // defpackage.kj3
    public final ar3 f(Context context, String str, View view) {
        return pu1.D(new bt2(this, context, str, view, 5), this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.util.HashMap r13) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj3.g(java.util.HashMap):void");
    }

    @Override // defpackage.kj3
    public final ar3 h(Context context) {
        return pu1.D(new gs1(this, context, 15), this.c);
    }

    public final String i(HashMap map) {
        String strG;
        gk3 gk3Var = this.e;
        try {
            gk3Var.a(20110).a();
            synchronized (this.f) {
                try {
                    cj1 cj1Var = this.j;
                    if (cj1Var == null) {
                        gk3Var.b(20109);
                        strG = "";
                    } else {
                        byte[] bArr = (byte[]) ((nb) cj1Var.i).j(cj1Var.f, Optional.of(map));
                        ho3 ho3Var = jo3.e;
                        if (ho3Var.b != null) {
                            ho3Var = new ho3(ho3Var.a, (Character) null);
                        }
                        strG = ho3Var.g(bArr.length, bArr);
                    }
                } finally {
                }
            }
            return strG;
        } finally {
        }
    }
}
