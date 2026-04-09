package com.google.gson.internal;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements WildcardType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f20840a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f20841b;

    public f(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException("At most one lower bound is supported");
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException("Exactly one upper bound must be specified");
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            g.b(typeArr[0]);
            this.f20841b = null;
            this.f20840a = g.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        g.b(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
        }
        this.f20841b = g.a(typeArr2[0]);
        this.f20840a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && g.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f20841b;
        return type != null ? new Type[]{type} : g.f20842a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f20840a};
    }

    public final int hashCode() {
        Type type = this.f20841b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f20840a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f20841b;
        if (type != null) {
            return "? super " + g.k(type);
        }
        Type type2 = this.f20840a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + g.k(type2);
    }
}
