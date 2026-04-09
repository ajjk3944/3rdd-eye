package i4;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class f implements GenericArrayType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f20599a;

    public f(Type type) {
        Objects.requireNonNull(type);
        this.f20599a = i.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && i.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f20599a;
    }

    public final int hashCode() {
        return this.f20599a.hashCode();
    }

    public final String toString() {
        return i.k(this.f20599a) + "[]";
    }
}
