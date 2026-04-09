package com.google.gson.internal;

import com.applovin.shadow.okhttp3.HttpUrl;
import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d implements GenericArrayType, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Type f20836a;

    public d(Type type) {
        Objects.requireNonNull(type);
        this.f20836a = g.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && g.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f20836a;
    }

    public final int hashCode() {
        return this.f20836a.hashCode();
    }

    public final String toString() {
        return g.k(this.f20836a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
