package com.google.firebase;

import A1.p;
import F4.n;
import F4.t;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C4274c;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import f5.InterfaceC5536b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k5.C6393a;
import o.C7010a;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import r.Y;
import r5.C7574b;
import s3.AbstractC7900o;
import s3.AbstractC7901p;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f38859k = new Object();

    /* renamed from: l, reason: collision with root package name */
    static final Map f38860l = new C7010a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f38861a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38862b;

    /* renamed from: c, reason: collision with root package name */
    private final m f38863c;

    /* renamed from: d, reason: collision with root package name */
    private final F4.n f38864d;

    /* renamed from: g, reason: collision with root package name */
    private final t f38867g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC5536b f38868h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f38865e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f38866f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List f38869i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List f38870j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    private static class b implements ComponentCallbacks2C4274c.a {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference f38871a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (com.google.android.gms.common.util.k.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f38871a.get() == null) {
                    b bVar = new b();
                    if (Y.a(f38871a, null, bVar)) {
                        ComponentCallbacks2C4274c.c(application);
                        ComponentCallbacks2C4274c.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C4274c.a
        public void a(boolean z10) {
            synchronized (f.f38859k) {
                try {
                    Iterator it = new ArrayList(f.f38860l.values()).iterator();
                    while (it.hasNext()) {
                        f fVar = (f) it.next();
                        if (fVar.f38865e.get()) {
                            fVar.y(z10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference f38872b = new AtomicReference();

        /* renamed from: a, reason: collision with root package name */
        private final Context f38873a;

        public c(Context context) {
            this.f38873a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f38872b.get() == null) {
                c cVar = new c(context);
                if (Y.a(f38872b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f38873a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f38859k) {
                try {
                    Iterator it = f.f38860l.values().iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).p();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c();
        }
    }

    protected f(final Context context, String str, m mVar) {
        this.f38861a = (Context) AbstractC7901p.l(context);
        this.f38862b = AbstractC7901p.f(str);
        this.f38863c = (m) AbstractC7901p.l(mVar);
        n nVarB = FirebaseInitProvider.b();
        r5.c.b("Firebase");
        r5.c.b("ComponentDiscovery");
        List listB = F4.f.c(context, ComponentDiscoveryService.class).b();
        r5.c.a();
        r5.c.b("Runtime");
        n.b bVarG = F4.n.m(G4.k.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(F4.c.s(context, Context.class, new Class[0])).b(F4.c.s(this, f.class, new Class[0])).b(F4.c.s(mVar, m.class, new Class[0])).g(new C7574b());
        if (p.a(context) && FirebaseInitProvider.c()) {
            bVarG.b(F4.c.s(nVarB, n.class, new Class[0]));
        }
        F4.n nVarE = bVarG.e();
        this.f38864d = nVarE;
        r5.c.a();
        this.f38867g = new t(new InterfaceC5536b() { // from class: com.google.firebase.d
            @Override // f5.InterfaceC5536b
            public final Object get() {
                return this.f38856a.v(context);
            }
        });
        this.f38868h = nVarE.e(e5.f.class);
        g(new a() { // from class: com.google.firebase.e
            @Override // com.google.firebase.f.a
            public final void a(boolean z10) {
                this.f38858a.w(z10);
            }
        });
        r5.c.a();
    }

    private void i() {
        AbstractC7901p.p(!this.f38866f.get(), "FirebaseApp was deleted");
    }

    public static f l() {
        f fVar;
        synchronized (f38859k) {
            try {
                fVar = (f) f38860l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + com.google.android.gms.common.util.n.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((e5.f) fVar.f38868h.get()).k();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!p.a(this.f38861a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m());
            c.b(this.f38861a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m());
        this.f38864d.p(u());
        ((e5.f) this.f38868h.get()).k();
    }

    public static f q(Context context) {
        synchronized (f38859k) {
            try {
                if (f38860l.containsKey("[DEFAULT]")) {
                    return l();
                }
                m mVarA = m.a(context);
                if (mVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return r(context, mVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static f r(Context context, m mVar) {
        return s(context, mVar, "[DEFAULT]");
    }

    public static f s(Context context, m mVar, String str) {
        f fVar;
        b.c(context);
        String strX = x(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f38859k) {
            Map map = f38860l;
            AbstractC7901p.p(!map.containsKey(strX), "FirebaseApp name " + strX + " already exists!");
            AbstractC7901p.m(context, "Application context cannot be null.");
            fVar = new f(context, strX, mVar);
            map.put(strX, fVar);
        }
        fVar.p();
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C6393a v(Context context) {
        return new C6393a(context, o(), (d5.c) this.f38864d.a(d5.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(boolean z10) {
        if (z10) {
            return;
        }
        ((e5.f) this.f38868h.get()).k();
    }

    private static String x(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f38869i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f38862b.equals(((f) obj).m());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.f38865e.get() && ComponentCallbacks2C4274c.b().d()) {
            aVar.a(true);
        }
        this.f38869i.add(aVar);
    }

    public void h(g gVar) {
        i();
        AbstractC7901p.l(gVar);
        this.f38870j.add(gVar);
    }

    public int hashCode() {
        return this.f38862b.hashCode();
    }

    public Object j(Class cls) {
        i();
        return this.f38864d.a(cls);
    }

    public Context k() {
        i();
        return this.f38861a;
    }

    public String m() {
        i();
        return this.f38862b;
    }

    public m n() {
        i();
        return this.f38863c;
    }

    public String o() {
        return com.google.android.gms.common.util.c.a(m().getBytes(Charset.defaultCharset())) + MqttTopic.SINGLE_LEVEL_WILDCARD + com.google.android.gms.common.util.c.a(n().c().getBytes(Charset.defaultCharset()));
    }

    public boolean t() {
        i();
        return ((C6393a) this.f38867g.get()).b();
    }

    public String toString() {
        return AbstractC7900o.c(this).a("name", this.f38862b).a("options", this.f38863c).toString();
    }

    public boolean u() {
        return "[DEFAULT]".equals(m());
    }
}
