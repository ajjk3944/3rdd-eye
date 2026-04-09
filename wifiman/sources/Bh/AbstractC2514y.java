package Bh;

import kotlin.jvm.internal.AbstractC6492s;
import zi.AbstractC8783m;

/* renamed from: Bh.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2514y {
    public static final InterfaceC2495e b(G g10, Zh.b classId) {
        AbstractC6492s.i(g10, "<this>");
        AbstractC6492s.i(classId, "classId");
        InterfaceC2498h interfaceC2498hC = c(g10, classId);
        if (interfaceC2498hC instanceof InterfaceC2495e) {
            return (InterfaceC2495e) interfaceC2498hC;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Bh.InterfaceC2498h c(Bh.G r8, Zh.b r9) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Bh.AbstractC2514y.c(Bh.G, Zh.b):Bh.h");
    }

    public static final InterfaceC2495e d(G g10, Zh.b classId, L notFoundClasses) {
        AbstractC6492s.i(g10, "<this>");
        AbstractC6492s.i(classId, "classId");
        AbstractC6492s.i(notFoundClasses, "notFoundClasses");
        InterfaceC2495e interfaceC2495eB = b(g10, classId);
        return interfaceC2495eB != null ? interfaceC2495eB : notFoundClasses.d(classId, AbstractC8783m.Z(AbstractC8783m.N(AbstractC8783m.n(classId, new kotlin.jvm.internal.E() { // from class: Bh.y.a
            @Override // th.n
            public Object get(Object obj) {
                return ((Zh.b) obj).e();
            }

            @Override // kotlin.jvm.internal.AbstractC6480f, th.c
            public String getName() {
                return "outerClassId";
            }

            @Override // kotlin.jvm.internal.AbstractC6480f
            public th.f getOwner() {
                return kotlin.jvm.internal.O.b(Zh.b.class);
            }

            @Override // kotlin.jvm.internal.AbstractC6480f
            public String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }), C2513x.f1824a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(Zh.b it) {
        AbstractC6492s.i(it, "it");
        return 0;
    }

    public static final k0 f(G g10, Zh.b classId) {
        AbstractC6492s.i(g10, "<this>");
        AbstractC6492s.i(classId, "classId");
        InterfaceC2498h interfaceC2498hC = c(g10, classId);
        if (interfaceC2498hC instanceof k0) {
            return (k0) interfaceC2498hC;
        }
        return null;
    }
}
