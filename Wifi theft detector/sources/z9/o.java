package z9;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Map f25456a = new LinkedHashMap();

    public final JsonObject a() {
        return new JsonObject(this.f25456a);
    }

    public final kotlinx.serialization.json.b b(String key, kotlinx.serialization.json.b element) {
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(element, "element");
        return (kotlinx.serialization.json.b) this.f25456a.put(key, element);
    }
}
