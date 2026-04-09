package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public class y extends AbstractJsonTreeEncoder {

    /* renamed from: f, reason: collision with root package name */
    public final Map f23049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z9.a json, l9.l nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(nodeConsumer, "nodeConsumer");
        this.f23049f = new LinkedHashMap();
    }

    @Override // kotlinx.serialization.internal.c2, y9.d
    public void i(kotlinx.serialization.descriptors.f descriptor, int i10, kotlinx.serialization.e serializer, Object obj) {
        kotlin.jvm.internal.p.e(descriptor, "descriptor");
        kotlin.jvm.internal.p.e(serializer, "serializer");
        if (obj != null || this.f22965d.f()) {
            super.i(descriptor, i10, serializer, obj);
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public kotlinx.serialization.json.b r0() {
        return new JsonObject(this.f23049f);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void s0(String key, kotlinx.serialization.json.b element) {
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(element, "element");
        this.f23049f.put(key, element);
    }

    public final Map t0() {
        return this.f23049f;
    }
}
