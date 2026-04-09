package I4;

import java.lang.annotation.Annotation;

/* compiled from: Qualified.java */
/* loaded from: classes2.dex */
public final class s<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<? extends Annotation> f2481a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f2482b;

    /* compiled from: Qualified.java */
    public @interface a {
    }

    public s(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f2481a = cls;
        this.f2482b = cls2;
    }

    public static <T> s<T> a(Class<T> cls) {
        return new s<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f2482b.equals(sVar.f2482b)) {
            return this.f2481a.equals(sVar.f2481a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2481a.hashCode() + (this.f2482b.hashCode() * 31);
    }

    public final String toString() {
        Class<T> cls = this.f2482b;
        Class<? extends Annotation> cls2 = this.f2481a;
        if (cls2 == a.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
