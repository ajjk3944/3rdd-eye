package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class dh2 implements rs1 {
    public final Context f;
    public final z71 g;

    public dh2(Context context, e51 e51Var) {
        int i;
        z71 z71Var;
        this.f = context;
        iz1 iz1Var = mz1.X2;
        tw1 tw1Var = tw1.e;
        int iIntValue = ((Integer) tw1Var.c.a(iz1Var)).intValue();
        if (iIntValue != 1) {
            i = 3;
            if (iIntValue != 2 && iIntValue == 3) {
                i = 4;
            }
        } else {
            i = 2;
        }
        zf3 zf3VarE = ag3.E();
        float fFloatValue = ((Float) tw1Var.c.a(mz1.e3)).floatValue();
        zf3VarE.b();
        ((ag3) zf3VarE.g).G(fFloatValue);
        ag3 ag3Var = (ag3) zf3VarE.d();
        bg3 bg3VarE = cg3.E();
        boolean zBooleanValue = ((Boolean) tw1Var.c.a(mz1.f3)).booleanValue();
        bg3VarE.b();
        ((cg3) bg3VarE.g).G(zBooleanValue);
        long jLongValue = ((Long) tw1Var.c.a(mz1.h3)).longValue();
        bg3VarE.b();
        ((cg3) bg3VarE.g).H(jLongValue);
        cg3 cg3Var = (cg3) bg3VarE.d();
        uf3 uf3VarU = vf3.U();
        uf3VarU.b();
        ((vf3) uf3VarU.g).C(i);
        String str = e51Var.f;
        uf3VarU.b();
        ((vf3) uf3VarU.g).W(str);
        boolean zBooleanValue2 = ((Boolean) tw1Var.c.a(mz1.B2)).booleanValue();
        uf3VarU.b();
        ((vf3) uf3VarU.g).V(zBooleanValue2);
        boolean z = ((Integer) tw1Var.c.a(mz1.U2)).intValue() == -1;
        uf3VarU.b();
        ((vf3) uf3VarU.g).A(z);
        long jIntValue = ((Integer) tw1Var.c.a(mz1.W2)).intValue();
        uf3VarU.b();
        ((vf3) uf3VarU.g).b0(jIntValue);
        long jLongValue2 = ((Long) tw1Var.c.a(mz1.g3)).longValue();
        uf3VarU.b();
        ((vf3) uf3VarU.g).Z(jLongValue2);
        long jIntValue2 = ((Integer) tw1Var.c.a(mz1.V2)).intValue();
        uf3VarU.b();
        ((vf3) uf3VarU.g).Y(jIntValue2);
        uf3VarU.b();
        ((vf3) uf3VarU.g).X(ag3Var);
        uf3VarU.b();
        ((vf3) uf3VarU.g).a0(cg3Var);
        vf3 vf3Var = (vf3) uf3VarU.d();
        ld2 ld2Var = md2.a;
        synchronized (z71.h) {
            try {
                if (z71.i == null) {
                    z71.i = new z71(context, ld2Var, vf3Var);
                }
                z71Var = z71.i;
            } finally {
            }
        }
        this.g = z71Var;
        og3 og3Var = ((tf3) z71Var.g).a;
        synchronized (og3Var) {
            try {
                if (og3Var.e != null) {
                    return;
                }
                Set set = (Set) og3Var.b.d();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ng3) it.next()).a());
                }
                gk3 gk3Var = (gk3) og3Var.d.d();
                rp3 rp3VarP = pu1.P(new zp3(xm3.m(arrayList), true), gj1.v, og3Var.c);
                gk3Var.d(2, rp3VarP);
                og3Var.e = rp3VarP;
                Iterator it2 = ((Set) og3Var.a.d()).iterator();
                while (it2.hasNext()) {
                    ((ng3) it2.next()).a();
                }
                if (og3Var.e != null) {
                } else {
                    throw null;
                }
            } finally {
            }
        }
    }

    @Override // defpackage.rs1
    public final void a(int i, int i2, int i3) {
        j63 j63Var = sv1.f.a;
        Context context = this.f;
        long j = i3;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j, 0, j63.b(context, i), j63.m(context.getResources().getDisplayMetrics(), i2), 0);
        z71 z71Var = this.g;
        z71Var.t(motionEventObtain);
        motionEventObtain.recycle();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j, 2, j63.m(context.getResources().getDisplayMetrics(), i), j63.m(context.getResources().getDisplayMetrics(), i2), 0);
        z71Var.t(motionEventObtain2);
        motionEventObtain2.recycle();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j, 1, j63.m(context.getResources().getDisplayMetrics(), i), j63.m(context.getResources().getDisplayMetrics(), i2), 0);
        z71Var.t(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // defpackage.rs1
    public final String b(Context context) {
        return this.g.o(context);
    }

    @Override // defpackage.rs1
    public final void c(StackTraceElement[] stackTraceElementArr) {
        z71 z71Var = this.g;
        List listAsList = Arrays.asList(stackTraceElementArr);
        bk3 bk3Var = ((tf3) z71Var.g).c.b;
        synchronized (bk3Var) {
            ArrayList arrayList = bk3Var.a;
            arrayList.clear();
            arrayList.addAll(listAsList);
        }
    }

    @Override // defpackage.rs1
    public final String d(Context context) {
        return this.g.o(context);
    }

    @Override // defpackage.rs1
    public final void f(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.g.t(motionEvent);
    }

    @Override // defpackage.rs1
    public final String g(Context context, String str, View view) {
        return this.g.q(context, str, view);
    }

    @Override // defpackage.rs1
    public final String h(Context context, String str, View view, Activity activity) {
        return this.g.q(context, str, view);
    }

    @Override // defpackage.rs1
    public final String i(Context context, View view, Activity activity) {
        String string;
        rp3 rp3Var;
        tf3 tf3Var = (tf3) this.g.g;
        fk3 fk3VarA = tf3Var.d.a(4);
        try {
            try {
                try {
                    fk3VarA.a();
                    og3 og3Var = tf3Var.a;
                    synchronized (og3Var) {
                        rp3Var = og3Var.e;
                        if (rp3Var == null) {
                            throw null;
                        }
                    }
                    string = (String) pu1.O(rp3Var, new k62(tf3Var, context, view, activity), dq3.f).get(tf3Var.e, TimeUnit.MILLISECONDS);
                } catch (ExecutionException e) {
                    e = e;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    fk3VarA.b(e);
                    string = Integer.toString(3);
                } catch (Throwable th) {
                    fk3VarA.b(th);
                    throw th;
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                fk3VarA.b(e2);
                string = "";
            } catch (TimeoutException e3) {
                fk3VarA.b(e3);
                string = Integer.toString(17);
            }
            fk3VarA.c();
            return string;
        } catch (Throwable th2) {
            fk3VarA.c();
            throw th2;
        }
    }

    @Override // defpackage.rs1
    public final void e(View view) {
    }
}
