package bf;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2742a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f2743b;

    public u(Class cls, Class cls2) {
        this.f2742a = cls;
        this.f2743b = cls2;
    }

    public static u a(Class cls) {
        return new u(t.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f2743b.equals(uVar.f2743b)) {
            return this.f2742a.equals(uVar.f2742a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2742a.hashCode() + (this.f2743b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f2743b;
        Class cls2 = this.f2742a;
        if (cls2 == t.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
