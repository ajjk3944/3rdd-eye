package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m4.AbstractC6769h;
import o.C7010a;

/* loaded from: classes.dex */
public final class G3 implements InterfaceC4390k3 {

    /* renamed from: g, reason: collision with root package name */
    private static final Map f35016g = new C7010a();

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f35017a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f35018b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f35019c;

    /* renamed from: e, reason: collision with root package name */
    private volatile Map f35021e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f35020d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final List f35022f = new ArrayList();

    private G3(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f35017a = sharedPreferences;
        this.f35018b = runnable;
    }

    private static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                SharedPreferences sharedPreferencesA = AbstractC4506z0.a(context, str, 0, AbstractC4474v0.f35500a);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return sharedPreferencesA;
            }
            if (AbstractC4328d3.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            SharedPreferences sharedPreferencesA2 = AbstractC4506z0.a(context, str.substring(12), 0, AbstractC4474v0.f35500a);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return sharedPreferencesA2;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    static G3 b(Context context, String str, Runnable runnable) {
        final G3 g32;
        if (!((!AbstractC4328d3.a() || str.startsWith("direct_boot:")) ? true : AbstractC4328d3.c(context))) {
            return null;
        }
        synchronized (G3.class) {
            try {
                Map map = f35016g;
                g32 = (G3) map.get(str);
                if (g32 == null) {
                    g32 = new G3(a(context, str), runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.F3
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            G3.d(this.f34999a, sharedPreferences, str2);
                        }
                    };
                    g32.f35019c = onSharedPreferenceChangeListener;
                    g32.f35017a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, g32);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g32;
    }

    static synchronized void c() {
        try {
            for (G3 g32 : f35016g.values()) {
                g32.f35017a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) AbstractC6769h.i(g32.f35019c));
            }
            f35016g.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ void d(G3 g32, SharedPreferences sharedPreferences, String str) {
        synchronized (g32.f35020d) {
            g32.f35021e = null;
            g32.f35018b.run();
        }
        synchronized (g32) {
            try {
                Iterator it = g32.f35022f.iterator();
                if (it.hasNext()) {
                    AbstractC5487d.a(it.next());
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4390k3
    public final Object zza(String str) {
        Map<String, ?> map = this.f35021e;
        if (map == null) {
            synchronized (this.f35020d) {
                try {
                    map = this.f35021e;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f35017a.getAll();
                            this.f35021e = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
