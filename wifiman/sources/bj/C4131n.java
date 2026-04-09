package bj;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;

/* renamed from: bj.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4131n {

    /* renamed from: a, reason: collision with root package name */
    private final Map f33452a = AbstractC4130m.a(16);

    /* renamed from: bj.n$a */
    public static final class a {
    }

    public final Object a(Xi.f descriptor, a key) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(key, "key");
        Map map = (Map) this.f33452a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(Xi.f descriptor, a key, InterfaceC6824a defaultValue) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(defaultValue, "defaultValue");
        Object objA = a(descriptor, key);
        if (objA != null) {
            return objA;
        }
        Object objInvoke = defaultValue.invoke();
        c(descriptor, key, objInvoke);
        return objInvoke;
    }

    public final void c(Xi.f descriptor, a key, Object value) {
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(key, "key");
        AbstractC6492s.i(value, "value");
        Map map = this.f33452a;
        Object objA = map.get(descriptor);
        if (objA == null) {
            objA = AbstractC4130m.a(2);
            map.put(descriptor, objA);
        }
        ((Map) objA).put(key, value);
    }
}
