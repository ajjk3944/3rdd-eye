package km;

import j$.util.Objects;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a1 implements ParameterizedType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f28389a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f28390b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f28391c;

    public a1(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            c1.d(type3);
        }
        this.f28389a = type;
        this.f28390b = type2;
        this.f28391c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && c1.e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f28391c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f28389a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f28390b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f28391c) ^ this.f28390b.hashCode();
        Type type = this.f28389a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f28391c;
        int length = typeArr.length;
        Type type = this.f28390b;
        if (length == 0) {
            return c1.r(type);
        }
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(c1.r(type));
        sb2.append("<");
        sb2.append(c1.r(typeArr[0]));
        for (int i4 = 1; i4 < typeArr.length; i4++) {
            sb2.append(", ");
            sb2.append(c1.r(typeArr[i4]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
