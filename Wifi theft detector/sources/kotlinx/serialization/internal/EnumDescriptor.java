package kotlinx.serialization.internal;

import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.h;
import kotlinx.serialization.descriptors.i;

/* loaded from: classes4.dex */
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.h f22790m;

    /* renamed from: n, reason: collision with root package name */
    public final y8.h f22791n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(final String name, final int i10) {
        super(name, null, i10, 2, null);
        kotlin.jvm.internal.p.e(name, "name");
        this.f22790m = h.b.f22785a;
        this.f22791n = kotlin.b.b(new l9.a() { // from class: kotlinx.serialization.internal.EnumDescriptor$elementDescriptors$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // l9.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.descriptors.f[] invoke() {
                int i11 = i10;
                kotlinx.serialization.descriptors.f[] fVarArr = new kotlinx.serialization.descriptors.f[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    fVarArr[i12] = SerialDescriptorsKt.d(name + '.' + this.e(i12), i.d.f22789a, new kotlinx.serialization.descriptors.f[0], null, 8, null);
                }
                return fVarArr;
            }
        });
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kotlinx.serialization.descriptors.f)) {
            return false;
        }
        kotlinx.serialization.descriptors.f fVar = (kotlinx.serialization.descriptors.f) obj;
        return fVar.getKind() == h.b.f22785a && kotlin.jvm.internal.p.a(h(), fVar.h()) && kotlin.jvm.internal.p.a(l1.a(this), l1.a(fVar));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.f
    public kotlinx.serialization.descriptors.f g(int i10) {
        return q()[i10];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.f
    public kotlinx.serialization.descriptors.h getKind() {
        return this.f22790m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int iHashCode = h().hashCode();
        int iHashCode2 = 1;
        for (String str : kotlinx.serialization.descriptors.g.b(this)) {
            int i10 = iHashCode2 * 31;
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public final kotlinx.serialization.descriptors.f[] q() {
        return (kotlinx.serialization.descriptors.f[]) this.f22791n.getValue();
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public String toString() {
        return z8.z.O(kotlinx.serialization.descriptors.g.b(this), ", ", h() + '(', ")", 0, null, null, 56, null);
    }
}
