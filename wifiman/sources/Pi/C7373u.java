package pi;

import Bh.InterfaceC2495e;
import Bh.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: pi.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7373u extends AbstractC7341b {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2495e f58167d;

    /* renamed from: e, reason: collision with root package name */
    private final List f58168e;

    /* renamed from: f, reason: collision with root package name */
    private final Collection f58169f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7373u(InterfaceC2495e interfaceC2495e, List list, Collection collection, oi.n nVar) {
        super(nVar);
        if (interfaceC2495e == null) {
            H(0);
        }
        if (list == null) {
            H(1);
        }
        if (collection == null) {
            H(2);
        }
        if (nVar == null) {
            H(3);
        }
        this.f58167d = interfaceC2495e;
        this.f58168e = Collections.unmodifiableList(new ArrayList(list));
        this.f58169f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void H(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // pi.AbstractC7374v, pi.v0
    /* renamed from: I */
    public InterfaceC2495e c() {
        InterfaceC2495e interfaceC2495e = this.f58167d;
        if (interfaceC2495e == null) {
            H(5);
        }
        return interfaceC2495e;
    }

    @Override // pi.v0
    public boolean d() {
        return true;
    }

    @Override // pi.v0
    public List getParameters() {
        List list = this.f58168e;
        if (list == null) {
            H(4);
        }
        return list;
    }

    @Override // pi.AbstractC7369p
    protected Collection r() {
        Collection collection = this.f58169f;
        if (collection == null) {
            H(6);
        }
        return collection;
    }

    public String toString() {
        return bi.i.m(this.f58167d).b();
    }

    @Override // pi.AbstractC7369p
    protected Bh.j0 v() {
        j0.a aVar = j0.a.f1787a;
        if (aVar == null) {
            H(7);
        }
        return aVar;
    }
}
