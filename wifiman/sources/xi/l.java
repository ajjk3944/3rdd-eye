package Xi;

import Xi.n;
import Yg.J;
import Zg.AbstractC3682n;
import Zi.O0;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public abstract class l {
    public static final f b(String serialName, e kind) {
        AbstractC6492s.i(serialName, "serialName");
        AbstractC6492s.i(kind, "kind");
        if (t.m0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return O0.a(serialName, kind);
    }

    public static final f c(String serialName, f[] typeParameters, InterfaceC6835l builderAction) {
        AbstractC6492s.i(serialName, "serialName");
        AbstractC6492s.i(typeParameters, "typeParameters");
        AbstractC6492s.i(builderAction, "builderAction");
        if (t.m0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(serialName);
        builderAction.invoke(aVar);
        return new i(serialName, n.a.f24470a, aVar.f().size(), AbstractC3682n.d1(typeParameters), aVar);
    }

    public static final f d(String serialName, m kind, f[] typeParameters, InterfaceC6835l builder) {
        AbstractC6492s.i(serialName, "serialName");
        AbstractC6492s.i(kind, "kind");
        AbstractC6492s.i(typeParameters, "typeParameters");
        AbstractC6492s.i(builder, "builder");
        if (t.m0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (AbstractC6492s.d(kind, n.a.f24470a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new i(serialName, kind, aVar.f().size(), AbstractC3682n.d1(typeParameters), aVar);
    }

    public static /* synthetic */ f e(String str, m mVar, f[] fVarArr, InterfaceC6835l interfaceC6835l, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            interfaceC6835l = new InterfaceC6835l() { // from class: Xi.k
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj2) {
                    return l.f((a) obj2);
                }
            };
        }
        return d(str, mVar, fVarArr, interfaceC6835l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(a aVar) {
        AbstractC6492s.i(aVar, "<this>");
        return J.f24997a;
    }
}
