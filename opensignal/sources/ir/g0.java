package ir;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g0 implements WildcardType, Type {

    /* renamed from: g, reason: collision with root package name */
    public static final g0 f12938g = new g0(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Type f12939a;

    /* renamed from: d, reason: collision with root package name */
    public final Type f12940d;

    public g0(Type type, Type type2) {
        this.f12939a = type;
        this.f12940d = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f12940d;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f12940d;
        if (type != null) {
            return "? super " + f0.b(type);
        }
        Type type2 = this.f12939a;
        if (type2 == null || br.l.a(type2, Object.class)) {
            return "?";
        }
        return "? extends " + f0.b(type2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type type = this.f12939a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
