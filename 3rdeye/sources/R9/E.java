package R9;

import S9.F;
import S9.G;
import t4.C5606d;

/* compiled from: JsonTransformingSerializer.kt */
/* loaded from: classes3.dex */
public abstract class E<T> implements M9.b<T> {
    private final M9.b<T> tSerializer;

    public E(M9.b<T> tSerializer) {
        kotlin.jvm.internal.l.f(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // M9.b
    public final T deserialize(P9.d decoder) {
        h a10;
        kotlin.jvm.internal.l.f(decoder, "decoder");
        h hVarC = B7.d.c(decoder);
        i iVarJ = hVarC.j();
        AbstractC1564a abstractC1564aC = hVarC.c();
        M9.b<T> deserializer = this.tSerializer;
        i element = transformDeserialize(iVarJ);
        abstractC1564aC.getClass();
        kotlin.jvm.internal.l.f(deserializer, "deserializer");
        kotlin.jvm.internal.l.f(element, "element");
        if (element instanceof z) {
            a10 = new S9.E(abstractC1564aC, (z) element, null, null);
        } else if (element instanceof C1565b) {
            a10 = new G(abstractC1564aC, (C1565b) element);
        } else {
            if (!(element instanceof u ? true : element.equals(x.INSTANCE))) {
                throw new b9.j();
            }
            a10 = new S9.A(abstractC1564aC, (C) element);
        }
        return (T) C5606d.r(a10, deserializer);
    }

    @Override // M9.b
    public O9.e getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // M9.b
    public final void serialize(P9.e encoder, T value) {
        kotlin.jvm.internal.l.f(encoder, "encoder");
        kotlin.jvm.internal.l.f(value, "value");
        r rVarD = B7.d.d(encoder);
        AbstractC1564a abstractC1564aC = rVarD.c();
        M9.b<T> serializer = this.tSerializer;
        kotlin.jvm.internal.l.f(abstractC1564aC, "<this>");
        kotlin.jvm.internal.l.f(serializer, "serializer");
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        new F(abstractC1564aC, new F7.h(wVar, 6)).x(serializer, value);
        T t10 = wVar.f43660b;
        if (t10 != null) {
            rVarD.t(transformSerialize((i) t10));
        } else {
            kotlin.jvm.internal.l.l("result");
            throw null;
        }
    }

    public i transformDeserialize(i element) {
        kotlin.jvm.internal.l.f(element, "element");
        return element;
    }

    public i transformSerialize(i element) {
        kotlin.jvm.internal.l.f(element, "element");
        return element;
    }
}
