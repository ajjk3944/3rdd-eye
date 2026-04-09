package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u2.AbstractC8129b;
import u2.InterfaceC8128a;
import v2.AbstractC8187a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f32358d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f32359e = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Context f32362c;

    /* renamed from: b, reason: collision with root package name */
    final Set f32361b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    final Map f32360a = new HashMap();

    a(Context context) {
        this.f32362c = context.getApplicationContext();
    }

    private Object d(Class cls, Set set) {
        Object objB;
        if (AbstractC8187a.d()) {
            try {
                AbstractC8187a.a(cls.getSimpleName());
            } catch (Throwable th2) {
                AbstractC8187a.b();
                throw th2;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f32360a.containsKey(cls)) {
            objB = this.f32360a.get(cls);
        } else {
            set.add(cls);
            try {
                InterfaceC8128a interfaceC8128a = (InterfaceC8128a) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = interfaceC8128a.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.f32360a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objB = interfaceC8128a.b(this.f32362c);
                set.remove(cls);
                this.f32360a.put(cls, objB);
            } catch (Throwable th3) {
                throw new StartupException(th3);
            }
        }
        AbstractC8187a.b();
        return objB;
    }

    public static a e(Context context) {
        if (f32358d == null) {
            synchronized (f32359e) {
                try {
                    if (f32358d == null) {
                        f32358d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f32358d;
    }

    void a() {
        try {
            try {
                AbstractC8187a.a("Startup");
                b(this.f32362c.getPackageManager().getProviderInfo(new ComponentName(this.f32362c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new StartupException(e10);
            }
        } finally {
            AbstractC8187a.b();
        }
    }

    void b(Bundle bundle) throws ClassNotFoundException {
        String string = this.f32362c.getString(AbstractC8129b.f62671a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC8128a.class.isAssignableFrom(cls)) {
                            this.f32361b.add(cls);
                        }
                    }
                }
                Iterator it = this.f32361b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    Object c(Class cls) {
        Object objD;
        synchronized (f32359e) {
            try {
                objD = this.f32360a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objD;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f32361b.contains(cls);
    }
}
