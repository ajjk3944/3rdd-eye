package androidx.work.multiprocess;

import T1.s;
import T1.z;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.work.m;
import androidx.work.multiprocess.b;
import d2.C4268c;
import e2.InterfaceExecutorC4305a;
import g2.AbstractC4381e;
import g2.C4377a;
import g2.C4382f;
import g2.C4383g;
import g2.C4384h;
import g2.InterfaceC4379c;
import java.util.List;

@SuppressLint({"BanKeepAnnotation"})
/* loaded from: classes.dex */
public class RemoteWorkManagerClient extends AbstractC4381e {

    /* renamed from: j, reason: collision with root package name */
    public static final String f16962j = m.g("RemoteWorkManagerClient");

    /* renamed from: a, reason: collision with root package name */
    public a f16963a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16964b;

    /* renamed from: c, reason: collision with root package name */
    public final z f16965c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceExecutorC4305a f16966d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16967e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f16968f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16969g;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f16970h;
    public final c i;

    public static class a implements ServiceConnection {

        /* renamed from: c, reason: collision with root package name */
        public static final String f16971c = m.g("RemoteWMgr.Connection");

        /* renamed from: a, reason: collision with root package name */
        public final C4268c<androidx.work.multiprocess.b> f16972a = new C4268c<>();

        /* renamed from: b, reason: collision with root package name */
        public final RemoteWorkManagerClient f16973b;

        public a(RemoteWorkManagerClient remoteWorkManagerClient) {
            this.f16973b = remoteWorkManagerClient;
        }

        @Override // android.content.ServiceConnection
        public final void onBindingDied(ComponentName componentName) {
            m.e().a(f16971c, "Binding died");
            this.f16972a.j(new RuntimeException("Binding died"));
            this.f16973b.e();
        }

        @Override // android.content.ServiceConnection
        public final void onNullBinding(ComponentName componentName) {
            m.e().c(f16971c, "Unable to bind to service");
            this.f16972a.j(new RuntimeException("Cannot bind to service " + componentName));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v6, types: [androidx.work.multiprocess.b] */
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            b.a.C0270a c0270a;
            m.e().a(f16971c, "Service connected");
            int i = b.a.f16983b;
            if (iBinder == null) {
                c0270a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(androidx.work.multiprocess.b.f16982h8);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.work.multiprocess.b)) {
                    b.a.C0270a c0270a2 = new b.a.C0270a();
                    c0270a2.f16984b = iBinder;
                    c0270a = c0270a2;
                } else {
                    c0270a = (androidx.work.multiprocess.b) iInterfaceQueryLocalInterface;
                }
            }
            this.f16972a.i(c0270a);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            m.e().a(f16971c, "Service disconnected");
            this.f16972a.j(new RuntimeException("Service disconnected"));
            this.f16973b.e();
        }
    }

    public static class b extends g {

        /* renamed from: e, reason: collision with root package name */
        public final RemoteWorkManagerClient f16974e;

        public b(RemoteWorkManagerClient remoteWorkManagerClient) {
            this.f16974e = remoteWorkManagerClient;
        }

        @Override // androidx.work.multiprocess.g
        public final void w() {
            RemoteWorkManagerClient remoteWorkManagerClient = this.f16974e;
            remoteWorkManagerClient.f16970h.postDelayed(remoteWorkManagerClient.i, remoteWorkManagerClient.f16969g);
        }
    }

    public static class c implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        public static final String f16975c = m.g("SessionHandler");

        /* renamed from: b, reason: collision with root package name */
        public final RemoteWorkManagerClient f16976b;

        public c(RemoteWorkManagerClient remoteWorkManagerClient) {
            this.f16976b = remoteWorkManagerClient;
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j4 = this.f16976b.f16968f;
            synchronized (this.f16976b.f16967e) {
                try {
                    long j10 = this.f16976b.f16968f;
                    a aVar = this.f16976b.f16963a;
                    if (aVar != null) {
                        if (j4 == j10) {
                            m.e().a(f16975c, "Unbinding service");
                            this.f16976b.f16964b.unbindService(aVar);
                            m.e().a(a.f16971c, "Binding died");
                            aVar.f16972a.j(new RuntimeException("Binding died"));
                            aVar.f16973b.e();
                        } else {
                            m.e().a(f16975c, "Ignoring request to unbind.");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public RemoteWorkManagerClient(Context context, z zVar) {
        this(context, zVar, 60000L);
    }

    @Override // g2.AbstractC4381e
    public final C4268c a() {
        return C4377a.a(f(new C4383g()), C4377a.f37942a, this.f16966d);
    }

    @Override // g2.AbstractC4381e
    public final C4268c b() {
        return C4377a.a(f(new C4384h()), C4377a.f37942a, this.f16966d);
    }

    @Override // g2.AbstractC4381e
    public final C4268c c(String str, androidx.work.g gVar, List list) {
        z zVar = this.f16965c;
        zVar.getClass();
        if (list.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return C4377a.a(f(new C4382f(new s(zVar, str, gVar, list, null))), C4377a.f37942a, this.f16966d);
    }

    public final void e() {
        synchronized (this.f16967e) {
            m.e().a(f16962j, "Cleaning up.");
            this.f16963a = null;
        }
    }

    public final C4268c f(InterfaceC4379c interfaceC4379c) {
        C4268c<androidx.work.multiprocess.b> c4268c;
        Intent intent = new Intent(this.f16964b, (Class<?>) RemoteWorkManagerService.class);
        synchronized (this.f16967e) {
            try {
                this.f16968f++;
                if (this.f16963a == null) {
                    m mVarE = m.e();
                    String str = f16962j;
                    mVarE.a(str, "Creating a new session");
                    a aVar = new a(this);
                    this.f16963a = aVar;
                    try {
                        if (!this.f16964b.bindService(intent, aVar, 1)) {
                            a aVar2 = this.f16963a;
                            RuntimeException runtimeException = new RuntimeException("Unable to bind to service");
                            m.e().d(str, "Unable to bind to service", runtimeException);
                            aVar2.f16972a.j(runtimeException);
                        }
                    } catch (Throwable th) {
                        a aVar3 = this.f16963a;
                        m.e().d(f16962j, "Unable to bind to service", th);
                        aVar3.f16972a.j(th);
                    }
                }
                this.f16970h.removeCallbacks(this.i);
                c4268c = this.f16963a.f16972a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b bVar = new b(this);
        c4268c.addListener(new h(this, c4268c, bVar, interfaceC4379c), this.f16966d);
        return bVar.f17005b;
    }

    public RemoteWorkManagerClient(Context context, z zVar, long j4) {
        this.f16964b = context.getApplicationContext();
        this.f16965c = zVar;
        this.f16966d = zVar.f12233d.c();
        this.f16967e = new Object();
        this.f16963a = null;
        this.i = new c(this);
        this.f16969g = j4;
        this.f16970h = G0.i.a(Looper.getMainLooper());
    }
}
