package lr;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final i4.b f15603a;

    /* renamed from: b, reason: collision with root package name */
    public static final i4.b f15604b;

    static {
        b bVar = b.f15596g;
        int i10 = a.f15591a;
        f15603a = new i4.b((ar.k) bVar);
        f15604b = new i4.b((ar.k) b.f15597r);
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ar.k, br.n] */
    public static final z a(Class cls) {
        Object objPutIfAbsent;
        br.l.e(cls, "jClass");
        i4.b bVar = f15603a;
        bVar.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) bVar.f11197d;
        Object objA = concurrentHashMap.get(cls);
        if (objA == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (objA = ((br.n) bVar.f11196a).a(cls)))) != null) {
            objA = objPutIfAbsent;
        }
        br.l.c(objA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (z) objA;
    }
}
