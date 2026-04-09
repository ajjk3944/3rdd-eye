package kotlinx.serialization.internal;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class n0 extends PluginGeneratedSerialDescriptor {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f22888m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(String name, i0 generatedSerializer) {
        super(name, generatedSerializer, 1);
        kotlin.jvm.internal.p.e(name, "name");
        kotlin.jvm.internal.p.e(generatedSerializer, "generatedSerializer");
        this.f22888m = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        kotlinx.serialization.descriptors.f fVar = (kotlinx.serialization.descriptors.f) obj;
        if (!kotlin.jvm.internal.p.a(h(), fVar.h())) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (!n0Var.isInline() || !Arrays.equals(o(), n0Var.o()) || d() != fVar.d()) {
            return false;
        }
        int iD = d();
        for (int i10 = 0; i10 < iD; i10++) {
            if (!kotlin.jvm.internal.p.a(g(i10).h(), fVar.g(i10).h()) || !kotlin.jvm.internal.p.a(g(i10).getKind(), fVar.g(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.f
    public boolean isInline() {
        return this.f22888m;
    }
}
