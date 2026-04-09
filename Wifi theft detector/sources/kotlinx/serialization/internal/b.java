package kotlinx.serialization.internal;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.SerializationException;
import y9.c;

/* loaded from: classes4.dex */
public abstract class b implements kotlinx.serialization.b {
    public final Object b(y9.c cVar) {
        return c.a.c(cVar, getDescriptor(), 1, kotlinx.serialization.c.a(this, cVar, cVar.m(getDescriptor(), 0)), null, 8, null);
    }

    public kotlinx.serialization.a c(y9.c decoder, String str) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return decoder.a().d(e(), str);
    }

    public kotlinx.serialization.e d(y9.f encoder, Object value) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(value, "value");
        return encoder.a().e(e(), value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    @Override // kotlinx.serialization.a
    public final Object deserialize(y9.e decoder) {
        Object objB;
        kotlin.jvm.internal.p.e(decoder, "decoder");
        kotlinx.serialization.descriptors.f descriptor = getDescriptor();
        y9.c cVarB = decoder.b(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (cVarB.p()) {
            objB = b(cVarB);
        } else {
            Object objC = null;
            while (true) {
                int iO = cVarB.o(getDescriptor());
                if (iO != -1) {
                    if (iO == 0) {
                        ref$ObjectRef.element = cVarB.m(getDescriptor(), iO);
                    } else {
                        if (iO != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) ref$ObjectRef.element;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(iO);
                            throw new SerializationException(sb.toString());
                        }
                        T t10 = ref$ObjectRef.element;
                        if (t10 == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        ref$ObjectRef.element = t10;
                        objC = c.a.c(cVarB, getDescriptor(), iO, kotlinx.serialization.c.a(this, cVarB, (String) t10), null, 8, null);
                    }
                } else {
                    if (objC == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.element)).toString());
                    }
                    kotlin.jvm.internal.p.c(objC, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                    objB = objC;
                }
            }
        }
        cVarB.c(descriptor);
        return objB;
    }

    public abstract r9.c e();

    @Override // kotlinx.serialization.e
    public final void serialize(y9.f encoder, Object value) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        kotlin.jvm.internal.p.e(value, "value");
        kotlinx.serialization.e eVarB = kotlinx.serialization.c.b(this, encoder, value);
        kotlinx.serialization.descriptors.f descriptor = getDescriptor();
        y9.d dVarB = encoder.b(descriptor);
        dVarB.y(getDescriptor(), 0, eVarB.getDescriptor().h());
        kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
        kotlin.jvm.internal.p.c(eVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        dVarB.C(descriptor2, 1, eVarB, value);
        dVarB.c(descriptor);
    }
}
