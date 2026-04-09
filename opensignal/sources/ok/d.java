package ok;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;
import nk.p0;

/* loaded from: classes.dex */
public final class d implements ParameterizedType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f19532a;

    /* renamed from: d, reason: collision with root package name */
    public final Type f19533d;

    /* renamed from: g, reason: collision with root package name */
    public final Type[] f19534g;

    public d(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || p0.d(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        this.f19532a = type == null ? null : f.a(type);
        this.f19533d = f.a(type2);
        this.f19534g = (Type[]) typeArr.clone();
        int i10 = 0;
        while (true) {
            Type[] typeArr2 = this.f19534g;
            if (i10 >= typeArr2.length) {
                return;
            }
            typeArr2[i10].getClass();
            f.b(this.f19534g[i10]);
            Type[] typeArr3 = this.f19534g;
            typeArr3[i10] = f.a(typeArr3[i10]);
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && p0.b(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f19534g.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f19532a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f19533d;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f19534g) ^ this.f19533d.hashCode();
        Set set = f.f19537a;
        Type type = this.f19532a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f19534g;
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(f.k(this.f19533d));
        if (typeArr.length == 0) {
            return sb2.toString();
        }
        sb2.append("<");
        sb2.append(f.k(typeArr[0]));
        for (int i10 = 1; i10 < typeArr.length; i10++) {
            sb2.append(", ");
            sb2.append(f.k(typeArr[i10]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
