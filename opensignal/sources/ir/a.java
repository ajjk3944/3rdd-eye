package ir;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class a implements GenericArrayType, Type {

    /* renamed from: a, reason: collision with root package name */
    public final Type f12928a;

    public a(Type type) {
        br.l.e(type, "elementType");
        this.f12928a = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return br.l.a(this.f12928a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f12928a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return f0.b(this.f12928a) + "[]";
    }

    public final int hashCode() {
        return this.f12928a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
