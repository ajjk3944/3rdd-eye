package h6;

import ac.m;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.gms.internal.measurement.z3;
import com.liuzh.deviceinfo.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f24881d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f24882e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f24885c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f24884b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24883a = new HashMap();

    public a(Context context) {
        this.f24885c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f24881d == null) {
            synchronized (f24882e) {
                try {
                    if (f24881d == null) {
                        f24881d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f24881d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f24885c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f24884b;
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
            } catch (ClassNotFoundException e2) {
                throw new m(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = this.f24883a;
        if (z3.p()) {
            try {
                Trace.beginSection(z3.w(cls.getSimpleName()));
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f24885c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th3) {
                throw new m(th3);
            }
        }
        Trace.endSection();
        return objCreate;
    }
}
