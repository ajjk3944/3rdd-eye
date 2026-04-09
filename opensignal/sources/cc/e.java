package cc;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzj;
import h7.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: y, reason: collision with root package name */
    public static final Feature[] f3614y = new Feature[0];

    /* renamed from: b, reason: collision with root package name */
    public f0 f3616b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3617c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f3618d;

    /* renamed from: e, reason: collision with root package name */
    public final zb.d f3619e;

    /* renamed from: f, reason: collision with root package name */
    public final v f3620f;

    /* renamed from: i, reason: collision with root package name */
    public o f3623i;
    public d j;
    public IInterface k;

    /* renamed from: m, reason: collision with root package name */
    public x f3625m;

    /* renamed from: o, reason: collision with root package name */
    public final b f3627o;

    /* renamed from: p, reason: collision with root package name */
    public final c f3628p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3629q;

    /* renamed from: r, reason: collision with root package name */
    public final String f3630r;

    /* renamed from: s, reason: collision with root package name */
    public volatile String f3631s;

    /* renamed from: t, reason: collision with root package name */
    public volatile r1 f3632t;

    /* renamed from: a, reason: collision with root package name */
    public volatile String f3615a = null;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3621g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final Object f3622h = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3624l = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public int f3626n = 1;

    /* renamed from: u, reason: collision with root package name */
    public ConnectionResult f3633u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3634v = false;

    /* renamed from: w, reason: collision with root package name */
    public volatile zzj f3635w = null;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicInteger f3636x = new AtomicInteger(0);

    public e(Context context, Looper looper, e0 e0Var, zb.d dVar, int i10, b bVar, c cVar, String str) {
        s.i(context, "Context must not be null");
        this.f3617c = context;
        s.i(looper, "Looper must not be null");
        s.i(e0Var, "Supervisor must not be null");
        this.f3618d = e0Var;
        s.i(dVar, "API availability must not be null");
        this.f3619e = dVar;
        this.f3620f = new v(this, looper);
        this.f3629q = i10;
        this.f3627o = bVar;
        this.f3628p = cVar;
        this.f3630r = str;
    }

    public abstract int a();

    public boolean b() {
        return false;
    }

    public final void c() {
        int iB = this.f3619e.b(this.f3617c, a());
        if (iB == 0) {
            this.j = new h(this);
            u(2, null);
            return;
        }
        u(1, null);
        this.j = new h(this);
        int i10 = this.f3636x.get();
        v vVar = this.f3620f;
        vVar.sendMessage(vVar.obtainMessage(3, i10, iB, null));
    }

    public abstract IInterface d(IBinder iBinder);

    public final void e() {
        this.f3636x.incrementAndGet();
        ArrayList arrayList = this.f3624l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    n nVar = (n) arrayList.get(i10);
                    synchronized (nVar) {
                        nVar.f3662a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f3622h) {
            this.f3623i = null;
        }
        u(1, null);
    }

    public final void f(String str) {
        this.f3615a = str;
        e();
    }

    public Account g() {
        return null;
    }

    public Feature[] h() {
        return f3614y;
    }

    public Executor i() {
        return null;
    }

    public Bundle j() {
        return new Bundle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(g gVar, Set set) {
        AttributionSource attributionSource;
        Bundle bundleJ = j();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.f3632t == null || (attributionSource = (AttributionSource) this.f3632t.f10199d) == null || attributionSource.getAttributionTag() == null) ? this.f3631s : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i10 = this.f3629q;
        int i11 = zb.d.f26816a;
        Scope[] scopeArr = GetServiceRequest.K;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.L;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i10, i11, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f4834r = this.f3617c.getPackageName();
        getServiceRequest.B = bundleJ;
        if (set != null) {
            getServiceRequest.f4836y = (Scope[]) set.toArray(new Scope[0]);
        }
        if (b()) {
            Account accountG = g();
            if (accountG == null) {
                accountG = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.D = accountG;
            if (gVar != 0) {
                getServiceRequest.f4835x = ((com.google.android.gms.internal.measurement.x) gVar).f5251e;
            }
        }
        getServiceRequest.E = f3614y;
        getServiceRequest.F = h();
        if (this instanceof pc.h) {
            getServiceRequest.I = true;
        }
        try {
            synchronized (this.f3622h) {
                try {
                    o oVar = this.f3623i;
                    if (oVar != null) {
                        oVar.d(new w(this, this.f3636x.get()), getServiceRequest);
                    } else {
                        io.sentry.android.core.e0.p("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e4) {
            io.sentry.android.core.e0.q("GmsClient", "IGmsServiceBroker.getService failed", e4);
            int i12 = this.f3636x.get();
            v vVar = this.f3620f;
            vVar.sendMessage(vVar.obtainMessage(6, i12, 3));
        } catch (RemoteException e10) {
            e = e10;
            io.sentry.android.core.e0.q("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i13 = this.f3636x.get();
            y yVar = new y(this, 8, null, null);
            v vVar2 = this.f3620f;
            vVar2.sendMessage(vVar2.obtainMessage(1, i13, -1, yVar));
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            io.sentry.android.core.e0.q("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i132 = this.f3636x.get();
            y yVar2 = new y(this, 8, null, null);
            v vVar22 = this.f3620f;
            vVar22.sendMessage(vVar22.obtainMessage(1, i132, -1, yVar2));
        }
    }

    public Set l() {
        return Collections.EMPTY_SET;
    }

    public final IInterface m() {
        IInterface iInterface;
        synchronized (this.f3621g) {
            try {
                if (this.f3626n == 5) {
                    throw new DeadObjectException();
                }
                if (!q()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.k;
                s.i(iInterface, "Client is connected but service is null");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public abstract String n();

    public abstract String o();

    public boolean p() {
        return a() >= 211700000;
    }

    public final boolean q() {
        boolean z10;
        synchronized (this.f3621g) {
            z10 = this.f3626n == 4;
        }
        return z10;
    }

    public final boolean r() {
        boolean z10;
        synchronized (this.f3621g) {
            int i10 = this.f3626n;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void s() {
        System.currentTimeMillis();
    }

    public final /* synthetic */ boolean t(int i10, int i11, IInterface iInterface) {
        synchronized (this.f3621g) {
            try {
                if (this.f3626n != i10) {
                    return false;
                }
                u(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void u(int i10, IInterface iInterface) {
        f0 f0Var;
        s.b((i10 == 4) == (iInterface != null));
        synchronized (this.f3621g) {
            try {
                this.f3626n = i10;
                this.k = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    x xVar = this.f3625m;
                    if (xVar != null) {
                        e0 e0Var = this.f3618d;
                        String str = this.f3616b.f3649c;
                        s.h(str);
                        this.f3616b.getClass();
                        if (this.f3630r == null) {
                            this.f3617c.getClass();
                        }
                        e0Var.c(str, xVar, this.f3616b.f3648b);
                        this.f3625m = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    x xVar2 = this.f3625m;
                    if (xVar2 != null && (f0Var = this.f3616b) != null) {
                        String str2 = f0Var.f3649c;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb2.append("Calling connect() while still connected, missing disconnect() for ");
                        sb2.append(str2);
                        sb2.append(" on com.google.android.gms");
                        io.sentry.android.core.e0.d("GmsClient", sb2.toString());
                        e0 e0Var2 = this.f3618d;
                        String str3 = this.f3616b.f3649c;
                        s.h(str3);
                        this.f3616b.getClass();
                        if (this.f3630r == null) {
                            this.f3617c.getClass();
                        }
                        e0Var2.c(str3, xVar2, this.f3616b.f3648b);
                        this.f3636x.incrementAndGet();
                    }
                    x xVar3 = new x(this, this.f3636x.get());
                    this.f3625m = xVar3;
                    String strO = o();
                    boolean zP = p();
                    this.f3616b = new f0(strO, zP, 0);
                    if (zP && a() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f3616b.f3649c)));
                    }
                    e0 e0Var3 = this.f3618d;
                    String str4 = this.f3616b.f3649c;
                    s.h(str4);
                    this.f3616b.getClass();
                    String name = this.f3630r;
                    if (name == null) {
                        name = this.f3617c.getClass().getName();
                    }
                    ConnectionResult connectionResultB = e0Var3.b(new b0(str4, this.f3616b.f3648b), xVar3, name, i());
                    if (!(connectionResultB.f4807d == 0)) {
                        String str5 = this.f3616b.f3649c;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb3.append("unable to connect to service: ");
                        sb3.append(str5);
                        sb3.append(" on com.google.android.gms");
                        io.sentry.android.core.e0.p("GmsClient", sb3.toString());
                        int i11 = connectionResultB.f4807d;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (connectionResultB.f4808g != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", connectionResultB.f4808g);
                        }
                        int i12 = this.f3636x.get();
                        z zVar = new z(this, i11, bundle);
                        v vVar = this.f3620f;
                        vVar.sendMessage(vVar.obtainMessage(7, i12, -1, zVar));
                    }
                } else if (i10 == 4) {
                    s.h(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
