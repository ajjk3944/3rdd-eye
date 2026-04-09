package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class y implements x1 {

    /* renamed from: a, reason: collision with root package name */
    public final l9.l f22929a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f22930b;

    public y(l9.l compute) {
        kotlin.jvm.internal.p.e(compute, "compute");
        this.f22929a = compute;
        this.f22930b = new ConcurrentHashMap();
    }

    @Override // kotlinx.serialization.internal.x1
    public kotlinx.serialization.b a(r9.c key) {
        Object objPutIfAbsent;
        kotlin.jvm.internal.p.e(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f22930b;
        Class clsA = k9.a.a(key);
        Object mVar = concurrentHashMap.get(clsA);
        if (mVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsA, (mVar = new m((kotlinx.serialization.b) this.f22929a.invoke(key))))) != null) {
            mVar = objPutIfAbsent;
        }
        return ((m) mVar).f22884a;
    }
}
