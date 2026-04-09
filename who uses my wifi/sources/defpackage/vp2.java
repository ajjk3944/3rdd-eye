package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vp2 extends f74 implements ov1 {
    public final WeakHashMap i;
    public final Context j;
    public final a83 k;

    public vp2(Context context, Set set, a83 a83Var) {
        super(set);
        this.i = new WeakHashMap(1);
        this.j = context;
        this.k = a83Var;
    }

    @Override // defpackage.ov1
    public final synchronized void S0(nv1 nv1Var) {
        P1(new of3(18, nv1Var));
    }

    public final synchronized void U1(View view) {
        pv1 pv1Var;
        try {
            WeakHashMap weakHashMap = this.i;
            pv1Var = (pv1) weakHashMap.get(view);
            if (pv1Var == null) {
                pv1 pv1Var2 = new pv1(this.j, view);
                pv1Var2.q.add(this);
                pv1Var2.d(3);
                weakHashMap.put(view, pv1Var2);
                pv1Var = pv1Var2;
            }
        } catch (Throwable th) {
            throw th;
        }
        if (this.k.X) {
            iz1 iz1Var = mz1.x1;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                long jLongValue = ((Long) tw1Var.c.a(mz1.w1)).longValue();
                rn1 rn1Var = pv1Var.n;
                synchronized (rn1Var.h) {
                    rn1Var.f = jLongValue;
                }
                return;
            }
            throw th;
        }
        rn1 rn1Var2 = pv1Var.n;
        long j = pv1.t;
        synchronized (rn1Var2.h) {
            rn1Var2.f = j;
        }
    }
}
