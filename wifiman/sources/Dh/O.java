package Dh;

import Bh.AbstractC2510u;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.b0;
import Bh.f0;
import Bh.g0;
import com.google.ar.core.ImageFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;

/* loaded from: classes4.dex */
public class O extends AbstractC2612s implements f0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected O(InterfaceC2503m interfaceC2503m, f0 f0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar, InterfaceC2492b.a aVar, g0 g0Var) {
        super(interfaceC2503m, f0Var, hVar, fVar, aVar, g0Var);
        if (interfaceC2503m == null) {
            I(0);
        }
        if (hVar == null) {
            I(1);
        }
        if (fVar == null) {
            I(2);
        }
        if (aVar == null) {
            I(3);
        }
        if (g0Var == null) {
            I(4);
        }
    }

    private static /* synthetic */ void I(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case ImageFormat.RGBA_FP16 /* 22 */:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case ImageFormat.RGBA_FP16 /* 22 */:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static O l1(InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar, InterfaceC2492b.a aVar, g0 g0Var) {
        if (interfaceC2503m == null) {
            I(5);
        }
        if (hVar == null) {
            I(6);
        }
        if (fVar == null) {
            I(7);
        }
        if (aVar == null) {
            I(8);
        }
        if (g0Var == null) {
            I(9);
        }
        return new O(interfaceC2503m, null, hVar, fVar, aVar, g0Var);
    }

    @Override // Dh.AbstractC2612s
    protected AbstractC2612s L0(InterfaceC2503m interfaceC2503m, InterfaceC2515z interfaceC2515z, InterfaceC2492b.a aVar, Zh.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, g0 g0Var) {
        if (interfaceC2503m == null) {
            I(25);
        }
        if (aVar == null) {
            I(26);
        }
        if (hVar == null) {
            I(27);
        }
        if (g0Var == null) {
            I(28);
        }
        f0 f0Var = (f0) interfaceC2515z;
        if (fVar == null) {
            fVar = getName();
        }
        return new O(interfaceC2503m, f0Var, hVar, fVar, aVar, g0Var);
    }

    @Override // Bh.InterfaceC2492b
    /* renamed from: k1 */
    public f0 c0(InterfaceC2503m interfaceC2503m, Bh.D d10, AbstractC2510u abstractC2510u, InterfaceC2492b.a aVar, boolean z10) {
        f0 f0Var = (f0) super.K0(interfaceC2503m, d10, abstractC2510u, aVar, z10);
        if (f0Var == null) {
            I(29);
        }
        return f0Var;
    }

    @Override // Dh.AbstractC2612s, Dh.AbstractC2608n, Dh.AbstractC2607m, Bh.InterfaceC2503m
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public f0 a() {
        f0 f0Var = (f0) super.a();
        if (f0Var == null) {
            I(24);
        }
        return f0Var;
    }

    @Override // Dh.AbstractC2612s
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public O R0(b0 b0Var, b0 b0Var2, List list, List list2, List list3, pi.S s10, Bh.D d10, AbstractC2510u abstractC2510u) {
        if (list == null) {
            I(14);
        }
        if (list2 == null) {
            I(15);
        }
        if (list3 == null) {
            I(16);
        }
        if (abstractC2510u == null) {
            I(17);
        }
        O oO1 = o1(b0Var, b0Var2, list, list2, list3, s10, d10, abstractC2510u, null);
        if (oO1 == null) {
            I(18);
        }
        return oO1;
    }

    public O o1(b0 b0Var, b0 b0Var2, List list, List list2, List list3, pi.S s10, Bh.D d10, AbstractC2510u abstractC2510u, Map map) {
        if (list == null) {
            I(19);
        }
        if (list2 == null) {
            I(20);
        }
        if (list3 == null) {
            I(21);
        }
        if (abstractC2510u == null) {
            I(22);
        }
        super.R0(b0Var, b0Var2, list, list2, list3, s10, d10, abstractC2510u);
        if (map != null && !map.isEmpty()) {
            this.f3496D = new LinkedHashMap(map);
        }
        return this;
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2515z
    public InterfaceC2515z.a v() {
        InterfaceC2515z.a aVarV = super.v();
        if (aVarV == null) {
            I(30);
        }
        return aVarV;
    }
}
