package Dh;

import Bh.AbstractC2510u;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2505o;
import Bh.a0;
import Bh.g0;
import Bh.s0;
import fi.AbstractC5833e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import pi.AbstractC7346d0;

/* loaded from: classes4.dex */
public class M extends J implements a0 {

    /* renamed from: m, reason: collision with root package name */
    private s0 f3399m;

    /* renamed from: n, reason: collision with root package name */
    private final a0 f3400n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M(Bh.Y y10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Bh.D d10, AbstractC2510u abstractC2510u, boolean z10, boolean z11, boolean z12, InterfaceC2492b.a aVar, a0 a0Var, g0 g0Var) {
        M m10;
        M m11;
        super(d10, abstractC2510u, y10, hVar, Zh.f.n("<set-" + y10.getName() + ">"), z10, z11, z12, aVar, g0Var);
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
        if (a0Var != 0) {
            m11 = this;
            m10 = a0Var;
        } else {
            m10 = this;
            m11 = m10;
        }
        m11.f3400n = m10;
    }

    private static /* synthetic */ void I(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static V O0(a0 a0Var, pi.S s10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar) {
        if (a0Var == null) {
            I(7);
        }
        if (s10 == null) {
            I(8);
        }
        if (hVar == null) {
            I(9);
        }
        return new V(a0Var, null, 0, hVar, Zh.h.f25435o, s10, false, false, false, null, g0.f1784a);
    }

    @Override // Dh.AbstractC2608n, Dh.AbstractC2607m, Bh.InterfaceC2503m
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public a0 a() {
        a0 a0Var = this.f3400n;
        if (a0Var == null) {
            I(13);
        }
        return a0Var;
    }

    public void Q0(s0 s0Var) {
        if (s0Var == null) {
            I(6);
        }
        this.f3399m = s0Var;
    }

    @Override // Bh.InterfaceC2515z, Bh.InterfaceC2492b, Bh.InterfaceC2491a
    public Collection f() {
        Collection collectionK0 = super.K0(false);
        if (collectionK0 == null) {
            I(10);
        }
        return collectionK0;
    }

    @Override // Bh.InterfaceC2491a
    public pi.S getReturnType() {
        AbstractC7346d0 abstractC7346d0Z = AbstractC5833e.m(this).Z();
        if (abstractC7346d0Z == null) {
            I(12);
        }
        return abstractC7346d0Z;
    }

    @Override // Bh.InterfaceC2491a
    public List i() {
        s0 s0Var = this.f3399m;
        if (s0Var == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(s0Var);
        if (listSingletonList == null) {
            I(11);
        }
        return listSingletonList;
    }

    @Override // Bh.InterfaceC2503m
    public Object t0(InterfaceC2505o interfaceC2505o, Object obj) {
        return interfaceC2505o.j(this, obj);
    }
}
