package Dh;

import Bh.InterfaceC2503m;
import Bh.g0;

/* renamed from: Dh.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2604j extends AbstractC2595a {

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2503m f3462f;

    /* renamed from: g, reason: collision with root package name */
    private final g0 f3463g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f3464h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC2604j(oi.n nVar, InterfaceC2503m interfaceC2503m, Zh.f fVar, g0 g0Var, boolean z10) {
        super(nVar, fVar);
        if (nVar == null) {
            B0(0);
        }
        if (interfaceC2503m == null) {
            B0(1);
        }
        if (fVar == null) {
            B0(2);
        }
        if (g0Var == null) {
            B0(3);
        }
        this.f3462f = interfaceC2503m;
        this.f3463g = g0Var;
        this.f3464h = z10;
    }

    private static /* synthetic */ void B0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Bh.InterfaceC2495e, Bh.InterfaceC2504n, Bh.InterfaceC2503m
    public InterfaceC2503m b() {
        InterfaceC2503m interfaceC2503m = this.f3462f;
        if (interfaceC2503m == null) {
            B0(4);
        }
        return interfaceC2503m;
    }

    public boolean isExternal() {
        return this.f3464h;
    }

    @Override // Bh.InterfaceC2506p
    public g0 j() {
        g0 g0Var = this.f3463g;
        if (g0Var == null) {
            B0(5);
        }
        return g0Var;
    }
}
