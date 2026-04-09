package pb;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: x, reason: collision with root package name */
    public static final nb.d[] f31566x = new nb.d[0];

    /* renamed from: a, reason: collision with root package name */
    public volatile String f31567a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f31568b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f31569c;

    /* renamed from: d, reason: collision with root package name */
    public final k0 f31570d;

    /* renamed from: e, reason: collision with root package name */
    public final nb.f f31571e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f31572f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f31573h;

    /* renamed from: i, reason: collision with root package name */
    public u f31574i;
    public d j;

    /* renamed from: k, reason: collision with root package name */
    public IInterface f31575k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f31576l;

    /* renamed from: m, reason: collision with root package name */
    public d0 f31577m;

    /* renamed from: n, reason: collision with root package name */
    public int f31578n;

    /* renamed from: o, reason: collision with root package name */
    public final b f31579o;

    /* renamed from: p, reason: collision with root package name */
    public final c f31580p;

    /* renamed from: q, reason: collision with root package name */
    public final int f31581q;

    /* renamed from: r, reason: collision with root package name */
    public final String f31582r;

    /* renamed from: s, reason: collision with root package name */
    public volatile String f31583s;

    /* renamed from: t, reason: collision with root package name */
    public nb.b f31584t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f31585u;

    /* renamed from: v, reason: collision with root package name */
    public volatile g0 f31586v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicInteger f31587w;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(Context context, Looper looper, int i4, b bVar, c cVar) {
        k0 k0VarA = k0.a(context);
        nb.f fVar = nb.f.f29899b;
        y.h(bVar);
        y.h(cVar);
        this(context, looper, k0VarA, fVar, i4, bVar, cVar, null);
    }

    public final void b(String str) {
        this.f31567a = str;
        f();
    }

    public final boolean c() {
        boolean z3;
        synchronized (this.g) {
            int i4 = this.f31578n;
            z3 = true;
            if (i4 != 2 && i4 != 3) {
                z3 = false;
            }
        }
        return z3;
    }

    public final void d(d dVar) {
        this.j = dVar;
        z(2, null);
    }

    public final void e() {
        if (!g() || this.f31568b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void f() {
        this.f31587w.incrementAndGet();
        ArrayList arrayList = this.f31576l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((t) arrayList.get(i4)).d();
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f31573h) {
            this.f31574i = null;
        }
        z(1, null);
    }

    public final boolean g() {
        boolean z3;
        synchronized (this.g) {
            z3 = this.f31578n == 4;
        }
        return z3;
    }

    public final void h(o7.d dVar) {
        ((com.google.android.gms.common.api.internal.n) dVar.f30421b).f9111m.f9092m.post(new b5.o(6, dVar));
    }

    public final void i(i iVar, Set set) {
        Bundle bundleR = r();
        String str = Build.VERSION.SDK_INT < 31 ? this.f31583s : this.f31583s;
        int i4 = this.f31581q;
        int i10 = nb.f.f29898a;
        Scope[] scopeArr = g.f31595o;
        Bundle bundle = new Bundle();
        nb.d[] dVarArr = g.f31596p;
        g gVar = new g(6, i4, i10, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        gVar.f31600d = this.f31569c.getPackageName();
        gVar.g = bundleR;
        if (set != null) {
            gVar.f31602f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account accountP = p();
            if (accountP == null) {
                accountP = new Account("<<default account>>", "com.google");
            }
            gVar.f31603h = accountP;
            if (iVar != null) {
                gVar.f31601e = iVar.asBinder();
            }
        }
        gVar.f31604i = f31566x;
        gVar.j = q();
        if (this instanceof yb.b) {
            gVar.f31607m = true;
        }
        try {
            synchronized (this.f31573h) {
                try {
                    u uVar = this.f31574i;
                    if (uVar != null) {
                        uVar.O(new c0(this, this.f31587w.get()), gVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            int i11 = this.f31587w.get();
            b0 b0Var = this.f31572f;
            b0Var.sendMessage(b0Var.obtainMessage(6, i11, 3));
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i12 = this.f31587w.get();
            e0 e0Var = new e0(this, 8, null, null);
            b0 b0Var2 = this.f31572f;
            b0Var2.sendMessage(b0Var2.obtainMessage(1, i12, -1, e0Var));
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i122 = this.f31587w.get();
            e0 e0Var2 = new e0(this, 8, null, null);
            b0 b0Var22 = this.f31572f;
            b0Var22.sendMessage(b0Var22.obtainMessage(1, i122, -1, e0Var2));
        }
    }

    public int j() {
        return nb.f.f29898a;
    }

    public final nb.d[] k() {
        g0 g0Var = this.f31586v;
        if (g0Var == null) {
            return null;
        }
        return g0Var.f31610b;
    }

    public final String l() {
        return this.f31567a;
    }

    public boolean m() {
        return false;
    }

    public final void n() throws PackageManager.NameNotFoundException {
        Context context = this.f31569c;
        int iC = this.f31571e.c(j(), context);
        if (iC == 0) {
            d(new k(this));
            return;
        }
        z(1, null);
        this.j = new k(this);
        int i4 = this.f31587w.get();
        b0 b0Var = this.f31572f;
        b0Var.sendMessage(b0Var.obtainMessage(3, i4, iC, null));
    }

    public abstract IInterface o(IBinder iBinder);

    public Account p() {
        return null;
    }

    public nb.d[] q() {
        return f31566x;
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
                if (this.f31578n == 5) {
                    throw new DeadObjectException();
                }
                if (!g()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.f31575k;
                y.i(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        return j() >= 211700000;
    }

    public final /* synthetic */ boolean x(int i4, int i10, IInterface iInterface) {
        synchronized (this.g) {
            try {
                if (this.f31578n != i4) {
                    return false;
                }
                z(i10, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void y() {
        int i4;
        int i10;
        synchronized (this.g) {
            i4 = this.f31578n;
        }
        if (i4 == 3) {
            this.f31585u = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        b0 b0Var = this.f31572f;
        b0Var.sendMessage(b0Var.obtainMessage(i10, this.f31587w.get(), 16));
    }

    public final void z(int i4, IInterface iInterface) {
        l0 l0Var;
        y.b((i4 == 4) == (iInterface != null));
        synchronized (this.g) {
            try {
                this.f31578n = i4;
                this.f31575k = iInterface;
                Bundle bundle = null;
                if (i4 == 1) {
                    d0 d0Var = this.f31577m;
                    if (d0Var != null) {
                        k0 k0Var = this.f31570d;
                        String str = this.f31568b.f31649b;
                        y.h(str);
                        this.f31568b.getClass();
                        if (this.f31582r == null) {
                            this.f31569c.getClass();
                        }
                        k0Var.d(str, d0Var, this.f31568b.f31648a);
                        this.f31577m = null;
                    }
                } else if (i4 == 2 || i4 == 3) {
                    d0 d0Var2 = this.f31577m;
                    if (d0Var2 != null && (l0Var = this.f31568b) != null) {
                        String str2 = l0Var.f31649b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(str2);
                        sb2.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb2.toString());
                        k0 k0Var2 = this.f31570d;
                        String str3 = this.f31568b.f31649b;
                        y.h(str3);
                        this.f31568b.getClass();
                        if (this.f31582r == null) {
                            this.f31569c.getClass();
                        }
                        k0Var2.d(str3, d0Var2, this.f31568b.f31648a);
                        this.f31587w.incrementAndGet();
                    }
                    d0 d0Var3 = new d0(this, this.f31587w.get());
                    this.f31577m = d0Var3;
                    String strV = v();
                    boolean zW = w();
                    l0 l0Var2 = new l0();
                    l0Var2.f31649b = strV;
                    l0Var2.f31648a = zW;
                    this.f31568b = l0Var2;
                    if (zW && j() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f31568b.f31649b)));
                    }
                    k0 k0Var3 = this.f31570d;
                    String str4 = this.f31568b.f31649b;
                    y.h(str4);
                    this.f31568b.getClass();
                    String name = this.f31582r;
                    if (name == null) {
                        name = this.f31569c.getClass().getName();
                    }
                    nb.b bVarC = k0Var3.c(new h0(str4, this.f31568b.f31648a), d0Var3, name, null);
                    if (!(bVarC.f29885b == 0)) {
                        String str5 = this.f31568b.f31649b;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(str5);
                        sb3.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb3.toString());
                        int i10 = bVarC.f29885b;
                        if (i10 == -1) {
                            i10 = 16;
                        }
                        if (bVarC.f29886c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", bVarC.f29886c);
                        }
                        int i11 = this.f31587w.get();
                        f0 f0Var = new f0(this, i10, bundle);
                        b0 b0Var = this.f31572f;
                        b0Var.sendMessage(b0Var.obtainMessage(7, i11, -1, f0Var));
                    }
                } else if (i4 == 4) {
                    y.h(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public e(Context context, Looper looper, k0 k0Var, nb.f fVar, int i4, b bVar, c cVar, String str) {
        this.f31567a = null;
        this.g = new Object();
        this.f31573h = new Object();
        this.f31576l = new ArrayList();
        this.f31578n = 1;
        this.f31584t = null;
        this.f31585u = false;
        this.f31586v = null;
        this.f31587w = new AtomicInteger(0);
        y.i(context, "Context must not be null");
        this.f31569c = context;
        y.i(looper, "Looper must not be null");
        y.i(k0Var, "Supervisor must not be null");
        this.f31570d = k0Var;
        y.i(fVar, "API availability must not be null");
        this.f31571e = fVar;
        this.f31572f = new b0(this, looper);
        this.f31581q = i4;
        this.f31579o = bVar;
        this.f31580p = cVar;
        this.f31582r = str;
    }
}
