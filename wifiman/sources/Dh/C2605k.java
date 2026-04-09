package Dh;

import Bh.AbstractC2509t;
import Bh.AbstractC2510u;
import Bh.EnumC2496f;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Bh.g0;
import Bh.q0;
import ii.InterfaceC6164k;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import pi.C7373u;
import pi.v0;

/* renamed from: Dh.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2605k extends AbstractC2604j {

    /* renamed from: i, reason: collision with root package name */
    private final Bh.D f3465i;

    /* renamed from: j, reason: collision with root package name */
    private final EnumC2496f f3466j;

    /* renamed from: k, reason: collision with root package name */
    private final v0 f3467k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC6164k f3468l;

    /* renamed from: m, reason: collision with root package name */
    private Set f3469m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC2494d f3470n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2605k(InterfaceC2503m interfaceC2503m, Zh.f fVar, Bh.D d10, EnumC2496f enumC2496f, Collection collection, g0 g0Var, boolean z10, oi.n nVar) {
        super(nVar, interfaceC2503m, fVar, g0Var, z10);
        if (interfaceC2503m == null) {
            B0(0);
        }
        if (fVar == null) {
            B0(1);
        }
        if (d10 == null) {
            B0(2);
        }
        if (enumC2496f == null) {
            B0(3);
        }
        if (collection == null) {
            B0(4);
        }
        if (g0Var == null) {
            B0(5);
        }
        if (nVar == null) {
            B0(6);
        }
        this.f3465i = d10;
        this.f3466j = enumC2496f;
        this.f3467k = new C7373u(this, Collections.emptyList(), collection, nVar);
    }

    private static /* synthetic */ void B0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Bh.InterfaceC2495e
    public boolean D() {
        return false;
    }

    @Override // Bh.C
    public boolean F0() {
        return false;
    }

    @Override // Bh.InterfaceC2495e
    public boolean I0() {
        return false;
    }

    public final void K0(InterfaceC6164k interfaceC6164k, Set set, InterfaceC2494d interfaceC2494d) {
        if (interfaceC6164k == null) {
            B0(7);
        }
        if (set == null) {
            B0(8);
        }
        this.f3468l = interfaceC6164k;
        this.f3469m = set;
        this.f3470n = interfaceC2494d;
    }

    @Override // Bh.C
    public boolean L() {
        return false;
    }

    @Override // Bh.InterfaceC2499i
    public boolean M() {
        return false;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC2494d P() {
        return this.f3470n;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC6164k Q() {
        InterfaceC6164k.b bVar = InterfaceC6164k.b.f49223b;
        if (bVar == null) {
            B0(14);
        }
        return bVar;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC2495e S() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.h getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVarB = kotlin.reflect.jvm.internal.impl.descriptors.annotations.h.f51914c1.b();
        if (hVarB == null) {
            B0(9);
        }
        return hVarB;
    }

    @Override // Bh.InterfaceC2495e, Bh.C, Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        AbstractC2510u abstractC2510u = AbstractC2509t.f1796e;
        if (abstractC2510u == null) {
            B0(17);
        }
        return abstractC2510u;
    }

    @Override // Bh.InterfaceC2495e
    public EnumC2496f h() {
        EnumC2496f enumC2496f = this.f3466j;
        if (enumC2496f == null) {
            B0(15);
        }
        return enumC2496f;
    }

    @Override // Dh.z
    public InterfaceC6164k i0(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            B0(12);
        }
        InterfaceC6164k interfaceC6164k = this.f3468l;
        if (interfaceC6164k == null) {
            B0(13);
        }
        return interfaceC6164k;
    }

    @Override // Bh.InterfaceC2495e
    public boolean isInline() {
        return false;
    }

    @Override // Bh.InterfaceC2498h
    public v0 k() {
        v0 v0Var = this.f3467k;
        if (v0Var == null) {
            B0(10);
        }
        return v0Var;
    }

    @Override // Bh.InterfaceC2495e, Bh.C
    public Bh.D l() {
        Bh.D d10 = this.f3465i;
        if (d10 == null) {
            B0(16);
        }
        return d10;
    }

    @Override // Bh.InterfaceC2495e
    public Collection m() {
        Set set = this.f3469m;
        if (set == null) {
            B0(11);
        }
        return set;
    }

    @Override // Bh.InterfaceC2495e
    public Collection n() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            B0(19);
        }
        return listEmptyList;
    }

    @Override // Bh.InterfaceC2495e
    public boolean o() {
        return false;
    }

    public String toString() {
        return "class " + getName();
    }

    @Override // Bh.InterfaceC2495e, Bh.InterfaceC2499i
    public List w() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            B0(18);
        }
        return listEmptyList;
    }

    @Override // Bh.InterfaceC2495e
    public boolean z() {
        return false;
    }

    @Override // Bh.InterfaceC2495e
    public q0 z0() {
        return null;
    }
}
