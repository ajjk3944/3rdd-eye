package se;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.util.Base64;
import bf.i;
import bf.q;
import cc.s;
import cf.n;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import io.sentry.android.core.e0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f {
    public static final Object k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final u.e f22006l = new u.e(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f22007a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22008b;

    /* renamed from: c, reason: collision with root package name */
    public final h f22009c;

    /* renamed from: d, reason: collision with root package name */
    public final i f22010d;

    /* renamed from: g, reason: collision with root package name */
    public final q f22013g;

    /* renamed from: h, reason: collision with root package name */
    public final eg.b f22014h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f22011e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f22012f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f22015i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public f(Context context, String str, h hVar) throws PackageManager.NameNotFoundException {
        ?? arrayList;
        this.f22007a = context;
        s.e(str);
        this.f22008b = str;
        this.f22009c = hVar;
        a aVar = FirebaseInitProvider.f5834a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                e0.p("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    e0.p("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            e0.p("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            e0.p("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new bf.e(0, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        n nVar = n.INSTANCE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i10 = 1;
        arrayList3.add(new bf.e(i10, new FirebaseCommonRegistrar()));
        arrayList3.add(new bf.e(i10, new ExecutorsRegistrar()));
        arrayList4.add(bf.c.c(context, Context.class, new Class[0]));
        arrayList4.add(bf.c.c(this, f.class, new Class[0]));
        arrayList4.add(bf.c.c(hVar, h.class, new Class[0]));
        df.c cVar = new df.c();
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.f5835d.get()) {
            arrayList4.add(bf.c.c(aVar, a.class, new Class[0]));
        }
        i iVar = new i(nVar, arrayList3, arrayList4, cVar);
        this.f22010d = iVar;
        Trace.endSection();
        this.f22013g = new q(new bf.h(this, 2, context));
        this.f22014h = iVar.g(cg.d.class);
        c cVar2 = new c(this);
        a();
        if (this.f22011e.get()) {
            bc.c.f2581x.f2582a.get();
        }
        this.f22015i.add(cVar2);
        Trace.endSection();
    }

    public static f c() {
        f fVar;
        synchronized (k) {
            try {
                fVar = (f) f22006l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + gc.b.c() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((cg.d) fVar.f22014h.get()).b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static f f(Context context, h hVar) {
        f fVar;
        AtomicReference atomicReference = d.f22003a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = d.f22003a;
            if (atomicReference2.get() == null) {
                d dVar = new d();
                while (true) {
                    if (atomicReference2.compareAndSet(null, dVar)) {
                        bc.c.b(application);
                        bc.c.f2581x.a(dVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            u.e eVar = f22006l;
            s.j("FirebaseApp name [DEFAULT] already exists!", !eVar.containsKey("[DEFAULT]"));
            s.i(context, "Application context cannot be null.");
            fVar = new f(context, "[DEFAULT]", hVar);
            eVar.put("[DEFAULT]", fVar);
        }
        fVar.e();
        return fVar;
    }

    public static void g(Context context) {
        synchronized (k) {
            try {
                if (f22006l.containsKey("[DEFAULT]")) {
                    c();
                    return;
                }
                h hVarA = h.a(context);
                if (hVarA == null) {
                    e0.p("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                } else {
                    f(context, hVarA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        s.j("FirebaseApp was deleted", !this.f22012f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f22010d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f22008b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        a();
        byte[] bytes2 = this.f22009c.f22022b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void e() {
        HashMap map;
        if (!((UserManager) this.f22007a.getSystemService(UserManager.class)).isUserUnlocked()) {
            a();
            Context context = this.f22007a;
            AtomicReference atomicReference = e.f22004b;
            if (atomicReference.get() == null) {
                e eVar = new e(context);
                while (!atomicReference.compareAndSet(null, eVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        a();
        i iVar = this.f22010d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f22008b);
        AtomicReference atomicReference2 = iVar.f2721y;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (iVar) {
                    map = new HashMap(iVar.f2716a);
                }
                iVar.b(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((cg.d) this.f22014h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.a();
        return this.f22008b.equals(fVar.f22008b);
    }

    public final boolean h() {
        boolean z10;
        a();
        jg.a aVar = (jg.a) this.f22013g.get();
        synchronized (aVar) {
            z10 = aVar.f13710a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f22008b.hashCode();
    }

    public final String toString() {
        bm.e eVar = new bm.e(9, this);
        eVar.d(this.f22008b, "name");
        eVar.d(this.f22009c, "options");
        return eVar.toString();
    }
}
