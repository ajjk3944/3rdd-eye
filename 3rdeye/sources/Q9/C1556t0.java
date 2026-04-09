package Q9;

import N7.B8;
import c9.C2099t;
import java.lang.annotation.Annotation;
import java.util.List;

/* compiled from: Primitives.kt */
/* renamed from: Q9.t0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1556t0 implements O9.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f11532a;

    /* renamed from: b, reason: collision with root package name */
    public final O9.d f11533b;

    public C1556t0(String str, O9.d kind) {
        kotlin.jvm.internal.l.f(kind, "kind");
        this.f11532a = str;
        this.f11533b = kind;
    }

    @Override // O9.e
    public final String a() {
        return this.f11532a;
    }

    @Override // O9.e
    public final boolean c() {
        return false;
    }

    @Override // O9.e
    public final int d(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // O9.e
    public final O9.k e() {
        return this.f11533b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556t0)) {
            return false;
        }
        C1556t0 c1556t0 = (C1556t0) obj;
        if (kotlin.jvm.internal.l.b(this.f11532a, c1556t0.f11532a)) {
            if (kotlin.jvm.internal.l.b(this.f11533b, c1556t0.f11533b)) {
                return true;
            }
        }
        return false;
    }

    @Override // O9.e
    public final int f() {
        return 0;
    }

    @Override // O9.e
    public final String g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // O9.e
    public final List<Annotation> getAnnotations() {
        return C2099t.f18581b;
    }

    @Override // O9.e
    public final List<Annotation> h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.f11533b.hashCode() * 31) + this.f11532a.hashCode();
    }

    @Override // O9.e
    public final O9.e i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // O9.e
    public final boolean isInline() {
        return false;
    }

    @Override // O9.e
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return B8.j(new StringBuilder("PrimitiveDescriptor("), this.f11532a, ')');
    }
}
