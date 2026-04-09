package kotlinx.serialization.json.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public abstract class l0 {
    public static final Object a(z9.a aVar, kotlinx.serialization.json.b element, kotlinx.serialization.a deserializer) {
        y9.e uVar;
        kotlin.jvm.internal.p.e(aVar, "<this>");
        kotlin.jvm.internal.p.e(element, "element");
        kotlin.jvm.internal.p.e(deserializer, "deserializer");
        if (element instanceof JsonObject) {
            uVar = new JsonTreeDecoder(aVar, (JsonObject) element, null, null, 12, null);
        } else if (element instanceof kotlinx.serialization.json.a) {
            uVar = new z(aVar, (kotlinx.serialization.json.a) element);
        } else {
            if (!(element instanceof z9.l ? true : kotlin.jvm.internal.p.a(element, JsonNull.f22952c))) {
                throw new NoWhenBranchMatchedException();
            }
            uVar = new u(aVar, (kotlinx.serialization.json.c) element);
        }
        return uVar.G(deserializer);
    }

    public static final Object b(z9.a aVar, String discriminator, JsonObject element, kotlinx.serialization.a deserializer) {
        kotlin.jvm.internal.p.e(aVar, "<this>");
        kotlin.jvm.internal.p.e(discriminator, "discriminator");
        kotlin.jvm.internal.p.e(element, "element");
        kotlin.jvm.internal.p.e(deserializer, "deserializer");
        return new JsonTreeDecoder(aVar, element, discriminator, deserializer.getDescriptor()).G(deserializer);
    }
}
