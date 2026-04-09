package Dh;

import Bh.AbstractC2510u;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2502l;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2505o;
import Bh.InterfaceC2515z;
import Bh.b0;
import Bh.g0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import pi.G0;

/* renamed from: Dh.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2603i extends AbstractC2612s implements InterfaceC2494d {

    /* renamed from: E, reason: collision with root package name */
    protected final boolean f3461E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected C2603i(InterfaceC2495e interfaceC2495e, InterfaceC2502l interfaceC2502l, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, boolean z10, InterfaceC2492b.a aVar, g0 g0Var) {
        super(interfaceC2495e, interfaceC2502l, hVar, Zh.h.f25430j, aVar, g0Var);
        if (interfaceC2495e == null) {
            I(0);
        }
        if (hVar == null) {
            I(1);
        }
        if (aVar == null) {
            I(2);
        }
        if (g0Var == null) {
            I(3);
        }
        this.f3461E = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void I(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Dh.C2603i.I(int):void");
    }

    private List k1() {
        InterfaceC2495e interfaceC2495eB = b();
        if (interfaceC2495eB.H0().isEmpty()) {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList == null) {
                I(16);
            }
            return listEmptyList;
        }
        List listH0 = interfaceC2495eB.H0();
        if (listH0 == null) {
            I(15);
        }
        return listH0;
    }

    public static C2603i n1(InterfaceC2495e interfaceC2495e, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, boolean z10, g0 g0Var) {
        if (interfaceC2495e == null) {
            I(4);
        }
        if (hVar == null) {
            I(5);
        }
        if (g0Var == null) {
            I(6);
        }
        return new C2603i(interfaceC2495e, null, hVar, z10, InterfaceC2492b.a.DECLARATION, g0Var);
    }

    @Override // Bh.InterfaceC2502l
    public boolean B() {
        return this.f3461E;
    }

    @Override // Bh.InterfaceC2502l
    public InterfaceC2495e C() {
        InterfaceC2495e interfaceC2495eB = b();
        if (interfaceC2495eB == null) {
            I(18);
        }
        return interfaceC2495eB;
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2515z, Bh.InterfaceC2492b, Bh.InterfaceC2491a
    public Collection f() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            I(21);
        }
        return setEmptySet;
    }

    public b0 l1() {
        InterfaceC2495e interfaceC2495eB = b();
        if (!interfaceC2495eB.M()) {
            return null;
        }
        InterfaceC2503m interfaceC2503mB = interfaceC2495eB.b();
        if (interfaceC2503mB instanceof InterfaceC2495e) {
            return ((InterfaceC2495e) interfaceC2503mB).J0();
        }
        return null;
    }

    @Override // Bh.InterfaceC2492b
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public InterfaceC2494d c0(InterfaceC2503m interfaceC2503m, Bh.D d10, AbstractC2510u abstractC2510u, InterfaceC2492b.a aVar, boolean z10) {
        InterfaceC2494d interfaceC2494d = (InterfaceC2494d) super.K0(interfaceC2503m, d10, abstractC2510u, aVar, z10);
        if (interfaceC2494d == null) {
            I(27);
        }
        return interfaceC2494d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dh.AbstractC2612s
    /* renamed from: o1, reason: merged with bridge method [inline-methods] */
    public C2603i L0(InterfaceC2503m interfaceC2503m, InterfaceC2515z interfaceC2515z, InterfaceC2492b.a aVar, Zh.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, g0 g0Var) {
        if (interfaceC2503m == null) {
            I(23);
        }
        if (aVar == null) {
            I(24);
        }
        if (hVar == null) {
            I(25);
        }
        if (g0Var == null) {
            I(26);
        }
        InterfaceC2492b.a aVar2 = InterfaceC2492b.a.DECLARATION;
        if (aVar == aVar2 || aVar == InterfaceC2492b.a.SYNTHESIZED) {
            return new C2603i((InterfaceC2495e) interfaceC2503m, this, hVar, this.f3461E, aVar2, g0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC2503m + "\nkind: " + aVar);
    }

    @Override // Dh.AbstractC2608n, Bh.InterfaceC2503m
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public InterfaceC2495e b() {
        InterfaceC2495e interfaceC2495e = (InterfaceC2495e) super.b();
        if (interfaceC2495e == null) {
            I(17);
        }
        return interfaceC2495e;
    }

    public C2603i q1(List list, AbstractC2510u abstractC2510u) {
        if (list == null) {
            I(13);
        }
        if (abstractC2510u == null) {
            I(14);
        }
        r1(list, abstractC2510u, b().w());
        return this;
    }

    public C2603i r1(List list, AbstractC2510u abstractC2510u, List list2) {
        if (list == null) {
            I(10);
        }
        if (abstractC2510u == null) {
            I(11);
        }
        if (list2 == null) {
            I(12);
        }
        super.R0(null, l1(), k1(), list2, list, null, Bh.D.FINAL, abstractC2510u);
        return this;
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o interfaceC2505o, Object obj) {
        return interfaceC2505o.f(this, obj);
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2492b
    public void x0(Collection collection) {
        if (collection == null) {
            I(22);
        }
    }

    @Override // Dh.AbstractC2612s, Bh.InterfaceC2515z, Bh.i0
    public InterfaceC2494d c(G0 g02) {
        if (g02 == null) {
            I(20);
        }
        return (InterfaceC2494d) super.c(g02);
    }

    @Override // Dh.AbstractC2612s, Dh.AbstractC2608n, Dh.AbstractC2607m, Bh.InterfaceC2503m
    public InterfaceC2494d a() {
        InterfaceC2494d interfaceC2494d = (InterfaceC2494d) super.a();
        if (interfaceC2494d == null) {
            I(19);
        }
        return interfaceC2494d;
    }
}
