package w1;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import androidx.startup.StartupException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f24775d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f24776e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f24779c;

    /* renamed from: b, reason: collision with root package name */
    public final Set f24778b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final Map f24777a = new HashMap();

    public a(Context context) {
        this.f24779c = context.getApplicationContext();
    }

    public static a e(Context context) {
        if (f24775d == null) {
            synchronized (f24776e) {
                try {
                    if (f24775d == null) {
                        f24775d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f24775d;
    }

    public void a() {
        try {
            try {
                x1.b.a("Startup");
                b(this.f24779c.getPackageManager().getProviderInfo(new ComponentName(this.f24779c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e10) {
                throw new StartupException(e10);
            }
        } finally {
            x1.b.b();
        }
    }

    public void b(Bundle bundle) throws ClassNotFoundException {
        String string = this.f24779c.getString(c.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f24778b.add(cls);
                        }
                    }
                }
                Iterator it = this.f24778b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    public Object c(Class cls) {
        Object objD;
        synchronized (f24776e) {
            try {
                objD = this.f24777a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objD;
    }

    public final Object d(Class cls, Set set) {
        Object objCreate;
        if (x1.b.d()) {
            try {
                x1.b.a(cls.getSimpleName());
            } catch (Throwable th) {
                x1.b.b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f24777a.containsKey(cls)) {
            objCreate = this.f24777a.get(cls);
        } else {
            set.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!this.f24777a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objCreate = bVar.create(this.f24779c);
                set.remove(cls);
                this.f24777a.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        x1.b.b();
        return objCreate;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f24778b.contains(cls);
    }
}
