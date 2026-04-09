package li;

import Bh.AbstractC2514y;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.g0;
import Bh.s0;
import Uh.b;
import Zg.AbstractC3689v;
import di.AbstractC5398g;
import di.AbstractC5403l;
import di.C5387A;
import di.C5388B;
import di.C5389C;
import di.C5390D;
import di.C5392a;
import di.C5393b;
import di.C5394c;
import di.C5395d;
import di.C5396e;
import di.C5400i;
import di.C5401j;
import di.C5402k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import pi.AbstractC7346d0;
import sh.AbstractC7978m;

/* renamed from: li.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6629g {

    /* renamed from: a, reason: collision with root package name */
    private final Bh.G f52700a;

    /* renamed from: b, reason: collision with root package name */
    private final Bh.L f52701b;

    /* renamed from: li.g$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52702a;

        static {
            int[] iArr = new int[b.C0830b.c.EnumC0833c.values().length];
            try {
                iArr[b.C0830b.c.EnumC0833c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.C0830b.c.EnumC0833c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.C0830b.c.EnumC0833c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.C0830b.c.EnumC0833c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.C0830b.c.EnumC0833c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.C0830b.c.EnumC0833c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.C0830b.c.EnumC0833c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.C0830b.c.EnumC0833c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.C0830b.c.EnumC0833c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.C0830b.c.EnumC0833c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.C0830b.c.EnumC0833c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.C0830b.c.EnumC0833c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[b.C0830b.c.EnumC0833c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f52702a = iArr;
        }
    }

    public C6629g(Bh.G module, Bh.L notFoundClasses) {
        AbstractC6492s.i(module, "module");
        AbstractC6492s.i(notFoundClasses, "notFoundClasses");
        this.f52700a = module;
        this.f52701b = notFoundClasses;
    }

    private final boolean b(AbstractC5398g abstractC5398g, pi.S s10, b.C0830b.c cVar) {
        b.C0830b.c.EnumC0833c enumC0833cC1 = cVar.c1();
        int i10 = enumC0833cC1 == null ? -1 : a.f52702a[enumC0833cC1.ordinal()];
        if (i10 == 10) {
            InterfaceC2498h interfaceC2498hC = s10.N0().c();
            InterfaceC2495e interfaceC2495e = interfaceC2498hC instanceof InterfaceC2495e ? (InterfaceC2495e) interfaceC2498hC : null;
            if (interfaceC2495e != null && !kotlin.reflect.jvm.internal.impl.builtins.i.l0(interfaceC2495e)) {
                return false;
            }
        } else {
            if (i10 != 13) {
                return AbstractC6492s.d(abstractC5398g.a(this.f52700a), s10);
            }
            if (!(abstractC5398g instanceof C5393b) || ((List) ((C5393b) abstractC5398g).b()).size() != cVar.T0().size()) {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC5398g).toString());
            }
            pi.S sK = c().k(s10);
            AbstractC6492s.h(sK, "getArrayElementType(...)");
            C5393b c5393b = (C5393b) abstractC5398g;
            Iterable iterableM = AbstractC3689v.m((Collection) c5393b.b());
            if (!(iterableM instanceof Collection) || !((Collection) iterableM).isEmpty()) {
                Iterator it = iterableM.iterator();
                while (it.hasNext()) {
                    int iD = ((Zg.Q) it).d();
                    AbstractC5398g abstractC5398g2 = (AbstractC5398g) ((List) c5393b.b()).get(iD);
                    b.C0830b.c cVarN0 = cVar.N0(iD);
                    AbstractC6492s.h(cVarN0, "getArrayElement(...)");
                    if (!b(abstractC5398g2, sK, cVarN0)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final kotlin.reflect.jvm.internal.impl.builtins.i c() {
        return this.f52700a.q();
    }

    private final Yg.s d(b.C0830b c0830b, Map map, Wh.c cVar) {
        s0 s0Var = (s0) map.get(AbstractC6609L.b(cVar, c0830b.P()));
        if (s0Var == null) {
            return null;
        }
        Zh.f fVarB = AbstractC6609L.b(cVar, c0830b.P());
        pi.S type = s0Var.getType();
        AbstractC6492s.h(type, "getType(...)");
        b.C0830b.c cVarS = c0830b.S();
        AbstractC6492s.h(cVarS, "getValue(...)");
        return new Yg.s(fVarB, g(type, cVarS, cVar));
    }

    private final InterfaceC2495e e(Zh.b bVar) {
        return AbstractC2514y.d(this.f52700a, bVar, this.f52701b);
    }

    private final AbstractC5398g g(pi.S s10, b.C0830b.c cVar, Wh.c cVar2) {
        AbstractC5398g abstractC5398gF = f(s10, cVar, cVar2);
        if (!b(abstractC5398gF, s10, cVar)) {
            abstractC5398gF = null;
        }
        if (abstractC5398gF != null) {
            return abstractC5398gF;
        }
        return AbstractC5403l.f46100b.a("Unexpected argument value: actual type " + cVar.c1() + " != expected type " + s10);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(Uh.b proto, Wh.c nameResolver) {
        AbstractC6492s.i(proto, "proto");
        AbstractC6492s.i(nameResolver, "nameResolver");
        InterfaceC2495e interfaceC2495eE = e(AbstractC6609L.a(nameResolver, proto.f0()));
        Map mapH = Zg.U.h();
        if (proto.S() != 0 && !kotlin.reflect.jvm.internal.impl.types.error.l.m(interfaceC2495eE) && bi.i.t(interfaceC2495eE)) {
            Collection collectionM = interfaceC2495eE.m();
            AbstractC6492s.h(collectionM, "getConstructors(...)");
            InterfaceC2494d interfaceC2494d = (InterfaceC2494d) AbstractC3689v.S0(collectionM);
            if (interfaceC2494d != null) {
                List listI = interfaceC2494d.i();
                AbstractC6492s.h(listI, "getValueParameters(...)");
                List list = listI;
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(Zg.U.d(AbstractC3689v.w(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(((s0) obj).getName(), obj);
                }
                List<b.C0830b> listT = proto.T();
                AbstractC6492s.h(listT, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (b.C0830b c0830b : listT) {
                    AbstractC6492s.f(c0830b);
                    Yg.s sVarD = d(c0830b, linkedHashMap, nameResolver);
                    if (sVarD != null) {
                        arrayList.add(sVarD);
                    }
                }
                mapH = Zg.U.r(arrayList);
            }
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(interfaceC2495eE.u(), mapH, g0.f1784a);
    }

    public final AbstractC5398g f(pi.S expectedType, b.C0830b.c value, Wh.c nameResolver) {
        AbstractC5398g c5395d;
        AbstractC6492s.i(expectedType, "expectedType");
        AbstractC6492s.i(value, "value");
        AbstractC6492s.i(nameResolver, "nameResolver");
        Boolean boolD = Wh.b.f23936P.d(value.Y0());
        AbstractC6492s.h(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        b.C0830b.c.EnumC0833c enumC0833cC1 = value.c1();
        switch (enumC0833cC1 == null ? -1 : a.f52702a[enumC0833cC1.ordinal()]) {
            case 1:
                byte bA1 = (byte) value.a1();
                if (zBooleanValue) {
                    c5395d = new C5387A(bA1);
                    break;
                } else {
                    c5395d = new C5395d(bA1);
                    break;
                }
            case 2:
                return new C5396e((char) value.a1());
            case 3:
                short sA1 = (short) value.a1();
                if (zBooleanValue) {
                    c5395d = new C5390D(sA1);
                    break;
                } else {
                    c5395d = new di.w(sA1);
                    break;
                }
            case 4:
                int iA1 = (int) value.a1();
                if (zBooleanValue) {
                    c5395d = new C5388B(iA1);
                    break;
                } else {
                    c5395d = new di.n(iA1);
                    break;
                }
            case 5:
                long jA1 = value.a1();
                return zBooleanValue ? new C5389C(jA1) : new di.t(jA1);
            case 6:
                return new di.m(value.Z0());
            case 7:
                return new C5401j(value.W0());
            case 8:
                return new C5394c(value.a1() != 0);
            case 9:
                return new di.x(nameResolver.getString(value.b1()));
            case 10:
                return new di.s(AbstractC6609L.a(nameResolver, value.U0()), value.M0());
            case 11:
                return new C5402k(AbstractC6609L.a(nameResolver, value.U0()), AbstractC6609L.b(nameResolver, value.X0()));
            case 12:
                Uh.b bVarK0 = value.K0();
                AbstractC6492s.h(bVarK0, "getAnnotation(...)");
                return new C5392a(a(bVarK0, nameResolver));
            case 13:
                C5400i c5400i = C5400i.f46097a;
                List listT0 = value.T0();
                AbstractC6492s.h(listT0, "getArrayElementList(...)");
                List<b.C0830b.c> list = listT0;
                ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
                for (b.C0830b.c cVar : list) {
                    AbstractC7346d0 abstractC7346d0I = c().i();
                    AbstractC6492s.h(abstractC7346d0I, "getAnyType(...)");
                    AbstractC6492s.f(cVar);
                    arrayList.add(f(abstractC7346d0I, cVar, nameResolver));
                }
                return c5400i.c(arrayList, expectedType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.c1() + " (expected " + expectedType + ')').toString());
        }
        return c5395d;
    }
}
