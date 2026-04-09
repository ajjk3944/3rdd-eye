package p2;

import A1.q;
import A1.w;
import A2.B;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.AbstractC1984ut;
import com.google.android.gms.internal.ads.AbstractC1998v6;
import com.google.android.gms.internal.ads.C1028d7;
import com.google.android.gms.internal.ads.C1338iu;
import com.google.android.gms.internal.ads.C1405k6;
import com.google.android.gms.internal.ads.C1453l0;
import com.google.android.gms.internal.ads.C1459l6;
import com.google.android.gms.internal.ads.C1476lN;
import com.google.android.gms.internal.ads.C1621o6;
import com.google.android.gms.internal.ads.C1675p6;
import com.google.android.gms.internal.ads.C2215z7;
import com.google.android.gms.internal.ads.C6;
import com.google.android.gms.internal.ads.Cw;
import com.google.android.gms.internal.ads.Dw;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.F5;
import com.google.android.gms.internal.ads.F6;
import com.google.android.gms.internal.ads.G5;
import com.google.android.gms.internal.ads.G6;
import com.google.android.gms.internal.ads.G9;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.L6;
import com.google.android.gms.internal.ads.Nx;
import com.google.android.gms.internal.ads.O5;
import com.google.android.gms.internal.ads.Ww;
import h0.C2352b;
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
import q2.C2841s;
import q2.r;
import t2.C2911G;
import u2.C2951a;
import u2.k;

/* loaded from: classes.dex */
public final class e implements Runnable, F6 {

    /* renamed from: D, reason: collision with root package name */
    public static final long f22754D = System.currentTimeMillis();

    /* renamed from: C, reason: collision with root package name */
    public int f22755C;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22759d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22760e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22761f;

    /* renamed from: g, reason: collision with root package name */
    public final ExecutorService f22762g;

    /* renamed from: h, reason: collision with root package name */
    public final Cw f22763h;
    public Context i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f22764j;

    /* renamed from: k, reason: collision with root package name */
    public C2951a f22765k;

    /* renamed from: l, reason: collision with root package name */
    public final C2951a f22766l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f22767m;

    /* renamed from: a, reason: collision with root package name */
    public final Vector f22756a = new Vector();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f22757b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f22758c = new AtomicReference();

    /* renamed from: n, reason: collision with root package name */
    public final CountDownLatch f22768n = new CountDownLatch(1);

