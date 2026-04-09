package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gb4 implements Runnable, rs1 {
    public static final long u = System.currentTimeMillis();
    public boolean i;
    public final boolean j;
    public final boolean k;
    public final ExecutorService l;
    public final gd3 m;
    public Context n;
    public final Context o;
    public e51 p;
    public final e51 q;
    public final boolean r;
    public int t;
    public final Vector f = new Vector();
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public final CountDownLatch s = new CountDownLatch(1);

    public gb4(Context context, e51 e51Var) {
        this.n = context;
        this.o = context;
        this.p = e51Var;
        this.q = e51Var;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.l = executorServiceNewCachedThreadPool;
        iz1 iz1Var = mz1.E2;
        tw1 tw1Var = tw1.e;
        boolean zBooleanValue = ((Boolean) tw1Var.c.a(iz1Var)).booleanValue();
        this.r = zBooleanValue;
        this.m = gd3.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        iz1 iz1Var2 = mz1.B2;
        kz1 kz1Var = tw1Var.c;
        this.j = ((Boolean) kz1Var.a(iz1Var2)).booleanValue();
        this.k = ((Boolean) kz1Var.a(mz1.F2)).booleanValue();
        if (((Boolean) kz1Var.a(mz1.D2)).booleanValue()) {
            this.t = 2;
        } else {
            this.t = 1;
        }
        if (!((Boolean) kz1Var.a(mz1.O3)).booleanValue()) {
            this.i = l();
        }
        if (((Boolean) kz1Var.a(mz1.H3)).booleanValue()) {
            md2.a.execute(this);
            return;
        }
        j63 j63Var = sv1.f.a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            md2.a.execute(this);
        } else {
            run();
        }
    }

    public static final ps1 p(Context context, e51 e51Var, boolean z, boolean z2) {
        ps1 ps1VarM;
        pq1 pq1VarE = qq1.E();
        pq1VarE.b();
        ((qq1) pq1VarE.g).G(z);
        String str = e51Var.f;
        pq1VarE.b();
        ((qq1) pq1VarE.g).F(str);
        qq1 qq1Var = (qq1) pq1VarE.d();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        synchronized (ps1.class) {
            hd3 hd3Var = new hd3();
            hd3Var.b = false;
            byte b = (byte) (hd3Var.f | 1);
            hd3Var.c = true;
            hd3Var.d = 100L;
            hd3Var.e = 300L;
            hd3Var.f = (byte) (((byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16)) | 32);
            String strA = qq1Var.A();
            if (strA == null) {
                throw new NullPointerException("Null clientVersion");
            }
            hd3Var.a = strA;
            hd3Var.b = qq1Var.B();
            hd3Var.f = (byte) (hd3Var.f | 1);
            ps1VarM = ps1.m(context, Executors.newCachedThreadPool(), hd3Var.a(), z2);
        }
        return ps1VarM;
    }

    @Override // defpackage.rs1
    public final void a(int i, int i2, int i3) {
        rs1 rs1VarO = o();
        if (rs1VarO != null) {
            m();
            rs1VarO.a(i, i2, i3);
        } else {
            this.f.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
    }

    @Override // defpackage.rs1
    public final String b(Context context) {
        try {
            return (String) pu1.D(new gs1(this, context, 16), this.l).get(((Integer) tw1.e.c.a(mz1.V2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.q.f;
            long j = u;
            try {
                xr1 xr1VarA = yr1.A();
                xr1VarA.b();
                ((yr1) xr1VarA.g).C(str);
                xr1VarA.b();
                ((yr1) xr1VarA.g).B("0.460000000");
                String packageName = context.getPackageName();
                xr1VarA.b();
                ((yr1) xr1VarA.g).E(packageName);
                long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
                xr1VarA.b();
                ((yr1) xr1VarA.g).G(jCurrentTimeMillis);
                long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                xr1VarA.b();
                ((yr1) xr1VarA.g).D(jCurrentTimeMillis2);
                try {
                    long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    xr1VarA.b();
                    ((yr1) xr1VarA.g).F(j2);
                } catch (PackageManager.NameNotFoundException unused3) {
                    xr1VarA.b();
                    ((yr1) xr1VarA.g).F(-1L);
                }
                bs1 bs1VarB = hs1.b(null, ((yr1) xr1VarA.d()).b());
                bs1VarB.b();
                ((cs1) bs1VarB.g).D(5);
                bs1VarB.b();
                ((cs1) bs1VarB.g).E(2);
                return Base64.encodeToString(((cs1) bs1VarB.d()).b(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // defpackage.rs1
    public final void c(StackTraceElement[] stackTraceElementArr) {
        rs1 rs1VarO;
        rs1 rs1VarO2;
        if (((Boolean) tw1.e.c.a(mz1.c3)).booleanValue()) {
            if (this.s.getCount() != 0 || (rs1VarO2 = o()) == null) {
                return;
            }
            rs1VarO2.c(stackTraceElementArr);
            return;
        }
        if (!j() || (rs1VarO = o()) == null) {
            return;
        }
        rs1VarO.c(stackTraceElementArr);
    }

    @Override // defpackage.rs1
    public final String d(Context context) {
        return k(context);
    }

    @Override // defpackage.rs1
    public final void e(View view) {
        rs1 rs1VarO = o();
        if (rs1VarO != null) {
            rs1VarO.e(view);
        }
    }

    @Override // defpackage.rs1
    public final void f(MotionEvent motionEvent) {
        rs1 rs1VarO = o();
        if (rs1VarO == null) {
            this.f.add(new Object[]{motionEvent});
        } else {
            m();
            rs1VarO.f(motionEvent);
        }
    }

    @Override // defpackage.rs1
    public final String g(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // defpackage.rs1
    public final String h(Context context, String str, View view, Activity activity) {
        if (!j()) {
            return "";
        }
        rs1 rs1VarO = o();
        if (((Boolean) tw1.e.c.a(mz1.vb)).booleanValue()) {
            lf4 lf4Var = hg4.C.c;
            lf4.j(view, 4);
        }
        if (rs1VarO == null) {
            return "";
        }
        m();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return rs1VarO.h(context, str, view, activity);
    }

    @Override // defpackage.rs1
    public final String i(Context context, View view, Activity activity) {
        iz1 iz1Var = mz1.ub;
        tw1 tw1Var = tw1.e;
        kz1 kz1Var = tw1Var.c;
        kz1 kz1Var2 = tw1Var.c;
        if (!((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
            rs1 rs1VarO = o();
            if (((Boolean) kz1Var2.a(mz1.vb)).booleanValue()) {
                lf4 lf4Var = hg4.C.c;
                lf4.j(view, 2);
            }
            return rs1VarO != null ? rs1VarO.i(context, view, activity) : "";
        }
        if (!j()) {
            return "";
        }
        rs1 rs1VarO2 = o();
        if (((Boolean) kz1Var2.a(mz1.vb)).booleanValue()) {
            lf4 lf4Var2 = hg4.C.c;
            lf4.j(view, 2);
        }
        return rs1VarO2 != null ? rs1VarO2.i(context, view, activity) : "";
    }

    public final boolean j() throws InterruptedException {
        try {
            this.s.await();
            return true;
        } catch (InterruptedException unused) {
            gi2.q0(5);
            return false;
        }
    }

    public final String k(Context context) {
        rs1 rs1VarO;
        if (!j() || (rs1VarO = o()) == null) {
            return "";
        }
        m();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return rs1VarO.d(context);
    }

    public final boolean l() throws IOException {
        Context context = this.n;
        yf3 yf3Var = new yf3(this);
        de3 de3Var = new de3(context, gi2.J(context, this.m), yf3Var, ((Boolean) tw1.e.c.a(mz1.C2)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (de3.k) {
            try {
                fv1 fv1VarR = de3Var.r(1);
                if (fv1VarR == null) {
                    de3Var.p(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileJ = de3Var.j(fv1VarR.A());
                if (!new File(fileJ, "pcam.jar").exists()) {
                    de3Var.p(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileJ, "pcbc").exists()) {
                    de3Var.p(5019, jCurrentTimeMillis);
                    return true;
                }
                de3Var.p(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        rs1 rs1VarO = o();
        Vector vector = this.f;
        if (vector.isEmpty() || rs1VarO == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            int length = objArr.length;
            if (length == 1) {
                rs1VarO.f((MotionEvent) objArr[0]);
            } else if (length == 3) {
                rs1VarO.a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        vector.clear();
    }

    public final void n(boolean z) {
        String str = this.p.f;
        Context context = this.n;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        pq1 pq1VarE = qq1.E();
        pq1VarE.b();
        ((qq1) pq1VarE.g).G(z);
        pq1VarE.b();
        ((qq1) pq1VarE.g).F(str);
        qq1 qq1Var = (qq1) pq1VarE.d();
        wy0 wy0Var = new wy0();
        wy0Var.g = qq1Var.A();
        wy0Var.f = qq1Var.B();
        wy0Var.h = qq1Var.C();
        qq1Var.D();
        synchronized (ss1.class) {
            try {
                if (!ss1.E) {
                    ss1.F = System.currentTimeMillis() / 1000;
                    ss1.C = ss1.q(context, wy0Var.f);
                    iz1 iz1Var = mz1.J3;
                    tw1 tw1Var = tw1.e;
                    if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                        ss1.G = zs1.D(context);
                    }
                    ExecutorService executorService = ss1.C.b;
                    if (((Boolean) tw1Var.c.a(mz1.K3)).booleanValue() && executorService != null) {
                        ss1.H = pt1.a(context, executorService);
                    }
                    if (((Boolean) tw1Var.c.a(mz1.S2)).booleanValue()) {
                        ss1.I = new xe1();
                    }
                    if (((Boolean) tw1Var.c.a(mz1.Y2)).booleanValue() || ((yq1) wy0Var.h).E()) {
                        ss1.K = new vg0(context, executorService);
                    }
                    if (((Boolean) tw1Var.c.a(mz1.T2)).booleanValue() || ((yq1) wy0Var.h).C()) {
                        ss1.J = new t83(context, executorService, (yq1) wy0Var.h, ss1.K);
                    }
                    ss1.E = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g.set(new ss1(context, wy0Var));
    }

    public final rs1 o() {
        return ((!this.j || this.i) ? this.t : 1) == 2 ? (rs1) this.h.get() : (rs1) this.g.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            iz1 iz1Var = mz1.O3;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                this.i = l();
            }
            boolean z2 = this.p.i;
            boolean z3 = false;
            if (!((Boolean) tw1Var.c.a(mz1.f1)).booleanValue() && z2) {
                z3 = true;
            }
            if (((!this.j || this.i) ? this.t : 1) == 1) {
                n(z3);
                if (this.t == 2) {
                    this.l.execute(new n82(this, z3, 2));
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    ps1 ps1VarP = p(this.n, this.p, z3, this.r);
                    this.h.set(ps1VarP);
                    if (this.k) {
                        synchronized (ps1VarP) {
                            z = ps1VarP.v;
                        }
                        if (!z) {
                            this.t = 1;
                            n(z3);
                        }
                    }
                } catch (NullPointerException e) {
                    this.t = 1;
                    n(z3);
                    this.m.c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            this.s.countDown();
            this.n = null;
            this.p = null;
        } catch (Throwable th) {
            this.s.countDown();
            this.n = null;
            this.p = null;
            throw th;
        }
    }
}
