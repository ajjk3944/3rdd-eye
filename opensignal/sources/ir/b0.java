package ir;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 implements ParameterizedType, Type {

    /* renamed from: a, reason: collision with root package name */
    public final Class f12929a;

    /* renamed from: d, reason: collision with root package name */
    public final Type f12930d;

    /* renamed from: g, reason: collision with root package name */
    public final Type[] f12931g;

    public b0(Class cls, Type type, ArrayList arrayList) {
        this.f12929a = cls;
        this.f12930d = type;
        this.f12931g = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return br.l.a(this.f12929a, parameterizedType.getRawType()) && br.l.a(this.f12930d, parameterizedType.getOwnerType()) && Arrays.equals(this.f12931g, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f12931g;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f12930d;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f12929a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb2 = new StringBuilder();
        Class cls = this.f12929a;
        Type type = this.f12930d;
        if (type != null) {
            sb2.append(f0.b(type));
            sb2.append("$");
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(f0.b(cls));
        }
        Type[] typeArr = this.f12931g;
        if (typeArr.length != 0) {
            mq.l.s0(typeArr, sb2, ", ", "<", ">", "...", a0.E);
        }
        return sb2.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f12929a.hashCode();
        Type type = this.f12930d;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f12931g);
    }

    public final String toString() {
        return getTypeName();
    }
}
