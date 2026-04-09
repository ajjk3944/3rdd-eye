package M2;

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

/* renamed from: M2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0165e {

    /* renamed from: x, reason: collision with root package name */
    public static final J2.d[] f2732x = new J2.d[0];

    /* renamed from: b, reason: collision with root package name */
    public C0.r f2734b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2735c;

    /* renamed from: d, reason: collision with root package name */
    public final G f2736d;

    /* renamed from: e, reason: collision with root package name */
    public final J2.f f2737e;

    /* renamed from: f, reason: collision with root package name */
    public final x f2738f;
    public t i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0164d f2741j;

    /* renamed from: k, reason: collision with root package name */
    public IInterface f2742k;

    /* renamed from: m, reason: collision with root package name */
    public z f2744m;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0162b f2746o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0163c f2747p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2748q;

    /* renamed from: r, reason: collision with root package name */
    public final String f2749r;

    /* renamed from: s, reason: collision with root package name */
    public volatile String f2750s;

    /* renamed from: a, reason: collision with root package name */
    public volatile String f2733a = null;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2739g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final Object f2740h = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2743l = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public int f2745n = 1;

    /* renamed from: t, reason: collision with root package name */
    public J2.b f2751t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2752u = false;

    /* renamed from: v, reason: collision with root package name */
    public volatile C f2753v = null;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicInteger f2754w = new AtomicInteger(0);

    public AbstractC0165e(Context context, Looper looper, G g2, J2.f fVar, int i, InterfaceC0162b interfaceC0162b, InterfaceC0163c interfaceC0163c, String str) {
        u.f(context, "Context must not be null");
        this.f2735c = context;
        u.f(looper, "Looper must not be null");
        u.f(g2, "Supervisor must not be null");
        this.f2736d = g2;
        u.f(fVar, "API availability must not be null");
        this.f2737e = fVar;
        this.f2738f = new x(this, looper);
        this.f2748q = i;
        this.f2746o = interfaceC0162b;
        this.f2747p = interfaceC0163c;
        this.f2749r = str;
    }

    public final void b(InterfaceC0169i interfaceC0169i, Set set) {
        Bundle bundleR = r();
        String str = Build.VERSION.SDK_INT < 31 ? this.f2750s : this.f2750s;
        int i = this.f2748q;
        int i3 = J2.f.f2058a;
        Scope[] scopeArr = C0167g.f2761C;
        Bundle bundle = new Bundle();
        J2.d[] dVarArr = C0167g.f2762D;
        C0167g c0167g = new C0167g(6, i, i3, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c0167g.f2766d = this.f2735c.getPackageName();
        c0167g.f2769g = bundleR;
        if (set != null) {
            c0167g.f2768f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account accountP = p();
            if (accountP == null) {
                accountP = new Account("<<default account>>", "com.google");
            }
            c0167g.f2770h = accountP;
            if (interfaceC0169i != null) {
                c0167g.f2767e = interfaceC0169i.asBinder();
            }
        }
        c0167g.i = f2732x;
        c0167g.f2771j = q();
        if (this instanceof V2.b) {
            c0167g.f2774m = true;
        }
        try {
            synchronized (this.f2740h) {
                try {
                    t tVar = this.i;
                    if (tVar != null) {
                        tVar.g0(new y(this, this.f2754w.get()), c0167g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e6) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e6);
            int i6 = this.f2754w.get();
            x xVar = this.f2738f;
            xVar.sendMessage(xVar.obtainMessage(6, i6, 3));
        } catch (RemoteException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i7 = this.f2754w.get();
            A a6 = new A(this, 8, null, null);
            x xVar2 = this.f2738f;
            xVar2.sendMessage(xVar2.obtainMessage(1, i7, -1, a6));
        } catch (SecurityException e8) {
            throw e8;
        } catch (RuntimeException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i72 = this.f2754w.get();
            A a62 = new A(this, 8, null, null);
            x xVar22 = this.f2738f;
            xVar22.sendMessage(xVar22.obtainMessage(1, i72, -1, a62));
        }
    }

    public final void c(String str) {
        this.f2733a = str;
        h();
    }

    public final boolean d() {
        boolean z6;
        synchronized (this.f2739g) {
            int i = this.f2745n;
            z6 = true;
            if (i != 2 && i != 3) {
                z6 = false;
            }
        }
        return z6;
    }

    public final void e() {
        if (!i() || this.f2734b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void f(InterfaceC0164d interfaceC0164d) {
        this.f2741j = interfaceC0164d;
        z(2, null);
    }

    public final void g(A0.e eVar) {
        ((L2.k) eVar.f73b).f2533m.f2517m.post(new C0.k(2, eVar));
    }

    public final void h() {
        this.f2754w.incrementAndGet();
        ArrayList arrayList = this.f2743l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((s) arrayList.get(i)).d();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f2740h) {
            this.i = null;
        }
        z(1, null);
    }

    public final boolean i() {
        boolean z6;
        synchronized (this.f2739g) {
            z6 = this.f2745n == 4;
        }
        return z6;
    }

    public int j() {
        return J2.f.f2058a;
    }

    public final J2.d[] k() {
        C c6 = this.f2753v;
        if (c6 == null) {
            return null;
        }
        return c6.f2709b;
    }

    public final String l() {
        return this.f2733a;
    }

    public boolean m() {
        return false;
    }

    public final void n() throws PackageManager.NameNotFoundException {
        int iC = this.f2737e.c(this.f2735c, j());
        if (iC == 0) {
            f(new k(this));
            return;
        }
        z(1, null);
        this.f2741j = new k(this);
        int i = this.f2754w.get();
        x xVar = this.f2738f;
        xVar.sendMessage(xVar.obtainMessage(3, i, iC, null));
    }

    public abstract IInterface o(IBinder iBinder);

    public Account p() {
        return null;
    }

    public J2.d[] q() {
        return f2732x;
    }

    public Bundle r() {
        return new Bundle();
    }

    public Set s() {
        return Collections.EMPTY_SET;
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.f2739g) {
            try {
                if (this.f2745n == 5) {
                    throw new DeadObjectException();
                }
                if (!i()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.f2742k;
                u.f(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        return j() >= 211700000;
    }

    public final /* synthetic */ boolean x(int i, int i3, IInterface iInterface) {
        synchronized (this.f2739g) {
            try {
                if (this.f2745n != i) {
                    return false;
                }
                z(i3, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void y() {
        int i;
        int i3;
        synchronized (this.f2739g) {
            i = this.f2745n;
        }
        if (i == 3) {
            this.f2752u = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        x xVar = this.f2738f;
        xVar.sendMessage(xVar.obtainMessage(i3, this.f2754w.get(), 16));
    }

    public final void z(int i, IInterface iInterface) {
        C0.r rVar;
        u.a((i == 4) == (iInterface != null));
        synchronized (this.f2739g) {
            try {
                this.f2745n = i;
                this.f2742k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    z zVar = this.f2744m;
                    if (zVar != null) {
                        G g2 = this.f2736d;
                        String str = this.f2734b.f1098a;
                        u.e(str);
                        this.f2734b.getClass();
                        if (this.f2749r == null) {
                            this.f2735c.getClass();
                        }
                        g2.d(str, zVar, this.f2734b.f1099b);
                        this.f2744m = null;
                    }
                } else if (i == 2 || i == 3) {
                    z zVar2 = this.f2744m;
                    if (zVar2 != null && (rVar = this.f2734b) != null) {
                        String str2 = rVar.f1098a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        G g6 = this.f2736d;
                        String str3 = this.f2734b.f1098a;
                        u.e(str3);
                        this.f2734b.getClass();
                        if (this.f2749r == null) {
                            this.f2735c.getClass();
                        }
                        g6.d(str3, zVar2, this.f2734b.f1099b);
                        this.f2754w.incrementAndGet();
                    }
                    z zVar3 = new z(this, this.f2754w.get());
                    this.f2744m = zVar3;
                    String strV = v();
                    boolean zW = w();
                    this.f2734b = new C0.r(strV, zW);
                    if (zW && j() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f2734b.f1098a)));
                    }
                    G g7 = this.f2736d;
                    String str4 = this.f2734b.f1098a;
                    u.e(str4);
                    this.f2734b.getClass();
                    String name = this.f2749r;
                    if (name == null) {
                        name = this.f2735c.getClass().getName();
                    }
                    J2.b bVarC = g7.c(new D(str4, this.f2734b.f1099b), zVar3, name, null);
                    if (!(bVarC.f2045b == 0)) {
                        String str5 = this.f2734b.f1098a;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i3 = bVarC.f2045b;
                        if (i3 == -1) {
                            i3 = 16;
                        }
                        if (bVarC.f2046c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", bVarC.f2046c);
                        }
                        int i6 = this.f2754w.get();
                        B b5 = new B(this, i3, bundle);
                        x xVar = this.f2738f;
                        xVar.sendMessage(xVar.obtainMessage(7, i6, -1, b5));
                    }
                } else if (i == 4) {
                    u.e(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
