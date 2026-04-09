package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C4937q3;
import com.google.android.gms.measurement.internal.InterfaceC4930p4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4371i1 {

    /* renamed from: j, reason: collision with root package name */
    private static volatile C4371i1 f35249j;

    /* renamed from: a, reason: collision with root package name */
    private final String f35250a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.util.d f35251b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f35252c;

    /* renamed from: d, reason: collision with root package name */
    private final J3.a f35253d;

    /* renamed from: e, reason: collision with root package name */
    private final List f35254e;

    /* renamed from: f, reason: collision with root package name */
    private int f35255f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f35256g;

    /* renamed from: h, reason: collision with root package name */
    private String f35257h;

    /* renamed from: i, reason: collision with root package name */
    private volatile P0 f35258i;

    /* renamed from: com.google.android.gms.internal.measurement.i1$a */
    abstract class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final long f35259a;

        /* renamed from: b, reason: collision with root package name */
        final long f35260b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f35261c;

        a(C4371i1 c4371i1) {
            this(true);
        }

        abstract void a();

        protected void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4371i1.this.f35256g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e10) {
                C4371i1.this.q(e10, false, this.f35261c);
                b();
            }
        }

        a(boolean z10) {
            this.f35259a = C4371i1.this.f35251b.a();
            this.f35260b = C4371i1.this.f35251b.c();
            this.f35261c = z10;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.i1$b */
    static class b extends Z0 {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC4930p4 f35263a;

        b(InterfaceC4930p4 interfaceC4930p4) {
            this.f35263a = interfaceC4930p4;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC4299a1
        public final void P(String str, String str2, Bundle bundle, long j10) {
            this.f35263a.a(str, str2, bundle, j10);
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC4299a1
        public final int zza() {
            return System.identityHashCode(this.f35263a);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.i1$c */
    class c implements Application.ActivityLifecycleCallbacks {
        c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C4371i1.this.l(new H1(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C4371i1.this.l(new M1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C4371i1.this.l(new L1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            C4371i1.this.l(new I1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Q0 q02 = new Q0();
            C4371i1.this.l(new N1(this, activity, q02));
            Bundle bundleC = q02.c(50L);
            if (bundleC != null) {
                bundle.putAll(bundleC);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C4371i1.this.l(new J1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C4371i1.this.l(new K1(this, activity));
        }
    }

    private C4371i1(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !F(str2, str3)) {
            this.f35250a = "FA";
        } else {
            this.f35250a = str;
        }
        this.f35251b = com.google.android.gms.common.util.g.d();
        this.f35252c = I0.a().a(new ThreadFactoryC4443r1(this), 1);
        this.f35253d = new J3.a(this);
        this.f35254e = new ArrayList();
        if (C(context) && !L()) {
            this.f35257h = null;
            this.f35256g = true;
            Log.w(this.f35250a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (F(str2, str3)) {
            this.f35257h = str2;
        } else {
            this.f35257h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f35250a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f35250a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        l(new C4396l1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f35250a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c());
        }
    }

    private static boolean C(Context context) {
        return new C4937q3(context, C4937q3.a(context)).b("google_app_id") != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F(String str, String str2) {
        return (str2 == null || str == null || L()) ? false : true;
    }

    private final boolean L() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static C4371i1 e(Context context) {
        return f(context, null, null, null, null);
    }

    public static C4371i1 f(Context context, String str, String str2, String str3, Bundle bundle) {
        AbstractC7901p.l(context);
        if (f35249j == null) {
            synchronized (C4371i1.class) {
                try {
                    if (f35249j == null) {
                        f35249j = new C4371i1(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f35249j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(a aVar) {
        this.f35252c.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(Exception exc, boolean z10, boolean z11) {
        this.f35256g |= z10;
        if (z10) {
            Log.w(this.f35250a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            i(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f35250a, "Error with data collection. Data lost.", exc);
    }

    private final void u(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        l(new G1(this, l10, str, str2, bundle, z10, z11));
    }

    public final void A(String str, String str2) {
        v(null, str, str2, false);
    }

    public final void B(String str, String str2, Bundle bundle) {
        u(str, str2, bundle, true, true, null);
    }

    public final void D(String str) {
        l(new C4451s1(this, str));
    }

    public final void G(String str) {
        l(new C4420o1(this, str));
    }

    public final String H() {
        Q0 q02 = new Q0();
        l(new C4483w1(this, q02));
        return q02.o0(50L);
    }

    public final String I() {
        Q0 q02 = new Q0();
        l(new C1(this, q02));
        return q02.o0(500L);
    }

    public final String J() {
        Q0 q02 = new Q0();
        l(new C4499y1(this, q02));
        return q02.o0(500L);
    }

    public final String K() {
        Q0 q02 = new Q0();
        l(new C4491x1(this, q02));
        return q02.o0(500L);
    }

    public final int a(String str) {
        Q0 q02 = new Q0();
        l(new E1(this, str, q02));
        Integer num = (Integer) Q0.f(q02.c(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        Q0 q02 = new Q0();
        l(new C4507z1(this, q02));
        Long lN0 = q02.n0(500L);
        if (lN0 != null) {
            return lN0.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f35251b.a()).nextLong();
        int i10 = this.f35255f + 1;
        this.f35255f = i10;
        return jNextLong + i10;
    }

    protected final P0 c(Context context, boolean z10) {
        try {
            return S0.asInterface(DynamiteModule.e(context, DynamiteModule.f34899e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e10) {
            q(e10, true, false);
            return null;
        }
    }

    public final List g(String str, String str2) {
        Q0 q02 = new Q0();
        l(new C4428p1(this, str, str2, q02));
        List list = (List) Q0.f(q02.c(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map h(String str, String str2, boolean z10) {
        Q0 q02 = new Q0();
        l(new A1(this, str, str2, z10, q02));
        Bundle bundleC = q02.c(5000L);
        if (bundleC == null || bundleC.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleC.size());
        for (String str3 : bundleC.keySet()) {
            Object obj = bundleC.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void i(int i10, String str, Object obj, Object obj2, Object obj3) {
        l(new D1(this, false, 5, str, obj, null, null));
    }

    public final void j(Activity activity, String str, String str2) {
        l(new C4436q1(this, C4353g1.b(activity), str, str2));
    }

    public final void k(Bundle bundle) {
        l(new C4412n1(this, bundle));
    }

    public final void p(InterfaceC4930p4 interfaceC4930p4) {
        AbstractC7901p.l(interfaceC4930p4);
        synchronized (this.f35254e) {
            for (int i10 = 0; i10 < this.f35254e.size(); i10++) {
                try {
                    if (interfaceC4930p4.equals(((Pair) this.f35254e.get(i10)).first)) {
                        Log.w(this.f35250a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            b bVar = new b(interfaceC4930p4);
            this.f35254e.add(new Pair(interfaceC4930p4, bVar));
            if (this.f35258i != null) {
                try {
                    this.f35258i.registerOnMeasurementEventListener(bVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f35250a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            l(new F1(this, bVar));
        }
    }

    public final void r(Runnable runnable) {
        l(new C4475v1(this, runnable));
    }

    public final void s(String str, Bundle bundle) {
        u(null, str, bundle, false, true, null);
    }

    public final void t(String str, String str2, Bundle bundle) {
        l(new C4404m1(this, str, str2, bundle));
    }

    public final void v(String str, String str2, Object obj, boolean z10) {
        l(new C4388k1(this, str, str2, obj, z10));
    }

    public final J3.a x() {
        return this.f35253d;
    }

    public final void z(String str) {
        l(new C4459t1(this, str));
    }
}
