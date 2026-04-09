package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nj2 implements um2, rn2, dn2, fd1, bn2, tp2, do2 {
    public final Context f;
    public final Executor g;
    public final Executor h;
    public final ScheduledExecutorService i;
    public final h83 j;
    public final a83 k;
    public final db3 l;
    public final q83 m;
    public final vs1 n;
    public final f02 o;
    public final WeakReference p;
    public final WeakReference q;
    public final t83 r;
    public final ao2 s;
    public final gm2 t;
    public boolean u;
    public final AtomicBoolean v = new AtomicBoolean();

    public nj2(Context context, ld2 ld2Var, Executor executor, ScheduledExecutorService scheduledExecutorService, h83 h83Var, a83 a83Var, db3 db3Var, q83 q83Var, View view, ag2 ag2Var, vs1 vs1Var, f02 f02Var, t83 t83Var, ao2 ao2Var, gm2 gm2Var) {
        this.f = context;
        this.g = ld2Var;
        this.h = executor;
        this.i = scheduledExecutorService;
        this.j = h83Var;
        this.k = a83Var;
        this.l = db3Var;
        this.m = q83Var;
        this.n = vs1Var;
        this.p = new WeakReference(view);
        this.q = new WeakReference(ag2Var);
        this.o = f02Var;
        this.r = t83Var;
        this.s = ao2Var;
        this.t = gm2Var;
    }

    @Override // defpackage.fd1
    public final void C() {
        boolean zBooleanValue = ((Boolean) tw1.e.c.a(mz1.B0)).booleanValue();
        h83 h83Var = this.j;
        if ((zBooleanValue && ((c83) h83Var.b.g).h) || !((Boolean) r02.d.w()).booleanValue()) {
            a83 a83Var = this.k;
            this.m.b(true == hg4.C.h.i(this.f) ? 2 : 1, this.l.a(h83Var, a83Var, a83Var.c));
        } else {
            f02 f02Var = this.o;
            f02Var.getClass();
            xo3 xo3VarJ = pu1.J(gq3.r((gq3) pu1.N(gq3.r(lq3.g), ((Long) r02.c.w()).longValue(), TimeUnit.MILLISECONDS, f02Var.c)), Throwable.class, gj1.h, md2.g);
            xo3VarJ.c(new jq3(xo3VarJ, new f20(18, this), 0), this.g);
        }
    }

    @Override // defpackage.dn2
    public final void D0() {
        if (this.v.compareAndSet(false, true)) {
            iz1 iz1Var = mz1.b4;
            tw1 tw1Var = tw1.e;
            kz1 kz1Var = tw1Var.c;
            kz1 kz1Var2 = tw1Var.c;
            int iIntValue = ((Integer) kz1Var.a(iz1Var)).intValue();
            if (iIntValue > 0) {
                h(iIntValue, ((Integer) kz1Var2.a(mz1.c4)).intValue());
            } else if (!((Boolean) kz1Var2.a(mz1.a4)).booleanValue()) {
                l();
            } else {
                this.h.execute(new lj2(this, 0));
            }
        }
    }

    @Override // defpackage.um2
    public final void J(ka2 ka2Var, String str, String str2) {
        i83 i83Var;
        a83 a83Var = this.k;
        List list = a83Var.h;
        db3 db3Var = this.l;
        db3Var.getClass();
        ArrayList arrayList = new ArrayList();
        db3Var.h.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = ka2Var.f;
            String string = Integer.toString(ka2Var.g);
            boolean zBooleanValue = ((Boolean) tw1.e.c.a(mz1.T3)).booleanValue();
            jq0 fl3Var = xk3.f;
            if (zBooleanValue) {
                j83 j83Var = db3Var.g;
                if (j83Var != null && (i83Var = j83Var.a) != null) {
                    fl3Var = new fl3(i83Var);
                }
            } else {
                i83 i83Var2 = db3Var.f;
                if (i83Var2 != null) {
                    fl3Var = new fl3(i83Var2);
                }
            }
            String str4 = (String) fl3Var.c(gj1.u).b();
            String str5 = (String) fl3Var.c(gj1.t).b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m54.E(db3.c(db3.c(db3.c(db3.c(db3.c(db3.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", string), "@gw_sdkver@", db3Var.b), db3Var.e, a83Var.W, a83Var.w0));
            }
        } catch (RemoteException e) {
            gi2.c0("Unable to determine award type and amount.", e);
        }
        this.m.a(arrayList, null);
    }

    @Override // defpackage.um2
    public final void b() {
        a83 a83Var = this.k;
        this.m.a(this.l.a(this.j, a83Var, a83Var.g), null);
    }

    @Override // defpackage.um2
    public final void c() {
        a83 a83Var = this.k;
        this.m.a(this.l.a(this.j, a83Var, a83Var.i), null);
    }

    @Override // defpackage.rn2
    public final synchronized void e() {
        t83 t83Var;
        long j;
        try {
            if (this.u) {
                ArrayList arrayList = new ArrayList(p());
                a83 a83Var = this.k;
                arrayList.addAll(a83Var.f);
                this.m.a(this.l.b(this.j, a83Var, true, null, null, arrayList, null), null);
            } else {
                q83 q83Var = this.m;
                db3 db3Var = this.l;
                h83 h83Var = this.j;
                a83 a83Var2 = this.k;
                q83Var.a(db3Var.a(h83Var, a83Var2, a83Var2.m), null);
                if (((Boolean) tw1.e.c.a(mz1.X3)).booleanValue() && (t83Var = this.r) != null) {
                    List list = ((a83) t83Var.h).m;
                    String strD = ((o13) t83Var.i).d();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(db3.c((String) it.next(), "@gw_adnetstatus@", strD));
                    }
                    o13 o13Var = (o13) t83Var.i;
                    synchronized (o13Var) {
                        j = o13Var.h;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        arrayList3.add(db3.c((String) obj, "@gw_ttr@", Long.toString(j, 10)));
                    }
                    q83Var.a(db3Var.a((h83) t83Var.g, (a83) t83Var.h, arrayList3), null);
                }
                q83Var.a(db3Var.a(h83Var, a83Var2, a83Var2.f), null);
            }
            this.u = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.p.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            l();
        } else {
            this.i.schedule(new mj2(this, i, i2, 0), i2, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // defpackage.tp2
    public final void j() {
        a83 a83Var = this.k;
        this.m.a(this.l.a(this.j, a83Var, a83Var.u0), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.AbstractCollection, java.util.List] */
    @Override // defpackage.do2
    public final void k() {
        a83 a83Var = this.k;
        if (a83Var.e == 4) {
            this.m.a(this.l.a(this.j, a83Var, a83Var.A0), null);
        }
    }

    public final void l() {
        int i;
        a83 a83Var = this.k;
        List list = a83Var.d;
        if (list == null || list.isEmpty()) {
            return;
        }
        iz1 iz1Var = mz1.S3;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        String strI = ((Boolean) kz1Var.a(iz1Var)).booleanValue() ? this.n.b.i(this.f, (View) this.p.get(), null) : null;
        if ((((Boolean) kz1Var2.a(mz1.B0)).booleanValue() && ((c83) this.j.b.g).h) || !((Boolean) r02.h.w()).booleanValue()) {
            this.m.a(this.l.b(this.j, a83Var, false, strI, null, p(), this.t), this.s);
            return;
        }
        if (((Boolean) r02.g.w()).booleanValue() && ((i = a83Var.b) == 1 || i == 2 || i == 5)) {
        }
        gq3 gq3Var = (gq3) pu1.N(gq3.r(lq3.g), ((Long) kz1Var2.a(mz1.e1)).longValue(), TimeUnit.MILLISECONDS, this.i);
        gq3Var.c(new jq3(gq3Var, new vq2((Object) this, (Object) strI, 28, false), 0), this.g);
    }

    public final List p() {
        boolean zBooleanValue = ((Boolean) tw1.e.c.a(mz1.hc)).booleanValue();
        a83 a83Var = this.k;
        if (zBooleanValue) {
            lf4 lf4Var = hg4.C.c;
            Context context = this.f;
            if (lf4.d(context)) {
                Object systemService = context.getSystemService("display");
                Integer numValueOf = systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null;
                if (numValueOf != null) {
                    int iMin = Math.min(numValueOf.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a83Var.d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return a83Var.d;
    }

    @Override // defpackage.bn2
    public final void s(nx2 nx2Var) {
        if (((Boolean) tw1.e.c.a(mz1.D1)).booleanValue()) {
            int i = nx2Var.f;
            ArrayList arrayList = new ArrayList();
            a83 a83Var = this.k;
            for (String str : a83Var.o) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(db3.c(str, "@gw_mpe@", sb.toString()));
            }
            this.m.a(this.l.a(this.j, a83Var, arrayList), null);
        }
    }

    @Override // defpackage.um2
    public final void T() {
    }

    @Override // defpackage.um2
    public final void a() {
    }

    @Override // defpackage.um2
    public final void r() {
    }
}
