package kotlinx.serialization.internal;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class z implements j1 {

    /* renamed from: a, reason: collision with root package name */
    public final l9.p f22935a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f22936b;

    public z(l9.p compute) {
        kotlin.jvm.internal.p.e(compute, "compute");
        this.f22935a = compute;
        this.f22936b = new ConcurrentHashMap();
    }

    @Override // kotlinx.serialization.internal.j1
    public Object a(r9.c key, List types) {
        Object objB;
        Object objPutIfAbsent;
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(types, "types");
        ConcurrentHashMap concurrentHashMap = this.f22936b;
        Class clsA = k9.a.a(key);
        Object i1Var = concurrentHashMap.get(clsA);
        if (i1Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (i1Var = new i1()))) != null) {
            i1Var = objPutIfAbsent;
        }
        ConcurrentHashMap concurrentHashMap2 = ((i1) i1Var).f22870a;
        Object obj = concurrentHashMap2.get(types);
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objB = Result.b((kotlinx.serialization.b) this.f22935a.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(kotlin.c.a(th));
            }
            Result resultA = Result.a(objB);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(types, resultA);
            obj = objPutIfAbsent2 == null ? resultA : objPutIfAbsent2;
        }
        kotlin.jvm.internal.p.d(obj, "serializers.getOrPut(typ… { producer() }\n        }");
        return ((Result) obj).getValue();
    }
}
