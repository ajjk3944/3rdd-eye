package Q9;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* compiled from: NullableSerializer.kt */
/* loaded from: classes3.dex */
public final class w0 implements O9.e, InterfaceC1542m {

    /* renamed from: a, reason: collision with root package name */
    public final O9.e f11538a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11539b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<String> f11540c;

    public w0(O9.e original) {
        kotlin.jvm.internal.l.f(original, "original");
        this.f11538a = original;
        this.f11539b = original.a() + '?';
        this.f11540c = C1545n0.a(original);
    }

    @Override // O9.e
    public final String a() {
        return this.f11539b;
    }

    @Override // Q9.InterfaceC1542m
    public final Set<String> b() {
        return this.f11540c;
    }

    @Override // O9.e
    public final boolean c() {
        return true;
    }

    @Override // O9.e
    public final int d(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        return this.f11538a.d(name);
    }

    @Override // O9.e
    public final O9.k e() {
        return this.f11538a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            return kotlin.jvm.internal.l.b(this.f11538a, ((w0) obj).f11538a);
        }
        return false;
    }

    @Override // O9.e
    public final int f() {
        return this.f11538a.f();
    }

    @Override // O9.e
    public final String g(int i) {
        return this.f11538a.g(i);
    }

    @Override // O9.e
    public final List<Annotation> getAnnotations() {
        return this.f11538a.getAnnotations();
    }

    @Override // O9.e
    public final List<Annotation> h(int i) {
        return this.f11538a.h(i);
    }

    public final int hashCode() {
        return this.f11538a.hashCode() * 31;
    }

    @Override // O9.e
    public final O9.e i(int i) {
        return this.f11538a.i(i);
    }

    @Override // O9.e
    public final boolean isInline() {
        return this.f11538a.isInline();
    }

    @Override // O9.e
    public final boolean j(int i) {
        return this.f11538a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11538a);
        sb.append('?');
        return sb.toString();
    }
}
