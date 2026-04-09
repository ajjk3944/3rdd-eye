package I1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: AppInitializer.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f2408d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f2409e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f2412c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2411b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2410a = new HashMap();

    public a(Context context) {
        this.f2412c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f2408d == null) {
            synchronized (f2409e) {
                try {
                    if (f2408d == null) {
                        f2408d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f2408d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f2412c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f2411b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e4) {
                throw new c(e4);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        if (J1.a.b()) {
            try {
                Trace.beginSection(J1.a.d(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f2410a;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> listDependencies = bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f2412c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }
}
