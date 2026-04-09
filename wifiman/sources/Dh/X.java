package Dh;

import Bh.InterfaceC2503m;
import Bh.b0;
import Bh.g0;
import Bh.t0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class X extends AbstractC2608n implements t0 {

    /* renamed from: e, reason: collision with root package name */
    protected pi.S f3425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar, pi.S s10, g0 g0Var) {
        super(interfaceC2503m, hVar, fVar, g0Var);
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
        this.f3425e = s10;
    }

    private static /* synthetic */ void I(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public void G0(pi.S s10) {
        this.f3425e = s10;
    }

    @Override // Bh.InterfaceC2491a
    public boolean H() {
        return false;
    }

    public b0 d0() {
        return null;
    }

    public pi.S getReturnType() {
        pi.S type = getType();
        if (type == null) {
            I(10);
        }
        return type;
    }

    @Override // Bh.r0
    public pi.S getType() {
        pi.S s10 = this.f3425e;
        if (s10 == null) {
            I(4);
        }
        return s10;
    }

    public List getTypeParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            I(8);
        }
        return listEmptyList;
    }

    @Override // Bh.InterfaceC2491a
    public List i() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            I(6);
        }
        return listEmptyList;
    }

    public b0 k0() {
        return null;
    }
}
