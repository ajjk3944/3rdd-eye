package d3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: d3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5297k implements InterfaceC5291e {

    /* renamed from: a, reason: collision with root package name */
    private final a f45745a;

    /* renamed from: b, reason: collision with root package name */
    private final C5295i f45746b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f45747c;

    /* renamed from: d3.k$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f45748a;

        /* renamed from: b, reason: collision with root package name */
        private Map f45749b = null;

        a(Context context) {
            this.f45748a = context;
        }

        private Map a(Context context) throws PackageManager.NameNotFoundException {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private Map c() {
            if (this.f45749b == null) {
                this.f45749b = a(this.f45748a);
            }
            return this.f45749b;
        }

        private static Bundle d(Context context) throws PackageManager.NameNotFoundException {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        InterfaceC5290d b(String str) {
            String str2 = (String) c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC5290d) Class.forName(str2).asSubclass(InterfaceC5290d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e14);
                return null;
            }
        }
    }

    C5297k(Context context, C5295i c5295i) {
        this(new a(context), c5295i);
    }

    @Override // d3.InterfaceC5291e
    public synchronized InterfaceC5299m get(String str) {
        if (this.f45747c.containsKey(str)) {
            return (InterfaceC5299m) this.f45747c.get(str);
        }
        InterfaceC5290d interfaceC5290dB = this.f45745a.b(str);
        if (interfaceC5290dB == null) {
            return null;
        }
        InterfaceC5299m interfaceC5299mCreate = interfaceC5290dB.create(this.f45746b.a(str));
        this.f45747c.put(str, interfaceC5299mCreate);
        return interfaceC5299mCreate;
    }

    C5297k(a aVar, C5295i c5295i) {
        this.f45747c = new HashMap();
        this.f45745a = aVar;
        this.f45746b = c5295i;
    }
}
