package th;

import Zg.AbstractC3686s;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
final class u implements ParameterizedType, Type {

    /* renamed from: a, reason: collision with root package name */
    private final Class f62646a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f62647b;

    /* renamed from: c, reason: collision with root package name */
    private final Type[] f62648c;

    /* synthetic */ class a extends C6490p implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f62649a = new a();

        a() {
            super(1, w.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type p02) {
            AbstractC6492s.i(p02, "p0");
            return w.h(p02);
        }
    }

    public u(Class rawType, Type type, List typeArguments) {
        AbstractC6492s.i(rawType, "rawType");
        AbstractC6492s.i(typeArguments, "typeArguments");
        this.f62646a = rawType;
        this.f62647b = type;
        this.f62648c = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (AbstractC6492s.d(this.f62646a, parameterizedType.getRawType()) && AbstractC6492s.d(this.f62647b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f62648c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f62647b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f62646a;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f62647b;
        if (type != null) {
            sb2.append(w.h(type));
            sb2.append("$");
            sb2.append(this.f62646a.getSimpleName());
        } else {
            sb2.append(w.h(this.f62646a));
        }
        Type[] typeArr = this.f62648c;
        if (!(typeArr.length == 0)) {
            AbstractC3686s.t0(typeArr, sb2, (50 & 2) != 0 ? ", " : null, (50 & 4) != 0 ? "" : "<", (50 & 8) == 0 ? ">" : "", (50 & 16) != 0 ? -1 : 0, (50 & 32) != 0 ? "..." : null, (50 & 64) != 0 ? null : a.f62649a);
        }
        return sb2.toString();
    }

    public int hashCode() {
        int iHashCode = this.f62646a.hashCode();
        Type type = this.f62647b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
