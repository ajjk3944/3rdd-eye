package Dh;

import Bh.AbstractC2510u;
import Bh.InterfaceC2491a;
import Bh.InterfaceC2492b;
import Bh.InterfaceC2503m;
import Bh.InterfaceC2515z;
import Bh.b0;
import Bh.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import pi.G0;

/* loaded from: classes4.dex */
public abstract class J extends AbstractC2608n implements Bh.X {

    /* renamed from: e, reason: collision with root package name */
    private boolean f3356e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3357f;

    /* renamed from: g, reason: collision with root package name */
    private final Bh.D f3358g;

    /* renamed from: h, reason: collision with root package name */
    private final Bh.Y f3359h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f3360i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC2492b.a f3361j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC2510u f3362k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC2515z f3363l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Bh.D d10, AbstractC2510u abstractC2510u, Bh.Y y10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.h hVar, Zh.f fVar, boolean z10, boolean z11, boolean z12, InterfaceC2492b.a aVar, g0 g0Var) {
        super(y10.b(), hVar, fVar, g0Var);
        if (d10 == null) {
            I(0);
        }
        if (abstractC2510u == null) {
            I(1);
        }
        if (y10 == null) {
            I(2);
        }
        if (hVar == null) {
            I(3);
        }
        if (fVar == null) {
            I(4);
        }
        if (g0Var == null) {
            I(5);
        }
        this.f3363l = null;
        this.f3358g = d10;
        this.f3362k = abstractC2510u;
        this.f3359h = y10;
        this.f3356e = z10;
        this.f3357f = z11;
        this.f3360i = z12;
        this.f3361j = aVar;
    }

    private static /* synthetic */ void I(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // Bh.X
    public Bh.Y C0() {
        Bh.Y y10 = this.f3359h;
        if (y10 == null) {
            I(13);
        }
        return y10;
    }

    @Override // Bh.InterfaceC2515z
    public boolean D0() {
        return false;
    }

    @Override // Bh.C
    public boolean F0() {
        return false;
    }

    @Override // Bh.InterfaceC2492b
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public Bh.X c0(InterfaceC2503m interfaceC2503m, Bh.D d10, AbstractC2510u abstractC2510u, InterfaceC2492b.a aVar, boolean z10) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // Bh.InterfaceC2491a
    public boolean H() {
        return false;
    }

    protected Collection K0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        for (Bh.Y y10 : C0().f()) {
            Bh.C cD = z10 ? y10.d() : y10.g();
            if (cD != null) {
                arrayList.add(cD);
            }
        }
        return arrayList;
    }

    @Override // Bh.C
    public boolean L() {
        return false;
    }

    public void L0(boolean z10) {
        this.f3356e = z10;
    }

    public void M0(InterfaceC2515z interfaceC2515z) {
        this.f3363l = interfaceC2515z;
    }

    public void N0(AbstractC2510u abstractC2510u) {
        this.f3362k = abstractC2510u;
    }

    @Override // Bh.InterfaceC2515z
    public boolean O() {
        return false;
    }

    @Override // Bh.X
    public boolean T() {
        return this.f3356e;
    }

    @Override // Bh.InterfaceC2515z
    public InterfaceC2515z a0() {
        return this.f3363l;
    }

    @Override // Bh.i0
    public InterfaceC2515z c(G0 g02) {
        if (g02 == null) {
            I(7);
        }
        return this;
    }

    @Override // Bh.InterfaceC2491a
    public b0 d0() {
        return C0().d0();
    }

    @Override // Bh.InterfaceC2491a
    public Object e0(InterfaceC2491a.InterfaceC0071a interfaceC0071a) {
        return null;
    }

    @Override // Bh.InterfaceC2491a
    public List getTypeParameters() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            I(9);
        }
        return listEmptyList;
    }

    @Override // Bh.InterfaceC2507q
    public AbstractC2510u getVisibility() {
        AbstractC2510u abstractC2510u = this.f3362k;
        if (abstractC2510u == null) {
            I(11);
        }
        return abstractC2510u;
    }

    @Override // Bh.InterfaceC2492b
    public InterfaceC2492b.a h() {
        InterfaceC2492b.a aVar = this.f3361j;
        if (aVar == null) {
            I(6);
        }
        return aVar;
    }

    @Override // Bh.C
    public boolean isExternal() {
        return this.f3357f;
    }

    @Override // Bh.InterfaceC2515z
    public boolean isInfix() {
        return false;
    }

    @Override // Bh.InterfaceC2515z
    public boolean isInline() {
        return this.f3360i;
    }

    @Override // Bh.InterfaceC2515z
    public boolean isOperator() {
        return false;
    }

    @Override // Bh.InterfaceC2515z
    public boolean isSuspend() {
        return false;
    }

    @Override // Bh.InterfaceC2491a
    public b0 k0() {
        return C0().k0();
    }

    @Override // Bh.C
    public Bh.D l() {
        Bh.D d10 = this.f3358g;
        if (d10 == null) {
            I(10);
        }
        return d10;
    }

    @Override // Bh.InterfaceC2491a
    public List p0() {
        List listP0 = C0().p0();
        if (listP0 == null) {
            I(14);
        }
        return listP0;
    }

    @Override // Bh.InterfaceC2515z
    public boolean v0() {
        return false;
    }

    @Override // Bh.InterfaceC2492b
    public void x0(Collection collection) {
        if (collection == null) {
            I(16);
        }
    }
}
