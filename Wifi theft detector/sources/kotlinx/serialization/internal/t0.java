package kotlinx.serialization.internal;

import kotlinx.serialization.SerializationException;
import y9.c;

/* loaded from: classes4.dex */
public abstract class t0 implements kotlinx.serialization.b {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.b f22916a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.b f22917b;

    public /* synthetic */ t0(kotlinx.serialization.b bVar, kotlinx.serialization.b bVar2, kotlin.jvm.internal.i iVar) {
        this(bVar, bVar2);
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj);

    public abstract Object c(Object obj, Object obj2);

    @Override // kotlinx.serialization.a
    public Object deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        y9.c cVarB = decoder.b(getDescriptor());
        if (cVarB.p()) {
            return c(c.a.c(cVarB, getDescriptor(), 0, this.f22916a, null, 8, null), c.a.c(cVarB, getDescriptor(), 1, this.f22917b, null, 8, null));
        }
        Object objC = d2.f22841a;
        Object objC2 = d2.f22841a;
        while (true) {
            int iO = cVarB.o(getDescriptor());
            if (iO == -1) {
                cVarB.c(getDescriptor());
                if (objC == d2.f22841a) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objC2 != d2.f22841a) {
                    return c(objC, objC2);
                }
                throw new SerializationException("Element 'value' is missing");
            }
            if (iO == 0) {
                objC = c.a.c(cVarB, getDescriptor(), 0, this.f22916a, null, 8, null);
            } else {
                if (iO != 1) {
                    throw new SerializationException("Invalid index: " + iO);
                }
                objC2 = c.a.c(cVarB, getDescriptor(), 1, this.f22917b, null, 8, null);
            }
        }
    }

    @Override // kotlinx.serialization.e
    public void serialize(y9.f encoder, Object obj) {
        kotlin.jvm.internal.p.e(encoder, "encoder");
        y9.d dVarB = encoder.b(getDescriptor());
        dVarB.C(getDescriptor(), 0, this.f22916a, a(obj));
        dVarB.C(getDescriptor(), 1, this.f22917b, b(obj));
        dVarB.c(getDescriptor());
    }

    public t0(kotlinx.serialization.b bVar, kotlinx.serialization.b bVar2) {
        this.f22916a = bVar;
        this.f22917b = bVar2;
    }
}
