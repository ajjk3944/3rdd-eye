package bi;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.D;
import Bh.G;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2515z;
import Bh.Y;
import Bh.b0;
import Bh.f0;
import Bh.g0;
import Dh.C2603i;
import Dh.K;
import Dh.L;
import Dh.M;
import Dh.N;
import Dh.O;
import com.google.ar.core.ImageFormat;
import fi.AbstractC5833e;
import java.util.Collections;
import ji.C6341b;
import ji.C6342c;
import ji.C6343d;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.h;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import pi.D0;
import pi.N0;
import pi.S;
import pi.V;
import pi.r0;

/* loaded from: classes4.dex */
public abstract class h {

    private static class a extends C2603i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2495e interfaceC2495e, g0 g0Var, boolean z10) {
            super(interfaceC2495e, null, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), true, InterfaceC2492b.a.DECLARATION, g0Var);
            if (interfaceC2495e == null) {
                I(0);
            }
            if (g0Var == null) {
                I(1);
            }
            q1(Collections.emptyList(), i.k(interfaceC2495e, z10));
        }

        private static /* synthetic */ void I(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case ImageFormat.YUV_420_888 /* 35 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case MqttConnectOptions.CONNECTION_TIMEOUT_DEFAULT /* 30 */:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case ImageFormat.YUV_420_888 /* 35 */:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static b0 b(InterfaceC2491a interfaceC2491a, S s10, Zh.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, int i10) {
        if (interfaceC2491a == null) {
            a(32);
        }
        if (hVar == null) {
            a(33);
        }
        if (s10 == null) {
            return null;
        }
        return new N(interfaceC2491a, new C6342c(interfaceC2491a, s10, fVar, null), hVar, Zh.g.a(i10));
    }

    public static b0 c(InterfaceC2495e interfaceC2495e, S s10, Zh.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, int i10) {
        if (interfaceC2495e == null) {
            a(34);
        }
        if (hVar == null) {
            a(35);
        }
        if (s10 == null) {
            return null;
        }
        return new N(interfaceC2495e, new C6341b(interfaceC2495e, s10, fVar, null), hVar, Zh.g.a(i10));
    }

    public static L d(Y y10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar) {
        if (y10 == null) {
            a(13);
        }
        if (hVar == null) {
            a(14);
        }
        return j(y10, hVar, true, false, false);
    }

    public static M e(Y y10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar2) {
        if (y10 == null) {
            a(0);
        }
        if (hVar == null) {
            a(1);
        }
        if (hVar2 == null) {
            a(2);
        }
        return n(y10, hVar, hVar2, true, false, false, y10.j());
    }

    public static Y f(InterfaceC2495e interfaceC2495e) {
        if (interfaceC2495e == null) {
            a(26);
        }
        G g10 = i.g(interfaceC2495e);
        InterfaceC2495e interfaceC2495eA = v.a(g10).a(g10);
        if (interfaceC2495eA == null) {
            return null;
        }
        h.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarB = aVar.b();
        D d10 = D.FINAL;
        AbstractC2510u abstractC2510u = AbstractC2509t.f1796e;
        Zh.f fVar = kotlin.reflect.jvm.internal.impl.builtins.o.f51781e;
        InterfaceC2492b.a aVar2 = InterfaceC2492b.a.SYNTHESIZED;
        K kO0 = K.O0(interfaceC2495e, hVarB, d10, abstractC2510u, false, fVar, aVar2, interfaceC2495e.j(), false, false, false, false, false, false);
        L l10 = new L(kO0, aVar.b(), d10, abstractC2510u, false, false, false, aVar2, null, interfaceC2495e.j());
        kO0.U0(l10, null);
        kO0.b1(V.i(r0.f58162b.j(), interfaceC2495eA.k(), Collections.singletonList(new D0(interfaceC2495e.u())), false), Collections.emptyList(), null, null, Collections.emptyList());
        l10.P0(kO0.getReturnType());
        return kO0;
    }

    public static f0 g(InterfaceC2495e interfaceC2495e) {
        if (interfaceC2495e == null) {
            a(24);
        }
        h.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1;
        O oL1 = O.l1(interfaceC2495e, aVar.b(), kotlin.reflect.jvm.internal.impl.builtins.o.f51782f, InterfaceC2492b.a.SYNTHESIZED, interfaceC2495e.j());
        O oN1 = oL1.R0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new Dh.V(oL1, null, 0, aVar.b(), Zh.f.h("value"), AbstractC5833e.m(interfaceC2495e).W(), false, false, false, null, interfaceC2495e.j())), interfaceC2495e.u(), D.FINAL, AbstractC2509t.f1796e);
        if (oN1 == null) {
            a(25);
        }
        return oN1;
    }

    public static f0 h(InterfaceC2495e interfaceC2495e) {
        if (interfaceC2495e == null) {
            a(22);
        }
        O oN1 = O.l1(interfaceC2495e, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b(), kotlin.reflect.jvm.internal.impl.builtins.o.f51780d, InterfaceC2492b.a.SYNTHESIZED, interfaceC2495e.j()).R0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), AbstractC5833e.m(interfaceC2495e).l(N0.INVARIANT, interfaceC2495e.u()), D.FINAL, AbstractC2509t.f1796e);
        if (oN1 == null) {
            a(23);
        }
        return oN1;
    }

    public static b0 i(InterfaceC2491a interfaceC2491a, S s10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar) {
        if (interfaceC2491a == null) {
            a(30);
        }
        if (hVar == null) {
            a(31);
        }
        if (s10 == null) {
            return null;
        }
        return new N(interfaceC2491a, new C6343d(interfaceC2491a, s10, null), hVar);
    }

    public static L j(Y y10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, boolean z10, boolean z11, boolean z12) {
        if (y10 == null) {
            a(15);
        }
        if (hVar == null) {
            a(16);
        }
        return k(y10, hVar, z10, z11, z12, y10.j());
    }

    public static L k(Y y10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, boolean z10, boolean z11, boolean z12, g0 g0Var) {
        if (y10 == null) {
            a(17);
        }
        if (hVar == null) {
            a(18);
        }
        if (g0Var == null) {
            a(19);
        }
        return new L(y10, hVar, y10.l(), y10.getVisibility(), z10, z11, z12, InterfaceC2492b.a.DECLARATION, null, g0Var);
    }

    public static C2603i l(InterfaceC2495e interfaceC2495e, g0 g0Var) {
        if (interfaceC2495e == null) {
            a(20);
        }
        if (g0Var == null) {
            a(21);
        }
        return new a(interfaceC2495e, g0Var, false);
    }

    public static M m(Y y10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar2, boolean z10, boolean z11, boolean z12, AbstractC2510u abstractC2510u, g0 g0Var) {
        if (y10 == null) {
            a(7);
        }
        if (hVar == null) {
            a(8);
        }
        if (hVar2 == null) {
            a(9);
        }
        if (abstractC2510u == null) {
            a(10);
        }
        if (g0Var == null) {
            a(11);
        }
        M m10 = new M(y10, hVar, y10.l(), abstractC2510u, z10, z11, z12, InterfaceC2492b.a.DECLARATION, null, g0Var);
        m10.Q0(M.O0(m10, y10.getType(), hVar2));
        return m10;
    }

    public static M n(Y y10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar2, boolean z10, boolean z11, boolean z12, g0 g0Var) {
        if (y10 == null) {
            a(3);
        }
        if (hVar == null) {
            a(4);
        }
        if (hVar2 == null) {
            a(5);
        }
        if (g0Var == null) {
            a(6);
        }
        return m(y10, hVar, hVar2, z10, z11, z12, y10.getVisibility(), g0Var);
    }

    private static boolean o(InterfaceC2515z interfaceC2515z) {
        if (interfaceC2515z == null) {
            a(29);
        }
        return interfaceC2515z.h() == InterfaceC2492b.a.SYNTHESIZED && i.A(interfaceC2515z.b());
    }

    public static boolean p(InterfaceC2515z interfaceC2515z) {
        if (interfaceC2515z == null) {
            a(28);
        }
        return interfaceC2515z.getName().equals(kotlin.reflect.jvm.internal.impl.builtins.o.f51782f) && o(interfaceC2515z);
    }

    public static boolean q(InterfaceC2515z interfaceC2515z) {
        if (interfaceC2515z == null) {
            a(27);
        }
        return interfaceC2515z.getName().equals(kotlin.reflect.jvm.internal.impl.builtins.o.f51780d) && o(interfaceC2515z);
    }
}
