package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class w9 {
    public static final ju[] x = new ju[0];
    public qq0 b;
    public final Context c;
    public final nf4 d;
    public final gz e;
    public final mu1 f;
    public if1 i;
    public v9 j;
    public IInterface k;
    public qx2 m;
    public final t9 o;
    public final u9 p;
    public final int q;
    public final String r;
    public volatile String s;
    public volatile String a = null;
    public final Object g = new Object();
    public final Object h = new Object();
    public final ArrayList l = new ArrayList();
    public int n = 1;
    public rh t = null;
    public boolean u = false;
    public volatile eb4 v = null;
    public final AtomicInteger w = new AtomicInteger(0);

    public w9(Context context, Looper looper, nf4 nf4Var, gz gzVar, int i, t9 t9Var, u9 u9Var, String str) {
        ou1.k(context, "Context must not be null");
        this.c = context;
        ou1.k(looper, "Looper must not be null");
        ou1.k(nf4Var, "Supervisor must not be null");
        this.d = nf4Var;
        ou1.k(gzVar, "API availability must not be null");
        this.e = gzVar;
        this.f = new mu1(this, looper);
        this.q = i;
        this.o = t9Var;
        this.p = u9Var;
        this.r = str;
    }

    public static /* bridge */ /* synthetic */ boolean x(w9 w9Var, int i, int i2, IInterface iInterface) {
        synchronized (w9Var.g) {
            try {
                if (w9Var.n != i) {
                    return false;
                }
                w9Var.y(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 4;
        }
        return z;
    }

    public final void b(z71 z71Var) {
        ((xb1) z71Var.g).r.r.post(new a9(20, z71Var));
    }

    public final void d(String str) {
        this.a = str;
        k();
    }

    public int e() {
        return gz.a;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.g) {
            int i = this.n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final ju[] g() {
        eb4 eb4Var = this.v;
        if (eb4Var == null) {
            return null;
        }
        return eb4Var.g;
    }

    public final void h() {
        if (!a() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void i(v9 v9Var) {
        this.j = v9Var;
        y(2, null);
    }

    public final String j() {
        return this.a;
    }

    public final void k() {
        this.w.incrementAndGet();
        synchronized (this.l) {
            try {
                int size = this.l.size();
                for (int i = 0; i < size; i++) {
                    ad1 ad1Var = (ad1) this.l.get(i);
                    synchronized (ad1Var) {
                        ad1Var.a = null;
                    }
                }
                this.l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.h) {
            this.i = null;
        }
        y(1, null);
    }

    public boolean l() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(k10 k10Var, Set set) {
        Bundle bundleR = r();
        String str = this.s;
        int i = gz.a;
        Scope[] scopeArr = xy.t;
        Bundle bundle = new Bundle();
        int i2 = this.q;
        ju[] juVarArr = xy.u;
        xy xyVar = new xy(6, i2, i, null, null, scopeArr, bundle, null, juVarArr, juVarArr, true, 0, false, str);
        xyVar.i = this.c.getPackageName();
        xyVar.l = bundleR;
        if (set != null) {
            xyVar.k = (Scope[]) set.toArray(new Scope[0]);
        }
        if (l()) {
            Account accountP = p();
            if (accountP == null) {
                accountP = new Account("<<default account>>", "com.google");
            }
            xyVar.m = accountP;
            if (k10Var != 0) {
                xyVar.j = ((sb1) k10Var).g;
            }
        }
        xyVar.n = x;
        xyVar.o = q();
        if (this instanceof kn2) {
            xyVar.r = true;
        }
        try {
            try {
                synchronized (this.h) {
                    try {
                        if1 if1Var = this.i;
                        if (if1Var != null) {
                            if1Var.T(new on2(this, this.w.get()), xyVar);
                        }
                    } finally {
                    }
                }
            } catch (DeadObjectException unused) {
                int i3 = this.w.get();
                mu1 mu1Var = this.f;
                mu1Var.sendMessage(mu1Var.obtainMessage(6, i3, 3));
            } catch (SecurityException e) {
                throw e;
            }
        } catch (RemoteException | RuntimeException unused2) {
            int i4 = this.w.get();
            m63 m63Var = new m63(this, 8, null, null);
            mu1 mu1Var2 = this.f;
            mu1Var2.sendMessage(mu1Var2.obtainMessage(1, i4, -1, m63Var));
        }
    }

    public final void n() throws PackageManager.NameNotFoundException {
        int iC = this.e.c(this.c, e());
        if (iC == 0) {
            i(new f23(2, this));
            return;
        }
        y(1, null);
        this.j = new f23(2, this);
        int i = this.w.get();
        mu1 mu1Var = this.f;
        mu1Var.sendMessage(mu1Var.obtainMessage(3, i, iC, null));
    }

    public abstract IInterface o(IBinder iBinder);

    public Account p() {
        return null;
    }

    public ju[] q() {
        return x;
    }

    public Bundle r() {
        return new Bundle();
    }

    public Set s() {
        return Collections.EMPTY_SET;
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.g) {
            try {
                if (this.n == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.k;
                ou1.k(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        return e() >= 211700000;
    }

    public final void y(int i, IInterface iInterface) {
        qq0 qq0Var;
        ou1.f((i == 4) == (iInterface != null));
        synchronized (this.g) {
            try {
                this.n = i;
                this.k = iInterface;
                if (i == 1) {
                    qx2 qx2Var = this.m;
                    if (qx2Var != null) {
                        nf4 nf4Var = this.d;
                        String str = this.b.a;
                        ou1.j(str);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        nf4Var.b(str, qx2Var, this.b.b);
                        this.m = null;
                    }
                } else if (i == 2 || i == 3) {
                    qx2 qx2Var2 = this.m;
                    if (qx2Var2 != null && (qq0Var = this.b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + qq0Var.a + " on com.google.android.gms");
                        nf4 nf4Var2 = this.d;
                        String str2 = this.b.a;
                        ou1.j(str2);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        nf4Var2.b(str2, qx2Var2, this.b.b);
                        this.w.incrementAndGet();
                    }
                    qx2 qx2Var3 = new qx2(this, this.w.get());
                    this.m = qx2Var3;
                    String strV = v();
                    boolean zW = w();
                    this.b = new qq0(strV, zW);
                    if (zW && e() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.a)));
                    }
                    nf4 nf4Var3 = this.d;
                    String str3 = this.b.a;
                    ou1.j(str3);
                    this.b.getClass();
                    String name = this.r;
                    if (name == null) {
                        name = this.c.getClass().getName();
                    }
                    if (!nf4Var3.c(new kd4(str3, this.b.b), qx2Var3, name, null)) {
                        String str4 = this.b.a;
                        int i2 = this.w.get();
                        eh3 eh3Var = new eh3(this, 16);
                        mu1 mu1Var = this.f;
                        mu1Var.sendMessage(mu1Var.obtainMessage(7, i2, -1, eh3Var));
                    }
                } else if (i == 4) {
                    ou1.j(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
