package de;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Class f22224a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f22225b;

    public q(Class cls, Class cls2) {
        this.f22224a = cls;
        this.f22225b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f22225b.equals(qVar.f22225b)) {
            return this.f22224a.equals(qVar.f22224a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22224a.hashCode() + (this.f22225b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f22225b;
        Class cls2 = this.f22224a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
