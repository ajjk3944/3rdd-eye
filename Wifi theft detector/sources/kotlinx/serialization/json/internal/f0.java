package kotlinx.serialization.json.internal;

import kotlinx.serialization.descriptors.h;
import kotlinx.serialization.descriptors.i;

/* loaded from: classes4.dex */
public final class f0 implements aa.e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23001a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23002b;

    public f0(boolean z10, String discriminator) {
        kotlin.jvm.internal.p.e(discriminator, "discriminator");
        this.f23001a = z10;
        this.f23002b = discriminator;
    }

    @Override // aa.e
    public void a(r9.c baseClass, l9.l defaultDeserializerProvider) {
        kotlin.jvm.internal.p.e(baseClass, "baseClass");
        kotlin.jvm.internal.p.e(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // aa.e
    public void b(r9.c baseClass, l9.l defaultSerializerProvider) {
        kotlin.jvm.internal.p.e(baseClass, "baseClass");
        kotlin.jvm.internal.p.e(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // aa.e
    public void c(r9.c baseClass, r9.c actualClass, kotlinx.serialization.b actualSerializer) {
        kotlin.jvm.internal.p.e(baseClass, "baseClass");
        kotlin.jvm.internal.p.e(actualClass, "actualClass");
        kotlin.jvm.internal.p.e(actualSerializer, "actualSerializer");
        kotlinx.serialization.descriptors.f descriptor = actualSerializer.getDescriptor();
        e(descriptor, actualClass);
        if (this.f23001a) {
            return;
        }
        d(descriptor, actualClass);
    }

    public final void d(kotlinx.serialization.descriptors.f fVar, r9.c cVar) {
        int iD = fVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            String strE = fVar.e(i10);
            if (kotlin.jvm.internal.p.a(strE, this.f23002b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + cVar + " has property '" + strE + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    public final void e(kotlinx.serialization.descriptors.f fVar, r9.c cVar) {
        kotlinx.serialization.descriptors.h kind = fVar.getKind();
        if ((kind instanceof kotlinx.serialization.descriptors.d) || kotlin.jvm.internal.p.a(kind, h.a.f22784a)) {
            throw new IllegalArgumentException("Serializer for " + cVar.i() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.f23001a) {
            return;
        }
        if (kotlin.jvm.internal.p.a(kind, i.b.f22787a) || kotlin.jvm.internal.p.a(kind, i.c.f22788a) || (kind instanceof kotlinx.serialization.descriptors.e) || (kind instanceof h.b)) {
            throw new IllegalArgumentException("Serializer for " + cVar.i() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
    }
}
