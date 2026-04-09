package kotlinx.serialization.internal;

import kotlin.Triple;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import y9.c;

/* loaded from: classes4.dex */
public final class TripleSerializer implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.b f22816a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.b f22817b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.b f22818c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.f f22819d;

    public TripleSerializer(kotlinx.serialization.b aSerializer, kotlinx.serialization.b bSerializer, kotlinx.serialization.b cSerializer) {
        kotlin.jvm.internal.p.e(aSerializer, "aSerializer");
        kotlin.jvm.internal.p.e(bSerializer, "bSerializer");
        kotlin.jvm.internal.p.e(cSerializer, "cSerializer");
        this.f22816a = aSerializer;
        this.f22817b = bSerializer;
        this.f22818c = cSerializer;
        this.f22819d = SerialDescriptorsKt.b("kotlin.Triple", new kotlinx.serialization.descriptors.f[0], new l9.l() { // from class: kotlinx.serialization.internal.TripleSerializer$descriptor$1
            {
                super(1);
            }

            public final void a(kotlinx.serialization.descriptors.a buildClassSerialDescriptor) {
                kotlin.jvm.internal.p.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, "first", this.this$0.f22816a.getDescriptor(), null, false, 12, null);
                kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, "second", this.this$0.f22817b.getDescriptor(), null, false, 12, null);
                kotlinx.serialization.descriptors.a.b(buildClassSerialDescriptor, "third", this.this$0.f22818c.getDescriptor(), null, false, 12, null);
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((kotlinx.serialization.descriptors.a) obj);
                return y8.s.f25199a;
            }
        });
    }

    public final Triple d(y9.c cVar) {
        Object objC = c.a.c(cVar, getDescriptor(), 0, this.f22816a, null, 8, null);
        Object objC2 = c.a.c(cVar, getDescriptor(), 1, this.f22817b, null, 8, null);
        Object objC3 = c.a.c(cVar, getDescriptor(), 2, this.f22818c, null, 8, null);
        cVar.c(getDescriptor());
        return new Triple(objC, objC2, objC3);
    }

    public final Triple e(y9.c cVar) {
        Object objC = d2.f22841a;
        Object objC2 = d2.f22841a;
        Object objC3 = d2.f22841a;
        while (true) {
            int iO = cVar.o(getDescriptor());
            if (iO == -1) {
                cVar.c(getDescriptor());
                if (objC == d2.f22841a) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objC2 == d2.f22841a) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objC3 != d2.f22841a) {
                    return new Triple(objC, objC2, objC3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iO == 0) {
                objC = c.a.c(cVar, getDescriptor(), 0, this.f22816a, null, 8, null);
            } else if (iO == 1) {
                objC2 = c.a.c(cVar, getDescriptor(), 1, this.f22817b, null, 8, null);
            } else {
                if (iO != 2) {
                    throw new SerializationException("Unexpected index " + iO);
                }
                objC3 = c.a.c(cVar, getDescriptor(), 2, this.f22818c, null, 8, null);
            }
        }
    }

    @Override // kotlinx.serialization.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Triple deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        y9.c cVarB = decoder.b(getDescriptor());
        return cVarB.p() ? d(cVarB) : e(cVarB);
    }

    @Override // kotlinx.serialization.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void serialize(y9.f encoder, Triple value) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(value, "value");
        y9.d dVarB = encoder.b(getDescriptor());
        dVarB.C(getDescriptor(), 0, this.f22816a, value.getFirst());
        dVarB.C(getDescriptor(), 1, this.f22817b, value.getSecond());
        dVarB.C(getDescriptor(), 2, this.f22818c, value.getThird());
        dVarB.c(getDescriptor());
    }

    @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
    public kotlinx.serialization.descriptors.f getDescriptor() {
        return this.f22819d;
    }
}
