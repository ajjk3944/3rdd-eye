package Q2;

import Q2.b;
import W2.f;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class r {

    /* renamed from: d, reason: collision with root package name */
    private static volatile r f19149d;

    /* renamed from: a, reason: collision with root package name */
    private final c f19150a;

    /* renamed from: b, reason: collision with root package name */
    final Set f19151b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f19152c;

    class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f19153a;

        a(Context context) {
            this.f19153a = context;
        }

        @Override // W2.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f19153a.getSystemService("connectivity");
        }
    }

    class b implements b.a {
        b() {
        }

        @Override // Q2.b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            W2.l.a();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f19151b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z10);
            }
        }
    }

    private interface c {
        void a();

        boolean b();
    }

    private static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        boolean f19156a;

        /* renamed from: b, reason: collision with root package name */
        final b.a f19157b;

        /* renamed from: c, reason: collision with root package name */
        private final f.b f19158c;

        /* renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f19159d = new a();

        class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: Q2.r$d$a$a, reason: collision with other inner class name */
            class RunnableC0672a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f19161a;

                RunnableC0672a(boolean z10) {
                    this.f19161a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f19161a);
                }
            }

            a() {
            }

            private void b(boolean z10) {
                W2.l.u(new RunnableC0672a(z10));
            }

            void a(boolean z10) {
                W2.l.a();
                d dVar = d.this;
                boolean z11 = dVar.f19156a;
                dVar.f19156a = z10;
                if (z11 != z10) {
                    dVar.f19157b.a(z10);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        d(f.b bVar, b.a aVar) {
            this.f19158c = bVar;
            this.f19157b = aVar;
        }

        @Override // Q2.r.c
        public void a() {
            ((ConnectivityManager) this.f19158c.get()).unregisterNetworkCallback(this.f19159d);
        }

        @Override // Q2.r.c
        public boolean b() {
            this.f19156a = ((ConnectivityManager) this.f19158c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f19158c.get()).registerDefaultNetworkCallback(this.f19159d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }
    }

    private r(Context context) {
        this.f19150a = new d(W2.f.a(new a(context)), new b());
    }

    static r a(Context context) {
        if (f19149d == null) {
            synchronized (r.class) {
                try {
                    if (f19149d == null) {
                        f19149d = new r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f19149d;
    }

    private void b() {
        if (this.f19152c || this.f19151b.isEmpty()) {
            return;
        }
        this.f19152c = this.f19150a.b();
    }

    private void c() {
        if (this.f19152c && this.f19151b.isEmpty()) {
            this.f19150a.a();
            this.f19152c = false;
        }
    }

    synchronized void d(b.a aVar) {
        this.f19151b.add(aVar);
        b();
    }

    synchronized void e(b.a aVar) {
        this.f19151b.remove(aVar);
        c();
    }
}
