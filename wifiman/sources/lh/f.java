package Lh;

import Bh.AbstractC2510u;
import Bh.C2500j;
import Bh.D;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2503m;
import Bh.Y;
import Bh.a0;
import Bh.g0;
import Bh.s0;
import Dh.K;
import Dh.L;
import Dh.M;
import Rh.k0;
import Yg.s;
import Zg.AbstractC3689v;
import com.google.ar.core.ImageFormat;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.i;
import mh.InterfaceC6824a;
import pi.S;

/* loaded from: classes4.dex */
public class f extends K implements a {

    /* renamed from: C, reason: collision with root package name */
    private final boolean f11825C;

    /* renamed from: D, reason: collision with root package name */
    private final s f11826D;

    /* renamed from: E, reason: collision with root package name */
    private S f11827E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, D d10, AbstractC2510u abstractC2510u, boolean z10, Zh.f fVar, g0 g0Var, Y y10, InterfaceC2492b.a aVar, boolean z11, s sVar) {
        super(interfaceC2503m, y10, hVar, d10, abstractC2510u, z10, fVar, aVar, g0Var, false, false, false, false, false, false);
        if (interfaceC2503m == null) {
            I(0);
        }
        if (hVar == null) {
            I(1);
        }
        if (d10 == null) {
            I(2);
        }
        if (abstractC2510u == null) {
            I(3);
        }
        if (fVar == null) {
            I(4);
        }
        if (g0Var == null) {
            I(5);
        }
        if (aVar == null) {
            I(6);
        }
        this.f11827E = null;
        this.f11825C = z11;
        this.f11826D = sVar;
    }

    private static /* synthetic */ void I(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    public static f f1(InterfaceC2503m interfaceC2503m, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, D d10, AbstractC2510u abstractC2510u, boolean z10, Zh.f fVar, g0 g0Var, boolean z11) {
        if (interfaceC2503m == null) {
            I(7);
        }
        if (hVar == null) {
            I(8);
        }
        if (d10 == null) {
            I(9);
        }
        if (abstractC2510u == null) {
            I(10);
        }
        if (fVar == null) {
            I(11);
        }
        if (g0Var == null) {
            I(12);
        }
        return new f(interfaceC2503m, hVar, d10, abstractC2510u, z10, fVar, g0Var, null, InterfaceC2492b.a.DECLARATION, z11, null);
    }

    @Override // Dh.K, Bh.t0
    public boolean A() {
        S type = getType();
        return this.f11825C && C2500j.a(type) && (!k0.i(type) || i.v0(type));
    }

    @Override // Lh.a
    public a A0(S s10, List list, S s11, s sVar) {
        L l10;
        M m10;
        if (list == null) {
            I(19);
        }
        if (s11 == null) {
            I(20);
        }
        Y yA = a() == this ? null : a();
        f fVar = new f(b(), getAnnotations(), l(), getVisibility(), h0(), getName(), j(), yA, h(), this.f11825C, sVar);
        L lD = d();
        if (lD != null) {
            l10 = l;
            L l11 = new L(fVar, lD.getAnnotations(), lD.l(), lD.getVisibility(), lD.T(), lD.isExternal(), lD.isInline(), h(), yA == null ? null : yA.d(), lD.j());
            l10.M0(lD.a0());
            l10.P0(s11);
        } else {
            l10 = null;
        }
        a0 a0VarG = g();
        if (a0VarG != null) {
            M m11 = new M(fVar, a0VarG.getAnnotations(), a0VarG.l(), a0VarG.getVisibility(), a0VarG.T(), a0VarG.isExternal(), a0VarG.isInline(), h(), yA == null ? null : yA.g(), a0VarG.j());
            m11.M0(m11.a0());
            m11.Q0((s0) a0VarG.i().get(0));
            m10 = m11;
        } else {
            m10 = null;
        }
        fVar.V0(l10, m10, o0(), l0());
        fVar.a1(W0());
        InterfaceC6824a interfaceC6824a = this.f3428h;
        if (interfaceC6824a != null) {
            fVar.K0(this.f3427g, interfaceC6824a);
        }
        fVar.x0(f());
        fVar.b1(s11, getTypeParameters(), d0(), s10 == null ? null : bi.h.i(this, s10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b()), AbstractC3689v.l());
        return fVar;
    }

    @Override // Dh.X, Bh.InterfaceC2491a
    public boolean H() {
        return false;
    }

    @Override // Dh.K
    protected K P0(InterfaceC2503m interfaceC2503m, D d10, AbstractC2510u abstractC2510u, Y y10, InterfaceC2492b.a aVar, Zh.f fVar, g0 g0Var) {
        if (interfaceC2503m == null) {
            I(13);
        }
        if (d10 == null) {
            I(14);
        }
        if (abstractC2510u == null) {
            I(15);
        }
        if (aVar == null) {
            I(16);
        }
        if (fVar == null) {
            I(17);
        }
        if (g0Var == null) {
            I(18);
        }
        return new f(interfaceC2503m, getAnnotations(), d10, abstractC2510u, h0(), fVar, g0Var, y10, aVar, this.f11825C, this.f11826D);
    }

    @Override // Dh.K
    public void Z0(S s10) {
        if (s10 == null) {
            I(22);
        }
        this.f11827E = s10;
    }

    @Override // Dh.K, Bh.InterfaceC2491a
    public Object e0(InterfaceC2491a.InterfaceC0071a interfaceC0071a) {
        s sVar = this.f11826D;
        if (sVar == null || !((InterfaceC2491a.InterfaceC0071a) sVar.h()).equals(interfaceC0071a)) {
            return null;
        }
        return this.f11826D.j();
    }
}
