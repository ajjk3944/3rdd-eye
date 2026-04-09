package S9;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SchemaCache.kt */
/* renamed from: S9.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1586s {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f12105a = new ConcurrentHashMap(16);

    /* compiled from: SchemaCache.kt */
    /* renamed from: S9.s$a */
    public static final class a<T> {
    }

    public final <T> T a(O9.e descriptor, a<T> aVar) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        Map map = (Map) this.f12105a.get(descriptor);
        T t10 = map != null ? (T) map.get(aVar) : null;
        if (t10 == null) {
            return null;
        }
        return t10;
    }
}
