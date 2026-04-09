package kotlinx.serialization.json.internal;

import java.util.Map;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Map f23038a = p.a(1);

    public static final class a {
    }

    public final Object a(kotlinx.serialization.descriptors.f descriptor, a key) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        kotlin.jvm.internal.p.e(key, "key");
        Map map = (Map) this.f23038a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(kotlinx.serialization.descriptors.f descriptor, a key, l9.a defaultValue) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(defaultValue, "defaultValue");
        Object objA = a(descriptor, key);
        if (objA != null) {
            return objA;
        }
        Object objInvoke = defaultValue.invoke();
        c(descriptor, key, objInvoke);
        return objInvoke;
    }

    public final void c(kotlinx.serialization.descriptors.f descriptor, a key, Object value) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(value, "value");
        Map map = this.f23038a;
        Object objA = map.get(descriptor);
        if (objA == null) {
            objA = p.a(1);
            map.put(descriptor, objA);
        }
        ((Map) objA).put(key, value);
    }
}
