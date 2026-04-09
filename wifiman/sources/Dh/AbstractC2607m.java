package Dh;

import Bh.InterfaceC2503m;

/* renamed from: Dh.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2607m extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.b implements InterfaceC2503m {

    /* renamed from: b, reason: collision with root package name */
    private final Zh.f f3473b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2607m(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar) {
        super(hVar);
        if (hVar == null) {
            I(0);
        }
        if (fVar == null) {
            I(1);
        }
        this.f3473b = fVar;
    }

    private static /* synthetic */ void I(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String i0(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            I(4);
        }
        try {
            String str = kotlin.reflect.jvm.internal.impl.renderer.n.f52071k.O(interfaceC2503m) + "[" + interfaceC2503m.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC2503m)) + "]";
            if (str == null) {
                I(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = interfaceC2503m.getClass().getSimpleName() + " " + interfaceC2503m.getName();
            if (str2 == null) {
                I(6);
            }
            return str2;
        }
    }

    public InterfaceC2503m a() {
        return this;
    }

    @Override // Bh.I
    public Zh.f getName() {
        Zh.f fVar = this.f3473b;
        if (fVar == null) {
            I(2);
        }
        return fVar;
    }

    public String toString() {
        return i0(this);
    }
}
