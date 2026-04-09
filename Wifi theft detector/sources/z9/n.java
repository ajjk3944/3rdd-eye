package z9;

import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.h;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* loaded from: classes4.dex */
public final class n implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final n f25454a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f25455b = SerialDescriptorsKt.d("kotlinx.serialization.json.JsonNull", h.b.f22785a, new kotlinx.serialization.descriptors.f[0], null, 8, null);

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonNull deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        h.g(decoder);
        if (decoder.D()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        decoder.j();
        return JsonNull.f22952c;
    }

    @Override // kotlinx.serialization.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(y9.f encoder, JsonNull value) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(value, "value");
        h.h(encoder);
        encoder.o();
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f25455b;
    }
}
