package xr;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* loaded from: classes.dex */
public final class e0 extends b0 implements hs.d {

    /* renamed from: a, reason: collision with root package name */
    public final WildcardType f25502a;

    public e0(WildcardType wildcardType) {
        this.f25502a = wildcardType;
    }

    @Override // xr.b0
    public final Type b() {
        return this.f25502a;
    }

    public final b0 c() {
        WildcardType wildcardType = this.f25502a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object objX0 = mq.l.x0(lowerBounds);
            br.l.d(objX0, "lowerBounds.single()");
            Type type = (Type) objX0;
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new z(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) ? new i(type) : type instanceof WildcardType ? new e0((WildcardType) type) : new q(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type type2 = (Type) mq.l.x0(upperBounds);
        if (br.l.a(type2, Object.class)) {
            return null;
        }
        br.l.d(type2, "ub");
        boolean z11 = type2 instanceof Class;
        if (z11) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new z(cls2);
            }
        }
        return ((type2 instanceof GenericArrayType) || (z11 && ((Class) type2).isArray())) ? new i(type2) : type2 instanceof WildcardType ? new e0((WildcardType) type2) : new q(type2);
    }

    @Override // hs.b
    public final Collection getAnnotations() {
        return mq.w.f16945a;
    }
}
