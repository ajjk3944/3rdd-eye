package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xj2 implements ov1, en2, ye4, dn2 {
    public final qj2 f;
    public final rj2 g;
    public final p62 i;
    public final Executor j;
    public final ym k;
    public final HashSet h = new HashSet();
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final wj2 m = new wj2();
    public boolean n = false;
    public WeakReference o = new WeakReference(this);

    public xj2(l62 l62Var, rj2 rj2Var, Executor executor, qj2 qj2Var, ym ymVar) {
        this.f = qj2Var;
        Charset charset = h62.a;
        l62Var.a();
        this.i = new p62(0, l62Var.b);
        this.g = rj2Var;
        this.j = executor;
        this.k = ymVar;
    }

    @Override // defpackage.ye4
    public final synchronized void B1() {
        this.m.b = false;
        i();
    }

    @Override // defpackage.dn2
    public final synchronized void D0() {
        if (this.l.compareAndSet(false, true)) {
            qj2 qj2Var = this.f;
            l62 l62Var = qj2Var.b;
            pj2 pj2Var = qj2Var.e;
            l62Var.a();
            n70 n70Var = l62Var.b;
            z02 z02Var = new z02("/updateActiveView", pj2Var, 1);
            ld2 ld2Var = md2.g;
            l62Var.b = pu1.O(n70Var, z02Var, ld2Var);
            pj2 pj2Var2 = qj2Var.f;
            l62Var.a();
            l62Var.b = pu1.O(l62Var.b, new z02("/untrackActiveViewUnit", pj2Var2, 1), ld2Var);
            qj2Var.d = this;
            i();
        }
    }

    @Override // defpackage.ov1
    public final synchronized void S0(nv1 nv1Var) {
        wj2 wj2Var = this.m;
        wj2Var.a = nv1Var.j;
        wj2Var.e = nv1Var;
        i();
    }

    @Override // defpackage.ye4
    public final synchronized void U() {
        this.m.b = true;
        i();
    }

    public final void a() {
        Iterator it = this.h.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            qj2 qj2Var = this.f;
            if (!zHasNext) {
                l62 l62Var = qj2Var.b;
                pj2 pj2Var = qj2Var.e;
                n70 n70Var = l62Var.b;
                dn1 dn1Var = new dn1(str2, pj2Var, 1);
                ld2 ld2Var = md2.g;
                rp3 rp3VarP = pu1.P(n70Var, dn1Var, ld2Var);
                l62Var.b = rp3VarP;
                l62Var.b = pu1.P(rp3VarP, new dn1(str, qj2Var.f, 1), ld2Var);
                return;
            }
            ag2 ag2Var = (ag2) it.next();
            ag2Var.f1("/updateActiveView", qj2Var.e);
            ag2Var.f1("/untrackActiveViewUnit", qj2Var.f);
        }
    }

    @Override // defpackage.en2
    public final synchronized void h(Context context) {
        this.m.d = "u";
        i();
        a();
        this.n = true;
    }

    public final synchronized void i() {
        try {
            if (this.o.get() == null) {
                synchronized (this) {
                    a();
                    this.n = true;
                }
                return;
            }
            if (this.n || !this.l.get()) {
                return;
            }
            try {
                wj2 wj2Var = this.m;
                this.k.getClass();
                wj2Var.c = SystemClock.elapsedRealtime();
                JSONObject jSONObjectP = this.g.p(wj2Var);
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    this.j.execute(new tj2(jSONObjectP, (ag2) it.next()));
                }
                p62 p62Var = this.i;
                p62Var.getClass();
                z02 z02Var = new z02(p62Var, jSONObjectP, 2);
                n70 n70Var = p62Var.b;
                ld2 ld2Var = md2.g;
                qp3 qp3VarO = pu1.O(n70Var, z02Var, ld2Var);
                qp3VarO.c(new jq3(qp3VarO, new bs3("ActiveViewListener.callActiveViewJs", 2), 0), ld2Var);
                return;
            } catch (Exception unused) {
                gi2.R();
                return;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // defpackage.en2
    public final synchronized void l(Context context) {
        this.m.b = true;
        i();
    }

    @Override // defpackage.en2
    public final synchronized void p(Context context) {
        this.m.b = false;
        i();
    }

    @Override // defpackage.ye4
    public final void E1() {
    }

    @Override // defpackage.ye4
    public final void M1() {
    }

    @Override // defpackage.ye4
    public final void R2() {
    }

    @Override // defpackage.ye4
    public final void Y() {
    }

    @Override // defpackage.ye4
    public final void f() {
    }

    @Override // defpackage.ye4
    public final void f3() {
    }

    @Override // defpackage.ye4
    public final void h3() {
    }

    @Override // defpackage.ye4
    public final void m2() {
    }

    @Override // defpackage.ye4
    public final void G1(int i) {
    }
}
