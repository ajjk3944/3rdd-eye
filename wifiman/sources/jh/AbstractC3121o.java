package Jh;

import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2512w;
import Bh.Y;

/* renamed from: Jh.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3121o {
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(InterfaceC2492b interfaceC2492b) {
        InterfaceC2512w interfaceC2512wO0;
        if (interfaceC2492b == null) {
            a(3);
        }
        if ((interfaceC2492b instanceof Y) && (interfaceC2512wO0 = ((Y) interfaceC2492b).o0()) != null && interfaceC2512wO0.getAnnotations().P(H.f10098b)) {
            return true;
        }
        return interfaceC2492b.getAnnotations().P(H.f10098b);
    }

    public static boolean c(InterfaceC2503m interfaceC2503m) {
        if (interfaceC2503m == null) {
            a(1);
        }
        return bi.i.x(interfaceC2503m) && bi.i.w(interfaceC2503m.b()) && !d((InterfaceC2495e) interfaceC2503m);
    }

    public static boolean d(InterfaceC2495e interfaceC2495e) {
        if (interfaceC2495e == null) {
            a(2);
        }
        return kotlin.reflect.jvm.internal.impl.builtins.e.a(kotlin.reflect.jvm.internal.impl.builtins.d.f51733a, interfaceC2495e);
    }

    public static boolean e(Y y10) {
        if (y10 == null) {
            a(0);
        }
        if (y10.h() == InterfaceC2492b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(y10.b())) {
            return true;
        }
        return bi.i.x(y10.b()) && b(y10);
    }
}
