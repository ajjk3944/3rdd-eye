package bj;

import Xi.m;
import Xi.n;
import aj.C3873g;
import aj.EnumC3867a;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class w implements cj.i {

    /* renamed from: a, reason: collision with root package name */
    private final String f33466a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33467b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33468c;

    public w(C3873g configuration) {
        AbstractC6492s.i(configuration, "configuration");
        this.f33466a = configuration.e();
        this.f33467b = configuration.p();
        this.f33468c = configuration.f() != EnumC3867a.NONE;
    }

    private final void h(Xi.f fVar, th.d dVar) {
        int iE = fVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            String strF = fVar.f(i10);
            if (AbstractC6492s.d(strF, this.f33466a)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + dVar + " has property '" + strF + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void i(Xi.f fVar, th.d dVar) {
        Xi.m mVarH = fVar.h();
        if ((mVarH instanceof Xi.d) || AbstractC6492s.d(mVarH, m.a.f24468a)) {
            throw new IllegalArgumentException("Serializer for " + dVar.v() + " can't be registered as a subclass for polymorphic serialization because its kind " + mVarH + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (!this.f33467b && this.f33468c) {
            if (AbstractC6492s.d(mVarH, n.b.f24471a) || AbstractC6492s.d(mVarH, n.c.f24472a) || (mVarH instanceof Xi.e) || (mVarH instanceof m.b)) {
                throw new IllegalArgumentException("Serializer for " + dVar.v() + " of kind " + mVarH + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    @Override // cj.i
    public void c(th.d kClass, InterfaceC6835l provider) {
        AbstractC6492s.i(kClass, "kClass");
        AbstractC6492s.i(provider, "provider");
    }

    @Override // cj.i
    public void d(th.d baseClass, InterfaceC6835l defaultDeserializerProvider) {
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // cj.i
    public void e(th.d baseClass, th.d actualClass, Vi.b actualSerializer) {
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(actualClass, "actualClass");
        AbstractC6492s.i(actualSerializer, "actualSerializer");
        Xi.f fVarA = actualSerializer.a();
        i(fVarA, actualClass);
        if (this.f33467b || !this.f33468c) {
            return;
        }
        h(fVarA, actualClass);
    }

    @Override // cj.i
    public void g(th.d baseClass, InterfaceC6835l defaultSerializerProvider) {
        AbstractC6492s.i(baseClass, "baseClass");
        AbstractC6492s.i(defaultSerializerProvider, "defaultSerializerProvider");
    }
}
