package Dh;

import Bh.InterfaceC2503m;
import Bh.InterfaceC2504n;
import Bh.InterfaceC2506p;
import Bh.g0;

/* renamed from: Dh.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2608n extends AbstractC2607m implements InterfaceC2504n {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2503m f3474c;

    /* renamed from: d, reason: collision with root package name */
    private final g0 f3475d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC2608n(InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar, g0 g0Var) {
        super(hVar, fVar);
        if (interfaceC2503m == null) {
            I(0);
        }
        if (hVar == null) {
            I(1);
        }
        if (fVar == null) {
            I(2);
        }
        if (g0Var == null) {
            I(3);
        }
        this.f3474c = interfaceC2503m;
        this.f3475d = g0Var;
    }

    private static /* synthetic */ void I(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Dh.AbstractC2607m, Bh.InterfaceC2503m
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public InterfaceC2506p a() {
        InterfaceC2506p interfaceC2506p = (InterfaceC2506p) super.a();
        if (interfaceC2506p == null) {
            I(4);
        }
        return interfaceC2506p;
    }

    public InterfaceC2503m b() {
        InterfaceC2503m interfaceC2503m = this.f3474c;
        if (interfaceC2503m == null) {
            I(5);
        }
        return interfaceC2503m;
    }

    public g0 j() {
        g0 g0Var = this.f3475d;
        if (g0Var == null) {
            I(6);
        }
        return g0Var;
    }
}
