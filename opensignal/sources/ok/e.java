package ok;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import nk.p0;

/* loaded from: classes.dex */
public final class e implements WildcardType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f19535a;

    /* renamed from: d, reason: collision with root package name */
    public final Type f19536d;

    public e(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            f.b(typeArr[0]);
            this.f19536d = null;
            this.f19535a = f.a(typeArr[0]);
            return;
        }
        typeArr2[0].getClass();
        f.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f19536d = f.a(typeArr2[0]);
        this.f19535a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && p0.b(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f19536d;
        return type != null ? new Type[]{type} : f.f19538b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f19535a};
    }

    public final int hashCode() {
        Type type = this.f19536d;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f19535a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f19536d;
        if (type != null) {
            return "? super " + f.k(type);
        }
        Type type2 = this.f19535a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + f.k(type2);
    }
}
