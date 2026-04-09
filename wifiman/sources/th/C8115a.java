package th;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: th.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C8115a implements GenericArrayType, Type {

    /* renamed from: a, reason: collision with root package name */
    private final Type f62640a;

    public C8115a(Type elementType) {
        AbstractC6492s.i(elementType, "elementType");
        this.f62640a = elementType;
    }

    public boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC6492s.d(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    public Type getGenericComponentType() {
        return this.f62640a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        return w.h(this.f62640a) + "[]";
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    public String toString() {
        return getTypeName();
    }
}
