package Dh;

import Bh.AbstractC2510u;
import Bh.EnumC2496f;
import Bh.InterfaceC2494d;
import Bh.InterfaceC2495e;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.g0;
import Bh.q0;
import ii.InterfaceC6164k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import pi.C7373u;
import pi.v0;

/* loaded from: classes4.dex */
public class G extends AbstractC2604j {

    /* renamed from: i, reason: collision with root package name */
    private final EnumC2496f f3342i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f3343j;

    /* renamed from: k, reason: collision with root package name */
    private Bh.D f3344k;

    /* renamed from: l, reason: collision with root package name */
    private AbstractC2510u f3345l;

    /* renamed from: m, reason: collision with root package name */
    private v0 f3346m;

    /* renamed from: n, reason: collision with root package name */
    private List f3347n;

    /* renamed from: o, reason: collision with root package name */
    private final Collection f3348o;

    /* renamed from: p, reason: collision with root package name */
    private final oi.n f3349p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(InterfaceC2503m interfaceC2503m, EnumC2496f enumC2496f, boolean z10, boolean z11, Zh.f fVar, g0 g0Var, oi.n nVar) {
        super(nVar, interfaceC2503m, fVar, g0Var, z11);
        if (interfaceC2503m == null) {
            B0(0);
        }
        if (enumC2496f == null) {
            B0(1);
        }
        if (fVar == null) {
            B0(2);
        }
        if (g0Var == null) {
            B0(3);
        }
        if (nVar == null) {
            B0(4);
        }
        this.f3348o = new ArrayList();
        this.f3349p = nVar;
        this.f3342i = enumC2496f;
        this.f3343j = z10;
    }

    private static /* synthetic */ void B0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i11 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
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

    public void K0() {
        this.f3346m = new C7373u(this, this.f3347n, this.f3348o, this.f3349p);
        Iterator it = m().iterator();
        while (it.hasNext()) {
            ((C2603i) ((InterfaceC2515z) it.next())).g1(u());
        }
    }

    @Override // Bh.C
    public boolean L() {
        return false;
    }

    @Override // Bh.InterfaceC2495e
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public Set m() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            B0(13);
        }
        return setEmptySet;
    }

    @Override // Bh.InterfaceC2499i
    public boolean M() {
        return this.f3343j;
    }

    public void M0(Bh.D d10) {
        if (d10 == null) {
            B0(6);
        }
        this.f3344k = d10;
    }

    public void N0(List list) {
        if (list == null) {
            B0(14);
        }
        if (this.f3347n == null) {
            this.f3347n = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    public void O0(AbstractC2510u abstractC2510u) {
        if (abstractC2510u == null) {
            B0(9);
        }
        this.f3345l = abstractC2510u;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC2494d P() {
        return null;
    }

    @Override // Bh.InterfaceC2495e
    public InterfaceC6164k Q() {
        InterfaceC6164k.b bVar = InterfaceC6164k.b.f49223b;
        if (bVar == null) {
            B0(18);
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
            B0(5);
        }
        return hVarB;
    }

    @Override // Bh.InterfaceC2495e, Bh.C, Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        AbstractC2510u abstractC2510u = this.f3345l;
        if (abstractC2510u == null) {
            B0(10);
        }
        return abstractC2510u;
    }

    @Override // Bh.InterfaceC2495e
    public EnumC2496f h() {
        EnumC2496f enumC2496f = this.f3342i;
        if (enumC2496f == null) {
            B0(8);
        }
        return enumC2496f;
    }

    @Override // Dh.z
    public InterfaceC6164k i0(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        if (gVar == null) {
            B0(16);
        }
        InterfaceC6164k.b bVar = InterfaceC6164k.b.f49223b;
        if (bVar == null) {
            B0(17);
        }
        return bVar;
    }

    @Override // Bh.InterfaceC2495e
    public boolean isInline() {
        return false;
    }

    @Override // Bh.InterfaceC2498h
    public v0 k() {
        v0 v0Var = this.f3346m;
        if (v0Var == null) {
            B0(11);
        }
        return v0Var;
    }

    @Override // Bh.InterfaceC2495e, Bh.C
    public Bh.D l() {
        Bh.D d10 = this.f3344k;
        if (d10 == null) {
            B0(7);
        }
        return d10;
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
        return AbstractC2607m.i0(this);
    }

    @Override // Bh.InterfaceC2495e, Bh.InterfaceC2499i
    public List w() {
        List list = this.f3347n;
        if (list == null) {
            B0(15);
        }
        return list;
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
