package Dh;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2505o;
import Bh.b0;
import Bh.g0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import ji.C6348i;
import pi.G0;
import pi.N0;

/* renamed from: Dh.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2597c extends AbstractC2607m implements b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2597c(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar) {
        super(hVar, Zh.h.f25429i);
        if (hVar == null) {
            I(0);
        }
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
            case 11:
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
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Dh.AbstractC2607m, Bh.InterfaceC2503m
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public Bh.V a() {
        return this;
    }

    @Override // Bh.InterfaceC2491a
    public boolean H() {
        return false;
    }

    @Override // Bh.InterfaceC2491a
    public b0 d0() {
        return null;
    }

    @Override // Bh.InterfaceC2491a
    public Collection f() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            I(8);
        }
        return setEmptySet;
    }

    @Override // Bh.InterfaceC2491a
    public pi.S getReturnType() {
        return getType();
    }

    @Override // Bh.r0
    public pi.S getType() {
        pi.S type = getValue().getType();
        if (type == null) {
            I(6);
        }
        return type;
    }

    @Override // Bh.InterfaceC2491a
    public List getTypeParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            I(5);
        }
        return listEmptyList;
    }

    @Override // Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        AbstractC2510u abstractC2510u = AbstractC2509t.f1797f;
        if (abstractC2510u == null) {
            I(9);
        }
        return abstractC2510u;
    }

    @Override // Bh.InterfaceC2491a
    public List i() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            I(7);
        }
        return listEmptyList;
    }

    @Override // Bh.InterfaceC2506p
    public g0 j() {
        g0 g0Var = g0.f1784a;
        if (g0Var == null) {
            I(11);
        }
        return g0Var;
    }

    @Override // Bh.InterfaceC2491a
    public b0 k0() {
        return null;
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o interfaceC2505o, Object obj) {
        return interfaceC2505o.i(this, obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2597c(kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar) {
        super(hVar, fVar);
        if (hVar == null) {
            I(1);
        }
        if (fVar == null) {
            I(2);
        }
    }

    @Override // Bh.i0
    public b0 c(G0 g02) {
        if (g02 == null) {
            I(3);
        }
        if (g02.k()) {
            return this;
        }
        pi.S sP = b() instanceof InterfaceC2495e ? g02.p(getType(), N0.OUT_VARIANCE) : g02.p(getType(), N0.INVARIANT);
        if (sP == null) {
            return null;
        }
        return sP == getType() ? this : new N(b(), new C6348i(sP), getAnnotations());
    }
}
