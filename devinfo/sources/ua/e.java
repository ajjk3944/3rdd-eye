package ua;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.aw0;
import com.google.android.gms.internal.ads.be;
import com.google.android.gms.internal.ads.de;
import com.google.android.gms.internal.ads.fk0;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.gv0;
import com.google.android.gms.internal.ads.hv0;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.kg;
import com.google.android.gms.internal.ads.mc;
import com.google.android.gms.internal.ads.me;
import com.google.android.gms.internal.ads.nc;
import com.google.android.gms.internal.ads.ne;
import com.google.android.gms.internal.ads.nf;
import com.google.android.gms.internal.ads.o1;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.rd;
import com.google.android.gms.internal.ads.rk;
import com.google.android.gms.internal.ads.sd;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.te;
import com.google.android.gms.internal.ads.vc;
import com.google.android.gms.internal.ads.vd;
import com.google.android.gms.internal.ads.wd;
import com.google.android.gms.internal.ads.yo0;
import com.google.android.gms.internal.ads.yr1;
import ec.p1;
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
import nm.d0;
import va.r;
import va.s;
import ya.f0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements Runnable, me {

    /* renamed from: p, reason: collision with root package name */
    public static final long f35230p = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    public boolean f35234d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f35235e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f35236f;
    public final ExecutorService g;

    /* renamed from: h, reason: collision with root package name */
    public final gv0 f35237h;

    /* renamed from: i, reason: collision with root package name */
    public Context f35238i;
    public final Context j;

    /* renamed from: k, reason: collision with root package name */
    public za.a f35239k;

    /* renamed from: l, reason: collision with root package name */
    public final za.a f35240l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f35241m;

    /* renamed from: o, reason: collision with root package name */
    public int f35243o;

    /* renamed from: a, reason: collision with root package name */
    public final Vector f35231a = new Vector();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f35232b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f35233c = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    public final CountDownLatch f35242n = new CountDownLatch(1);

    public e(Context context, za.a aVar) {
        this.f35238i = context;
        this.j = context;
        this.f35239k = aVar;
        this.f35240l = aVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.g = executorServiceNewCachedThreadPool;
        pk pkVar = sk.V2;
        s sVar = s.f36163e;
        boolean zBooleanValue = ((Boolean) sVar.f36166c.a(pkVar)).booleanValue();
        this.f35241m = zBooleanValue;
        this.f35237h = gv0.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        pk pkVar2 = sk.S2;
        rk rkVar = sVar.f36166c;
        this.f35235e = ((Boolean) rkVar.a(pkVar2)).booleanValue();
        this.f35236f = ((Boolean) rkVar.a(sk.W2)).booleanValue();
        if (((Boolean) rkVar.a(sk.U2)).booleanValue()) {
            this.f35243o = 2;
        } else {
            this.f35243o = 1;
        }
        if (!((Boolean) rkVar.a(sk.f16120f4)).booleanValue()) {
            this.f35234d = l();
        }
        if (((Boolean) rkVar.a(sk.Y3)).booleanValue()) {
            fx.f11274a.execute(this);
            return;
        }
        za.d dVar = r.g.f36157a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            fx.f11274a.execute(this);
        } else {
            run();
        }
    }

    public static final je p(Context context, za.a aVar, boolean z3, boolean z10) {
        je jeVarM;
        mc mcVarE = nc.E();
        mcVarE.b();
        ((nc) mcVarE.f14755b).G(z3);
        String str = aVar.f38129a;
        mcVarE.b();
        ((nc) mcVarE.f14755b).F(str);
        nc ncVar = (nc) mcVarE.e();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        synchronized (je.class) {
            hv0 hv0Var = new hv0();
            hv0Var.f11984b = false;
            byte b10 = (byte) (hv0Var.f11988f | 1);
            hv0Var.f11985c = true;
            hv0Var.f11986d = 100L;
            hv0Var.f11987e = 300L;
            hv0Var.f11988f = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16)) | 32);
            String strA = ncVar.A();
            if (strA == null) {
                throw new NullPointerException("Null clientVersion");
            }
            hv0Var.f11983a = strA;
            hv0Var.f11984b = ncVar.B();
            hv0Var.f11988f = (byte) (hv0Var.f11988f | 1);
            jeVarM = je.m(context, Executors.newCachedThreadPool(), hv0Var.a(), z10);
        }
        return jeVarM;
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void a(int i4, int i10, int i11) {
        me meVarO = o();
        if (meVarO == null) {
            this.f35231a.add(new Object[]{Integer.valueOf(i4), Integer.valueOf(i10), Integer.valueOf(i11)});
            return;
        }
        m();
        try {
            meVarO.a(i4, i10, i11);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void b(MotionEvent motionEvent) {
        me meVarO = o();
        if (meVarO == null) {
            this.f35231a.add(new Object[]{motionEvent});
            return;
        }
        m();
        try {
            meVarO.b(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String c(Context context, String str, View view, Activity activity) {
        if (!j()) {
            return "";
        }
        me meVarO = o();
        if (((Boolean) s.f36163e.f36166c.a(sk.Ub)).booleanValue()) {
            f0 f0Var = j.C.f35261c;
            f0.k(4, view);
        }
        if (meVarO == null) {
            return "";
        }
        m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return meVarO.c(context, str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String d(Context context) {
        try {
            return (String) yo0.z(this.g, new p1(4, context, (Object) this)).get(((Integer) s.f36163e.f36166c.a(sk.f16223m3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.f35240l.f38129a;
            long j = f35230p;
            try {
                rd rdVarA = sd.A();
                rdVarA.b();
                ((sd) rdVarA.f14755b).C(str);
                rdVarA.b();
                ((sd) rdVarA.f14755b).B("0.825731049");
                String packageName = context.getPackageName();
                rdVarA.b();
                ((sd) rdVarA.f14755b).E(packageName);
                long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
                rdVarA.b();
                ((sd) rdVarA.f14755b).G(jCurrentTimeMillis);
                long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                rdVarA.b();
                ((sd) rdVarA.f14755b).D(jCurrentTimeMillis2);
                try {
                    long j8 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    rdVarA.b();
                    ((sd) rdVarA.f14755b).F(j8);
                } catch (PackageManager.NameNotFoundException unused3) {
                    rdVarA.b();
                    ((sd) rdVarA.f14755b).F(-1L);
                }
                vd vdVarB = de.b(null, ((sd) rdVarA.e()).b());
                vdVarB.b();
                ((wd) vdVarB.f14755b).D(5);
                vdVarB.b();
                ((wd) vdVarB.f14755b).E(2);
                return Base64.encodeToString(((wd) vdVarB.e()).b(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void e(StackTraceElement[] stackTraceElementArr) {
        me meVarO;
        me meVarO2;
        if (((Boolean) s.f36163e.f36166c.a(sk.f16334t3)).booleanValue()) {
            if (this.f35242n.getCount() != 0 || (meVarO2 = o()) == null) {
                return;
            }
            try {
                meVarO2.e(stackTraceElementArr);
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        if (!j() || (meVarO = o()) == null) {
            return;
        }
        try {
            meVarO.e(stackTraceElementArr);
        } catch (NullPointerException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String f(Context context) {
        return k(context);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final void g(View view) {
        me meVarO = o();
        if (meVarO != null) {
            try {
                meVarO.g(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String h(Context context, String str, View view) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.me
    public final String i(Context context, View view, Activity activity) {
        pk pkVar = sk.Tb;
        s sVar = s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        try {
            if (!((Boolean) rkVar.a(pkVar)).booleanValue()) {
                me meVarO = o();
                if (((Boolean) rkVar2.a(sk.Ub)).booleanValue()) {
                    f0 f0Var = j.C.f35261c;
                    f0.k(2, view);
                }
                return meVarO != null ? meVarO.i(context, view, activity) : "";
            }
            if (!j()) {
                return "";
            }
            me meVarO2 = o();
            if (((Boolean) rkVar2.a(sk.Ub)).booleanValue()) {
                f0 f0Var2 = j.C.f35261c;
                f0.k(2, view);
            }
            return meVarO2 != null ? meVarO2.i(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean j() throws InterruptedException {
        try {
            this.f35242n.await();
            return true;
        } catch (InterruptedException e2) {
            za.i.i("Interrupted during GADSignals creation.", e2);
            return false;
        }
    }

    public final String k(Context context) {
        me meVarO;
        if (!j() || (meVarO = o()) == null) {
            return "";
        }
        m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return meVarO.f(context);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean l() throws IOException {
        Context context = this.f35238i;
        d0 d0Var = new d0(16, this);
        aw0 aw0Var = new aw0(context, yr1.o(context, this.f35237h), d0Var, ((Boolean) s.f36163e.f36166c.a(sk.T2)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (aw0.f9455f) {
            try {
                kg kgVarR = aw0Var.r(1);
                if (kgVarR == null) {
                    aw0Var.p(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileJ = aw0Var.j(kgVarR.A());
                if (!new File(fileJ, "pcam.jar").exists()) {
                    aw0Var.p(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileJ, "pcbc").exists()) {
                    aw0Var.p(5019, jCurrentTimeMillis);
                    return true;
                }
                aw0Var.p(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m() {
        me meVarO = o();
        Vector vector = this.f35231a;
        if (vector.isEmpty() || meVarO == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            try {
                int length = objArr.length;
                if (length == 1) {
                    meVarO.b((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    meVarO.a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        vector.clear();
    }

    public final void n(boolean z3) {
        String str = this.f35239k.f38129a;
        Context context = this.f35238i;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        mc mcVarE = nc.E();
        mcVarE.b();
        ((nc) mcVarE.f14755b).G(z3);
        mcVarE.b();
        ((nc) mcVarE.f14755b).F(str);
        m8.s sVar = new m8.s((nc) mcVarE.e());
        synchronized (ne.class) {
            try {
                if (!ne.f14257z) {
                    ne.A = System.currentTimeMillis() / 1000;
                    ne.f14255x = ne.p(context, sVar.f28982a);
                    pk pkVar = sk.f16038a4;
                    s sVar2 = s.f36163e;
                    if (((Boolean) sVar2.f36166c.a(pkVar)).booleanValue()) {
                        ne.B = te.a(context);
                    }
                    ExecutorService executorService = ne.f14255x.f11117b;
                    if (((Boolean) sVar2.f36166c.a(sk.f16055b4)).booleanValue() && executorService != null) {
                        ne.C = nf.a(context, executorService);
                    }
                    if (((Boolean) sVar2.f36166c.a(sk.f16178j3)).booleanValue()) {
                        ne.D = new o1();
                    }
                    if (((Boolean) sVar2.f36166c.a(sk.f16269p3)).booleanValue() || ((vc) sVar.f28984c).E()) {
                        ne.F = new fk0(context, executorService);
                    }
                    if (((Boolean) sVar2.f36166c.a(sk.f16192k3)).booleanValue() || ((vc) sVar.f28984c).C()) {
                        ne.E = new be(context, executorService, (vc) sVar.f28984c, ne.F);
                    }
                    ne.f14257z = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f35232b.set(new ne(context, sVar));
    }

    public final me o() {
        return ((!this.f35235e || this.f35234d) ? this.f35243o : 1) == 2 ? (me) this.f35233c.get() : (me) this.f35232b.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        try {
            pk pkVar = sk.f16120f4;
            s sVar = s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                this.f35234d = l();
            }
            boolean z10 = this.f35239k.f38132d;
            boolean z11 = false;
            if (!((Boolean) sVar.f36166c.a(sk.f16347u1)).booleanValue() && z10) {
                z11 = true;
            }
            if (((!this.f35235e || this.f35234d) ? this.f35243o : 1) == 1) {
                n(z11);
                if (this.f35243o == 2) {
                    this.g.execute(new bi.a(8, this, z11));
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    je jeVarP = p(this.f35238i, this.f35239k, z11, this.f35241m);
                    this.f35233c.set(jeVarP);
                    if (this.f35236f) {
                        synchronized (jeVarP) {
                            z3 = jeVarP.f12737q;
                        }
                        if (!z3) {
                            this.f35243o = 1;
                            n(z11);
                        }
                    }
                } catch (NullPointerException e2) {
                    this.f35243o = 1;
                    n(z11);
                    this.f35237h.c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e2);
                }
            }
            this.f35242n.countDown();
            this.f35238i = null;
            this.f35239k = null;
        } catch (Throwable th2) {
            this.f35242n.countDown();
            this.f35238i = null;
            this.f35239k = null;
            throw th2;
        }
    }
}
