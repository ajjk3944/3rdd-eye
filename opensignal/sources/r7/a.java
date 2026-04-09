package r7;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import bf.n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xu.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f21299d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f21300e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f21303c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f21302b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f21301a = new HashMap();

    public a(Context context) {
        this.f21303c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f21299d == null) {
            synchronized (f21300e) {
                try {
                    if (f21299d == null) {
                        f21299d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f21299d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f21303c.getString(c.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f21302b;
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
                throw new n(e4);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = this.f21301a;
        if (d.N()) {
            try {
                d.e(cls.getSimpleName());
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
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
                objB = bVar.b(this.f21303c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th3) {
                throw new n(th3);
            }
        }
        Trace.endSection();
        return objB;
    }
}
