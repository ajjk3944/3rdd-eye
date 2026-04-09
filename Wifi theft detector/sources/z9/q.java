package z9;

import kotlin.jvm.internal.t;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes4.dex */
public final class q implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final q f25462a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f25463b = SerialDescriptorsKt.d("kotlinx.serialization.json.JsonPrimitive", e.i.f22777a, new kotlinx.serialization.descriptors.f[0], null, 8, null);

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.c deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlinx.serialization.json.b bVarG = h.d(decoder).g();
        if (bVarG instanceof kotlinx.serialization.json.c) {
            return (kotlinx.serialization.json.c) bVarG;
        }
        throw kotlinx.serialization.json.internal.s.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + t.b(bVarG.getClass()), bVarG.toString());
    }

    @Override // kotlinx.serialization.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(y9.f encoder, kotlinx.serialization.json.c value) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(value, "value");
        h.h(encoder);
        if (value instanceof JsonNull) {
            encoder.e(n.f25454a, JsonNull.f22952c);
        } else {
            encoder.e(m.f25452a, (l) value);
        }
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f25463b;
    }
}
