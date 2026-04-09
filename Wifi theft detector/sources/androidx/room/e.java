package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import androidx.room.c;
import androidx.room.d;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4098a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4099b;

    /* renamed from: c, reason: collision with root package name */
    public int f4100c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.room.d f4101d;

    /* renamed from: e, reason: collision with root package name */
    public final d.c f4102e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.room.c f4103f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f4104g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.room.b f4105h = new a();

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f4106i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final ServiceConnection f4107j;

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f4108k;

    /* renamed from: l, reason: collision with root package name */
    public final Runnable f4109l;

    /* renamed from: m, reason: collision with root package name */
    public final Runnable f4110m;

    public class a extends b.a {

        /* renamed from: androidx.room.e$a$a, reason: collision with other inner class name */
        public class RunnableC0044a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f4112a;

            public RunnableC0044a(String[] strArr) {
                this.f4112a = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f4101d.e(this.f4112a);
            }
        }

        public a() {
        }

        @Override // androidx.room.b
        public void a(String[] strArr) {
            e.this.f4104g.execute(new RunnableC0044a(strArr));
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            e.this.f4103f = c.a.f(iBinder);
            e eVar = e.this;
            eVar.f4104g.execute(eVar.f4108k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            e eVar = e.this;
            eVar.f4104g.execute(eVar.f4109l);
            e.this.f4103f = null;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e eVar = e.this;
                androidx.room.c cVar = eVar.f4103f;
                if (cVar != null) {
                    eVar.f4100c = cVar.c(eVar.f4105h, eVar.f4099b);
                    e eVar2 = e.this;
                    eVar2.f4101d.a(eVar2.f4102e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f4101d.g(eVar.f4102e);
        }
    }

    /* renamed from: androidx.room.e$e, reason: collision with other inner class name */
    public class RunnableC0045e implements Runnable {
        public RunnableC0045e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.f4101d.g(eVar.f4102e);
            try {
                e eVar2 = e.this;
                androidx.room.c cVar = eVar2.f4103f;
                if (cVar != null) {
                    cVar.e(eVar2.f4105h, eVar2.f4100c);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            e eVar3 = e.this;
            eVar3.f4098a.unbindService(eVar3.f4107j);
        }
    }

    public class f extends d.c {
        public f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.d.c
        public boolean a() {
            return true;
        }

        @Override // androidx.room.d.c
        public void b(Set set) {
            if (e.this.f4106i.get()) {
                return;
            }
            try {
                e eVar = e.this;
                androidx.room.c cVar = eVar.f4103f;
                if (cVar != null) {
                    cVar.b(eVar.f4100c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public e(Context context, String str, androidx.room.d dVar, Executor executor) {
        b bVar = new b();
        this.f4107j = bVar;
        this.f4108k = new c();
        this.f4109l = new d();
        this.f4110m = new RunnableC0045e();
        Context applicationContext = context.getApplicationContext();
        this.f4098a = applicationContext;
        this.f4099b = str;
        this.f4101d = dVar;
        this.f4104g = executor;
        this.f4102e = new f((String[]) dVar.f4075a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }
}
