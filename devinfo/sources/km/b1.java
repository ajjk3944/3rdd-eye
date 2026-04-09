package km;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b1 implements WildcardType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f28396a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f28397b;

    public b1(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            c1.d(typeArr[0]);
            this.f28397b = null;
            this.f28396a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        c1.d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f28397b = typeArr2[0];
        this.f28396a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && c1.e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f28397b;
        return type != null ? new Type[]{type} : c1.f28400a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f28396a};
    }

    public final int hashCode() {
        Type type = this.f28397b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f28396a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f28397b;
        if (type != null) {
            return "? super " + c1.r(type);
        }
        Type type2 = this.f28396a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + c1.r(type2);
    }
}
