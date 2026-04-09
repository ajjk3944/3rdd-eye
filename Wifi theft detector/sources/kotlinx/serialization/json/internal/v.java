package kotlinx.serialization.json.internal;

/* loaded from: classes4.dex */
public final class v extends AbstractJsonTreeEncoder {

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.serialization.json.b f23046f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z9.a json, l9.l nodeConsumer) {
        super(json, nodeConsumer, null);
        kotlin.jvm.internal.p.e(json, "json");
        kotlin.jvm.internal.p.e(nodeConsumer, "nodeConsumer");
        Z("primitive");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public kotlinx.serialization.json.b r0() {
        kotlinx.serialization.json.b bVar = this.f23046f;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeEncoder
    public void s0(String key, kotlinx.serialization.json.b element) {
        kotlin.jvm.internal.p.e(key, "key");
        kotlin.jvm.internal.p.e(element, "element");
        if (key != "primitive") {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
        }
        if (this.f23046f != null) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        }
        this.f23046f = element;
    }
}
