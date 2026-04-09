package kotlinx.serialization.json;

import kotlin.jvm.internal.p;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.d;
import kotlinx.serialization.descriptors.f;
import l9.l;
import y8.s;
import y9.e;
import z9.h;
import z9.m;
import z9.n;
import z9.q;

/* loaded from: classes4.dex */
public final class JsonElementSerializer implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonElementSerializer f22944a = new JsonElementSerializer();

    /* renamed from: b, reason: collision with root package name */
    public static final f f22945b = SerialDescriptorsKt.c("kotlinx.serialization.json.JsonElement", d.b.f22768a, new f[0], new l() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1
        public final void a(kotlinx.serialization.descriptors.a buildSerialDescriptor) {
            p.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
            kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "JsonPrimitive", h.f(new l9.a() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.1
                @Override // l9.a
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final f invoke() {
                    return q.f25462a.getDescriptor();
                }
            }), null, false, 12, null);
            kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "JsonNull", h.f(new l9.a() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.2
                @Override // l9.a
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final f invoke() {
                    return n.f25454a.getDescriptor();
                }
            }), null, false, 12, null);
            kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "JsonLiteral", h.f(new l9.a() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.3
                @Override // l9.a
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final f invoke() {
                    return m.f25452a.getDescriptor();
                }
            }), null, false, 12, null);
            kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "JsonObject", h.f(new l9.a() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.4
                @Override // l9.a
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final f invoke() {
                    return z9.p.f25457a.getDescriptor();
                }
            }), null, false, 12, null);
            kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "JsonArray", h.f(new l9.a() { // from class: kotlinx.serialization.json.JsonElementSerializer$descriptor$1.5
                @Override // l9.a
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final f invoke() {
                    return z9.b.f25419a.getDescriptor();
                }
            }), null, false, 12, null);
        }

        @Override // l9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((kotlinx.serialization.descriptors.a) obj);
            return s.f25199a;
        }
    });

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b deserialize(e decoder) {
        p.e(decoder, "decoder");
        return h.d(decoder).g();
    }

    @Override // kotlinx.serialization.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(y9.f encoder, b value) {
        p.e(encoder, "encoder");
        p.e(value, "value");
        h.h(encoder);
        if (value instanceof c) {
            encoder.e(q.f25462a, value);
        } else if (value instanceof JsonObject) {
            encoder.e(z9.p.f25457a, value);
        } else if (value instanceof a) {
            encoder.e(z9.b.f25419a, value);
        }
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public f getDescriptor() {
        return f22945b;
    }
}
