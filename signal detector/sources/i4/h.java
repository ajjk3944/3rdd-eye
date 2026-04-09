package i4;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes.dex */
public final class h implements WildcardType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f20603a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f20604b;

    public h(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException("At most one lower bound is supported");
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException("Exactly one upper bound must be specified");
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            i.b(typeArr[0]);
            this.f20604b = null;
            this.f20603a = i.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        i.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
        }
        this.f20604b = i.a(typeArr2[0]);
        this.f20603a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && i.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f20604b;
        return type != null ? new Type[]{type} : i.f20605a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f20603a};
    }

    public final int hashCode() {
        Type type = this.f20604b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f20603a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f20604b;
        if (type != null) {
            return "? super " + i.k(type);
        }
        Type type2 = this.f20603a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + i.k(type2);
    }
}
