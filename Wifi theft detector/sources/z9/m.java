package z9;

import kotlin.jvm.internal.t;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.e;
import s9.b0;

/* loaded from: classes4.dex */
public final class m implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public static final m f25452a = new m();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.f f25453b = SerialDescriptorsKt.a("kotlinx.serialization.json.JsonLiteral", e.i.f22777a);

    @Override // kotlinx.serialization.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public l deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlinx.serialization.json.b bVarG = h.d(decoder).g();
        if (bVarG instanceof l) {
            return (l) bVarG;
        }
        throw kotlinx.serialization.json.internal.s.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + t.b(bVarG.getClass()), bVarG.toString());
    }

    @Override // kotlinx.serialization.e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(y9.f encoder, l value) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(value, "value");
        h.h(encoder);
        if (value.d()) {
            encoder.G(value.c());
            return;
        }
        Long lN = g.n(value);
        if (lN != null) {
            encoder.m(lN.longValue());
            return;
        }
        y8.n nVarH = b0.h(value.c());
        if (nVarH != null) {
            encoder.l(x9.a.F(y8.n.f25188b).getDescriptor()).m(nVarH.g());
            return;
        }
        Double dH = g.h(value);
        if (dH != null) {
            encoder.g(dH.doubleValue());
            return;
        }
        Boolean boolE = g.e(value);
        if (boolE != null) {
            encoder.r(boolE.booleanValue());
        } else {
            encoder.G(value.c());
        }
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return f25453b;
    }
}
