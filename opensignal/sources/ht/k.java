package ht;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends b {

    /* renamed from: c, reason: collision with root package name */
    public final ur.z f10914c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10915d;

    /* renamed from: e, reason: collision with root package name */
    public final Collection f10916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ur.z zVar, List list, Collection collection, gt.o oVar) {
        super(oVar);
        if (list == null) {
            h(1);
            throw null;
        }
        if (collection == null) {
            h(2);
            throw null;
        }
        if (oVar == null) {
            h(3);
            throw null;
        }
        this.f10914c = zVar;
        this.f10915d = Collections.unmodifiableList(new ArrayList(list));
        this.f10916e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void h(int i10) {
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
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
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

    @Override // ht.h
    public final Collection b() {
        Collection collection = this.f10916e;
        if (collection != null) {
            return collection;
        }
        h(6);
        throw null;
    }

    @Override // ht.h
    public final rr.p0 d() {
        return rr.p0.f21711g;
    }

    @Override // ht.b
    /* renamed from: i */
    public final rr.f p() {
        ur.z zVar = this.f10914c;
        if (zVar != null) {
            return zVar;
        }
        h(5);
        throw null;
    }

    @Override // ht.m0
    public final List o() {
        List list = this.f10915d;
        if (list != null) {
            return list;
        }
        h(4);
        throw null;
    }

    @Override // ht.m0
    public final boolean r() {
        return true;
    }

    public final String toString() {
        String str = ts.d.g(this.f10914c).f21030a;
        if (str != null) {
            return str;
        }
        qs.e.a(4);
        throw null;
    }
}
