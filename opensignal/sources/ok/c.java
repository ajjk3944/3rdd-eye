package ok;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import nk.p0;

/* loaded from: classes.dex */
public final class c implements GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f19531a;

    public c(Type type) {
        this.f19531a = f.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && p0.b(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f19531a;
    }

    public final int hashCode() {
        return this.f19531a.hashCode();
    }

    public final String toString() {
        return f.k(this.f19531a) + "[]";
    }
}
