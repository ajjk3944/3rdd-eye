package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.p;
import kotlinx.serialization.descriptors.i;
import kotlinx.serialization.internal.t1;
import l9.l;
import s9.u;
import y8.s;
import z8.o;

/* loaded from: classes4.dex */
public abstract class SerialDescriptorsKt {
    public static final f a(String serialName, e kind) {
        p.e(serialName, "serialName");
        p.e(kind, "kind");
        if (u.d0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return t1.a(serialName, kind);
    }

    public static final f b(String serialName, f[] typeParameters, l builderAction) {
        p.e(serialName, "serialName");
        p.e(typeParameters, "typeParameters");
        p.e(builderAction, "builderAction");
        if (u.d0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(serialName);
        builderAction.invoke(aVar);
        return new SerialDescriptorImpl(serialName, i.a.f22786a, aVar.f().size(), o.R(typeParameters), aVar);
    }

    public static final f c(String serialName, h kind, f[] typeParameters, l builder) {
        p.e(serialName, "serialName");
        p.e(kind, "kind");
        p.e(typeParameters, "typeParameters");
        p.e(builder, "builder");
        if (u.d0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (p.a(kind, i.a.f22786a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new SerialDescriptorImpl(serialName, kind, aVar.f().size(), o.R(typeParameters), aVar);
    }

    public static /* synthetic */ f d(String str, h hVar, f[] fVarArr, l lVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            lVar = new l() { // from class: kotlinx.serialization.descriptors.SerialDescriptorsKt$buildSerialDescriptor$1
                public final void a(a aVar) {
                    p.e(aVar, "$this$null");
                }

                @Override // l9.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    a((a) obj2);
                    return s.f25199a;
                }
            };
        }
        return c(str, hVar, fVarArr, lVar);
    }
}
