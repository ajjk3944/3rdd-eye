package B4;

import G0.t;
import I4.n;
import J4.p;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import e5.C4318d;
import g5.InterfaceC4392b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m0.C5308a;
import m5.C5327a;
import z5.C5861a;

/* compiled from: FirebaseApp.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f485k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final C5308a f486l = new C5308a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f487a;

    /* renamed from: b, reason: collision with root package name */
    public final String f488b;

    /* renamed from: c, reason: collision with root package name */
    public final k f489c;

    /* renamed from: d, reason: collision with root package name */
    public final I4.g f490d;

    /* renamed from: g, reason: collision with root package name */
    public final n<C5327a> f493g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4392b<C4318d> f494h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f491e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f492f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f495j = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    @KeepForSdk
    public interface a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z10);
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    public static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public static final AtomicReference<b> f496a = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z10) {
            synchronized (e.f485k) {
                try {
                    Iterator it = new ArrayList(e.f486l.values()).iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (eVar.f491e.get()) {
                            Log.d("FirebaseApp", "Notifying background state change listeners.");
                            Iterator it2 = eVar.i.iterator();
                            while (it2.hasNext()) {
                                ((a) it2.next()).onBackgroundStateChanged(z10);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    public static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        public static final AtomicReference<c> f497b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        public final Context f498a;

        public c(Context context) {
            this.f498a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (e.f485k) {
                try {
                    Iterator it = ((C5308a.e) e.f486l.values()).iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f498a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    public e(final Context context, String str, k kVar) throws PackageManager.NameNotFoundException {
        ?? arrayList;
        this.f487a = (Context) Preconditions.checkNotNull(context);
        this.f488b = Preconditions.checkNotEmpty(str);
        this.f489c = (k) Preconditions.checkNotNull(kVar);
        B4.a aVar = FirebaseInitProvider.f23277b;
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
            arrayList2.add(new I4.c((String) it.next(), 0));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        p pVar = p.INSTANCE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new I4.c(new FirebaseCommonRegistrar(), 1));
        arrayList3.add(new I4.c(new ExecutorsRegistrar(), 1));
        arrayList4.add(I4.a.c(context, Context.class, new Class[0]));
        arrayList4.add(I4.a.c(this, e.class, new Class[0]));
        arrayList4.add(I4.a.c(kVar, k.class, new Class[0]));
        C5861a c5861a = new C5861a();
        if (t.a(context) && FirebaseInitProvider.f23278c.get()) {
            arrayList4.add(I4.a.c(aVar, l.class, new Class[0]));
        }
        I4.g gVar = new I4.g(pVar, arrayList3, arrayList4, c5861a);
        this.f490d = gVar;
        Trace.endSection();
        this.f493g = new n<>(new InterfaceC4392b() { // from class: B4.c
            @Override // g5.InterfaceC4392b
            public final Object get() {
                e eVar = this.f482a;
                return new C5327a(context, eVar.d(), (d5.c) eVar.f490d.a(d5.c.class));
            }
        });
        this.f494h = gVar.c(C4318d.class);
        a aVar2 = new a() { // from class: B4.d
            @Override // B4.e.a
            public final void onBackgroundStateChanged(boolean z10) {
                e eVar = this.f484a;
                if (z10) {
                    eVar.getClass();
                } else {
                    eVar.f494h.get().c();
                }
            }
        };
        a();
        if (this.f491e.get() && BackgroundDetector.getInstance().isInBackground()) {
            aVar2.onBackgroundStateChanged(true);
        }
        this.i.add(aVar2);
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e c() {
        e eVar;
        synchronized (f485k) {
            try {
                eVar = (e) f486l.get("[DEFAULT]");
                if (eVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                eVar.f494h.get().c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static e f(Context context) {
        synchronized (f485k) {
            try {
                if (f486l.containsKey("[DEFAULT]")) {
                    return c();
                }
                k kVarA = k.a(context);
                if (kVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, kVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static e g(Context context, k kVar) {
        e eVar;
        AtomicReference<b> atomicReference = b.f496a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.f496a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                while (true) {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
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
        synchronized (f485k) {
            C5308a c5308a = f486l;
            Preconditions.checkState(!c5308a.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            eVar = new e(context, "[DEFAULT]", kVar);
            c5308a.put("[DEFAULT]", eVar);
        }
        eVar.e();
        return eVar;
    }

    public final void a() {
        Preconditions.checkState(!this.f492f.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    public final <T> T b(Class<T> cls) {
        a();
        return (T) this.f490d.a(cls);
    }

    @KeepForSdk
    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f488b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f489c.f504b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        HashMap map;
        if (!t.a(this.f487a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f488b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f487a;
            AtomicReference<c> atomicReference = c.f497b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (!atomicReference.compareAndSet(null, cVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f488b);
        Log.i("FirebaseApp", sb2.toString());
        I4.g gVar = this.f490d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f488b);
        AtomicReference<Boolean> atomicReference2 = gVar.f2458f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (true) {
            if (atomicReference2.compareAndSet(null, boolValueOf)) {
                synchronized (gVar) {
                    map = new HashMap(gVar.f2453a);
                }
                gVar.g(map, zEquals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        this.f494h.get().c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.a();
        return this.f488b.equals(eVar.f488b);
    }

    @KeepForSdk
    public final boolean h() {
        boolean z10;
        a();
        C5327a c5327a = this.f493g.get();
        synchronized (c5327a) {
            z10 = c5327a.f44082b;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f488b.hashCode();
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f488b).add("options", this.f489c).toString();
    }
}
