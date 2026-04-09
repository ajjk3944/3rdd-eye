package Dh;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import ji.C6344e;
import ji.InterfaceC6346g;

/* renamed from: Dh.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2613t extends AbstractC2597c {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2495e f3546c;

    /* renamed from: d, reason: collision with root package name */
    private final C6344e f3547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2613t(InterfaceC2495e interfaceC2495e) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b());
        if (interfaceC2495e == null) {
            I(0);
        }
        this.f3546c = interfaceC2495e;
        this.f3547d = new C6344e(interfaceC2495e, null);
    }

    private static /* synthetic */ void I(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i10 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i10 == 1) {
            objArr[1] = "getValue";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Bh.InterfaceC2503m
    public InterfaceC2503m b() {
        InterfaceC2495e interfaceC2495e = this.f3546c;
        if (interfaceC2495e == null) {
            I(2);
        }
        return interfaceC2495e;
    }

    @Override // Bh.b0
    public InterfaceC6346g getValue() {
        C6344e c6344e = this.f3547d;
        if (c6344e == null) {
            I(1);
        }
        return c6344e;
    }

    @Override // Dh.AbstractC2607m
    public String toString() {
        return "class " + this.f3546c.getName() + "::this";
    }
}
