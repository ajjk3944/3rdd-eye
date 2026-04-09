package q8;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class n implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f20751a;

    /* renamed from: d, reason: collision with root package name */
    public Context f20752d;

    /* renamed from: g, reason: collision with root package name */
    public k8.e f20753g;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20754r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20755x = true;

    public n(a8.l lVar) {
        this.f20751a = new WeakReference(lVar);
    }

    public final synchronized void a() {
        k8.e mVar;
        try {
            a8.l lVar = (a8.l) this.f20751a.get();
            if (lVar == null) {
                b();
            } else if (this.f20753g == null) {
                if (lVar.f218h.f20745b) {
                    Context context = lVar.f211a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    if (connectivityManager == null || h3.c.a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        mVar = new sm.m();
                    } else {
                        try {
                            mVar = new io.sentry.k(connectivityManager, this);
                        } catch (Exception unused) {
                            mVar = new sm.m();
                        }
                    }
                } else {
                    mVar = new sm.m();
                }
                this.f20753g = mVar;
                this.f20755x = mVar.e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f20754r) {
                return;
            }
            this.f20754r = true;
            Context context = this.f20752d;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            k8.e eVar = this.f20753g;
            if (eVar != null) {
                eVar.shutdown();
            }
            this.f20751a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((a8.l) this.f20751a.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i10) {
        a8.l lVar = (a8.l) this.f20751a.get();
        if (lVar != null) {
            j8.b bVar = (j8.b) lVar.f213c.getValue();
            if (bVar != null) {
                bVar.f13414a.z(i10);
                ag.b bVar2 = bVar.f13415b;
                synchronized (bVar2) {
                    if (i10 >= 10 && i10 != 20) {
                        bVar2.e();
                    }
                }
            }
        } else {
            b();
        }
    }
}
