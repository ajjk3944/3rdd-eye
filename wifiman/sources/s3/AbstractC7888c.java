package s3;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import r3.C7564b;
import r3.C7566d;
import r3.C7568f;

/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7888c {

    /* renamed from: A, reason: collision with root package name */
    private boolean f61212A;

    /* renamed from: B, reason: collision with root package name */
    private volatile d0 f61213B;

    /* renamed from: C, reason: collision with root package name */
    protected AtomicInteger f61214C;

    /* renamed from: a, reason: collision with root package name */
    private int f61215a;

    /* renamed from: b, reason: collision with root package name */
    private long f61216b;

    /* renamed from: c, reason: collision with root package name */
    private long f61217c;

    /* renamed from: d, reason: collision with root package name */
    private int f61218d;

    /* renamed from: e, reason: collision with root package name */
    private long f61219e;

    /* renamed from: f, reason: collision with root package name */
    private volatile String f61220f;

    /* renamed from: g, reason: collision with root package name */
    o0 f61221g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f61222h;

    /* renamed from: i, reason: collision with root package name */
    private final Looper f61223i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC7893h f61224j;

    /* renamed from: k, reason: collision with root package name */
    private final C7568f f61225k;

    /* renamed from: l, reason: collision with root package name */
    final Handler f61226l;

    /* renamed from: m, reason: collision with root package name */
    private final Object f61227m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f61228n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC7897l f61229o;

    /* renamed from: p, reason: collision with root package name */
    protected InterfaceC2135c f61230p;

    /* renamed from: q, reason: collision with root package name */
    private IInterface f61231q;

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList f61232r;

    /* renamed from: s, reason: collision with root package name */
    private a0 f61233s;

    /* renamed from: t, reason: collision with root package name */
    private int f61234t;

    /* renamed from: u, reason: collision with root package name */
    private final a f61235u;

    /* renamed from: v, reason: collision with root package name */
    private final b f61236v;

    /* renamed from: w, reason: collision with root package name */
    private final int f61237w;

    /* renamed from: x, reason: collision with root package name */
    private final String f61238x;

    /* renamed from: y, reason: collision with root package name */
    private volatile String f61239y;

    /* renamed from: z, reason: collision with root package name */
    private C7564b f61240z;

    /* renamed from: E, reason: collision with root package name */
    private static final C7566d[] f61211E = new C7566d[0];

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f61210D = {"service_esmobile", "service_googleme"};

    /* renamed from: s3.c$a */
    public interface a {
        void c(int i10);

        void f(Bundle bundle);
    }

    /* renamed from: s3.c$b */
    public interface b {
        void b(C7564b c7564b);
    }

    /* renamed from: s3.c$c, reason: collision with other inner class name */
    public interface InterfaceC2135c {
        void c(C7564b c7564b);
    }

    /* renamed from: s3.c$d */
    protected class d implements InterfaceC2135c {
        public d() {
        }

        @Override // s3.AbstractC7888c.InterfaceC2135c
        public final void c(C7564b c7564b) {
            if (c7564b.i()) {
                AbstractC7888c abstractC7888c = AbstractC7888c.this;
                abstractC7888c.k(null, abstractC7888c.A());
            } else if (AbstractC7888c.this.f61236v != null) {
                AbstractC7888c.this.f61236v.b(c7564b);
            }
        }
    }

    /* renamed from: s3.c$e */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected AbstractC7888c(Context context, Looper looper, int i10, a aVar, b bVar, String str) {
        AbstractC7893h abstractC7893hA = AbstractC7893h.a(context);
        C7568f c7568fF = C7568f.f();
        AbstractC7901p.l(aVar);
        AbstractC7901p.l(bVar);
        this(context, looper, abstractC7893hA, c7568fF, i10, aVar, bVar, str);
    }

    static /* bridge */ /* synthetic */ void a0(AbstractC7888c abstractC7888c, d0 d0Var) {
        abstractC7888c.f61213B = d0Var;
        if (abstractC7888c.Q()) {
            C7890e c7890e = d0Var.f61261d;
            C7902q.b().c(c7890e == null ? null : c7890e.j());
        }
    }

    static /* bridge */ /* synthetic */ void b0(AbstractC7888c abstractC7888c, int i10) {
        int i11;
        int i12;
        synchronized (abstractC7888c.f61227m) {
            i11 = abstractC7888c.f61234t;
        }
        if (i11 == 3) {
            abstractC7888c.f61212A = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = abstractC7888c.f61226l;
        handler.sendMessage(handler.obtainMessage(i12, abstractC7888c.f61214C.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean e0(AbstractC7888c abstractC7888c, int i10, int i11, IInterface iInterface) {
        synchronized (abstractC7888c.f61227m) {
            try {
                if (abstractC7888c.f61234t != i10) {
                    return false;
                }
                abstractC7888c.g0(i11, iInterface);
                return true;
            } finally {
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean f0(AbstractC7888c abstractC7888c) throws ClassNotFoundException {
        if (abstractC7888c.f61212A || TextUtils.isEmpty(abstractC7888c.C()) || TextUtils.isEmpty(abstractC7888c.z())) {
            return false;
        }
        try {
            Class.forName(abstractC7888c.C());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(int i10, IInterface iInterface) {
        o0 o0Var;
        AbstractC7901p.a((i10 == 4) == (iInterface != null));
        synchronized (this.f61227m) {
            try {
                this.f61234t = i10;
                this.f61231q = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    a0 a0Var = this.f61233s;
                    if (a0Var != null) {
                        AbstractC7893h abstractC7893h = this.f61224j;
                        String strB = this.f61221g.b();
                        AbstractC7901p.l(strB);
                        abstractC7893h.e(strB, this.f61221g.a(), 4225, a0Var, V(), this.f61221g.c());
                        this.f61233s = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    a0 a0Var2 = this.f61233s;
                    if (a0Var2 != null && (o0Var = this.f61221g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + o0Var.b() + " on " + o0Var.a());
                        AbstractC7893h abstractC7893h2 = this.f61224j;
                        String strB2 = this.f61221g.b();
                        AbstractC7901p.l(strB2);
                        abstractC7893h2.e(strB2, this.f61221g.a(), 4225, a0Var2, V(), this.f61221g.c());
                        this.f61214C.incrementAndGet();
                    }
                    a0 a0Var3 = new a0(this, this.f61214C.get());
                    this.f61233s = a0Var3;
                    o0 o0Var2 = (this.f61234t != 3 || z() == null) ? new o0(E(), D(), false, 4225, G()) : new o0(w().getPackageName(), z(), true, 4225, false);
                    this.f61221g = o0Var2;
                    if (o0Var2.c() && h() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f61221g.b())));
                    }
                    AbstractC7893h abstractC7893h3 = this.f61224j;
                    String strB3 = this.f61221g.b();
                    AbstractC7901p.l(strB3);
                    C7564b c7564bC = abstractC7893h3.c(new h0(strB3, this.f61221g.a(), 4225, this.f61221g.c()), a0Var3, V(), u());
                    if (!c7564bC.i()) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f61221g.b() + " on " + this.f61221g.a());
                        int iB = c7564bC.b() == -1 ? 16 : c7564bC.b();
                        if (c7564bC.f() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c7564bC.f());
                        }
                        c0(iB, bundle, this.f61214C.get());
                    }
                } else if (i10 == 4) {
                    AbstractC7901p.l(iInterface);
                    I(iInterface);
                }
            } finally {
            }
        }
    }

    protected Set A() {
        return Collections.emptySet();
    }

    public final IInterface B() {
        IInterface iInterface;
        synchronized (this.f61227m) {
            try {
                if (this.f61234t == 5) {
                    throw new DeadObjectException();
                }
                p();
                IInterface iInterface2 = this.f61231q;
                AbstractC7901p.m(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    protected abstract String C();

    protected abstract String D();

    protected String E() {
        return "com.google.android.gms";
    }

    public C7890e F() {
        d0 d0Var = this.f61213B;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f61261d;
    }

    protected boolean G() {
        return h() >= 211700000;
    }

    public boolean H() {
        return this.f61213B != null;
    }

    protected void I(IInterface iInterface) {
        this.f61217c = System.currentTimeMillis();
    }

    protected void J(C7564b c7564b) {
        this.f61218d = c7564b.b();
        this.f61219e = System.currentTimeMillis();
    }

    protected void K(int i10) {
        this.f61215a = i10;
        this.f61216b = System.currentTimeMillis();
    }

    protected void L(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.f61226l.sendMessage(this.f61226l.obtainMessage(1, i11, -1, new b0(this, i10, iBinder, bundle)));
    }

    public boolean M() {
        return false;
    }

    public void N(String str) {
        this.f61239y = str;
    }

    public void O(int i10) {
        this.f61226l.sendMessage(this.f61226l.obtainMessage(6, this.f61214C.get(), i10));
    }

    protected void P(InterfaceC2135c interfaceC2135c, int i10, PendingIntent pendingIntent) {
        AbstractC7901p.m(interfaceC2135c, "Connection progress callbacks cannot be null.");
        this.f61230p = interfaceC2135c;
        this.f61226l.sendMessage(this.f61226l.obtainMessage(3, this.f61214C.get(), i10, pendingIntent));
    }

    public boolean Q() {
        return false;
    }

    protected final String V() {
        String str = this.f61238x;
        return str == null ? this.f61222h.getClass().getName() : str;
    }

    public void b(String str) {
        this.f61220f = str;
        disconnect();
    }

    public boolean c() {
        boolean z10;
        synchronized (this.f61227m) {
            int i10 = this.f61234t;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    protected final void c0(int i10, Bundle bundle, int i11) {
        this.f61226l.sendMessage(this.f61226l.obtainMessage(7, i11, -1, new c0(this, i10, bundle)));
    }

    public String d() {
        o0 o0Var;
        if (!isConnected() || (o0Var = this.f61221g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return o0Var.a();
    }

    public void disconnect() {
        this.f61214C.incrementAndGet();
        synchronized (this.f61232r) {
            try {
                int size = this.f61232r.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Y) this.f61232r.get(i10)).d();
                }
                this.f61232r.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f61228n) {
            this.f61229o = null;
        }
        g0(1, null);
    }

    public void e(e eVar) {
        eVar.a();
    }

    public void f(InterfaceC2135c interfaceC2135c) {
        AbstractC7901p.m(interfaceC2135c, "Connection progress callbacks cannot be null.");
        this.f61230p = interfaceC2135c;
        g0(2, null);
    }

    public boolean g() {
        return true;
    }

    public abstract int h();

    public boolean isConnected() {
        boolean z10;
        synchronized (this.f61227m) {
            z10 = this.f61234t == 4;
        }
        return z10;
    }

    public final C7566d[] j() {
        d0 d0Var = this.f61213B;
        if (d0Var == null) {
            return null;
        }
        return d0Var.f61259b;
    }

    public void k(InterfaceC7895j interfaceC7895j, Set set) {
        Bundle bundleY = y();
        String str = Build.VERSION.SDK_INT < 31 ? this.f61239y : this.f61239y;
        int i10 = this.f61237w;
        int i11 = C7568f.f60085a;
        Scope[] scopeArr = C7891f.f61268o;
        Bundle bundle = new Bundle();
        C7566d[] c7566dArr = C7891f.f61269p;
        C7891f c7891f = new C7891f(6, i10, i11, null, null, scopeArr, bundle, null, c7566dArr, c7566dArr, true, 0, false, str);
        c7891f.f61273d = this.f61222h.getPackageName();
        c7891f.f61276g = bundleY;
        if (set != null) {
            c7891f.f61275f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account accountS = s();
            if (accountS == null) {
                accountS = new Account("<<default account>>", "com.google");
            }
            c7891f.f61277h = accountS;
            if (interfaceC7895j != null) {
                c7891f.f61274e = interfaceC7895j.asBinder();
            }
        } else if (M()) {
            c7891f.f61277h = s();
        }
        c7891f.f61278i = f61211E;
        c7891f.f61279j = t();
        if (Q()) {
            c7891f.f61282m = true;
        }
        try {
            synchronized (this.f61228n) {
                try {
                    InterfaceC7897l interfaceC7897l = this.f61229o;
                    if (interfaceC7897l != null) {
                        interfaceC7897l.i0(new Z(this, this.f61214C.get()), c7891f);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            O(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            L(8, null, null, this.f61214C.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            L(8, null, null, this.f61214C.get());
        }
    }

    public String l() {
        return this.f61220f;
    }

    public boolean m() {
        return false;
    }

    public void o() {
        int iH = this.f61225k.h(this.f61222h, h());
        if (iH == 0) {
            f(new d());
        } else {
            g0(1, null);
            P(new d(), iH, null);
        }
    }

    protected final void p() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract IInterface q(IBinder iBinder);

    protected boolean r() {
        return false;
    }

    public Account s() {
        return null;
    }

    public C7566d[] t() {
        return f61211E;
    }

    protected Executor u() {
        return null;
    }

    public Bundle v() {
        return null;
    }

    public final Context w() {
        return this.f61222h;
    }

    public int x() {
        return this.f61237w;
    }

    protected Bundle y() {
        return new Bundle();
    }

    protected String z() {
        return null;
    }

    protected AbstractC7888c(Context context, Looper looper, AbstractC7893h abstractC7893h, C7568f c7568f, int i10, a aVar, b bVar, String str) {
        this.f61220f = null;
        this.f61227m = new Object();
        this.f61228n = new Object();
        this.f61232r = new ArrayList();
        this.f61234t = 1;
        this.f61240z = null;
        this.f61212A = false;
        this.f61213B = null;
        this.f61214C = new AtomicInteger(0);
        AbstractC7901p.m(context, "Context must not be null");
        this.f61222h = context;
        AbstractC7901p.m(looper, "Looper must not be null");
        this.f61223i = looper;
        AbstractC7901p.m(abstractC7893h, "Supervisor must not be null");
        this.f61224j = abstractC7893h;
        AbstractC7901p.m(c7568f, "API availability must not be null");
        this.f61225k = c7568f;
        this.f61226l = new X(this, looper);
        this.f61237w = i10;
        this.f61235u = aVar;
        this.f61236v = bVar;
        this.f61238x = str;
    }
}
