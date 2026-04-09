package D5;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: TypeToken.java */
/* loaded from: classes2.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<? super T> f1061a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f1062b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1063c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type typeA = com.google.gson.internal.a.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.f1062b = typeA;
        this.f1061a = (Class<? super T>) com.google.gson.internal.a.e(typeA);
        this.f1063c = typeA.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return com.google.gson.internal.a.c(this.f1062b, ((a) obj).f1062b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1063c;
    }

    public final String toString() {
        return com.google.gson.internal.a.g(this.f1062b);
    }

    public a(Type type) {
        type.getClass();
        Type typeA = com.google.gson.internal.a.a(type);
        this.f1062b = typeA;
        this.f1061a = (Class<? super T>) com.google.gson.internal.a.e(typeA);
        this.f1063c = typeA.hashCode();
    }
}
