package a3;

import a3.InterfaceC1647a;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static volatile p f14131d;

    /* renamed from: a, reason: collision with root package name */
    public final c f14132a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f14133b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f14134c;

    /* compiled from: SingletonConnectivityReceiver.java */
    public class a implements h3.g<ConnectivityManager> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f14135a;

        public a(Context context) {
            this.f14135a = context;
        }

        @Override // h3.g
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.f14135a.getSystemService("connectivity");
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    public class b implements InterfaceC1647a.InterfaceC0210a {
        public b() {
        }

        @Override // a3.InterfaceC1647a.InterfaceC0210a
        public final void a(boolean z10) {
            ArrayList arrayList;
            h3.l.a();
            synchronized (p.this) {
                arrayList = new ArrayList(p.this.f14133b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC1647a.InterfaceC0210a) it.next()).a(z10);
            }
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    public interface c {
        boolean a();

        void b();
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f14137a;

        /* renamed from: b, reason: collision with root package name */
        public final b f14138b;

        /* renamed from: c, reason: collision with root package name */
        public final h3.f f14139c;

        /* renamed from: d, reason: collision with root package name */
        public final a f14140d = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                h3.l.f().post(new q(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                h3.l.f().post(new q(this, false));
            }
        }

        public d(h3.f fVar, b bVar) {
            this.f14139c = fVar;
            this.f14138b = bVar;
        }

        @Override // a3.p.c
        @SuppressLint({"MissingPermission"})
        public final boolean a() {
            h3.f fVar = this.f14139c;
            this.f14137a = ((ConnectivityManager) fVar.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) fVar.get()).registerDefaultNetworkCallback(this.f14140d);
                return true;
            } catch (RuntimeException e4) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e4);
                }
                return false;
            }
        }

        @Override // a3.p.c
        public final void b() {
            ((ConnectivityManager) this.f14139c.get()).unregisterNetworkCallback(this.f14140d);
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    public static final class e implements c {

        /* renamed from: g, reason: collision with root package name */
        public static final Executor f14142g = AsyncTask.SERIAL_EXECUTOR;

        /* renamed from: a, reason: collision with root package name */
        public final Context f14143a;

        /* renamed from: b, reason: collision with root package name */
        public final b f14144b;

        /* renamed from: c, reason: collision with root package name */
        public final h3.f f14145c;

        /* renamed from: d, reason: collision with root package name */
        public volatile boolean f14146d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f14147e;

        /* renamed from: f, reason: collision with root package name */
        public final a f14148f = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                e eVar = e.this;
                eVar.getClass();
                e.f14142g.execute(new r(eVar));
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.f14146d = eVar.c();
                try {
                    e eVar2 = e.this;
                    eVar2.f14143a.registerReceiver(eVar2.f14148f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    e.this.f14147e = true;
                } catch (SecurityException e4) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e4);
                    }
                    e.this.f14147e = false;
                }
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.f14147e) {
                    e.this.f14147e = false;
                    e eVar = e.this;
                    eVar.f14143a.unregisterReceiver(eVar.f14148f);
                }
            }
        }

        public e(Context context, h3.f fVar, b bVar) {
            this.f14143a = context.getApplicationContext();
            this.f14145c = fVar;
            this.f14144b = bVar;
        }

        @Override // a3.p.c
        public final boolean a() {
            f14142g.execute(new b());
            return true;
        }

        @Override // a3.p.c
        public final void b() {
            f14142g.execute(new c());
        }

        @SuppressLint({"MissingPermission"})
        public final boolean c() {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f14145c.get()).getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e4) {
                if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                    return true;
                }
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e4);
                return true;
            }
        }
    }

    public p(Context context) {
        h3.f fVar = new h3.f(new a(context));
        b bVar = new b();
        this.f14132a = Build.VERSION.SDK_INT >= 24 ? new d(fVar, bVar) : new e(context, fVar, bVar);
    }

    public static p a(Context context) {
        if (f14131d == null) {
            synchronized (p.class) {
                try {
                    if (f14131d == null) {
                        f14131d = new p(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f14131d;
    }
}
