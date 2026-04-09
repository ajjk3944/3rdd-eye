package Dh;

import Bh.AbstractC2510u;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2505o;
import Bh.Z;
import Bh.g0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class L extends J implements Z {

    /* renamed from: m, reason: collision with root package name */
    private pi.S f3397m;

    /* renamed from: n, reason: collision with root package name */
    private final Z f3398n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public L(Bh.Y y10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Bh.D d10, AbstractC2510u abstractC2510u, boolean z10, boolean z11, boolean z12, InterfaceC2492b.a aVar, Z z13, g0 g0Var) {
        L l10;
        L l11;
        super(d10, abstractC2510u, y10, hVar, Zh.f.n("<get-" + y10.getName() + ">"), z10, z11, z12, aVar, g0Var);
        if (y10 == null) {
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
        if (aVar == null) {
            I(4);
        }
        if (g0Var == null) {
            I(5);
        }
        if (z13 != 0) {
            l11 = this;
            l10 = z13;
        } else {
            l10 = this;
            l11 = l10;
        }
        l11.f3398n = l10;
    }

    private static /* synthetic */ void I(int i10) {
        String str = (i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i10 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Dh.AbstractC2608n, Dh.AbstractC2607m, Bh.InterfaceC2503m
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public Z a() {
        Z z10 = this.f3398n;
        if (z10 == null) {
            I(8);
        }
        return z10;
    }

    public void P0(pi.S s10) {
        if (s10 == null) {
            s10 = C0().getType();
        }
        this.f3397m = s10;
    }

    @Override // Bh.InterfaceC2515z, Bh.InterfaceC2492b, Bh.InterfaceC2491a
    public Collection f() {
        Collection collectionK0 = super.K0(true);
        if (collectionK0 == null) {
            I(6);
        }
        return collectionK0;
    }

    @Override // Bh.InterfaceC2491a
    public pi.S getReturnType() {
        return this.f3397m;
    }

    @Override // Bh.InterfaceC2491a
    public List i() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            I(7);
        }
        return listEmptyList;
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o interfaceC2505o, Object obj) {
        return interfaceC2505o.m(this, obj);
    }
}
