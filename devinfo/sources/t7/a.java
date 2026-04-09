package t7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.internal.ads.pu1;
import com.google.android.gms.internal.play_billing.a3;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.x2;
import com.google.android.gms.internal.play_billing.y2;
import com.google.android.gms.internal.play_billing.z2;
import com.liuzh.deviceinfo.DeviceInfoApp;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import me.t1;
import nm.d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class a {
    public final Long A;
    public final t1 B;

    /* renamed from: c, reason: collision with root package name */
    public final String f34411c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34412d;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.google.android.gms.common.api.internal.p f34414f;
    public final Context g;

    /* renamed from: h, reason: collision with root package name */
    public final km.n f34415h;

    /* renamed from: i, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.c f34416i;
    public volatile l j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f34417k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f34419m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f34420n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f34421o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f34422p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f34423q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34424r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f34425s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f34426t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f34427u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f34428v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34429w;

    /* renamed from: x, reason: collision with root package name */
    public final ja.c f34430x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f34431y;

    /* renamed from: z, reason: collision with root package name */
    public ExecutorService f34432z;

    /* renamed from: a, reason: collision with root package name */
    public final Object f34409a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public volatile int f34410b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f34413e = new Handler(Looper.getMainLooper());

    /* renamed from: l, reason: collision with root package name */
    public int f34418l = 0;

    public a(ja.c cVar, DeviceInfoApp deviceInfoApp, h hVar, fe.b bVar) {
        long jNextLong = new Random().nextLong();
        this.A = Long.valueOf(jNextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f20143a;
        this.f34411c = "8.0.0";
        String strZ = z();
        this.f34412d = strZ;
        this.g = deviceInfoApp.getApplicationContext();
        g3 g3VarX = h3.x();
        g3VarX.d();
        h3.v((h3) g3VarX.f20201b);
        if (strZ != null) {
            g3VarX.d();
            h3.w((h3) g3VarX.f20201b, strZ);
        }
        String packageName = this.g.getPackageName();
        g3VarX.d();
        h3.t((h3) g3VarX.f20201b, packageName);
        g3VarX.d();
        h3.q((h3) g3VarX.f20201b, jNextLong);
        g3VarX.d();
        h3.u((h3) g3VarX.f20201b);
        int i4 = Build.VERSION.SDK_INT;
        g3VarX.d();
        h3.n((h3) g3VarX.f20201b, i4);
        g3VarX.e();
        try {
            int i10 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            g3VarX.d();
            h3.o((h3) g3VarX.f20201b, i10);
        } catch (Throwable th2) {
            u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.f34415h = new km.n(this.g, (h3) g3VarX.a());
        if (hVar == null) {
            u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f34414f = new com.google.android.gms.common.api.internal.p(this.g, hVar, this.f34415h);
        this.f34430x = cVar;
        this.f34431y = false;
        this.g.getPackageName();
    }

    public static Future h(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new fb.r(15, futureSubmit, runnable), (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e2) {
            u.i("BillingClient", "Async task throws exception!", e2);
            return null;
        }
    }

    public static void s(a aVar, int i4) {
        if (i4 != 0) {
            aVar.n(0);
            return;
        }
        synchronized (aVar.f34409a) {
            try {
                if (aVar.f34410b == 3) {
                    return;
                }
                aVar.n(2);
                com.google.android.gms.common.api.internal.p pVar = aVar.f34414f != null ? aVar.f34414f : null;
                if (pVar != null) {
                    boolean z3 = aVar.f34427u;
                    s sVar = (s) pVar.f9118e;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    pVar.f9114a = z3;
                    s sVar2 = (s) pVar.f9119f;
                    Context context = (Context) pVar.f9115b;
                    sVar2.a(context, intentFilter2);
                    if (pVar.f9114a) {
                        sVar.b(context, intentFilter);
                    } else {
                        sVar.a(context, intentFilter);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean t(a aVar) {
        boolean z3;
        synchronized (aVar.f34409a) {
            z3 = true;
            if (aVar.f34410b != 1) {
                z3 = false;
            }
        }
        return z3;
    }

    public static String z() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public final km.o A(c cVar, int i4, String str, Exception exc) {
        D(i4, 9, cVar, p.a(exc));
        u.i("BillingClient", str, exc);
        return new km.o(cVar, (Object) null);
    }

    public final void B(int i4, int i10, c cVar) {
        try {
            int i11 = p.f34476a;
            k(p.b(i4, i10, cVar, null, e3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void C(int i4, c cVar, long j) {
        try {
            int i10 = p.f34476a;
            try {
                this.f34415h.D(p.b(i4, 2, cVar, null, e3.BROADCAST_ACTION_UNSPECIFIED), this.f34418l, j);
            } catch (Throwable th2) {
                u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void D(int i4, int i10, c cVar, String str) {
        try {
            int i11 = p.f34476a;
            k(p.b(i4, i10, cVar, str, e3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void E(int i4, c cVar, long j, boolean z3) {
        try {
            int i10 = p.f34476a;
            try {
                this.f34415h.F(p.b(i4, 2, cVar, null, e3.BROADCAST_ACTION_UNSPECIFIED), this.f34418l, j, z3);
            } catch (Throwable th2) {
                u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void F(int i4, c cVar, String str, long j, boolean z3) {
        try {
            int i10 = p.f34476a;
            try {
                this.f34415h.F(p.b(i4, 2, cVar, str, e3.BROADCAST_ACTION_UNSPECIFIED), this.f34418l, j, z3);
            } catch (Throwable th2) {
                u.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void G(c cVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f34413e.post(new fb.r(14, this, cVar));
    }

    public void a(km.i iVar, pf.u uVar) {
        if (h(new com.google.android.gms.internal.consent_sdk.i(this, uVar, iVar, 4), 30000L, new fb.r(13, this, uVar), u(), g()) == null) {
            c cVarX = x();
            B(25, 3, cVarX);
            uVar.g(cVarX);
        }
    }

    public void b(cl.u uVar, lf.e eVar) {
        if (h(new com.google.android.gms.internal.consent_sdk.i(this, eVar, uVar, 5), 30000L, new fb.r(this, eVar, uVar), u(), g()) == null) {
            c cVarX = x();
            B(25, 4, cVarX);
            eVar.c(cVarX);
        }
    }

    public final int c() {
        int i4;
        synchronized (this.f34409a) {
            i4 = this.f34410b;
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v37, types: [android.os.BaseBundle, android.os.Bundle] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t7.c d(android.app.Activity r32, final b5.i0 r33) {
        /*
            Method dump skipped, instructions count: 1956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.a.d(android.app.Activity, b5.i0):t7.c");
    }

    public void e(km.i iVar, ri.d dVar) {
        if (h(new com.google.android.gms.internal.consent_sdk.i(this, dVar, iVar, 6), 30000L, new fb.r(17, this, dVar), u(), g()) == null) {
            c cVarX = x();
            B(25, 7, cVarX);
            com.google.android.gms.internal.play_billing.o oVar = com.google.android.gms.internal.play_billing.q.f20213b;
            dVar.a(cVarX, new d0(13, v.f20241e));
        }
    }

    public void f(km.i iVar) {
        o(iVar);
    }

    public final synchronized ExecutorService g() {
        try {
            if (this.f34432z == null) {
                this.f34432z = Executors.newFixedThreadPool(u.f20232a, new k(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f34432z;
    }

    public final void i(pf.u uVar, c cVar, int i4, Exception exc) {
        u.i("BillingClient", "Error in acknowledge purchase!", exc);
        D(i4, 3, cVar, p.a(exc));
        uVar.g(cVar);
    }

    public final void j(lf.e eVar, c cVar, int i4, String str, Exception exc) {
        u.i("BillingClient", str, exc);
        D(i4, 4, cVar, p.a(exc));
        eVar.c(cVar);
    }

    public final void k(y2 y2Var) {
        try {
            km.n nVar = this.f34415h;
            int i4 = this.f34418l;
            nVar.getClass();
            try {
                g3 g3Var = (g3) ((h3) nVar.f28442b).g();
                g3Var.d();
                h3.p((h3) g3Var.f20201b, i4);
                nVar.f28442b = (h3) g3Var.a();
                nVar.C(y2Var);
            } catch (Throwable th2) {
                u.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            u.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void l(a3 a3Var) {
        try {
            km.n nVar = this.f34415h;
            int i4 = this.f34418l;
            nVar.getClass();
            try {
                g3 g3Var = (g3) ((h3) nVar.f28442b).g();
                g3Var.d();
                h3.p((h3) g3Var.f20201b, i4);
                h3 h3Var = (h3) g3Var.a();
                nVar.f28442b = h3Var;
                try {
                    nVar.K(a3Var, h3Var);
                } catch (Throwable th2) {
                    u.i("BillingLogger", "Unable to log.", th2);
                }
            } catch (Throwable th3) {
                u.i("BillingLogger", "Unable to log.", th3);
            }
        } catch (Throwable th4) {
            u.i("BillingClient", "Unable to log.", th4);
        }
    }

    public final void m(int i4, c cVar) {
        try {
            int i10 = p.f34476a;
            x2 x2Var = (x2) p.b(i4, 6, cVar, null, e3.BROADCAST_ACTION_UNSPECIFIED).g();
            u3 u3VarR = v3.r();
            u3VarR.e(false);
            u3VarR.f();
            x2Var.f(u3VarR);
            k((y2) x2Var.a());
        } catch (Throwable th2) {
            u.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void n(int i4) {
        synchronized (this.f34409a) {
            try {
                if (this.f34410b == 3) {
                    return;
                }
                int i10 = this.f34410b;
                u.g("BillingClient", "Setting clientState from " + (i10 != 0 ? i10 != 1 ? i10 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED") + " to " + (i4 != 0 ? i4 != 1 ? i4 != 2 ? "CLOSED" : "CONNECTED" : "CONNECTING" : "DISCONNECTED"));
                this.f34410b = i4;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o(km.i iVar) {
        int i4;
        c cVarW;
        synchronized (this.f34409a) {
            try {
                if (r()) {
                    cVarW = w();
                } else if (this.f34410b == 1) {
                    u.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    cVarW = r.f34480d;
                    m(37, cVarW);
                } else if (this.f34410b == 3) {
                    u.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    cVarW = r.j;
                    m(38, cVarW);
                } else {
                    n(1);
                    p();
                    u.g("BillingClient", "Starting in-app billing setup.");
                    this.j = new l(this, iVar);
                    pu1 pu1Var = this.j.f34469b;
                    pu1Var.f15114c = 0L;
                    pu1Var.f15113b = false;
                    pu1Var.c();
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> listQueryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i4 = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i4 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                u.h("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f34411c);
                                synchronized (this.f34409a) {
                                    try {
                                        if (this.f34410b == 2) {
                                            cVarW = w();
                                        } else if (this.f34410b != 1) {
                                            u.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            cVarW = r.j;
                                            m(105, cVarW);
                                        } else {
                                            l lVar = this.j;
                                            if (this.g.bindService(intent2, lVar, 1)) {
                                                u.g("BillingClient", "Service was bonded successfully.");
                                                cVarW = null;
                                            } else {
                                                u.h("BillingClient", "Connection to Billing service is blocked.");
                                                i4 = 39;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            u.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    n(0);
                    u.g("BillingClient", "Billing service unavailable on device.");
                    cVarW = r.f34478b;
                    m(i4, cVarW);
                }
            } finally {
            }
        }
        if (cVarW != null) {
            iVar.t(cVarW);
        }
    }

    public final void p() {
        synchronized (this.f34409a) {
            if (this.j != null) {
                try {
                    this.g.unbindService(this.j);
                } catch (Throwable th2) {
                    try {
                        u.i("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f34416i = null;
                        this.j = null;
                    } finally {
                        this.f34416i = null;
                        this.j = null;
                    }
                }
            }
        }
    }

    public final boolean q() throws InterruptedException {
        t1 t1Var = this.B;
        if (t1Var == null) {
            throw new NullPointerException("ticker");
        }
        long jI = t1Var.I();
        long j = 30000;
        int i4 = 1;
        long jConvert = 30000;
        while (i4 <= 3) {
            try {
            } catch (Exception e2) {
                if (e2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                u.i("BillingClient", "Error during reconnection attempt: ", e2);
            }
            if (Math.max(0L, jConvert) <= 0) {
                u.h("BillingClient", "No time remaining for reconnection attempt.");
                return r();
            }
            u.g("BillingClient", "Already connected or not opted into auto reconnection.");
            c cVar = r.f34484i;
            TimeUnit.MILLISECONDS.getClass();
            int i10 = cVar.f34435a;
            if (i10 == 0) {
                u.g("BillingClient", "Reconnection succeeded with result: " + i10);
                return r();
            }
            u.h("BillingClient", "Reconnection failed with result: " + i10);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long jI2 = (t1Var.I() - jI) + 0;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            jConvert = j - timeUnit.convert(jI2, timeUnit2);
            long j8 = j;
            long jPow = ((long) Math.pow(2.0d, i4 - 1)) * 1000;
            if (jConvert < jPow) {
                u.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                return r();
            }
            if (i4 < 3 && jPow > 0) {
                try {
                    Thread.sleep(jPow);
                    jConvert = j8 - timeUnit.convert((t1Var.I() - jI) + 0, timeUnit2);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    u.i("BillingClient", "Error sleeping during reconnection attempt: ", e10);
                }
            }
            i4++;
            j = j8;
        }
        u.h("BillingClient", "Max retries reached.");
        return r();
    }

    public final boolean r() {
        boolean z3;
        synchronized (this.f34409a) {
            try {
                z3 = false;
                if (this.f34410b == 2 && this.f34416i != null && this.j != null) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    public final Handler u() {
        return Looper.myLooper() == null ? this.f34413e : new Handler(Looper.myLooper());
    }

    public final a0 v(c cVar, int i4, String str, Exception exc) {
        u.i("BillingClient", str, exc);
        D(i4, 7, cVar, p.a(exc));
        return new a0(cVar.f34435a, cVar.f34437c, new ArrayList(), new ArrayList());
    }

    public final c w() {
        u.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        z2 z2VarS = a3.s();
        z2VarS.d();
        a3.r((a3) z2VarS.f20201b, 6);
        u3 u3VarR = v3.r();
        u3VarR.d();
        v3.q((v3) u3VarR.f20201b);
        u3VarR.e(false);
        u3VarR.f();
        z2VarS.d();
        a3.q((a3) z2VarS.f20201b, (v3) u3VarR.a());
        l((a3) z2VarS.a());
        return r.f34484i;
    }

    public final c x() {
        int[] iArr = {0, 3};
        synchronized (this.f34409a) {
            for (int i4 = 0; i4 < 2; i4++) {
                if (this.f34410b == iArr[i4]) {
                    return r.j;
                }
            }
            return r.f34483h;
        }
    }

    public final void y() {
        if (TextUtils.isEmpty(null)) {
            this.g.getPackageName();
        }
    }

    public a(ja.c cVar, DeviceInfoApp deviceInfoApp, fe.b bVar) {
        long jNextLong = new Random().nextLong();
        this.A = Long.valueOf(jNextLong);
        this.B = com.google.android.gms.internal.play_billing.i.f20143a;
        this.f34411c = "8.0.0";
        String strZ = z();
        this.f34412d = strZ;
        this.g = deviceInfoApp.getApplicationContext();
        g3 g3VarX = h3.x();
        g3VarX.d();
        h3.v((h3) g3VarX.f20201b);
        if (strZ != null) {
            g3VarX.d();
            h3.w((h3) g3VarX.f20201b, strZ);
        }
        String packageName = this.g.getPackageName();
        g3VarX.d();
        h3.t((h3) g3VarX.f20201b, packageName);
        g3VarX.d();
        h3.q((h3) g3VarX.f20201b, jNextLong);
        g3VarX.d();
        h3.u((h3) g3VarX.f20201b);
        int i4 = Build.VERSION.SDK_INT;
        g3VarX.d();
        h3.n((h3) g3VarX.f20201b, i4);
        g3VarX.e();
        try {
            int i10 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            g3VarX.d();
            h3.o((h3) g3VarX.f20201b, i10);
        } catch (Throwable th2) {
            u.i("BillingClient", "Error getting app version code.", th2);
        }
        this.f34415h = new km.n(this.g, (h3) g3VarX.a());
        u.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f34414f = new com.google.android.gms.common.api.internal.p(this.g, null, this.f34415h);
        this.f34430x = cVar;
        this.g.getPackageName();
    }
}
