package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.F;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Protobuf.java */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f15581c = new b0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f15583b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final H f15582a = new H();

    public final <T> f0<T> a(Class<T> cls) {
        f0<T> f0VarU;
        Class<?> cls2;
        C1746y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f15583b;
        f0<T> f0Var = (f0) concurrentHashMap.get(cls);
        if (f0Var != null) {
            return f0Var;
        }
        H h10 = this.f15582a;
        h10.getClass();
        Class<?> cls3 = g0.f15599a;
        if (!AbstractC1744w.class.isAssignableFrom(cls) && (cls2 = g0.f15599a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        N nMessageInfoFor = h10.f15548a.messageInfoFor(cls);
        if (nMessageInfoFor.isMessageSetWireFormat()) {
            if (AbstractC1744w.class.isAssignableFrom(cls)) {
                f0VarU = new U<>(g0.f15602d, r.f15689a, nMessageInfoFor.getDefaultInstance());
            } else {
                k0<?, ?> k0Var = g0.f15600b;
                AbstractC1738p<?> abstractC1738p = r.f15690b;
                if (abstractC1738p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                f0VarU = new U<>(k0Var, abstractC1738p, nMessageInfoFor.getDefaultInstance());
            }
        } else if (AbstractC1744w.class.isAssignableFrom(cls)) {
            f0VarU = nMessageInfoFor.getSyntax() == a0.PROTO2 ? T.u(nMessageInfoFor, X.f15580b, F.f15543b, g0.f15602d, r.f15689a, M.f15557b) : T.u(nMessageInfoFor, X.f15580b, F.f15543b, g0.f15602d, null, M.f15557b);
        } else if (nMessageInfoFor.getSyntax() == a0.PROTO2) {
            V v10 = X.f15579a;
            F.a aVar = F.f15542a;
            k0<?, ?> k0Var2 = g0.f15600b;
            AbstractC1738p<?> abstractC1738p2 = r.f15690b;
            if (abstractC1738p2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            f0VarU = T.u(nMessageInfoFor, v10, aVar, k0Var2, abstractC1738p2, M.f15556a);
        } else {
            f0VarU = T.u(nMessageInfoFor, X.f15579a, F.f15542a, g0.f15601c, null, M.f15556a);
        }
        f0<T> f0Var2 = (f0) concurrentHashMap.putIfAbsent(cls, f0VarU);
        return f0Var2 != null ? f0Var2 : f0VarU;
    }
}
