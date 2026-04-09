package xr;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* loaded from: classes.dex */
public final class i extends b0 implements hs.d {

    /* renamed from: a, reason: collision with root package name */
    public final Type f25506a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f25507b;

    /* renamed from: c, reason: collision with root package name */
    public final mq.w f25508c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Type type) {
        b0 zVar;
        b0 zVar2;
        this.f25506a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    br.l.d(componentType, "getComponentType()");
                    zVar = componentType.isPrimitive() ? new z(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new i(componentType) : componentType instanceof WildcardType ? new e0((WildcardType) componentType) : new q(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        br.l.d(genericComponentType, "genericComponentType");
        boolean z10 = genericComponentType instanceof Class;
        if (z10) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                zVar2 = new z(cls2);
                this.f25507b = zVar2;
                this.f25508c = mq.w.f16945a;
            }
        }
        zVar = ((genericComponentType instanceof GenericArrayType) || (z10 && ((Class) genericComponentType).isArray())) ? new i(genericComponentType) : genericComponentType instanceof WildcardType ? new e0((WildcardType) genericComponentType) : new q(genericComponentType);
        zVar2 = zVar;
        this.f25507b = zVar2;
        this.f25508c = mq.w.f16945a;
    }

    @Override // xr.b0
    public final Type b() {
        return this.f25506a;
    }

    @Override // hs.b
    public final Collection getAnnotations() {
        return this.f25508c;
    }
}
