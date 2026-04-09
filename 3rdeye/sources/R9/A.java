package R9;

import java.util.LinkedHashMap;

/* compiled from: JsonElementBuilders.kt */
/* loaded from: classes3.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f11772a = new LinkedHashMap();

    public final z a() {
        return new z(this.f11772a);
    }

    public final i b(i element, String key) {
        kotlin.jvm.internal.l.f(key, "key");
        kotlin.jvm.internal.l.f(element, "element");
        return (i) this.f11772a.put(key, element);
    }
}
