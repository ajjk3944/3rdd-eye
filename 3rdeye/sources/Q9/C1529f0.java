package Q9;

import O9.l;
import c9.C2099t;
import java.lang.annotation.Annotation;
import java.util.List;

/* compiled from: NothingSerialDescriptor.kt */
/* renamed from: Q9.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1529f0 implements O9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C1529f0 f11481a = new C1529f0();

    /* renamed from: b, reason: collision with root package name */
    public static final l.d f11482b = l.d.f10526a;

    /* renamed from: c, reason: collision with root package name */
    public static final String f11483c = "kotlin.Nothing";

    @Override // O9.e
    public final String a() {
        return f11483c;
    }

    @Override // O9.e
    public final boolean c() {
        return false;
    }

    @Override // O9.e
    public final int d(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // O9.e
    public final O9.k e() {
        return f11482b;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // O9.e
    public final int f() {
        return 0;
    }

    @Override // O9.e
    public final String g(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // O9.e
    public final List<Annotation> getAnnotations() {
        return C2099t.f18581b;
    }

    @Override // O9.e
    public final List<Annotation> h(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final int hashCode() {
        return (f11482b.hashCode() * 31) + f11483c.hashCode();
    }

    @Override // O9.e
    public final O9.e i(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // O9.e
    public final boolean isInline() {
        return false;
    }

    @Override // O9.e
    public final boolean j(int i) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
