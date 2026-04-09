package Dh;

import Bh.InterfaceC2503m;
import ji.InterfaceC6346g;

/* loaded from: classes4.dex */
public class N extends AbstractC2597c {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2503m f3401c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC6346g f3402d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC2503m interfaceC2503m, InterfaceC6346g interfaceC6346g, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar) {
        this(interfaceC2503m, interfaceC6346g, hVar, Zh.h.f25429i);
        if (interfaceC2503m == null) {
            I(0);
        }
        if (interfaceC6346g == null) {
            I(1);
        }
        if (hVar == null) {
            I(2);
        }
    }

    private static /* synthetic */ void I(int i10) {
        String str = (i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Bh.InterfaceC2503m
    public InterfaceC2503m b() {
        InterfaceC2503m interfaceC2503m = this.f3401c;
        if (interfaceC2503m == null) {
            I(8);
        }
        return interfaceC2503m;
    }

    @Override // Bh.b0
    public InterfaceC6346g getValue() {
        InterfaceC6346g interfaceC6346g = this.f3402d;
        if (interfaceC6346g == null) {
            I(7);
        }
        return interfaceC6346g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC2503m interfaceC2503m, InterfaceC6346g interfaceC6346g, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar) {
        super(hVar, fVar);
        if (interfaceC2503m == null) {
            I(3);
        }
        if (interfaceC6346g == null) {
            I(4);
        }
        if (hVar == null) {
            I(5);
        }
        if (fVar == null) {
            I(6);
        }
        this.f3401c = interfaceC2503m;
        this.f3402d = interfaceC6346g;
    }
}
