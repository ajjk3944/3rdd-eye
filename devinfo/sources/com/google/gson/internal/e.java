package com.google.gson.internal;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements ParameterizedType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f20837a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f20838b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f20839c;

    public e(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        this.f20837a = type == null ? null : g.a(type);
        this.f20838b = g.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f20839c = typeArr2;
        int length = typeArr2.length;
        for (int i4 = 0; i4 < length; i4++) {
            Objects.requireNonNull(this.f20839c[i4]);
            g.b(this.f20839c[i4]);
            Type[] typeArr3 = this.f20839c;
            typeArr3[i4] = g.a(typeArr3[i4]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && g.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f20839c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f20837a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f20838b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f20839c) ^ this.f20838b.hashCode();
        Type type = this.f20837a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f20839c;
        int length = typeArr.length;
        Type type = this.f20838b;
        if (length == 0) {
            return g.k(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(g.k(type));
        sb2.append("<");
        sb2.append(g.k(typeArr[0]));
        for (int i4 = 1; i4 < length; i4++) {
            sb2.append(", ");
            sb2.append(g.k(typeArr[i4]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
