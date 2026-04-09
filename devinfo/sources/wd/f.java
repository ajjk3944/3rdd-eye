package wd;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import de.m;
import ee.l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import km.n;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f36612k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final x.e f36613l = new x.e(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f36614a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36615b;

    /* renamed from: c, reason: collision with root package name */
    public final h f36616c;

    /* renamed from: d, reason: collision with root package name */
    public final de.f f36617d;
    public final m g;

    /* renamed from: h, reason: collision with root package name */
    public final cf.b f36620h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f36618e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f36619f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f36621i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public f(Context context, String str, h hVar) throws PackageManager.NameNotFoundException {
        ?? arrayList;
        int i4 = 0;
        this.f36614a = context;
        y.e(str);
        this.f36615b = str;
        this.f36616c = hVar;
        a aVar = FirebaseInitProvider.f20717a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
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
            arrayList2.add(new de.c(i4, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        l lVar = l.f23430a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i10 = 1;
        arrayList3.add(new de.c(i10, new FirebaseCommonRegistrar()));
        arrayList3.add(new de.c(i10, new ExecutorsRegistrar()));
        arrayList4.add(de.a.c(context, Context.class, new Class[0]));
        arrayList4.add(de.a.c(this, f.class, new Class[0]));
        arrayList4.add(de.a.c(hVar, h.class, new Class[0]));
        ja.c cVar = new ja.c();
        if (com.bumptech.glide.f.n(context) && FirebaseInitProvider.f20718b.get()) {
            arrayList4.add(de.a.c(aVar, a.class, new Class[0]));
        }
        de.f fVar = new de.f(arrayList3, arrayList4, cVar);
        this.f36617d = fVar;
        Trace.endSection();
        this.g = new m(new bf.c(this, context));
        this.f36620h = fVar.j(bf.e.class);
        c cVar2 = new c(this);
        a();
        if (this.f36618e.get()) {
            com.google.android.gms.common.api.internal.c.f9073e.f9074a.get();
        }
        this.f36621i.add(cVar2);
        Trace.endSection();
    }

    public static f b() {
        f fVar;
        synchronized (f36612k) {
            try {
                fVar = (f) f36613l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + tb.c.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((bf.e) fVar.f36620h.get()).b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static f e(Context context) {
        synchronized (f36612k) {
            try {
                if (f36613l.containsKey("[DEFAULT]")) {
                    return b();
                }
                h hVarA = h.a(context);
                if (hVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(context, hVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static f f(Context context, h hVar) {
        f fVar;
        AtomicReference atomicReference = d.f36609a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = d.f36609a;
            if (atomicReference2.get() == null) {
                d dVar = new d();
                while (true) {
                    if (atomicReference2.compareAndSet(null, dVar)) {
                        com.google.android.gms.common.api.internal.c.b(application);
                        com.google.android.gms.common.api.internal.c.f9073e.a(dVar);
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
        synchronized (f36612k) {
            x.e eVar = f36613l;
            y.j("FirebaseApp name [DEFAULT] already exists!", !eVar.containsKey("[DEFAULT]"));
            y.i(context, "Application context cannot be null.");
            fVar = new f(context, "[DEFAULT]", hVar);
            eVar.put("[DEFAULT]", fVar);
        }
        fVar.d();
        return fVar;
    }

    public final void a() {
        y.j("FirebaseApp was deleted", !this.f36619f.get());
    }

    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f36615b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        a();
        byte[] bytes2 = this.f36616c.f36628b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void d() {
        HashMap map;
        if (!com.bumptech.glide.f.n(this.f36614a)) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f36615b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f36614a;
            AtomicReference atomicReference = e.f36610b;
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
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f36615b);
        Log.i("FirebaseApp", sb3.toString());
        de.f fVar = this.f36617d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f36615b);
        AtomicReference atomicReference2 = fVar.f22204f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (fVar) {
                    map = new HashMap(fVar.f22199a);
                }
                fVar.b(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((bf.e) this.f36620h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.a();
        return this.f36615b.equals(fVar.f36615b);
    }

    public final boolean g() {
        boolean z3;
        a();
        hf.a aVar = (hf.a) this.g.get();
        synchronized (aVar) {
            z3 = aVar.f25065b;
        }
        return z3;
    }

    public final int hashCode() {
        return this.f36615b.hashCode();
    }

    public final String toString() {
        n nVar = new n(this);
        nVar.f(this.f36615b, "name");
        nVar.f(this.f36616c, "options");
        return nVar.toString();
    }
}
