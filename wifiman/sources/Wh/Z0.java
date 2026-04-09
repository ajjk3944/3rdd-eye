package wh;

import Gh.AbstractC2914f;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class Z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap f65115a = new ConcurrentHashMap();

    public static final Fh.k a(Class cls) {
        AbstractC6492s.i(cls, "<this>");
        ClassLoader classLoaderJ = AbstractC2914f.j(cls);
        k1 k1Var = new k1(classLoaderJ);
        ConcurrentMap concurrentMap = f65115a;
        WeakReference weakReference = (WeakReference) concurrentMap.get(k1Var);
        if (weakReference != null) {
            Fh.k kVar = (Fh.k) weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentMap.remove(k1Var, weakReference);
        }
        Fh.k kVarA = Fh.k.f6679c.a(classLoaderJ);
        while (true) {
            try {
                ConcurrentMap concurrentMap2 = f65115a;
                WeakReference weakReference2 = (WeakReference) concurrentMap2.putIfAbsent(k1Var, new WeakReference(kVarA));
                if (weakReference2 == null) {
                    return kVarA;
                }
                Fh.k kVar2 = (Fh.k) weakReference2.get();
                if (kVar2 != null) {
                    return kVar2;
                }
                concurrentMap2.remove(k1Var, weakReference2);
            } finally {
                k1Var.a(null);
            }
        }
    }
}