    public e(Context context, C2951a c2951a) {
        this.i = context;
        this.f22764j = context;
        this.f22765k = c2951a;
        this.f22766l = c2951a;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f22762g = executorServiceNewCachedThreadPool;
        E9 e9 = H9.f8685V2;
        C2841s c2841s = C2841s.f23267e;
        boolean zBooleanValue = ((Boolean) c2841s.f23270c.a(e9)).booleanValue();
        this.f22767m = zBooleanValue;
        this.f22763h = Cw.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        E9 e92 = H9.f8668S2;
        G9 g9 = c2841s.f23270c;
        this.f22760e = ((Boolean) g9.a(e92)).booleanValue();
        this.f22761f = ((Boolean) g9.a(H9.f8690W2)).booleanValue();
        if (((Boolean) g9.a(H9.f8679U2)).booleanValue()) {
            this.f22755C = 2;
        } else {
            this.f22755C = 1;
        }
        if (!((Boolean) g9.a(H9.f8744f4)).booleanValue()) {
            this.f22759d = l();
        }
        if (((Boolean) g9.a(H9.f8701Y3)).booleanValue()) {
            AbstractC0640Nf.f10005a.execute(this);
            return;
        }
        u2.f fVar = r.f23260g.f23261a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AbstractC0640Nf.f10005a.execute(this);
        } else {
            run();
        }
    }

    public static final C6 p(Context context, C2951a c2951a, boolean z6, boolean z7) {
        C6 c6M;
        F5 f5E = G5.E();
        f5E.b();
        ((G5) f5E.f13551b).G(z6);
        String str = c2951a.f23784a;
        f5E.b();
        ((G5) f5E.f13551b).F(str);
        G5 g52 = (G5) f5E.d();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        synchronized (C6.class) {
            Dw dw = new Dw();
            dw.f7854b = false;
            byte b5 = (byte) (dw.f7858f | 1);
            dw.f7855c = true;
            dw.f7856d = 100L;
            dw.f7857e = 300L;
            dw.f7858f = (byte) (((byte) (((byte) (((byte) (((byte) (b5 | 2)) | 4)) | 8)) | 16)) | 32);
            String strA = g52.A();
            if (strA == null) {
                throw new NullPointerException("Null clientVersion");
            }
            dw.f7853a = strA;
            dw.f7854b = g52.B();
            dw.f7858f = (byte) (dw.f7858f | 1);
            c6M = C6.m(context, Executors.newCachedThreadPool(), dw.a(), z7);
        }
        return c6M;
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void a(int i, int i3, int i6) {
        F6 f6O = o();
        if (f6O == null) {
            this.f22756a.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i6)});
            return;
        }
        m();
        try {
            f6O.a(i, i3, i6);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void b(MotionEvent motionEvent) {
        F6 f6O = o();
        if (f6O == null) {
            this.f22756a.add(new Object[]{motionEvent});
            return;
        }
        m();
        try {
            f6O.b(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String c(Context context, String str, View view, Activity activity) {
        if (!j()) {
            return "";
        }
        F6 f6O = o();
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Sb)).booleanValue()) {
            C2911G c2911g = j.f22785C.f22790c;
            C2911G.k(4, view);
        }
        if (f6O == null) {
            return "";
        }
        m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return f6O.c(context, str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String d(Context context, View view, String str) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String e(Context context) {
        try {
            return (String) AbstractC1984ut.z(new B(this, 2, context), this.f22762g).get(((Integer) C2841s.f23267e.f23270c.a(H9.f8786m3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            String str = this.f22766l.f23784a;
            long j6 = f22754D;
            try {
                C1405k6 c1405k6A = C1459l6.A();
                c1405k6A.b();
                ((C1459l6) c1405k6A.f13551b).C(str);
                c1405k6A.b();
                ((C1459l6) c1405k6A.f13551b).B("0.825731049");
                String packageName = context.getPackageName();
                c1405k6A.b();
                ((C1459l6) c1405k6A.f13551b).E(packageName);
                long jCurrentTimeMillis = (System.currentTimeMillis() - j6) / 1000;
                c1405k6A.b();
                ((C1459l6) c1405k6A.f13551b).G(jCurrentTimeMillis);
                long jCurrentTimeMillis2 = System.currentTimeMillis() / 1000;
                c1405k6A.b();
                ((C1459l6) c1405k6A.f13551b).D(jCurrentTimeMillis2);
                try {
                    long j7 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    c1405k6A.b();
                    ((C1459l6) c1405k6A.f13551b).F(j7);
                } catch (PackageManager.NameNotFoundException unused3) {
                    c1405k6A.b();
                    ((C1459l6) c1405k6A.f13551b).F(-1L);
                }
                C1621o6 c1621o6B = AbstractC1998v6.b(null, ((C1459l6) c1405k6A.d()).b());
                c1621o6B.b();
                ((C1675p6) c1621o6B.f13551b).D(5);
                c1621o6B.b();
                ((C1675p6) c1621o6B.f13551b).E(2);
                return Base64.encodeToString(((C1675p6) c1621o6B.d()).b(), 11);
            } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                return Integer.toString(7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void f(StackTraceElement[] stackTraceElementArr) {
        F6 f6O;
        F6 f6O2;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8832t3)).booleanValue()) {
            if (this.f22768n.getCount() != 0 || (f6O2 = o()) == null) {
                return;
            }
            try {
                f6O2.f(stackTraceElementArr);
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        if (!j() || (f6O = o()) == null) {
            return;
        }
        try {
            f6O.f(stackTraceElementArr);
        } catch (NullPointerException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String g(Context context) {
        return k(context);
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final void h(View view) {
        F6 f6O = o();
        if (f6O != null) {
            try {
                f6O.h(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.F6
    public final String i(Context context, View view, Activity activity) {
        E9 e9 = H9.Rb;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        try {
            if (!((Boolean) g9.a(e9)).booleanValue()) {
                F6 f6O = o();
                if (((Boolean) g92.a(H9.Sb)).booleanValue()) {
                    C2911G c2911g = j.f22785C.f22790c;
                    C2911G.k(2, view);
                }
                return f6O != null ? f6O.i(context, view, activity) : "";
            }
            if (!j()) {
                return "";
            }
            F6 f6O2 = o();
            if (((Boolean) g92.a(H9.Sb)).booleanValue()) {
                C2911G c2911g2 = j.f22785C.f22790c;
                C2911G.k(2, view);
            }
            return f6O2 != null ? f6O2.i(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean j() throws InterruptedException {
        try {
            this.f22768n.await();
            return true;
        } catch (InterruptedException e6) {
            k.i("Interrupted during GADSignals creation.", e6);
            return false;
        }
    }

    public final String k(Context context) {
        F6 f6O;
        if (!j() || (f6O = o()) == null) {
            return "";
        }
        m();
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            return f6O.g(context);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final boolean l() throws IOException {
        Context context = this.i;
        C2352b c2352b = new C2352b(9, this);
        Ww ww = new Ww(context, C1476lN.p(context, this.f22763h), c2352b, ((Boolean) C2841s.f23267e.f23270c.a(H9.f8674T2)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (Ww.f12343f) {
            try {
                C2215z7 c2215z7R = ww.r(1);
                if (c2215z7R == null) {
                    ww.p(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileI = ww.i(c2215z7R.A());
                if (!new File(fileI, "pcam.jar").exists()) {
                    ww.p(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileI, "pcbc").exists()) {
                    ww.p(5019, jCurrentTimeMillis);
                    return true;
                }
                ww.p(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        F6 f6O = o();
        Vector vector = this.f22756a;
        if (vector.isEmpty() || f6O == null) {
            return;
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            try {
                int length = objArr.length;
                if (length == 1) {
                    f6O.b((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    f6O.a(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        vector.clear();
    }

    public final void n(boolean z6) {
        String str = this.f22765k.f23784a;
        Context context = this.i;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        F5 f5E = G5.E();
        f5E.b();
        ((G5) f5E.f13551b).G(z6);
        f5E.b();
        ((G5) f5E.f13551b).F(str);
        w wVar = new w((G5) f5E.d());
        synchronized (G6.class) {
            try {
                if (!G6.f8289N) {
                    G6.f8290O = System.currentTimeMillis() / 1000;
                    G6.f8288L = G6.p(context, wVar.f140c);
                    E9 e9 = H9.f8712a4;
                    C2841s c2841s = C2841s.f23267e;
                    if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                        G6.f8291P = L6.j(context);
                    }
                    ExecutorService executorService = G6.f8288L.f12376b;
                    if (((Boolean) c2841s.f23270c.a(H9.f8718b4)).booleanValue() && executorService != null) {
                        G6.f8292Q = C1028d7.a(context, executorService);
                    }
                    if (((Boolean) c2841s.f23270c.a(H9.f8766j3)).booleanValue()) {
                        G6.f8293R = new C1453l0();
                    }
                    if (((Boolean) c2841s.f23270c.a(H9.f8806p3)).booleanValue() || ((O5) wVar.f139b).E()) {
                        G6.f8295T = new Nx(context, executorService);
                    }
                    if (((Boolean) c2841s.f23270c.a(H9.f8773k3)).booleanValue() || ((O5) wVar.f139b).C()) {
                        G6.f8294S = new C1338iu(context, executorService, (O5) wVar.f139b, G6.f8295T);
                    }
                    G6.f8289N = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f22757b.set(new G6(context, wVar));
    }

    public final F6 o() {
        return ((!this.f22760e || this.f22759d) ? this.f22755C : 1) == 2 ? (F6) this.f22758c.get() : (F6) this.f22757b.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        try {
            E9 e9 = H9.f8744f4;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                this.f22759d = l();
            }
            boolean z7 = this.f22765k.f23787d;
            boolean z8 = false;
            if (!((Boolean) c2841s.f23270c.a(H9.f8837u1)).booleanValue() && z7) {
                z8 = true;
            }
            if (((!this.f22760e || this.f22759d) ? this.f22755C : 1) == 1) {
                n(z8);
                if (this.f22755C == 2) {
                    this.f22762g.execute(new q(this, z8, 6));
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    C6 c6P = p(this.i, this.f22765k, z8, this.f22767m);
                    this.f22758c.set(c6P);
                    if (this.f22761f) {
                        synchronized (c6P) {
                            z6 = c6P.f7530E;
                        }
                        if (!z6) {
                            this.f22755C = 1;
                            n(z8);
                        }
                    }
                } catch (NullPointerException e6) {
                    this.f22755C = 1;
                    n(z8);
                    this.f22763h.c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e6);
                }
            }
            this.f22768n.countDown();
            this.i = null;
            this.f22765k = null;
        } catch (Throwable th) {
            this.f22768n.countDown();
            this.i = null;
            this.f22765k = null;
            throw th;
        }
    }
}
