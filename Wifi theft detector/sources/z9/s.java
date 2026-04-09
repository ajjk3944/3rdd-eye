package z9;

import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public abstract class s implements kotlinx.serialization.b {

    @NotNull
    private final kotlinx.serialization.b tSerializer;

    public s(kotlinx.serialization.b tSerializer) {
        kotlin.jvm.internal.p.e(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // kotlinx.serialization.a
    @NotNull
    public final Object deserialize(@NotNull y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        e eVarD = h.d(decoder);
        return eVarD.d().d(this.tSerializer, transformDeserialize(eVarD.g()));
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    @NotNull
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.e
    public final void serialize(@NotNull y9.f encoder, @NotNull Object value) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(value, "value");
        i iVarE = h.e(encoder);
        iVarE.A(transformSerialize(TreeJsonEncoderKt.c(iVarE.d(), value, this.tSerializer)));
    }

    public abstract kotlinx.serialization.json.b transformDeserialize(kotlinx.serialization.json.b bVar);

    @NotNull
    public kotlinx.serialization.json.b transformSerialize(@NotNull kotlinx.serialization.json.b element) {
        kotlin.jvm.internal.p.e(element, "element");
        return element;
    }
}
