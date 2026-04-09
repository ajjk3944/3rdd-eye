package F4;

/* loaded from: classes3.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private final Class f5945a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f5946b;

    private @interface a {
    }

    public A(Class cls, Class cls2) {
        this.f5945a = cls;
        this.f5946b = cls2;
    }

    public static A a(Class cls, Class cls2) {
        return new A(cls, cls2);
    }

    public static A b(Class cls) {
        return new A(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || A.class != obj.getClass()) {
            return false;
        }
        A a10 = (A) obj;
        if (this.f5946b.equals(a10.f5946b)) {
            return this.f5945a.equals(a10.f5945a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f5946b.hashCode() * 31) + this.f5945a.hashCode();
    }

    public String toString() {
        if (this.f5945a == a.class) {
            return this.f5946b.getName();
        }
        return "@" + this.f5945a.getName() + " " + this.f5946b.getName();
    }
}
