package kotlinx.serialization.internal;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* loaded from: classes4.dex */
public final class v implements j1 {

    /* renamed from: a, reason: collision with root package name */
    public final l9.p f22921a;

    /* renamed from: b, reason: collision with root package name */
    public final a f22922b;

    public static final class a extends ClassValue {
        @Override // java.lang.ClassValue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i1 computeValue(Class type) {
            kotlin.jvm.internal.p.e(type, "type");
            return new i1();
        }
    }

    public v(l9.p compute) {
        kotlin.jvm.internal.p.e(compute, "compute");
        this.f22921a = compute;
        this.f22922b = b();
    }

    @Override // kotlinx.serialization.internal.j1
    public Object a(r9.c key, List types) {
        Object objB;
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(types, "types");
        ConcurrentHashMap concurrentHashMap = ((i1) this.f22922b.get(k9.a.a(key))).f22870a;
        Object obj = concurrentHashMap.get(types);
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objB = Result.b((kotlinx.serialization.b) this.f22921a.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(kotlin.c.a(th));
            }
            Result resultA = Result.a(objB);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(types, resultA);
            obj = objPutIfAbsent == null ? resultA : objPutIfAbsent;
        }
        kotlin.jvm.internal.p.d(obj, "serializers.getOrPut(typ… { producer() }\n        }");
        return ((Result) obj).getValue();
    }

    public final a b() {
        return new a();
    }
}
