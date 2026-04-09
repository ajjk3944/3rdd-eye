package Dh;

import Bh.InterfaceC2503m;
import Bh.g0;
import Bh.j0;
import pi.N0;

/* renamed from: Dh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2596b extends AbstractC2602h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2596b(oi.n nVar, InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar, N0 n02, boolean z10, int i10, g0 g0Var, j0 j0Var) {
        super(nVar, interfaceC2503m, hVar, fVar, n02, z10, i10, g0Var, j0Var);
        if (nVar == null) {
            I(0);
        }
        if (interfaceC2503m == null) {
            I(1);
        }
        if (hVar == null) {
            I(2);
        }
        if (fVar == null) {
            I(3);
        }
        if (n02 == null) {
            I(4);
        }
        if (g0Var == null) {
            I(5);
        }
        if (j0Var == null) {
            I(6);
        }
    }

    private static /* synthetic */ void I(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Dh.AbstractC2607m
    public String toString() {
        String str = "";
        String str2 = G() ? "reified " : "";
        if (p() != N0.INVARIANT) {
            str = p() + " ";
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}
